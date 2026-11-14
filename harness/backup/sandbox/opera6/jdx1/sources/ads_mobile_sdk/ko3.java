package ads_mobile_sdk;

import android.content.Context;
import androidx.webkit.Profile;
import androidx.webkit.WebViewFeature;
import defpackage.axn;
import defpackage.jj4;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ko3 {
    public final Context a;
    public final yq3 b;
    public final qr0 c;

    public ko3(Context context, yq3 yq3Var, qr0 qr0Var) {
        this.a = context;
        this.b = yq3Var;
        this.c = qr0Var;
    }

    public final void a(s9e s9eVar, boolean z, cp3 cp3Var) {
        qr0 qr0Var = this.c;
        qr0Var.getClass();
        Boolean bool = Boolean.FALSE;
        fo foVar = fo.a;
        Set setE = (((Boolean) qr0Var.a("gads:webview_profile:enabled", bool, foVar)).booleanValue() && ((Boolean) qr0Var.a("gads:init_profile_during_webview_startup:enabled", bool, foVar)).booleanValue()) ? e82.E(new String[]{"GMA_WEBVIEW_PROFILE", "Default"}) : Collections.singleton("Default");
        AtomicBoolean atomicBoolean = ho3.a;
        ho3.a(this.a, s9eVar, z, setE, cp3Var);
    }

    public final boolean a() {
        if (!axn.b(WebViewFeature.MULTI_PROFILE)) {
            return false;
        }
        yq3 yq3Var = this.b;
        Profile profile = yq3Var.l;
        mt5 mt5Var = null;
        String name = profile != null ? profile.getName() : null;
        if (name != null) {
            return name.equals("GMA_WEBVIEW_PROFILE");
        }
        if (!((Boolean) yq3Var.r.getValue()).booleanValue()) {
            return false;
        }
        defpackage.na2.B(yq3Var.e, null, null, new jj4((byte) 24, mt5Var, (Object) yq3Var), 3);
        return true;
    }
}
