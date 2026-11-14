package com.opera.android.notifications;

import J.N;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.OperaApplication;
import defpackage.e7d;
import defpackage.fsp;
import defpackage.kqd;
import defpackage.m2f;
import defpackage.ru9;
import defpackage.wub;
import defpackage.yhe;
import defpackage.za9;
import java.util.ArrayList;
import java.util.HashMap;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.CommandLine;
import org.chromium.base.TraceEvent;

/* loaded from: classes.dex */
public final class NotificationBridge {
    public static final wub a = aib.t();
    public static final HashMap b = new HashMap();

    public interface ActionInfo {
        String a();

        Bitmap getIcon();

        String getTitle();

        int getType();
    }

    public static class ActionInfoArrayBuilder {
        public final ActionInfo[] a;

        public ActionInfoArrayBuilder(int i) {
            this.a = new ActionInfo[i];
        }

        public final ActionInfo[] getArray() {
            return this.a;
        }

        public final void set(int i, @NonNull String str, @Nullable Bitmap bitmap, int i2, @NonNull String str2) {
            this.a[i] = new a(this, str, bitmap, i2, str2);
        }
    }

    public interface Callback {
        void onDone();
    }

    public static class TrampolineActivity extends Activity {
        @Override // android.app.Activity
        public final void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            Intent intent = getIntent();
            if (intent == null || !NotificationBridge.c(intent)) {
                finish();
                return;
            }
            if (Build.VERSION.SDK_INT >= 35) {
                ArrayList arrayListA = ApplicationStatus.a();
                int size = arrayListA.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListA.get(i);
                    i++;
                    int iB = ApplicationStatus.b((Activity) obj);
                    if (iB == 3 || iB == 4) {
                    }
                }
                Context applicationContext = getApplicationContext();
                kqd kqdVar = new kqd((Object) this, (byte) 11);
                String[] strArr = OperaApplication.K;
                CommandLine commandLine = ((OperaApplication) applicationContext.getApplicationContext()).n;
                if (commandLine == null) {
                    commandLine = null;
                }
                fsp.g(applicationContext, commandLine);
                e7d.a(applicationContext, new b(applicationContext, intent, kqdVar));
                return;
            }
            Context applicationContext2 = getApplicationContext();
            applicationContext2.startService(new Intent(intent).setClass(applicationContext2, NotificationService.class));
            finish();
        }
    }

    public static void a(Intent intent, Callback callback) {
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("extra_origin");
        boolean booleanExtra = intent.getBooleanExtra("extra_private_mode", false);
        int intExtra = intent.getIntExtra("extra_action_index", -1);
        String stringExtra2 = intent.getStringExtra("extra_id");
        if (action == null || stringExtra == null || stringExtra2 == null) {
            callback.onDone();
            return;
        }
        boolean zEquals = action.equals("com.opera.android.notification.CLICK");
        HashMap map = b;
        if (zEquals) {
            map.put(stringExtra2, intent.getStringExtra("extra_platform_tag"));
            N.M6fGByfk(booleanExtra, stringExtra2, stringExtra, intExtra, callback);
        } else if (!action.equals("com.opera.android.notification.CLOSE")) {
            callback.onDone();
        } else {
            N.MrDppPR6(booleanExtra, stringExtra2, stringExtra, callback);
            map.remove(stringExtra2);
        }
    }

    public static yhe b(Context context, String str, String str2, String str3, boolean z, int i, String str4, boolean z2) {
        Uri uriBuild = Uri.parse(str3).buildUpon().fragment(z + "," + i + "," + str4).build();
        boolean zEquals = "com.opera.android.notification.CLOSE".equals(str);
        Intent intentPutExtra = new Intent(str, uriBuild).putExtra("extra_platform_tag", str2).putExtra("extra_origin", str3).putExtra("extra_private_mode", z).putExtra("extra_action_index", i).putExtra("extra_id", str4);
        if (zEquals) {
            intentPutExtra.setClass(context, NotificationService.class);
            return new yhe((Object) PendingIntent.getService(context, 0, intentPutExtra, 134217728 | c26.s(z2)), (byte) 8);
        }
        intentPutExtra.setClass(context, TrampolineActivity.class);
        return yhe.f(context, 0, intentPutExtra, 134217728, z2);
    }

    public static boolean c(Intent intent) {
        String action = intent.getAction();
        action.getClass();
        return (action.equals("com.opera.android.notification.CLICK") || action.equals("com.opera.android.notification.CLOSE")) && intent.hasExtra("extra_platform_tag") && intent.hasExtra("extra_origin") && intent.hasExtra("extra_private_mode") && intent.hasExtra("extra_action_index") && intent.hasExtra("extra_id");
    }

    public static void closePersistentNotification(@NonNull String str) {
        HashMap map = b;
        String str2 = (String) map.get(str);
        if (str2 != null) {
            map.remove(str);
            wub wubVar = a;
            wubVar.getClass();
            wub.N(TraceEvent.n("NotificationManagerProxyImpl.cancel(tag, id)", (String) null), new m2f(wubVar, str2, (byte) 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x037d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x037e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void displayNotification(@androidx.annotation.NonNull java.lang.String r18, boolean r19, @androidx.annotation.NonNull java.lang.String r20, @androidx.annotation.NonNull java.lang.String r21, @androidx.annotation.NonNull java.lang.String r22, @androidx.annotation.Nullable android.graphics.Bitmap r23, @androidx.annotation.Nullable android.graphics.Bitmap r24, @androidx.annotation.Nullable android.graphics.Bitmap r25, long r26, boolean r28, boolean r29, @androidx.annotation.NonNull int[] r30, @androidx.annotation.NonNull com.opera.android.notifications.NotificationBridge.ActionInfo[] r31, @androidx.annotation.NonNull java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.notifications.NotificationBridge.displayNotification(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, android.graphics.Bitmap, android.graphics.Bitmap, android.graphics.Bitmap, long, boolean, boolean, int[], com.opera.android.notifications.NotificationBridge$ActionInfo[], java.lang.String):void");
    }

    public static long getNextId() {
        ru9 ru9VarC = ru9.c(t8.a);
        long j = ru9VarC.a.getLong("chr.notifications.next_id_key", 10000L) + 1;
        nv6 nv6VarB = ru9VarC.b();
        ((SharedPreferences.Editor) nv6VarB.a).putLong("chr.notifications.next_id_key", j);
        nv6VarB.w();
        return j;
    }

    public static void logUserClickEvent(boolean z, boolean z2, long j) {
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).L().c.q0(new za9(!z, z2), true, j);
    }
}
