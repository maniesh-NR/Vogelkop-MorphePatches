package com.opera.android.browser;

import J.N;
import android.net.Uri;
import com.opera.android.browser.UrlMangler;
import com.opera.android.browser.chromium.ChromiumContent;
import defpackage.jri;
import defpackage.lqm;
import defpackage.lsc;
import defpackage.shj;
import defpackage.sre;
import defpackage.vml;
import defpackage.wqm;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class a implements shj {
    public final ChromiumContent a;

    public a(ChromiumContent chromiumContent) {
        this.a = chromiumContent;
    }

    @Override // defpackage.shj
    public final boolean b(NavigationHandle navigationHandle, GURL gurl, boolean z, boolean z2) {
        int i;
        int i2;
        lsc lscVarF;
        if (navigationHandle.a && (i2 = (i = navigationHandle.d) & 255) != 5 && i2 != 8 && (i & 16777216) == 0) {
            ChromiumContent chromiumContent = this.a;
            zg zgVarB = BrowserUtils.b(chromiumContent.r());
            if (zgVarB != null) {
                zg zgVarO = zg.o(zgVarB.a, ((Uri) ((zg) zgVarB.c).b).toString(), navigationHandle.e.g());
                if (zgVarO != null) {
                    sre sreVar = (sre) zgVarO.b;
                    UrlMangler.Builder builder = new UrlMangler.Builder("search", navigationHandle.e.g());
                    String string = ((Uri) ((zg) zgVarO.c).b).toString();
                    HashMap map = builder.c;
                    map.put("search_template", string);
                    map.put("search_origin", String.valueOf(vep.A(zgVarO.a)));
                    builder.displayString(sreVar.a());
                    String strBuild = builder.build();
                    if (!Intrinsics.a(strBuild, chromiumContent.r()) && (lscVarF = wqm.f(strBuild, null, lqm.b)) != null) {
                        if (Intrinsics.a(((sre) zgVarB.b).a(), sreVar.a())) {
                            lscVarF.d |= -1073741824;
                        }
                        lscVarF.k = (navigationHandle.d & (-1073741824)) != 0;
                        lscVarF.o = (byte[]) N.MHFaii6l(chromiumContent.e());
                        vml.c(new jri(this, lscVarF, (byte) 1));
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
