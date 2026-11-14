package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.amazon.privacypass.PrivacyPass;
import com.amazon.privacypass.VerificationContext;
import com.amazon.privacypass.callback.AttestAPICallback;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class v5p implements nno {
    public final Context a;
    public final f7p b;

    public v5p(Context context) {
        if (context == null) {
            qp2.o("Application context cannot be null");
            throw null;
        }
        this.a = context;
        this.b = f7p.a(context);
    }

    public final void a(qtk qtkVar) {
        PackageManager packageManager;
        boolean zHasSystemFeature;
        boolean zBooleanValue;
        Map map;
        f7p f7pVar = this.b;
        if (f7pVar.b != null) {
            zBooleanValue = f7pVar.b.booleanValue();
        } else {
            synchronized (f7pVar) {
                if (f7pVar.b != null) {
                    zHasSystemFeature = f7pVar.b.booleanValue();
                } else if (f7pVar.b()) {
                    try {
                        packageManager = f7pVar.c.getPackageManager();
                    } catch (SecurityException | Exception unused) {
                    }
                    if (packageManager == null) {
                        f7pVar.b = Boolean.FALSE;
                        zBooleanValue = false;
                    } else {
                        zHasSystemFeature = packageManager.hasSystemFeature("com.amazon.privacypass");
                        f7pVar.b = Boolean.valueOf(zHasSystemFeature);
                    }
                } else {
                    f7pVar.b = Boolean.FALSE;
                    zBooleanValue = false;
                }
                zBooleanValue = zHasSystemFeature;
            }
        }
        if (!zBooleanValue || (map = qtkVar.a) == null) {
            return;
        }
        String str = (String) map.get("verifierurl");
        String str2 = (String) qtkVar.a.get("version");
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
        } catch (IllegalArgumentException | MalformedURLException | Exception unused2) {
        }
    }
}
