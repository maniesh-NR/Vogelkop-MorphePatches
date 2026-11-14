package com.leanplum;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.leanplum.callbacks.InboxChangedCallback;
import com.leanplum.callbacks.InboxSyncedCallback;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.internal.AESCrypt;
import com.leanplum.internal.APIConfig;
import com.leanplum.internal.CollectionUtil;
import com.leanplum.internal.Constants;
import com.leanplum.internal.JsonConverter;
import com.leanplum.internal.Log;
import com.leanplum.internal.OperationQueue;
import com.leanplum.internal.Request;
import com.leanplum.internal.RequestBuilder;
import com.leanplum.internal.RequestSender;
import com.leanplum.utils.SharedPreferencesUtil;
import defpackage.sko;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class LeanplumInbox {
    static Set<String> downloadedImageUrls;
    private static LeanplumInbox instance = new LeanplumInbox();
    static boolean isInboxImagePrefetchingEnabled = true;
    private volatile boolean didLoad;
    private final Object updatingLock = new Object();
    private volatile int unreadCount = 0;
    private volatile Map<String, LeanplumInboxMessage> messages = new HashMap();
    private final List<InboxChangedCallback> changedCallbacks = new ArrayList();
    private final List<InboxSyncedCallback> syncedCallbacks = new ArrayList();

    private LeanplumInbox() {
        this.didLoad = false;
        this.didLoad = false;
        downloadedImageUrls = new HashSet();
    }

    private List<LeanplumInboxMessage> allMessages(List<LeanplumInboxMessage> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        try {
            Iterator<String> it = messagesIds().iterator();
            while (it.hasNext()) {
                LeanplumInboxMessage leanplumInboxMessageMessageForId = messageForId(it.next());
                if (leanplumInboxMessageMessageForId != null) {
                    list.add(leanplumInboxMessageMessageForId);
                }
            }
            return list;
        } catch (Throwable th) {
            Log.exception(th);
            return list;
        }
    }

    public static void disableImagePrefetching() {
        isInboxImagePrefetchingEnabled = false;
    }

    public static LeanplumInbox getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void triggerInboxSyncedWithStatus(boolean z, @Nullable InboxSyncedCallback inboxSyncedCallback) {
        if (inboxSyncedCallback == null) {
            triggerInboxSyncedWithStatus(z);
            return;
        }
        addSyncedHandler(inboxSyncedCallback);
        triggerInboxSyncedWithStatus(z);
        removeSyncedHandler(inboxSyncedCallback);
    }

    private List<LeanplumInboxMessage> unreadMessages(List<LeanplumInboxMessage> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        for (LeanplumInboxMessage leanplumInboxMessage : allMessages(null)) {
            if (!leanplumInboxMessage.isRead()) {
                list.add(leanplumInboxMessage);
            }
        }
        return list;
    }

    public void addChangedHandler(InboxChangedCallback inboxChangedCallback) {
        synchronized (this.changedCallbacks) {
            this.changedCallbacks.add(inboxChangedCallback);
        }
        if (this.didLoad) {
            inboxChangedCallback.inboxChanged();
        }
    }

    public void addSyncedHandler(InboxSyncedCallback inboxSyncedCallback) {
        synchronized (this.syncedCallbacks) {
            this.syncedCallbacks.add(inboxSyncedCallback);
        }
    }

    public List<LeanplumInboxMessage> allMessages() {
        return allMessages(new ArrayList());
    }

    public int count() {
        return this.messages.size();
    }

    public void downloadMessages() {
        downloadMessages(null);
    }

    public void downloadMessages(@Nullable final InboxSyncedCallback inboxSyncedCallback) {
        if (Constants.isNoop()) {
            return;
        }
        Request requestCreate = RequestBuilder.withGetInboxMessagesAction().andType(Request.RequestType.IMMEDIATE).create();
        requestCreate.onResponse(new Request.ResponseCallback() { // from class: com.leanplum.LeanplumInbox.2
            @Override // com.leanplum.internal.Request.ResponseCallback
            public void response(JSONObject jSONObject) {
                try {
                    if (jSONObject == null) {
                        Log.e("No inbox response received from the server.", new Object[0]);
                        return;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("newsfeedMessages");
                    if (jSONObjectOptJSONObject == null) {
                        Log.e("No inbox messages found in the response from the server. %s", jSONObject);
                        return;
                    }
                    final HashMap map = new HashMap();
                    Boolean boolValueOf = Boolean.FALSE;
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    final int i = 0;
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONObject jSONObject2 = jSONObjectOptJSONObject.getJSONObject(next);
                        Map mapMapFromJson = JsonConverter.mapFromJson(jSONObject2.getJSONObject(Constants.Keys.MESSAGE_DATA).getJSONObject("vars"));
                        Long lValueOf = Long.valueOf(jSONObject2.getLong(Constants.Keys.DELIVERY_TIMESTAMP));
                        Long lValueOf2 = jSONObject2.opt(Constants.Keys.EXPIRATION_TIMESTAMP) != null ? Long.valueOf(jSONObject2.getLong(Constants.Keys.EXPIRATION_TIMESTAMP)) : null;
                        boolean z = jSONObject2.getBoolean(Constants.Keys.IS_READ);
                        LeanplumInboxMessage leanplumInboxMessageConstructMessage = LeanplumInboxMessage.constructMessage(next, lValueOf, lValueOf2, z, mapMapFromJson);
                        if (leanplumInboxMessageConstructMessage != null) {
                            boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() | leanplumInboxMessageConstructMessage.downloadImageIfPrefetchingEnabled());
                            if (!z) {
                                i++;
                            }
                            map.put(next, leanplumInboxMessageConstructMessage);
                        }
                    }
                    if (boolValueOf.booleanValue()) {
                        Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new VariablesChangedCallback() { // from class: com.leanplum.LeanplumInbox.2.1
                            @Override // com.leanplum.callbacks.VariablesChangedCallback
                            public void variablesChanged() {
                                LeanplumInbox.this.update(map, i, true);
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                LeanplumInbox.this.triggerInboxSyncedWithStatus(true, inboxSyncedCallback);
                            }
                        });
                    } else {
                        LeanplumInbox.this.update(map, i, true);
                        LeanplumInbox.this.triggerInboxSyncedWithStatus(true, inboxSyncedCallback);
                    }
                } catch (Throwable th) {
                    LeanplumInbox.this.triggerInboxSyncedWithStatus(false, inboxSyncedCallback);
                    Log.exception(th);
                }
            }
        });
        requestCreate.onError(new Request.ErrorCallback() { // from class: com.leanplum.LeanplumInbox.3
            @Override // com.leanplum.internal.Request.ErrorCallback
            public void error(Exception exc) {
                LeanplumInbox.this.triggerInboxSyncedWithStatus(false, inboxSyncedCallback);
            }
        });
        RequestSender.getInstance().send(requestCreate);
    }

    public boolean isInboxImagePrefetchingEnabled() {
        return isInboxImagePrefetchingEnabled;
    }

    public void load() {
        int i;
        if (Constants.isNoop()) {
            return;
        }
        SharedPreferences sharedPreferences = Leanplum.getContext().getSharedPreferences(Constants.Defaults.LEANPLUM, 0);
        if (!Constants.allowStorageWithoutLegacyToken && APIConfig.getInstance().token() == null) {
            update(new HashMap<>(), 0, false);
            return;
        }
        String strDecodePreference = new AESCrypt(APIConfig.getInstance().appId(), APIConfig.getInstance().token()).decodePreference(sharedPreferences, Constants.Defaults.INBOX_KEY, "{}");
        Map<String, Object> mapFromJson = JsonConverter.fromJson(strDecodePreference);
        HashMap map = new HashMap();
        if (mapFromJson == null) {
            Log.e(sko.j("Could not parse newsfeed string: ", strDecodePreference), new Object[0]);
            i = 0;
        } else {
            i = 0;
            for (Map.Entry<String, Object> entry : mapFromJson.entrySet()) {
                String key = entry.getKey();
                LeanplumInboxMessage leanplumInboxMessageCreateFromJsonMap = LeanplumInboxMessage.createFromJsonMap(key, (Map) CollectionUtil.uncheckedCast(entry.getValue()));
                if (leanplumInboxMessageCreateFromJsonMap != null && leanplumInboxMessageCreateFromJsonMap.isActive()) {
                    map.put(key, leanplumInboxMessageCreateFromJsonMap);
                    if (!leanplumInboxMessageCreateFromJsonMap.isRead()) {
                        i++;
                    }
                }
            }
        }
        update(map, i, false);
    }

    public LeanplumInboxMessage messageForId(String str) {
        return this.messages.get(str);
    }

    public List<String> messagesIds() {
        ArrayList arrayList = new ArrayList(this.messages.keySet());
        try {
            Collections.sort(arrayList, new Comparator<String>() { // from class: com.leanplum.LeanplumInbox.1
                @Override // java.util.Comparator
                public int compare(String str, String str2) {
                    LeanplumInboxMessage leanplumInboxMessageMessageForId = LeanplumInbox.this.messageForId(str);
                    if (leanplumInboxMessageMessageForId == null) {
                        return -1;
                    }
                    LeanplumInboxMessage leanplumInboxMessageMessageForId2 = LeanplumInbox.this.messageForId(str2);
                    if (leanplumInboxMessageMessageForId2 == null) {
                        return 1;
                    }
                    Date deliveryTimestamp = leanplumInboxMessageMessageForId.getDeliveryTimestamp();
                    if (deliveryTimestamp == null) {
                        return -1;
                    }
                    Date deliveryTimestamp2 = leanplumInboxMessageMessageForId2.getDeliveryTimestamp();
                    if (deliveryTimestamp2 == null) {
                        return 1;
                    }
                    return deliveryTimestamp.compareTo(deliveryTimestamp2);
                }
            });
            return arrayList;
        } catch (Throwable th) {
            Log.exception(th);
            return arrayList;
        }
    }

    public void removeChangedHandler(InboxChangedCallback inboxChangedCallback) {
        synchronized (this.changedCallbacks) {
            this.changedCallbacks.remove(inboxChangedCallback);
        }
    }

    public void removeMessage(String str) {
        int i = this.unreadCount;
        LeanplumInboxMessage leanplumInboxMessageMessageForId = messageForId(str);
        if (leanplumInboxMessageMessageForId != null && !leanplumInboxMessageMessageForId.isRead()) {
            i--;
        }
        this.messages.remove(str);
        update(this.messages, i, true);
        if (Constants.isNoop()) {
            return;
        }
        RequestSender.getInstance().send(RequestBuilder.withDeleteInboxMessageAction().andParam(Constants.Params.INBOX_MESSAGE_ID, str).create());
    }

    public void removeSyncedHandler(InboxSyncedCallback inboxSyncedCallback) {
        synchronized (this.syncedCallbacks) {
            this.syncedCallbacks.remove(inboxSyncedCallback);
        }
    }

    public void save() {
        if (Constants.isNoop()) {
            return;
        }
        if (Constants.allowStorageWithoutLegacyToken || APIConfig.getInstance().token() != null) {
            SharedPreferences.Editor editorEdit = Leanplum.getContext().getSharedPreferences(Constants.Defaults.LEANPLUM, 0).edit();
            HashMap map = new HashMap();
            for (Map.Entry<String, LeanplumInboxMessage> entry : this.messages.entrySet()) {
                map.put(entry.getKey(), entry.getValue().toJsonMap());
            }
            editorEdit.putString(Constants.Defaults.INBOX_KEY, new AESCrypt(APIConfig.getInstance().appId(), APIConfig.getInstance().token()).encrypt(JsonConverter.toJson(map)));
            SharedPreferencesUtil.commitChanges(editorEdit);
        }
    }

    public void triggerChanged() {
        synchronized (this.changedCallbacks) {
            Iterator<InboxChangedCallback> it = this.changedCallbacks.iterator();
            while (it.hasNext()) {
                OperationQueue.sharedInstance().addUiOperation(it.next());
            }
        }
    }

    public void triggerInboxSyncedWithStatus(boolean z) {
        synchronized (this.changedCallbacks) {
            for (InboxSyncedCallback inboxSyncedCallback : this.syncedCallbacks) {
                inboxSyncedCallback.setSuccess(z);
                OperationQueue.sharedInstance().addUiOperation(inboxSyncedCallback);
            }
        }
    }

    public int unreadCount() {
        return this.unreadCount;
    }

    public List<LeanplumInboxMessage> unreadMessages() {
        return unreadMessages(new ArrayList());
    }

    public void update(Map<String, LeanplumInboxMessage> map, int i, boolean z) {
        try {
            synchronized (this.updatingLock) {
                this.unreadCount = i;
                if (map != null) {
                    this.messages = map;
                }
            }
            this.didLoad = true;
            if (z) {
                save();
            }
            triggerChanged();
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public void updateUnreadCount(int i) {
        this.unreadCount = i;
        save();
        triggerChanged();
    }
}
