package com.opera.android.downloads;

import J.N;
import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import com.leanplum.internal.RequestBuilder;
import com.opera.android.OperaApplication;
import defpackage.bp;
import defpackage.cg;
import defpackage.cm;
import defpackage.dg7;
import defpackage.e7d;
import defpackage.fsp;
import defpackage.l1f;
import defpackage.re7;
import defpackage.rf7;
import defpackage.sf7;
import defpackage.ua7;
import defpackage.wt2;
import java.util.Collections;
import org.chromium.base.CommandLine;

/* loaded from: classes.dex */
public class DownloadService extends zp5 {
    public static final boolean e;
    public static final bp f;
    public cg c;
    public eg7 d;

    static {
        e = Build.VERSION.SDK_INT < 34 || "Xiaomi".equalsIgnoreCase(Build.MANUFACTURER);
        f = new bp(DownloadService.class);
    }

    public DownloadService() throws SecurityException {
        super(f);
        e(null, "<init>");
    }

    public static void d(Context context, boolean z) {
        if (!e) {
            int i = DownloadJobService.d;
            g8.g(context, z);
            return;
        }
        bp bpVar = f;
        if (!z) {
            e(context, RequestBuilder.ACTION_STOP);
            bpVar.c0(context);
        } else {
            e(context, RequestBuilder.ACTION_START);
            if (bpVar.b0(context)) {
                return;
            }
            g(context);
        }
    }

    public static void e(Context context, String str) throws SecurityException {
        f.T(context, str);
    }

    public static void g(Context context) {
        ua7 ua7VarT = zi4.t("downloads_active", new cm((String) null, 2131362541, (byte) 5));
        ua7VarT.S(R.drawable.stat_sys_download);
        l1f l1fVar = (l1f) ua7VarT.b;
        l1fVar.h(8, true);
        ua7VarT.P(context.getString(2132018636));
        ua7VarT.O(context.getString(2132018634));
        String string = context.getString(2132018635);
        Intent intent = new Intent(context, (Class<?>) DownloadNotifierReceiver.class);
        intent.setAction("com.opera.android.action.RESUME_DOWNLOADS");
        l1fVar.a(0, string, PendingIntent.getBroadcast(context, 0, intent, 67108864));
        aib.t().H(ua7VarT.l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        g(this);
        super.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() throws SecurityException {
        e(getApplicationContext(), "ctrl_disconnect");
        String[] strArr = OperaApplication.K;
        rf7 rf7Var = ((OperaApplication) getApplicationContext()).m().a;
        rf7Var.v();
        try {
            for (re7 re7Var : Collections.unmodifiableList(rf7Var.c)) {
                if (re7Var.m() || re7Var.w) {
                    DownloadPauseManager downloadPauseManager = re7Var.a.b;
                    N.MUhg9A8g(downloadPauseManager.a, re7Var.t.getId(), 2);
                }
            }
            rf7Var.w();
            Context applicationContext = getApplicationContext();
            int i = DownloadJobService.d;
            g8.g(applicationContext, true);
            d(getApplicationContext(), false);
        } catch (Throwable th) {
            rf7Var.w();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() throws SecurityException {
        super/*android.app.Service*/.onCreate();
        e(getApplicationContext(), "create");
        cg cgVar = new cg(this, new dg7(this, (byte) 0));
        this.c = cgVar;
        b(cgVar.g(), 2131362541);
        if (f.a == 3) {
            return;
        }
        cg cgVar2 = this.c;
        Context context = cgVar2.b;
        String[] strArr = OperaApplication.K;
        sf7 sf7VarM = ((OperaApplication) context.getApplicationContext()).m();
        sf7VarM.c.a(cgVar2.i);
        sf7VarM.a.b(cgVar2.h);
        CommandLine commandLine = ((OperaApplication) getApplicationContext()).n;
        if (commandLine == null) {
            commandLine = null;
        }
        fsp.g(this, commandLine);
        e7d.a(this, new wt2(this, (byte) 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() throws SecurityException {
        ConnectivityManager connectivityManager;
        super.onDestroy();
        e(getApplicationContext(), "destroy");
        if (this.d != null && (connectivityManager = (ConnectivityManager) getSystemService("connectivity")) != null) {
            connectivityManager.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.d);
            this.d = null;
        }
        this.c.h();
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int onStartCommand(Intent intent, int i, int i2) throws SecurityException {
        Context applicationContext = getApplicationContext();
        StringBuilder sb = new StringBuilder("onStart[");
        sb.append(intent == null ? "null" : "avail");
        sb.append(",fl=");
        sb.append(i);
        sb.append("]");
        e(applicationContext, sb.toString());
        b(this.c.g(), 2131362541);
        return super.onStartCommand(intent, i, i2);
    }
}
