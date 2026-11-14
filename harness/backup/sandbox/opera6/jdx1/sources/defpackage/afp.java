package defpackage;

import ads_mobile_sdk.am2;
import ads_mobile_sdk.em1;
import ads_mobile_sdk.iu0;
import ads_mobile_sdk.ku0;
import ads_mobile_sdk.pm1;
import ads_mobile_sdk.qm1;
import ads_mobile_sdk.t7;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class afp implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qm1 b;

    public /* synthetic */ afp(qm1 qm1Var, byte b) {
        this.a = b;
        this.b = qm1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        lgp lgpVar;
        h1b h1bVarS;
        int i;
        int i2;
        String string;
        StringWriter stringWriter;
        int i3;
        char c;
        int i4;
        switch (this.a) {
            case 0:
                int i5 = 2;
                qm1 qm1Var = this.b;
                synchronized (qm1Var.n) {
                    lgp lgpVar2 = qm1Var.q;
                    iu0 iu0Var = (iu0) lgpVar2.a.a(5, (ku0) null);
                    boolean zJ = lgpVar2.b.j();
                    ku0 ku0Var = lgpVar2.b;
                    if (zJ) {
                        ku0Var.k();
                        ku0Var = lgpVar2.b;
                    }
                    iu0Var.b = ku0Var;
                    lgpVar = (lgp) iu0Var;
                }
                synchronized (qm1Var.o) {
                    h1bVarS = h1b.s(qm1Var.r);
                    qm1Var.r.clear();
                    qm1Var.s = false;
                }
                a1b a1bVarU = h1bVarS.u(0);
                int i6 = 0;
                while (a1bVarU.hasNext()) {
                    pm1 pm1Var = (pm1) a1bVarU.next();
                    if (i6 >= qm1Var.g) {
                        qm1Var.a((t7) lgpVar.a());
                        lgpVar.b$1();
                        t7 t7Var = (t7) lgpVar.b;
                        t7Var.getClass();
                        t7Var.logEvents_ = am2.e;
                        i = 0;
                    } else {
                        i = i6;
                    }
                    cvo cvoVarO = em1.o();
                    long j = pm1Var.a;
                    cvoVarO.b$1();
                    em1 em1Var = (em1) cvoVarO.b;
                    em1Var.bitField0_ |= 1;
                    em1Var.eventId_ = j;
                    long j2 = pm1Var.b;
                    cvoVarO.b$1();
                    em1 em1Var2 = (em1) cvoVarO.b;
                    em1Var2.bitField0_ |= 2;
                    em1Var2.runtimeMs_ = j2;
                    long j3 = pm1Var.e;
                    cvoVarO.b$1();
                    em1 em1Var3 = (em1) cvoVarO.b;
                    em1Var3.bitField0_ |= 32;
                    em1Var3.eventCount_ = j3;
                    String str = pm1Var.d;
                    if (str != null) {
                        cvoVarO.b$1();
                        ((em1) cvoVarO.b).b(str);
                    }
                    Throwable th = pm1Var.c;
                    int i7 = th == null ? i5 : 3;
                    cvoVarO.b$1();
                    em1 em1Var4 = (em1) cvoVarO.b;
                    em1Var4.getClass();
                    int i8 = i5;
                    if (i7 == i8) {
                        i2 = 1;
                    } else {
                        if (i7 != 3) {
                            throw null;
                        }
                        i2 = i8;
                    }
                    em1Var4.status_ = i2;
                    em1Var4.bitField0_ |= 4;
                    if (th != null) {
                        String name = th.getClass().getName();
                        cvoVarO.b$1();
                        ((em1) cvoVarO.b).c(name);
                        try {
                            stringWriter = new StringWriter();
                        } catch (IOException unused) {
                            string = "";
                        }
                        try {
                            PrintWriter printWriter = new PrintWriter(stringWriter);
                            try {
                                th.printStackTrace(printWriter);
                                string = stringWriter.toString();
                                printWriter.close();
                                stringWriter.close();
                                cvoVarO.b$1();
                                ((em1) cvoVarO.b).d(string);
                            } finally {
                                break;
                            }
                        } finally {
                        }
                    }
                    em1 em1Var5 = (em1) cvoVarO.a();
                    lgpVar.b$1();
                    ((t7) lgpVar.b).a(em1Var5);
                    i6 = i + 1;
                    i5 = i8;
                }
                if (i6 > 0) {
                    qm1Var.a((t7) lgpVar.a());
                    lgpVar.b$1();
                    t7 t7Var2 = (t7) lgpVar.b;
                    t7Var2.getClass();
                    t7Var2.logEvents_ = am2.e;
                    return;
                }
                return;
            default:
                qm1 qm1Var2 = this.b;
                if (!qm1Var2.e || qm1Var2.m.getAndSet(true)) {
                    return;
                }
                Context context = qm1Var2.a;
                String str2 = qm1Var2.j;
                int i9 = qm1Var2.k;
                double d = qm1Var2.i;
                long j4 = qm1Var2.l;
                Locale locale = Locale.getDefault();
                int i_getNumber$2 = p3p._getNumber$2(i9);
                int i10 = i_getNumber$2 != 0 ? i_getNumber$2 != 1 ? i_getNumber$2 != 2 ? i_getNumber$2 != 3 ? 0 : 4 : 3 : 2 : 1;
                if (i10 == 0) {
                    i10 = 1;
                    i3 = 1;
                } else {
                    i3 = 1;
                }
                lgp lgpVarO = t7.o();
                long j5 = Build.VERSION.SDK_INT;
                lgpVarO.b$1();
                t7 t7Var3 = (t7) lgpVarO.b;
                t7Var3.bitField0_ |= 1;
                t7Var3.apiLevel_ = j5;
                String str3 = Build.MODEL;
                lgpVarO.b$1();
                ((t7) lgpVarO.b).g(str3);
                String language = locale.getLanguage();
                lgpVarO.b$1();
                ((t7) lgpVarO.b).f(language);
                String country = locale.getCountry();
                lgpVarO.b$1();
                ((t7) lgpVarO.b).d(country);
                lgpVarO.b$1();
                ((t7) lgpVarO.b).e(str2);
                lgpVarO.b$1();
                t7 t7Var4 = (t7) lgpVarO.b;
                t7Var4.getClass();
                t7Var4.hostType_ = p3p._getNumber$5(i10);
                t7Var4.bitField0_ |= 2048;
                lgpVarO.b$1();
                t7 t7Var5 = (t7) lgpVarO.b;
                t7Var5.getClass();
                t7Var5.osType_ = p3p.a(2);
                t7Var5.bitField0_ |= 4096;
                String packageName = context.getPackageName();
                lgpVarO.b$1();
                ((t7) lgpVarO.b).c(packageName);
                lgpVarO.b$1();
                t7 t7Var6 = (t7) lgpVarO.b;
                t7Var6.bitField0_ |= 1024;
                t7Var6.requestedAdshieldVersion_ = j4;
                if (d > 0.0d) {
                    lgpVarO.b$1();
                    t7 t7Var7 = (t7) lgpVarO.b;
                    t7Var7.bitField0_ |= NotificationCompat.FLAG_GROUP_SUMMARY;
                    t7Var7.samplingDenominator_ = (int) (1.0d / d);
                }
                PackageManager packageManager = context.getPackageManager();
                try {
                    long j6 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                    lgpVarO.b$1();
                    t7 t7Var8 = (t7) lgpVarO.b;
                    t7Var8.bitField0_ |= 64;
                    t7Var8.appVersionCode_ = j6;
                } catch (Exception unused2) {
                }
                try {
                    if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                        c = 5;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                        c = 4;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                        c = 7;
                    } else {
                        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                        c = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? (char) 2 : (char) 6;
                    }
                    lgpVarO.b$1();
                    t7 t7Var9 = (t7) lgpVarO.b;
                    t7Var9.getClass();
                    switch (c) {
                        case 1:
                            i4 = 0;
                            break;
                        case 2:
                            i4 = i3;
                            break;
                        case 3:
                            i4 = 2;
                            break;
                        case 4:
                            i4 = 3;
                            break;
                        case 5:
                            i4 = 4;
                            break;
                        case 6:
                            i4 = 5;
                            break;
                        case 7:
                            i4 = 6;
                            break;
                        default:
                            throw null;
                    }
                    t7Var9.deviceType_ = i4;
                    t7Var9.bitField0_ |= 16;
                } catch (RuntimeException unused3) {
                }
                t7 t7Var10 = (t7) lgpVarO.a();
                synchronized (qm1Var2.n) {
                    qm1Var2.q.a(t7Var10);
                }
                return;
        }
    }
}
