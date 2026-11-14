package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import defpackage.eyo;
import defpackage.ffp;
import defpackage.mip;
import defpackage.p3p;
import java.util.Locale;

/* loaded from: classes.dex */
public final class we {
    public final Context a;
    public final mip b;
    public final vz c;
    public final ws d;
    public final qr0 e;
    public final eyo g;
    public final ek h;
    public final mi0 i;
    public final tv0 j;

    public we(Context context, i41 i41Var, String str, String str2, mip mipVar, vz vzVar, ws wsVar, qr0 qr0Var, kj0 kj0Var, eyo eyoVar, ek ekVar, mi0 mi0Var) {
        Rect bounds;
        String str3;
        PackageInfo packageInfo;
        this.a = context;
        this.b = mipVar;
        this.c = vzVar;
        this.d = wsVar;
        this.e = qr0Var;
        this.g = eyoVar;
        this.h = ekVar;
        this.i = mi0Var;
        WindowManager windowManagerB = kj0Var.b(context);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            bounds = windowManagerB.getMaximumWindowMetrics().getBounds();
        } else {
            Rect rect = new Rect();
            windowManagerB.getDefaultDisplay().getRectSize(rect);
            bounds = rect;
        }
        PackageManager packageManager = context.getPackageManager();
        String str4 = "";
        String str5 = (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), NotificationCompat.FLAG_HIGH_PRIORITY)) == null || (str5 = packageInfo.versionName) == null) ? "" : str5;
        ffp ffpVarP = tv0.p();
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).o("CUI_NAME_ANR_DETECTED");
        ffpVarP.b$1();
        tv0 tv0Var = (tv0) ffpVarP.b;
        tv0Var.getClass();
        tv0Var.os_ = p3p.d(2);
        String str6 = Build.VERSION.RELEASE;
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).p(str6);
        String str7 = Build.MODEL;
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).j(str7);
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).targetVersion_ = i;
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).t(str2);
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).d(str);
        String packageName = context.getPackageName();
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).f(packageName);
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).g(str5);
        x77 x77VarA = i41Var.a();
        if (x77VarA != null && (str3 = (String) x77VarA.b) != null) {
            str4 = str3;
        }
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).e(str4);
        String country = Locale.getDefault().getCountry();
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).i(country);
        int iWidth = bounds.width();
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).displayWidth_ = iWidth;
        int iHeight = bounds.height();
        ffpVarP.b$1();
        ((tv0) ffpVarP.b).displayHeight_ = iHeight;
        this.j = (tv0) ffpVarP.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04fd A[LOOP:8: B:108:0x04fb->B:109:0x04fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0274 A[LOOP:1: B:60:0x026e->B:62:0x0274, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cf A[LOOP:3: B:70:0x02c9->B:72:0x02cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0347 A[LOOP:4: B:74:0x0341->B:76:0x0347, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03a2 A[LOOP:6: B:84:0x039c->B:86:0x03a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0468  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r17) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.we.a(nt5):java.lang.Object");
    }
}
