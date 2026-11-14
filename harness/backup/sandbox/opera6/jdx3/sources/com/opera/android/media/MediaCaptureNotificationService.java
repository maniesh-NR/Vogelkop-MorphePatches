package com.opera.android.media;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.IBinder;
import android.util.SparseIntArray;
import com.opera.android.webapps.WebappActivity;
import defpackage.cm;
import defpackage.dx3;
import defpackage.g1f;
import defpackage.l1f;
import defpackage.mdb;
import defpackage.ua7;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class MediaCaptureNotificationService extends Service {
    public static final /* synthetic */ int e = 0;
    public NotificationManager a;
    public Context b;
    public SharedPreferences c;
    public final SparseIntArray d = new SparseIntArray();

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(dx3 dx3Var, int i, int i2, String str) {
        Intent intentB;
        Set setO;
        Context applicationContext = dx3Var.getApplicationContext();
        if (i2 == 0 && ((setO = w1h.o(ht5.a, "WebRTCNotificationIds", (Set) null)) == null || setO.isEmpty() || !setO.contains(String.valueOf(i)))) {
            return;
        }
        if (dx3Var instanceof WebappActivity) {
            intentB = dx3Var.getIntent();
        } else if (i != Integer.MIN_VALUE) {
            intentB = mdb.b(dx3Var);
            intentB.setAction("com.opera.android.action.ACTIVATE_TAB");
            intentB.putExtra("tabId", i);
        } else {
            intentB = null;
        }
        PendingIntent activity = intentB != null ? PendingIntent.getActivity(dx3Var, i, intentB, 67108864) : null;
        Intent intent = new Intent(applicationContext, (Class<?>) MediaCaptureNotificationService.class);
        intent.setAction("org.chromium.chrome.browser.media.SCREEN_CAPTURE_UPDATE");
        intent.putExtra("NotificationId", i);
        try {
            URL url = new URL(str);
            str = url.getProtocol() + "://" + url.getHost();
        } catch (MalformedURLException unused) {
        }
        intent.putExtra("NotificationMediaUrl", str);
        intent.putExtra("NotificationMediaType", i2);
        if (activity != null) {
            intent.putExtra("NotificationTabIntent", activity);
        }
        applicationContext.startService(intent);
    }

    public final void a() {
        Set setO = w1h.o(this.c, "WebRTCNotificationIds", (Set) null);
        if (setO == null) {
            return;
        }
        Iterator it = setO.iterator();
        while (it.hasNext()) {
            this.a.cancel("MediaCaptureNotificationService", Integer.parseInt((String) it.next()));
        }
        SharedPreferences.Editor editorEdit = this.c.edit();
        editorEdit.remove("WebRTCNotificationIds");
        editorEdit.apply();
    }

    public final void c(int i, boolean z) {
        HashSet hashSetM = w1h.m(this.c, "WebRTCNotificationIds");
        if (z && !hashSetM.isEmpty() && hashSetM.contains(String.valueOf(i))) {
            hashSetM.remove(String.valueOf(i));
        } else if (!z) {
            hashSetM.add(String.valueOf(i));
        }
        this.c.edit().putStringSet("WebRTCNotificationIds", hashSetM).apply();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        this.b = applicationContext;
        this.a = (NotificationManager) applicationContext.getSystemService("notification");
        this.c = ht5.a;
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) throws Resources.NotFoundException {
        String string;
        if (intent == null || intent.getExtras() == null) {
            a();
            stopSelf();
        } else {
            String action = intent.getAction();
            int intExtra = intent.getIntExtra("NotificationId", Integer.MIN_VALUE);
            int intExtra2 = intent.getIntExtra("NotificationMediaType", 0);
            String stringExtra = intent.getStringExtra("NotificationMediaUrl");
            if ("org.chromium.chrome.browser.media.SCREEN_CAPTURE_UPDATE".equals(action)) {
                PendingIntent pendingIntent = (PendingIntent) yi4.x(intent, "NotificationTabIntent", PendingIntent.class);
                SparseIntArray sparseIntArray = this.d;
                if (sparseIntArray.indexOfKey(intExtra) < 0 || sparseIntArray.get(intExtra) != intExtra2) {
                    if (sparseIntArray.indexOfKey(intExtra) >= 0) {
                        this.a.cancel("MediaCaptureNotificationService", intExtra);
                        sparseIntArray.delete(intExtra);
                        c(intExtra, true);
                    }
                    if (intExtra2 != 0) {
                        ua7 ua7VarT = zi4.t(intExtra2 == 4 ? "screen_capture" : "media", new cm("MediaCaptureNotificationService", intExtra, (byte) 5));
                        l1f l1fVar = (l1f) ua7VarT.b;
                        l1fVar.d(false);
                        ua7VarT.R(true);
                        l1fVar.f(this.b.getString(2132017591));
                        int i3 = 2131231938;
                        if (intExtra2 != 1 && intExtra2 != 2) {
                            if (intExtra2 == 3) {
                                i3 = 2131231937;
                            } else if (intExtra2 != 4) {
                                i3 = 0;
                            }
                        }
                        ua7VarT.S(i3);
                        l1fVar.t = true;
                        if (intExtra2 == 4) {
                            string = this.b.getResources().getString(2132020991, stringExtra);
                        } else {
                            string = this.b.getResources().getString(intExtra2 == 1 ? 2132022100 : intExtra2 == 2 ? 2132022103 : intExtra2 == 3 ? 2132017640 : 0);
                        }
                        StringBuilder sb = new StringBuilder(string);
                        sb.append('.');
                        if (pendingIntent != null) {
                            l1fVar.g = pendingIntent;
                            sb.append(this.b.getResources().getString(2132019747, stringExtra));
                        } else {
                            sb.append(" ");
                            sb.append(stringExtra);
                        }
                        ua7VarT.O(sb.toString());
                        String string2 = sb.toString();
                        g1f g1fVar = new g1f((byte) 0);
                        if (((l1f) g1fVar.b) != l1fVar) {
                            g1fVar.b = l1fVar;
                            l1fVar.j(g1fVar);
                        }
                        g1fVar.e = l1f.c(string2);
                        l1f l1fVar2 = (l1f) g1fVar.b;
                        this.a.notify("MediaCaptureNotificationService", intExtra, l1fVar2 != null ? l1fVar2.b() : null);
                        sparseIntArray.put(intExtra, intExtra2);
                        c(intExtra, false);
                    }
                    if (sparseIntArray.size() == 0) {
                        stopSelf();
                    }
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        a();
        return super.onUnbind(intent);
    }
}
