package defpackage;

import android.net.Uri;
import com.opera.android.weather.ui.WeatherWidgetActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mpn extends phj {
    public final Uri t;

    public mpn(Uri uri) {
        this.t = uri;
    }

    public final void a(nz0 nz0Var) {
        z9g z9gVar;
        lag lagVar;
        if ((nz0Var instanceof z9g) && (lagVar = (z9gVar = (z9g) nz0Var).a) == lag.c) {
            int i = WeatherWidgetActivity.e0;
            jb jbVar = z9gVar.e;
            String str = (String) jbVar.h;
            String str2 = (String) jbVar.i;
            if (lagVar != lag.b && lagVar != lag.h) {
                str = str2;
            }
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            Uri uri2 = this.t;
            if (Intrinsics.a(scheme, uri2.getScheme()) && Intrinsics.a(uri.getAuthority(), uri2.getAuthority())) {
                z9gVar.b(false, true);
                return;
            }
        }
        phj.B(nz0Var);
    }

    public final void i() {
    }
}
