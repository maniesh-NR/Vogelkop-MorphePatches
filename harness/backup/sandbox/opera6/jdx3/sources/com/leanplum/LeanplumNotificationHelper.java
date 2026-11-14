package com.leanplum;

import android.R;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.IconCompat;
import com.leanplum.internal.CollectionUtil;
import com.leanplum.internal.Constants;
import com.leanplum.internal.JsonConverter;
import com.leanplum.internal.Log;
import com.leanplum.utils.BitmapUtil;
import com.leanplum.utils.BuildUtil;
import defpackage.g1f;
import defpackage.l1f;
import defpackage.n1f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* loaded from: classes.dex */
class LeanplumNotificationHelper {
    private static final String LEANPLUM_DEFAULT_PUSH_ICON = "leanplum_default_push_icon";

    static class NotificationGroupInfo {
        final int id;

        @NonNull
        final String key;
        final int minNotificationsToGroup;

        @Nullable
        final String tag;

        public NotificationGroupInfo(@Nullable String str, int i, @NonNull String str2, int i2) {
            this.tag = str;
            this.id = i;
            this.key = str2;
            this.minNotificationsToGroup = i2;
        }
    }

    public static boolean areNotificationsEnabled(Context context, Bundle bundle) {
        if (!new l2f(context).b.areNotificationsEnabled()) {
            return false;
        }
        if (!BuildUtil.isNotificationChannelSupported(context)) {
            return true;
        }
        String strResolveChannelId = resolveChannelId(context, bundle);
        return !TextUtils.isEmpty(strResolveChannelId) && isChannelEnabled(context, strResolveChannelId);
    }

