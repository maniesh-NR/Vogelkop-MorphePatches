package com.leanplum.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.leanplum.ActionContext;
import com.leanplum.CacheUpdateBlock;
import com.leanplum.Leanplum;
import com.leanplum.LocationManager;
import com.leanplum.SecuredVars;
import com.leanplum.Var;
import com.leanplum.internal.Constants;
import com.leanplum.internal.FileManager;
import com.leanplum.internal.Request;
import com.leanplum.utils.SharedPreferencesUtil;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.url._UrlKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class VarCache {
    private static final String LEANPLUM = "__leanplum__";
    private static int contentVersion;
    private static Map<String, Object> devModeActionDefinitionsFromServer;
    private static Map<String, Object> devModeFileAttributesFromServer;
    private static Map<String, Object> devModeValuesFromServer;
    private static Object merged;
    private static boolean silent;
    private static CacheUpdateBlock updateBlock;
    private static Map<String, Object> userAttributes;
    private static volatile String varsJson;
    private static volatile String varsSignature;
    private static final Map<String, Var<?>> vars = new ConcurrentHashMap();
    private static final Map<String, Object> fileAttributes = new HashMap();
    private static final Map<String, StreamProvider> fileStreams = new HashMap();
    public static final Map<String, Object> valuesFromClient = new HashMap();
    private static final Map<String, String> defaultKinds = new HashMap();
    private static final Map<String, Object> actionDefinitions = new HashMap();
    private static Map<String, Object> diffs = new HashMap();
    private static Map<String, Object> regions = new HashMap();
    private static Map<String, Object> messageDiffs = new HashMap();
    private static volatile List<Map<String, Object>> variants = new ArrayList();
    private static volatile List<Map<String, Object>> localCaps = new ArrayList();
    private static boolean hasReceivedDiffs = false;
    private static Map<String, Object> messages = new HashMap();
    private static Map<String, Object> variantDebugInfo = new HashMap();
    private static final String NAME_COMPONENT_REGEX = "(?:[^\\.\\[.(\\\\]+|\\\\.)+";
    private static final Pattern NAME_COMPONENT_PATTERN = Pattern.compile(NAME_COMPONENT_REGEX);

    @FunctionalInterface
    public interface StreamProvider {
        InputStream openStream();
    }

    public static Map<String, Object> actionDefinitions() {
        return actionDefinitions;
    }

    public static void applyVariableDiffs(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, List<Map<String, Object>> list, List<Map<String, Object>> list2, Map<String, Object> map4, String str, String str2) {
        if (map != null) {
            diffs = map;
            computeMergedDictionary();
            Iterator it = new HashMap(vars).keySet().iterator();
            while (it.hasNext()) {
                Var<?> var = vars.get((String) it.next());
                if (var != null) {
                    var.update();
                }
            }
            fileVariableFinish();
        }
        if (map2 != null) {
            messageDiffs = map2;
            HashMap map5 = new HashMap();
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                Map map6 = (Map) CollectionUtil.uncheckedCast(entry.getValue());
                HashMap map7 = new HashMap(map6);
                Map map8 = (Map) CollectionUtil.uncheckedCast(mergeHelper((Map) Util.multiIndex(actionDefinitions, map7.get("action"), "values"), (Map) CollectionUtil.uncheckedCast(map6.get("vars"))));
                map5.put(entry.getKey(), map7);
                map7.put("vars", map8);
            }
            messages = map5;
            Iterator it2 = map5.entrySet().iterator();
            while (it2.hasNext()) {
                String str3 = (String) ((Map.Entry) it2.next()).getKey();
                Map map9 = (Map) CollectionUtil.uncheckedCast(messages.get(str3));
                if (map9 != null && map9.get("action") != null) {
                    new ActionContext(map9.get("action").toString(), (Map) CollectionUtil.uncheckedCast(map9.get("vars")), str3).update();
                }
            }
        }
        if (map3 != null) {
            regions = map3;
        }
        if (map2 != null || map3 != null) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            ActionManager.getForegroundandBackgroundRegionNames(hashSet, hashSet2);
            LocationManager locationManager = ActionManager.getLocationManager();
            if (locationManager != null) {
                locationManager.setRegionsData(map3, hashSet, hashSet2);
            }
        }
        if (list != null) {
            variants = list;
        }
        if (list2 != null) {
            localCaps = list2;
        }
        if (map4 != null) {
            setVariantDebugInfo(map4);
        }
        if (str != null) {
            varsJson = str;
            varsSignature = str2;
        }
        contentVersion++;
        if (silent) {
            return;
        }
        saveDiffs();
        triggerHasReceivedDiffs();
    }

    private static boolean areActionDefinitionsEqual(Map<String, Object> map, Map<String, Object> map2) {
        if (map == null || map2 == null || map.size() != map2.size()) {
            return false;
        }
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                return true;
            }
            Map.Entry<String, Object> next = it.next();
            Map map3 = (Map) CollectionUtil.uncheckedCast(next.getValue());
            Map map4 = (Map) CollectionUtil.uncheckedCast(map2.get(next.getKey()));
            if (map4 != null && map3 != null) {
                Object obj = map3.get("kind");
                Object obj2 = map3.get("values");
                Object obj3 = map3.get(Constants.Params.KINDS);
                Object obj4 = map3.get("options");
                if ((obj != null && !obj.equals(map4.get("kind"))) || ((obj2 != null && !obj2.equals(map4.get("values"))) || (obj3 != null && !obj3.equals(map4.get(Constants.Params.KINDS))))) {
                    break;
                }
                if ((obj4 == null) != (map4.get("options") == null) || (obj4 != null && obj4.equals(map4.get("options")))) {
                    break;
                }
            } else {
                break;
            }
        }
        return false;
    }

    public static void clearUserContent() {
        vars.clear();
        variants = new ArrayList();
        localCaps = new ArrayList();
        variantDebugInfo.clear();
        varsJson = null;
        varsSignature = null;
        diffs.clear();
        messageDiffs.clear();
        messages = null;
        userAttributes = null;
        merged = null;
        devModeValuesFromServer = null;
        devModeFileAttributesFromServer = null;
        devModeActionDefinitionsFromServer = null;
    }

    private static void computeMergedDictionary() {
        Map<String, Object> map = valuesFromClient;
        synchronized (map) {
            merged = mergeHelper(map, diffs);
        }
    }

    public static int contentVersion() {
        return contentVersion;
    }

    private static void fileVariableFinish() {
        Iterator it = new HashMap(vars).keySet().iterator();
        while (it.hasNext()) {
            Var<?> var = vars.get((String) it.next());
            if (var != null) {
                String str = var.stringValue;
                if (var.isResource && "file".equals(var.kind()) && str != null && !str.equals(var.defaultValue())) {
                    Map map = (Map) CollectionUtil.uncheckedCast(fileAttributes.get(str));
                    StreamProvider streamProvider = fileStreams.get(str);
                    if (map != null && streamProvider != null) {
                        var.setOverrideResId(getResIdFromPath(var.stringValue()));
                    }
                }
            }
        }
    }

    public static int getActionDefinitionType(String str) {
        Integer num;
        Object obj = actionDefinitions().get(str);
        if (!(obj instanceof Map) || (num = (Integer) ((Map) obj).get("kind")) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static Map<String, Object> getDiffs() {
        return diffs;
    }

    public static <T> T getMergedValueFromComponentArray(Object[] objArr) {
        Object obj = merged;
        if (obj == null) {
            obj = valuesFromClient;
        }
        return (T) getMergedValueFromComponentArray(objArr, obj);
    }

    public static <T> T getMergedValueFromComponentArray(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            obj = (T) traverse(obj, obj2, false);
        }
        return (T) obj;
    }

    public static Map<String, Object> getMessageDiffs() {
        return messageDiffs;
    }

    public static String[] getNameComponents(String str) {
        Matcher matcher = NAME_COMPONENT_PATTERN.matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(str.substring(matcher.start(), matcher.end()));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static int getResIdFromPath(String str) {
        try {
            String strReplace = str.replace("res/", "");
            String strSubstring = strReplace.substring(0, strReplace.lastIndexOf(46));
            String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(47) + 1);
            String strReplace2 = strSubstring.substring(0, strSubstring.lastIndexOf(47)).replace('/', '.');
            Context context = Leanplum.getContext();
            return context.getResources().getIdentifier(strSubstring2, strReplace2, context.getPackageName());
        } catch (Exception unused) {
            return 0;
        }
    }

    @Nullable
    public static SecuredVars getSecuredVars() {
        if (TextUtils.isEmpty(varsJson) || TextUtils.isEmpty(varsSignature)) {
            return null;
        }
        return new SecuredVars(varsJson, varsSignature);
    }

    public static <T> Var<T> getVariable(String str) {
        return (Var) vars.get(str);
    }

    public static Map<String, Object> getVariantDebugInfo() {
        return variantDebugInfo;
    }

    public static boolean hasReceivedDiffs() {
        return hasReceivedDiffs;
    }

    private static boolean isStreamAvailable(StreamProvider streamProvider) {
        if (streamProvider == null) {
            return false;
        }
        try {
            InputStream inputStreamOpenStream = streamProvider.openStream();
            if (inputStreamOpenStream == null) {
                return false;
            }
            inputStreamOpenStream.close();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static <T> String kindFromValue(T t) {
        if ((t instanceof Integer) || (t instanceof Long) || (t instanceof Short) || (t instanceof Character) || (t instanceof Byte) || (t instanceof BigInteger)) {
            return Constants.Kinds.INT;
        }
        if ((t instanceof Float) || (t instanceof Double) || (t instanceof BigDecimal)) {
            return Constants.Kinds.FLOAT;
        }
        if (t instanceof String) {
            return Constants.Kinds.STRING;
        }
        if ((t instanceof List) || (t instanceof Array)) {
            return Constants.Kinds.ARRAY;
        }
        if (t instanceof Map) {
            return Constants.Kinds.DICTIONARY;
        }
        if (t instanceof Boolean) {
            return Constants.Kinds.BOOLEAN;
        }
        return null;
    }

    public static void loadDiffs() {
        if (Constants.isNoop()) {
            return;
        }
        SharedPreferences sharedPreferences = Leanplum.getContext().getSharedPreferences("__leanplum__", 0);
        if (!Constants.allowStorageWithoutLegacyToken && APIConfig.getInstance().token() == null) {
            applyVariableDiffs(new HashMap(), new HashMap(), new HashMap(), new ArrayList(), new ArrayList(), new HashMap(), "", "");
            return;
        }
        try {
            AESCrypt aESCrypt = new AESCrypt(APIConfig.getInstance().appId(), APIConfig.getInstance().token());
            applyVariableDiffs(JsonConverter.fromJson(aESCrypt.decodePreference(sharedPreferences, Constants.Defaults.VARIABLES_KEY, "{}")), JsonConverter.fromJson(aESCrypt.decodePreference(sharedPreferences, Constants.Defaults.MESSAGES_KEY, "{}")), JsonConverter.fromJson(aESCrypt.decodePreference(sharedPreferences, "regions", "{}")), JsonConverter.listFromJson(new JSONArray(aESCrypt.decodePreference(sharedPreferences, Constants.Keys.VARIANTS, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI))), JsonConverter.listFromJson(new JSONArray(aESCrypt.decodePreference(sharedPreferences, Constants.Keys.LOCAL_CAPS, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI))), JsonConverter.fromJson(aESCrypt.decodePreference(sharedPreferences, Constants.Keys.VARIANT_DEBUG_INFO, "{}")), aESCrypt.decodePreference(sharedPreferences, Constants.Defaults.VARIABLES_JSON_KEY, "{}"), aESCrypt.decodePreference(sharedPreferences, Constants.Defaults.VARIABLES_SIGN_KEY, null));
            String strDecodePreference = aESCrypt.decodePreference(sharedPreferences, Constants.Params.DEVICE_ID, null);
            if (strDecodePreference != null) {
                if (Util.isValidDeviceId(strDecodePreference)) {
                    APIConfig.getInstance().setDeviceId(strDecodePreference);
                } else {
                    Log.d("Invalid stored device id found: \"" + strDecodePreference + "\"; discarding.", new Object[0]);
                }
            }
            String strDecodePreference2 = aESCrypt.decodePreference(sharedPreferences, Constants.Params.USER_ID, null);
            if (strDecodePreference2 != null) {
                if (Util.isValidUserId(strDecodePreference2)) {
                    APIConfig.getInstance().setUserId(strDecodePreference2);
                } else {
                    Log.d("Invalid stored user id found: \"" + strDecodePreference2 + "\"; discarding.", new Object[0]);
                }
            }
            if (Boolean.parseBoolean(aESCrypt.decodePreference(sharedPreferences, Constants.Keys.LOGGING_ENABLED, "false"))) {
                Constants.loggingEnabled = true;
            }
        } catch (Exception e) {
            Log.e("Could not load variable diffs.\n" + Log.getStackTraceString(e), new Object[0]);
        }
        userAttributes();
    }

    public static List<Map<String, Object>> localCaps() {
        return localCaps;
    }

    public static void maybeUploadNewFiles() throws JSONException {
        if (Constants.isNoop() || devModeFileAttributesFromServer == null || !Leanplum.hasStartedAndRegisteredAsDeveloper() || !Constants.enableFileUploadingInDevelopmentMode) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int iIntValue = 0;
        for (Map.Entry<String, Object> entry : fileAttributes.entrySet()) {
            String key = entry.getKey();
            Map map = (Map) CollectionUtil.uncheckedCast(entry.getValue());
            Map map2 = (Map) CollectionUtil.uncheckedCast(devModeFileAttributesFromServer.get(key));
            Map map3 = (Map) CollectionUtil.uncheckedCast(map.get(""));
            Map map4 = (Map) CollectionUtil.uncheckedCast(map2 != null ? map2.get("") : null);
            if (FileManager.isNewerLocally(map3, map4)) {
                Log.d("Will upload file " + key + ". Local attributes: " + map3 + "; server attributes: " + map4, new Object[0]);
                String str = (String) map3.get(Constants.Keys.HASH);
                if (str == null) {
                    str = "";
                }
                String strFileRelativeToAppBundle = FileManager.fileRelativeToAppBundle(key);
                if ((iIntValue > 26214400 && arrayList.size() > 0) || arrayList.size() >= 16) {
                    FileTransferManager.getInstance().sendFilesNow(arrayList2, arrayList, arrayList3);
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    iIntValue = 0;
                }
                iIntValue += ((Integer) map3.get(Constants.Keys.SIZE)).intValue();
                arrayList.add(strFileRelativeToAppBundle);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(Constants.Keys.HASH, str);
                    jSONObject.put(Constants.Keys.SIZE, map3.get(Constants.Keys.SIZE) + "");
                    jSONObject.put(Constants.Keys.FILENAME, key);
                    arrayList2.add(jSONObject);
                } catch (JSONException e) {
                    Log.e("Unable to upload files.\n" + Log.getStackTraceString(e), new Object[0]);
                    arrayList2.add(new JSONObject());
                }
                StreamProvider streamProvider = fileStreams.get(key);
                arrayList3.add(streamProvider != null ? streamProvider.openStream() : null);
            }
        }
        if (arrayList.size() > 0) {
            FileTransferManager.getInstance().sendFilesNow(arrayList2, arrayList, arrayList3);
        }
    }

    public static Object mergeHelper(Object obj, Object obj2) throws NumberFormatException {
        if (obj2 == null) {
            return obj;
        }
        if ((obj2 instanceof Number) || (obj2 instanceof Boolean) || (obj2 instanceof String) || (obj2 instanceof Character) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String) || (obj instanceof Character)) {
            return obj2;
        }
        boolean z = obj2 instanceof Map;
        Iterable iterableKeySet = z ? ((Map) obj2).keySet() : (Iterable) obj2;
        boolean z2 = obj instanceof Map;
        Iterable iterableKeySet2 = z2 ? ((Map) obj).keySet() : (Iterable) obj;
        Map map = z ? (Map) obj2 : null;
        Map map2 = z2 ? (Map) obj : null;
        boolean z3 = false;
        if (obj == null && z && ((Map) obj2).size() > 0) {
            Iterator it = iterableKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = true;
                    break;
                }
                Object next = it.next();
                if (!(next instanceof String)) {
                    break;
                }
                String str = (String) next;
                if (str.length() < 3 || str.charAt(0) != '[' || str.charAt(str.length() - 1) != ']') {
                    break;
                }
                String strH = p3p.h(1, 1, str);
                if (!String.valueOf(Integer.getInteger(strH)).equals(strH)) {
                    break;
                }
            }
        }
        if ((obj instanceof List) || z3) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = iterableKeySet2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            if (map != null) {
                for (Object obj3 : iterableKeySet) {
                    if (obj3 instanceof String) {
                        String str2 = (String) obj3;
                        if (str2.length() > 2 && str2.startsWith("[") && str2.endsWith("]")) {
                            int i = Integer.parseInt(str2.substring(1, str2.length() - 1));
                            Object obj4 = map.get(str2);
                            while (i >= arrayList.size() && arrayList.size() < 32767) {
                                arrayList.add(null);
                            }
                            arrayList.set(i, mergeHelper(arrayList.get(i), obj4));
                        }
                    }
                }
            }
            return arrayList;
        }
        if (!z2 && !z) {
            return null;
        }
        HashMap map3 = new HashMap();
        if (iterableKeySet2 != null) {
            for (Object obj5 : iterableKeySet2) {
                if (map != null && map2 != null) {
                    Object obj6 = map.get(obj5);
                    Object obj7 = map2.get(obj5);
                    if (obj6 == null && obj7 != null) {
                        map3.put(obj5, obj7);
                    }
                }
            }
        }
        for (Object obj8 : iterableKeySet) {
            map3.put(obj8, mergeHelper(map2 != null ? map2.get(obj8) : null, map != null ? map.get(obj8) : null));
        }
        return map3;
    }

    public static Map<String, Object> messages() {
        return messages;
    }

    public static void onUpdate(CacheUpdateBlock cacheUpdateBlock) {
        updateBlock = cacheUpdateBlock;
    }

    public static Map<String, Object> regions() {
        return regions;
    }

    public static void registerActionDefinition(String str, int i, List<ActionArg<?>> list, Map<String, Object> map) {
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (ActionArg<?> actionArg : list) {
            updateValues(actionArg.name(), getNameComponents(actionArg.name()), actionArg.defaultValue(), actionArg.kind(), map2, map3);
            arrayList.add(actionArg.name());
        }
        HashMap map4 = new HashMap();
        map4.put("kind", Integer.valueOf(i));
        map4.put("values", map2);
        map4.put(Constants.Params.KINDS, map3);
        map4.put("order", arrayList);
        map4.put("options", map);
        actionDefinitions.put(str, map4);
    }

    public static void registerFile(String str, StreamProvider streamProvider, String str2, int i) throws JSONException {
        if (isStreamAvailable(streamProvider) && Constants.isDevelopmentModeEnabled && !Constants.isNoop()) {
            HashMap map = new HashMap();
            map.put(Constants.Keys.HASH, str2);
            map.put(Constants.Keys.SIZE, Integer.valueOf(i));
            HashMap map2 = new HashMap();
            map2.put("", map);
            fileStreams.put(str, streamProvider);
            fileAttributes.put(str, map2);
            maybeUploadNewFiles();
        }
    }

    public static void registerFile(String str, String str2, StreamProvider streamProvider) throws Throwable {
        if (isStreamAvailable(streamProvider) && Constants.isDevelopmentModeEnabled && !Constants.isNoop()) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            if (Util.isSimulator()) {
                FileManager.HashResults hashResultsFileMD5HashCreateWithPath = FileManager.fileMD5HashCreateWithPath(streamProvider.openStream());
                if (hashResultsFileMD5HashCreateWithPath != null) {
                    map2.put(Constants.Keys.HASH, hashResultsFileMD5HashCreateWithPath.hash);
                    map2.put(Constants.Keys.SIZE, Integer.valueOf(hashResultsFileMD5HashCreateWithPath.size));
                }
            } else {
                map2.put(Constants.Keys.SIZE, Integer.valueOf(FileManager.getFileSize(FileManager.fileValue(str, str2, null))));
            }
            map.put("", map2);
            fileStreams.put(str, streamProvider);
            fileAttributes.put(str, map);
            maybeUploadNewFiles();
        }
    }

    public static void registerVariable(Var<?> var) {
        vars.put(var.name(), var);
        Map<String, Object> map = valuesFromClient;
        synchronized (map) {
            updateValues(var.name(), var.nameComponents(), var.defaultValue(), var.kind(), map, defaultKinds);
        }
    }

    public static void reset() {
        vars.clear();
        variantDebugInfo.clear();
        fileAttributes.clear();
        fileStreams.clear();
        valuesFromClient.clear();
        defaultKinds.clear();
        actionDefinitions.clear();
        diffs.clear();
        messageDiffs.clear();
        regions.clear();
        devModeValuesFromServer = null;
        devModeFileAttributesFromServer = null;
        devModeActionDefinitionsFromServer = null;
        variants = new ArrayList();
        localCaps = new ArrayList();
        updateBlock = null;
        hasReceivedDiffs = false;
        messages = null;
        merged = null;
        silent = false;
        contentVersion = 0;
        userAttributes = null;
        varsJson = null;
        varsSignature = null;
    }

    public static void saveDiffs() {
        if (Constants.isNoop()) {
            return;
        }
        if (Constants.allowStorageWithoutLegacyToken || APIConfig.getInstance().token() != null) {
            SharedPreferences.Editor editorEdit = Leanplum.getContext().getSharedPreferences("__leanplum__", 0).edit();
            AESCrypt aESCrypt = new AESCrypt(APIConfig.getInstance().appId(), APIConfig.getInstance().token());
            editorEdit.putString(Constants.Defaults.VARIABLES_KEY, aESCrypt.encrypt(JsonConverter.toJson(diffs)));
            editorEdit.putString(Constants.Defaults.MESSAGES_KEY, aESCrypt.encrypt(JsonConverter.toJson(messages)));
            editorEdit.putString("regions", aESCrypt.encrypt(JsonConverter.toJson(regions)));
            try {
                if (variants != null && !variants.isEmpty()) {
                    editorEdit.putString(Constants.Keys.VARIANTS, aESCrypt.encrypt(JsonConverter.listToJsonArray(variants).toString()));
                }
            } catch (JSONException e) {
                Log.e("Error converting " + variants + " to JSON.\n" + Log.getStackTraceString(e), new Object[0]);
            }
            try {
                if (localCaps != null) {
                    editorEdit.putString(Constants.Keys.LOCAL_CAPS, aESCrypt.encrypt(JsonConverter.listToJsonArray(localCaps).toString()));
                }
            } catch (JSONException e2) {
                Log.e("Error converting " + localCaps + " to JSON.\n" + Log.getStackTraceString(e2), new Object[0]);
            }
            Map<String, Object> map = variantDebugInfo;
            if (map != null) {
                editorEdit.putString(Constants.Keys.VARIANT_DEBUG_INFO, aESCrypt.encrypt(JsonConverter.toJson(map)));
            }
            editorEdit.putString(Constants.Defaults.VARIABLES_JSON_KEY, aESCrypt.encrypt(varsJson));
            editorEdit.putString(Constants.Defaults.VARIABLES_SIGN_KEY, aESCrypt.encrypt(varsSignature));
            editorEdit.putString(Constants.Params.DEVICE_ID, aESCrypt.encrypt(APIConfig.getInstance().deviceId()));
            editorEdit.putString(Constants.Params.USER_ID, aESCrypt.encrypt(APIConfig.getInstance().userId()));
            editorEdit.putString(Constants.Keys.LOGGING_ENABLED, aESCrypt.encrypt(String.valueOf(Constants.loggingEnabled)));
            SharedPreferencesUtil.commitChanges(editorEdit);
        }
    }

    public static void saveUserAttributes() {
        if (Constants.isNoop() || APIConfig.getInstance().appId() == null || userAttributes == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = Leanplum.getContext().getSharedPreferences("__leanplum__", 0).edit();
        editorEdit.putString(Constants.Defaults.ATTRIBUTES_KEY, new AESCrypt(APIConfig.getInstance().appId(), APIConfig.getInstance().token()).encrypt(JsonConverter.toJson(userAttributes)));
        SharedPreferencesUtil.commitChanges(editorEdit);
    }

    public static boolean sendActionsIfChanged() {
        return sendContentIfChanged(false, true);
    }

    private static boolean sendContentIfChanged(boolean z, boolean z2) {
        Map<String, Object> map;
        boolean z3 = (!z2 || areActionDefinitionsEqual(actionDefinitions, devModeActionDefinitionsFromServer)) ? (!z || (map = devModeValuesFromServer) == null || valuesFromClient.equals(map)) ? false : true : true;
        if (z3) {
            HashMap map2 = new HashMap();
            if (z) {
                map2.put("vars", JsonConverter.toJson(valuesFromClient));
                map2.put(Constants.Params.KINDS, JsonConverter.toJson(defaultKinds));
            }
            if (z2) {
                map2.put(Constants.Params.ACTION_DEFINITIONS, JsonConverter.toJson(actionDefinitions));
            }
            map2.put(Constants.Params.FILE_ATTRIBUTES, JsonConverter.toJson(fileAttributes));
            RequestSender.getInstance().send(RequestBuilder.withSetVarsAction().andParams(map2).andType(Request.RequestType.IMMEDIATE).create());
        }
        return z3;
    }

    public static boolean sendVariablesIfChanged() {
        return sendContentIfChanged(true, false);
    }

    public static void setDevModeValuesFromServer(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3) {
        devModeValuesFromServer = map;
        devModeActionDefinitionsFromServer = map3;
        devModeFileAttributesFromServer = map2;
    }

    public static void setSilent(boolean z) {
        silent = z;
    }

    public static void setVariantDebugInfo(Map<String, Object> map) {
        if (map != null) {
            variantDebugInfo = map;
        } else {
            variantDebugInfo = new HashMap();
        }
    }

    public static boolean silent() {
        return silent;
    }

    private static Object traverse(Object obj, Object obj2, boolean z) {
        Object obj3 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            Map map = (Map) CollectionUtil.uncheckedCast(obj);
            Object obj4 = map.get(obj2);
            if (!z || obj4 != null || !(obj2 instanceof String)) {
                return obj4;
            }
            HashMap map2 = new HashMap();
            map.put(obj2, map2);
            return map2;
        }
        if (obj instanceof List) {
            List list = (List) CollectionUtil.uncheckedCast(obj);
            Integer num = (Integer) obj2;
            obj3 = list.get(num.intValue());
            if (z && obj3 == null) {
                HashMap map3 = new HashMap();
                list.set(num.intValue(), map3);
                return map3;
            }
        }
        return obj3;
    }

    private static void triggerHasReceivedDiffs() {
        hasReceivedDiffs = true;
        CacheUpdateBlock cacheUpdateBlock = updateBlock;
        if (cacheUpdateBlock != null) {
            cacheUpdateBlock.updateCache();
        }
    }

    private static void updateValues(String str, String[] strArr, Object obj, String str2, Map<String, Object> map, Map<String, String> map2) {
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            Object obj2 = map;
            while (i < strArr.length - 1) {
                Object objTraverse = traverse(obj2, strArr[i], true);
                i++;
                obj2 = objTraverse;
            }
            if (obj2 instanceof Map) {
                ((Map) CollectionUtil.uncheckedCast(obj2)).put(strArr[strArr.length - 1], obj);
            }
        }
        if (map2 != null) {
            map2.put(str, str2);
        }
    }

    public static Map<String, Object> userAttributes() {
        if (userAttributes == null) {
            try {
                userAttributes = JsonConverter.fromJson(new AESCrypt(APIConfig.getInstance().appId(), APIConfig.getInstance().token()).decodePreference(Leanplum.getContext().getSharedPreferences("__leanplum__", 0), Constants.Defaults.ATTRIBUTES_KEY, "{}"));
            } catch (Exception e) {
                Log.e("Could not load user attributes.\n" + Log.getStackTraceString(e), new Object[0]);
                userAttributes = new HashMap();
            }
        }
        return userAttributes;
    }

    public static List<Map<String, Object>> variants() {
        return variants;
    }
}
