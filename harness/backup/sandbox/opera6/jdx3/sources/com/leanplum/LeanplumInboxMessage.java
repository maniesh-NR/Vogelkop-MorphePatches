package com.leanplum;

import android.net.Uri;
import android.text.TextUtils;
import com.leanplum.internal.CollectionUtil;
import com.leanplum.internal.Constants;
import com.leanplum.internal.FileManager;
import com.leanplum.internal.JsonConverter;
import com.leanplum.internal.Log;
import com.leanplum.internal.RequestBuilder;
import com.leanplum.internal.RequestSender;
import com.leanplum.internal.Util;
import defpackage.sko;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class LeanplumInboxMessage {
    private ActionContext context;
    private Long deliveryTimestamp;
    private Long expirationTimestamp;
    private String imageFileName;
    private String imageUrl;
    private boolean isRead;
    private String messageId;

    private LeanplumInboxMessage(String str, Long l, Long l2, boolean z, ActionContext actionContext) {
        this.messageId = str;
        this.deliveryTimestamp = l;
        this.expirationTimestamp = l2;
        this.isRead = z;
        this.context = actionContext;
        String strStringNamed = actionContext.stringNamed(Constants.Keys.INBOX_IMAGE);
        this.imageUrl = strStringNamed;
        if (strStringNamed != null) {
            try {
                this.imageFileName = Util.sha256(strStringNamed);
            } catch (Exception unused) {
            }
        }
    }

    private Map<String, Object> actionArgs() {
        return this.context.getArgs();
    }

    public static LeanplumInboxMessage constructMessage(String str, Long l, Long l2, boolean z, Map<String, Object> map) {
        if (!isValidMessageId(str)) {
            Log.e(sko.j("Malformed inbox messageId: ", str), new Object[0]);
            return null;
        }
        ActionContext actionContext = new ActionContext((String) map.get(Constants.Values.ACTION_ARG), map, str.split("##")[0]);
        actionContext.preventRealtimeUpdating();
        actionContext.update();
        return new LeanplumInboxMessage(str, l, l2, z, actionContext);
    }

    public static LeanplumInboxMessage createFromJsonMap(String str, Map<String, Object> map) {
        Map map2 = (Map) CollectionUtil.uncheckedCast(map.get(Constants.Keys.MESSAGE_DATA));
        Long l = (Long) CollectionUtil.uncheckedCast(map.get(Constants.Keys.DELIVERY_TIMESTAMP));
        Long l2 = (Long) CollectionUtil.uncheckedCast(map.get(Constants.Keys.EXPIRATION_TIMESTAMP));
        Boolean bool = (Boolean) CollectionUtil.uncheckedCast(map.get(Constants.Keys.IS_READ));
        return constructMessage(str, l, l2, bool != null ? bool.booleanValue() : false, map2);
    }

    private static boolean isValidMessageId(String str) {
        return str.split("##").length == 2;
    }

    private void setIsRead(boolean z) {
        this.isRead = z;
    }

    public boolean downloadImageIfPrefetchingEnabled() {
        if (LeanplumInbox.isInboxImagePrefetchingEnabled && !TextUtils.isEmpty(this.imageUrl) && !LeanplumInbox.downloadedImageUrls.contains(this.imageUrl)) {
            String str = this.imageFileName;
            String str2 = this.imageUrl;
            FileManager.DownloadFileResult downloadFileResultMaybeDownloadFile = FileManager.maybeDownloadFile(true, str, str2, str2, null);
            LeanplumInbox.downloadedImageUrls.add(this.imageUrl);
            if (FileManager.DownloadFileResult.DOWNLOADING == downloadFileResultMaybeDownloadFile) {
                return true;
            }
        }
        return false;
    }

    public ActionContext getContext() {
        return this.context;
    }

    public JSONObject getData() {
        try {
            return JsonConverter.mapToJsonObject((Map) CollectionUtil.uncheckedCast(getContext().objectNamed(Constants.Keys.DATA)));
        } catch (Throwable unused) {
            Log.i("Unable to parse JSONObject for Data field of inbox message.", new Object[0]);
            return null;
        }
    }

    public Date getDeliveryTimestamp() {
        if (this.deliveryTimestamp == null) {
            return null;
        }
        return new Date(this.deliveryTimestamp.longValue());
    }

    public Date getExpirationTimestamp() {
        if (this.expirationTimestamp == null) {
            return null;
        }
        return new Date(this.expirationTimestamp.longValue());
    }

    public String getImageFilePath() {
        String strFileValue = FileManager.fileValue(this.imageFileName);
        if (FileManager.fileExistsAtPath(strFileValue)) {
            return new File(strFileValue).getAbsolutePath();
        }
        if (LeanplumInbox.getInstance().isInboxImagePrefetchingEnabled()) {
            return null;
        }
        Log.i("Inbox Message image path is null because you're calling disableImagePrefetching. Consider using imageURL method or remove disableImagePrefetching.", new Object[0]);
        return null;
    }

    public Uri getImageUrl() {
        String strFileValue = FileManager.fileValue(this.imageFileName);
        if (FileManager.fileExistsAtPath(strFileValue)) {
            return Uri.fromFile(new File(strFileValue));
        }
        if (TextUtils.isEmpty(this.imageUrl)) {
            return null;
        }
        return Uri.parse(this.imageUrl);
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getSubtitle() {
        return this.context.stringNamed(Constants.Keys.SUBTITLE);
    }

    public String getTitle() {
        return this.context.stringNamed("Title");
    }

    public boolean isActive() {
        if (this.expirationTimestamp == null) {
            return true;
        }
        return new Date().before(new Date(this.expirationTimestamp.longValue()));
    }

    public boolean isRead() {
        return this.isRead;
    }

    public void markAsRead() {
        try {
            if (Constants.isNoop() || this.isRead) {
                return;
            }
            setIsRead(true);
            LeanplumInbox.getInstance().updateUnreadCount(LeanplumInbox.getInstance().unreadCount() - 1);
            RequestSender.getInstance().send(RequestBuilder.withMarkInboxMessageAsReadAction().andParam(Constants.Params.INBOX_MESSAGE_ID, this.messageId).create());
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public void read() {
        try {
            if (Constants.isNoop()) {
                return;
            }
            markAsRead();
            getContext().runTrackedActionNamed(Constants.Values.DEFAULT_PUSH_ACTION);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public void remove() {
        try {
            LeanplumInbox.getInstance().removeMessage(this.messageId);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public Map<String, Object> toJsonMap() {
        HashMap map = new HashMap();
        map.put(Constants.Keys.DELIVERY_TIMESTAMP, this.deliveryTimestamp);
        map.put(Constants.Keys.EXPIRATION_TIMESTAMP, this.expirationTimestamp);
        map.put(Constants.Keys.MESSAGE_DATA, actionArgs());
        map.put(Constants.Keys.IS_READ, Boolean.valueOf(isRead()));
        return map;
    }
}
