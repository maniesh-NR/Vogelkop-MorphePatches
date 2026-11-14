package com.leanplum;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.leanplum.internal.CollectionUtil;
import com.leanplum.internal.FileManager;
import com.leanplum.internal.Log;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.internal.VarCache;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class LeanplumResources extends Resources {
    public LeanplumResources(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawableCreateFromStream;
        try {
            Var overrideResource = getOverrideResource(i);
            if (overrideResource != null) {
                int iOverrideResId = overrideResource.overrideResId();
                if (iOverrideResId != 0) {
                    return super.getDrawable(iOverrideResId);
                }
                if (!overrideResource.stringValue.equals(overrideResource.defaultValue()) && (drawableCreateFromStream = Drawable.createFromStream(overrideResource.stream(), overrideResource.fileValue())) != null) {
                    return drawableCreateFromStream;
                }
            }
        } catch (Throwable th) {
            Log.exception(th);
        }
        return super.getDrawable(i);
    }

    public <T> Var<T> getOverrideResource(int i) throws Resources.NotFoundException {
        String resourceEntryName;
        String resourceTypeName;
        Var<HashMap<String, Object>> var;
        try {
            resourceEntryName = getResourceEntryName(i);
            resourceTypeName = getResourceTypeName(i);
            var = FileManager.resources;
        } catch (Exception e) {
            Log.e("Error getting resource", e);
        }
        if (var == null) {
            return null;
        }
        int i2 = 0;
        HashMap map = (HashMap) CollectionUtil.uncheckedCast(var.objectForKeyPath(new Object[0]));
        HashMap map2 = new HashMap();
        synchronized (VarCache.valuesFromClient) {
            for (String str : map.keySet()) {
                if (str.toLowerCase().startsWith(resourceTypeName)) {
                    String str2 = null;
                    for (String str3 : ((HashMap) CollectionUtil.uncheckedCast(map.get(str))).keySet()) {
                        String strReplace = str3.replace("\\.", ".");
                        int iLastIndexOf = strReplace.lastIndexOf(46);
                        if (iLastIndexOf >= 0) {
                            strReplace = strReplace.substring(0, iLastIndexOf);
                        }
                        if (strReplace.equals(resourceEntryName)) {
                            str2 = str3;
                        }
                    }
                    if (str2 != null) {
                        map2.put(str, str2);
                    }
                }
            }
        }
        HashMap map3 = new HashMap();
        for (String str4 : map2.keySet()) {
            map3.put(str4, ResourceQualifiers.fromFolder(str4));
        }
        Configuration configuration = getConfiguration();
        DisplayMetrics displayMetrics = getDisplayMetrics();
        HashSet hashSet = new HashSet();
        for (String str5 : map2.keySet()) {
            ResourceQualifiers resourceQualifiers = (ResourceQualifiers) map3.get(str5);
            for (ResourceQualifiers.Qualifier qualifier : resourceQualifiers.qualifiers.keySet()) {
                if (qualifier.getFilter().isMatch(resourceQualifiers.qualifiers.get(qualifier), configuration, displayMetrics)) {
                    hashSet.add(str5);
                }
            }
        }
        ResourceQualifiers.Qualifier[] qualifierArrValues = ResourceQualifiers.Qualifier.values();
        int length = qualifierArrValues.length;
        Set<String> setKeySet = hashSet;
        while (i2 < length) {
            ResourceQualifiers.Qualifier qualifier2 = qualifierArrValues[i2];
            HashMap map4 = new HashMap();
            for (String str6 : setKeySet) {
                Object obj = ((ResourceQualifiers) map3.get(str6)).qualifiers.get(qualifier2);
                if (obj != null) {
                    map4.put(str6, obj);
                }
            }
            Map<String, Object> mapBestMatch = qualifier2.getFilter().bestMatch(map4, configuration, displayMetrics);
            if (!mapBestMatch.isEmpty()) {
                setKeySet = mapBestMatch.keySet();
            }
            i2++;
            setKeySet = setKeySet;
        }
        if (!map2.isEmpty()) {
            String str7 = (String) ((Map.Entry) map2.entrySet().iterator().next()).getValue();
            return VarCache.getVariable("__Android Resources." + str7 + "." + ((String) map2.get(str7)));
        }
        return null;
    }
}
