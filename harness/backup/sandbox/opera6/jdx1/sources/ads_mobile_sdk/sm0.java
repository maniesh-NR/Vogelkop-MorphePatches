package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import com.amazon.privacypass.PrivacyPass;
import com.amazon.privacypass.VerificationContext;
import com.amazon.privacypass.callback.AttestAPICallback;
import defpackage.cgp;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class sm0 implements cgp {
    public final Context a;
    public final tm0 b;

    public sm0(Context context) {
        if (context == null) {
            qp2.o("Application context cannot be null");
            throw null;
        }
        this.a = context;
        this.b = tm0.a(context);
    }

    public final void a(e7 e7Var) {
        boolean zHasSystemFeature;
        boolean zBooleanValue;
        Map map;
        tm0 tm0Var = this.b;
        if (tm0Var.b != null) {
            zBooleanValue = tm0Var.b.booleanValue();
        } else {
            synchronized (tm0Var) {
                if (tm0Var.b != null) {
                    zHasSystemFeature = tm0Var.b.booleanValue();
                } else {
                    if (!tm0Var.a()) {
                        tm0Var.b = Boolean.FALSE;
                        return;
                    }
                    try {
                        try {
                            PackageManager packageManager = tm0Var.c.getPackageManager();
                            if (packageManager == null) {
                                tm0Var.b = Boolean.FALSE;
                                return;
                            } else {
                                zHasSystemFeature = packageManager.hasSystemFeature("com.amazon.privacypass");
                                tm0Var.b = Boolean.valueOf(zHasSystemFeature);
                            }
                        } catch (SecurityException unused) {
                            tm0Var.b = Boolean.FALSE;
                            return;
                        }
                    } catch (Exception unused2) {
                        tm0Var.b = Boolean.FALSE;
                        return;
                    }
                }
                zBooleanValue = zHasSystemFeature;
            }
        }
        if (!zBooleanValue || (map = (Map) e7Var.a) == null) {
            return;
        }
        String str = (String) map.get("verifierurl");
        String str2 = (String) ((Map) e7Var.a).get("version");
        if (str2 == null || str2.trim().isEmpty()) {
            str2 = "1.0";
        }
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        try {
            new URL(str);
            if (!str.startsWith("https://")) {
                if (!str.startsWith("http://")) {
                    return;
                }
            }
            if (this.a != null) {
                PrivacyPass.getInstance(this.a).attest(new VerificationContext(Collections.singletonList(str)), (AttestAPICallback) null, str2);
            }
        } catch (IllegalArgumentException | MalformedURLException | Exception unused3) {
        }
    }
}
