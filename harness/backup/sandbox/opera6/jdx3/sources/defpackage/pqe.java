package defpackage;

import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.UrlMangler;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.HashMap;
import kotlin.text.StringsKt;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;
import org.chromium.url.Parsed;

/* loaded from: classes.dex */
public final class pqe implements shj, ype {
    public final ChromiumContent a;
    public final x5f b;
    public final j4c c;
    public final esk d;
    public final esk e;

    public pqe(ChromiumContent chromiumContent, x5f x5fVar, j4c j4cVar, esk eskVar, esk eskVar2) {
        this.a = chromiumContent;
        this.b = x5fVar;
        this.c = j4cVar;
        this.d = eskVar;
        this.e = eskVar2;
    }

    @Override // defpackage.ype
    public final boolean a(GURL gurl) {
        return c(gurl);
    }

    @Override // defpackage.shj
    public final boolean b(NavigationHandle navigationHandle, GURL gurl, boolean z, boolean z2) {
        if (navigationHandle.c || navigationHandle.q || navigationHandle.u || (navigationHandle.d & 16777216) != 0 || !navigationHandle.a) {
            return false;
        }
        return c(gurl);
    }

    public final boolean c(GURL gurl) {
        String strE;
        int iL;
        String strR = this.a.r();
        if (UrlMangler.d(strR) && UrlMangler.a(strR, "article_id") != null) {
            GURL gurl2 = new GURL(BrowserUtils.getRendererUrl(strR));
            if (!gurl2.equals(gurl) && gurl2.f().equals(gurl.f()) && gurl2.c().equals(gurl.c())) {
                Parsed parsed = gurl2.c;
                String strB = gurl2.b(parsed.i, parsed.j);
                Parsed parsed2 = gurl.c;
                if (strB.equals(gurl.b(parsed2.i, parsed2.j)) && (iL = StringsKt.L((strE = gurl2.e()), "/news/detail", 0, false, 6)) >= 0) {
                    int i = iL + 12;
                    String strE2 = gurl.e();
                    if (strE2.length() > i && strE.substring(0, i).equals(strE2.substring(0, i))) {
                        x5f x5fVar = this.b;
                        if (x5fVar.h) {
                            zpa zpaVar = x5fVar.d;
                            x56 x56VarF = zpa.F();
                            x56VarF.E(zpaVar).z(zpaVar).e(10);
                            x5fVar.U0(x56VarF);
                        }
                        nv6 nv6Var = ((oue) this.e.get()).a;
                        long j = oue.b;
                        String strC = !gurl.b ? null : gurl.c();
                        if (strC != null) {
                            ((pd7) nv6Var.a).f(new ni2(nv6Var, strC, j, (byte) 3));
                        }
                        q82 q82Var = (q82) this.c.get();
                        String strG = gurl.g();
                        q82Var.getClass();
                        String str = "placeholder_" + strG.hashCode();
                        g82 g82Var = new g82(2, str, "", strG, strG, null, null, false);
                        c5o c5oVar = q82Var.h;
                        ((HashMap) c5oVar.a).put(str, g82Var);
                        ((HashMap) c5oVar.b).remove(str);
                        vml.c(new hpd(this, g82Var, (byte) 16));
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
