package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.StatFs;
import android.system.Os;
import android.system.OsConstants;
import com.appsflyer.internal.j;
import com.leanplum.utils.SizeUtil;
import com.opera.android.Lazy;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.autofill.PasswordManager;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ii extends Lazy {
    public final /* synthetic */ byte e;

    public /* synthetic */ ii(byte b) {
        this.e = b;
    }

    @Override // com.opera.android.Lazy
    public final Object d() throws NoSuchAlgorithmException, NumberFormatException, IOException, KeyStoreException, CertificateException {
        int i;
        byte b = this.e;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        switch (b) {
            case 0:
                return new rs2();
            case 1:
                return new AutofillManager();
            case 2:
                return new PasswordManager();
            case 3:
                return new ev1();
            case 4:
                s9f s9fVarB = ((t9f) xne.b.get()).b();
                s9fVarB.a(15L, timeUnit);
                s9fVarB.b(15L, timeUnit);
                return new t9f(s9fVarB);
            case 5:
                return new y22();
            case 6:
                return new zh7();
            case 7:
                return new AutofillManager();
            case 8:
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    try {
                        keyStore.load(null);
                    } catch (IOException | NoSuchAlgorithmException | CertificateException unused) {
                    }
                    return new z26(keyStore);
                } catch (KeyStoreException unused2) {
                    return null;
                }
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new br3();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new br3();
            case 11:
                return new qyf("com.opera.android.ads.pangle.PangleAdsModuleImpl");
            case 12:
                return new t0e("com.opera.android.ads.mintegral.MintegralAdsModuleImpl");
            case 13:
                return new zdc("com.opera.android.ads.liftoff.LiftoffAdsModuleImpl");
            case 14:
                if (!i0l.g()) {
                    return null;
                }
                try {
                    i = Integer.parseInt(i0l.f("ro.boot.lcd_density"));
                } catch (NumberFormatException unused3) {
                    i = 160;
                }
                return i >= 240 ? "1.75" : "1.25";
            case 15:
                return (String) ej9.a.get();
            case 16:
                Context context = cqp.m;
                Locale locale = Locale.US;
                String strQ = aik.q(Build.VERSION.RELEASE, pyn.a);
                String packageName = context.getPackageName();
                String str = r9n.u(context, context.getPackageName(), 0L).versionName;
                StringBuilder sbN = z1m.n("Mozilla 5.0 (Linux; Android ", strQ, ") ", packageName, " OPR/");
                sbN.append(str);
                return sbN.toString();
            case 17:
                s9f s9fVar = new s9f();
                File file = new File(cqp.m.getCacheDir(), "okhttp");
                File file2 = (file.exists() || file.mkdirs()) ? file : null;
                if (file2 != null) {
                    StatFs statFs = new StatFs(file2.getPath());
                    a74 a74Var = new a74(file2, Math.max(Math.min((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 50, 52428800L), 5242880L));
                    SharedPreferences sharedPreferences = cqp.m.getSharedPreferences("network_manager", 0);
                    int i2 = sharedPreferences.getInt("last_crash_count", -1);
                    int iA = tz5.a();
                    if (iA != i2) {
                        j.b(sharedPreferences, "last_crash_count", iA);
                        if (i2 != -1) {
                            try {
                                a74Var.a.evictAll();
                            } catch (IOException unused4) {
                            }
                        }
                    }
                    s9fVar.l = a74Var;
                }
                s9fVar.d.add(new mi1("Icon-Api-Key", new rqd((byte) 13)));
                s9fVar.d.add(new mi1("Api-Key", new rqd((byte) 14)));
                s9fVar.d.add(new x7(cqp.n, (byte) 1));
                ho7 ho7Var = new ho7();
                HashMap map = new HashMap();
                cqp.R(cqp.m, new dg7(map, (byte) 2));
                ho7Var.a = map;
                vml.e(new yqd(ho7Var, (byte) 10));
                s9fVar.d.add(ho7Var);
                return s9fVar;
            case SizeUtil.textSize0_1 /* 18 */:
                s9f s9fVar2 = (s9f) xne.a.get();
                s9fVar2.getClass();
                return new t9f(s9fVar2);
            case 19:
                return new pre();
            case SizeUtil.textSize0 /* 20 */:
                s9f s9fVarB2 = ((t9f) xne.b.get()).b();
                s9fVarB2.l = null;
                s9fVarB2.i = true;
                return new t9f(s9fVarB2);
            case 21:
                return Boolean.valueOf(Os.sysconf(OsConstants._SC_PAGE_SIZE) <= 4096);
            case SizeUtil.textSize1 /* 22 */:
                return s29.c();
            case 23:
                s9f s9fVarB3 = ((t9f) xne.b.get()).b();
                s9fVarB3.a(30L, timeUnit);
                s9fVarB3.b(30L, timeUnit);
                s9fVarB3.i = true;
                return new t9f(s9fVarB3);
            default:
                return Boolean.valueOf(t8.a.getPackageManager().hasSystemFeature("org.chromium.arc.device_management"));
        }
    }
}