    @TargetApi(16)
    private static boolean canCreateIconDrawable(Context context) {
        try {
            return Drawable.createFromStream(context.getResources().openRawResource(context.getApplicationInfo().icon), "applicationInfo.icon") != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Nullable
    public static Bitmap getBigPictureBitmap(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Bitmap scaledBitmap = BitmapUtil.getScaledBitmap(context, str);
        if (scaledBitmap == null) {
            Log.i("Failed to download image for push notification: %s", str);
        }
        return scaledBitmap;
    }

    @TargetApi(16)
    public static Notification.BigPictureStyle getBigPictureStyle(Bundle bundle, Bitmap bitmap, String str, String str2) {
        if (bundle == null || bitmap == null) {
            return null;
        }
        return new Notification.BigPictureStyle().bigPicture(bitmap).setBigContentTitle(str).setSummaryText(str2);
    }

    public static l1f getDefaultCompatNotificationBuilder(Context context, boolean z) {
        if (!z) {
            return new l1f(context, null);
        }
        String defaultNotificationChannelId = LeanplumNotificationChannel.getDefaultNotificationChannelId(context);
        if (!TextUtils.isEmpty(defaultNotificationChannelId)) {
            return new l1f(context, defaultNotificationChannelId);
        }
        Log.e("Failed to post notification, there are no notification channels configured.", new Object[0]);
        return null;
    }

    @TargetApi(26)
    private static Notification.Builder getDefaultNotificationBuilder(Context context, boolean z) {
        if (!z) {
            return new Notification.Builder(context);
        }
        String defaultNotificationChannelId = LeanplumNotificationChannel.getDefaultNotificationChannelId(context);
        if (!TextUtils.isEmpty(defaultNotificationChannelId)) {
            return new Notification.Builder(context, defaultNotificationChannelId);
        }
        Log.e("Failed to post notification, there are no notification channels configured.", new Object[0]);
        return null;
    }

    public static int getDefaultPushNotificationIconResourceId(Context context) {
        try {
            return context.getResources().getIdentifier(LEANPLUM_DEFAULT_PUSH_ICON, "drawable", context.getPackageName());
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static Bitmap getLargeIconBitmap(Context context, String str) {
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Bitmap scaledBitmap = BitmapUtil.getScaledBitmap(str, resources.getDimensionPixelSize(R.dimen.notification_large_icon_width), resources.getDimensionPixelSize(R.dimen.notification_large_icon_height));
        if (scaledBitmap == null) {
            Log.i("Failed to download large icon for push notification: %s", str);
        }
        return scaledBitmap;
    }

    private static Notification.Builder getNotificationBuilder(Context context, Bundle bundle) {
        if (!BuildUtil.isNotificationChannelSupported(context)) {
            return new Notification.Builder(context);
        }
        try {
            String string = bundle.getString(Constants.Keys.PUSH_NOTIFICATION_CHANNEL);
            if (TextUtils.isEmpty(string)) {
                return getDefaultNotificationBuilder(context, true);
            }
            String strCreateNotificationChannel = LeanplumNotificationChannel.createNotificationChannel(context, JsonConverter.fromJson(string));
            if (!TextUtils.isEmpty(strCreateNotificationChannel)) {
                return new Notification.Builder(context, strCreateNotificationChannel);
            }
            Log.e("Failed to post notification to specified channel.", new Object[0]);
            return null;
        } catch (Exception unused) {
            Log.e("Failed to post notification to specified channel.", new Object[0]);
            return null;
        }
    }

    public static Notification.Builder getNotificationBuilder(Context context, Bundle bundle, PendingIntent pendingIntent, String str, String str2, Bitmap bitmap, int i, NotificationGroupInfo notificationGroupInfo) {
        Notification.Builder notificationBuilder = getNotificationBuilder(context, bundle);
        if (notificationBuilder == null) {
            return null;
        }
        if (i == 0) {
            notificationBuilder.setSmallIcon(context.getApplicationInfo().icon);
        } else {
            notificationBuilder.setSmallIcon(i);
        }
        notificationBuilder.setContentTitle(str).setContentText(str2).setLargeIcon(bitmap);
        notificationBuilder.setStyle(new Notification.BigTextStyle().bigText(str2));
        if (!BuildUtil.isNotificationChannelSupported(context)) {
            notificationBuilder.setPriority(2);
        }
        notificationBuilder.setAutoCancel(true);
        notificationBuilder.setContentIntent(pendingIntent);
        if (isGroupingSupported().booleanValue() && notificationGroupInfo != null) {
            notificationBuilder.setGroup(notificationGroupInfo.key);
        }
        return notificationBuilder;
    }

    public static l1f getNotificationCompatBuilder(Context context, Bundle bundle) {
        if (!BuildUtil.isNotificationChannelSupported(context)) {
            return new l1f(context, null);
        }
        try {
            String string = bundle.getString(Constants.Keys.PUSH_NOTIFICATION_CHANNEL);
            if (TextUtils.isEmpty(string)) {
                return getDefaultCompatNotificationBuilder(context, true);
            }
            String strCreateNotificationChannel = LeanplumNotificationChannel.createNotificationChannel(context, JsonConverter.fromJson(string));
            if (!TextUtils.isEmpty(strCreateNotificationChannel)) {
                return new l1f(context, strCreateNotificationChannel);
            }
            Log.e("Failed to post notification to specified channel.", new Object[0]);
            return null;
        } catch (Exception unused) {
            Log.e("Failed to post notification to specified channel.", new Object[0]);
            return null;
        }
    }

    public static l1f getNotificationCompatBuilder(Context context, Bundle bundle, PendingIntent pendingIntent, String str, String str2, Bitmap bitmap, Bitmap bitmap2, int i, NotificationGroupInfo notificationGroupInfo) {
        l1f notificationCompatBuilder;
        if (bundle == null || (notificationCompatBuilder = getNotificationCompatBuilder(context, bundle)) == null) {
            return null;
        }
        Notification notification = notificationCompatBuilder.G;
        if (i == 0) {
            notification.icon = context.getApplicationInfo().icon;
        } else {
            notification.icon = i;
        }
        notificationCompatBuilder.e = l1f.c(str);
        g1f g1fVar = new g1f((byte) 0);
        g1fVar.e = l1f.c(str2);
        notificationCompatBuilder.j(g1fVar);
        notificationCompatBuilder.f = l1f.c(str2);
        notificationCompatBuilder.i(bitmap);
        if (bitmap2 != null) {
            n1f f1fVar = new f1f((byte) 0);
            ((f1f) f1fVar).e = IconCompat.b(bitmap2);
            f1fVar.c = l1f.c(str);
            f1fVar.d = l1f.c(str2);
            f1fVar.a = true;
            notificationCompatBuilder.j(f1fVar);
        }
        if (!BuildUtil.isNotificationChannelSupported(context)) {
            notificationCompatBuilder.j = 2;
        }
        notificationCompatBuilder.d(true);
        notificationCompatBuilder.g = pendingIntent;
        if (isGroupingSupported().booleanValue() && notificationGroupInfo != null) {
            notificationCompatBuilder.r = notificationGroupInfo.key;
        }
        return notificationCompatBuilder;
    }

    @Nullable
    public static NotificationGroupInfo getNotificationGroupInfo(@Nullable String str) {
        if (!isGroupingSupported().booleanValue()) {
            return null;
        }
        try {
            Map<String, Object> mapFromJson = JsonConverter.fromJson(str);
            if (mapFromJson == null) {
                return null;
            }
            String str2 = (String) CollectionUtil.getOrDefault(mapFromJson, "tag", null);
            String str3 = (String) CollectionUtil.getOrDefault(mapFromJson, "key", null);
            if (str3 == null) {
                return null;
            }
            return new NotificationGroupInfo(str2, ((Integer) CollectionUtil.getOrDefault(mapFromJson, "id", Integer.valueOf(str3.hashCode()))).intValue(), str3, ((Integer) CollectionUtil.getOrDefault(mapFromJson, "min_notifications", 0)).intValue());
        } catch (Throwable unused) {
            Log.i("Failed to parse group info.", new Object[0]);
            return null;
        }
    }

    public static int getNumberOfActiveNotifications(@NonNull NotificationManager notificationManager, @NonNull String str) {
        int i = 0;
        for (StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
            if (str.equals(statusBarNotification.getNotification().getGroup())) {
                i++;
            }
        }
        return i;
    }

    public static boolean isApplicationIconValid(Context context) {
        if (context == null) {
            return false;
        }
        return canCreateIconDrawable(context);
    }

    private static boolean isChannelEnabled(Context context, String str) {
        NotificationChannel notificationChannel = new l2f(context).b.getNotificationChannel(str);
        return notificationChannel != null && notificationChannel.getImportance() > 0;
    }

    public static Boolean isGroupingSupported() {
        return Boolean.TRUE;
    }

    private static String resolveChannelId(Context context, Bundle bundle) {
        String string = bundle.getString(Constants.Keys.PUSH_NOTIFICATION_CHANNEL);
        if (!TextUtils.isEmpty(string)) {
            String str = (String) JsonConverter.fromJson(string).get("id");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        String defaultNotificationChannelId = LeanplumNotificationChannel.getDefaultNotificationChannelId(context);
        if (TextUtils.isEmpty(defaultNotificationChannelId)) {
            return null;
        }
        return defaultNotificationChannelId;
    }

    @TargetApi(21)
    public static void scheduleJobService(Context context, Class cls, int i) {
        if (context != null) {
            ComponentName componentName = new ComponentName(context, (Class<?>) cls);
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null) {
                jobScheduler.schedule(new JobInfo.Builder(verifyJobId(jobScheduler.getAllPendingJobs(), i), componentName).setMinimumLatency(10L).build());
            }
        }
    }

    public static void setModifiedBigPictureStyle(Notification.Builder builder, Notification.Style style) {
        if (builder == null || style == null) {
            return;
        }
        builder.setStyle(style);
    }

    @TargetApi(21)
    private static int verifyJobId(List<JobInfo> list, int i) {
        if (list != null && !list.isEmpty()) {
            TreeSet treeSet = new TreeSet();
            Iterator<JobInfo> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(Integer.valueOf(it.next().getId()));
            }
            if (treeSet.contains(Integer.valueOf(i))) {
                if (((Integer) treeSet.first()).intValue() > Integer.MIN_VALUE) {
                    return ((Integer) treeSet.first()).intValue() - 1;
                }
                if (((Integer) treeSet.last()).intValue() < Integer.MIN_VALUE) {
                    return ((Integer) treeSet.last()).intValue() + 1;
                }
                while (treeSet.contains(Integer.valueOf(i))) {
                    i = new Random().nextInt();
                }
            }
        }
        return i;
    }
}
