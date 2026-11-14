package defpackage;

import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.UrlMangler;
import com.opera.android.browser.chromium.ChromiumContent;

/* loaded from: classes.dex */
public final class tjm extends n1 {
    public final v3m c;
    public final k6l d;
    public final int e;
    public boolean f;

    public tjm(o4m o4mVar, v3m v3mVar, k6l k6lVar, int i) {
        super((Object) o4mVar, (byte) 24);
        this.c = v3mVar;
        this.d = k6lVar;
        this.e = i;
    }

    public static boolean I0(v3m v3mVar, b2l b2lVar) {
        if (!v3m.f(v3mVar.a) || b2lVar == null) {
            return false;
        }
        d7l d7lVar = (d7l) b2lVar;
        return (d7lVar.n0() || UrlMangler.isOffline(d7lVar.j.getUrl()) || UrlMangler.b(d7lVar.j.getUrl()) || wqm.w(d7lVar.j.getUrl()) || wqm.A(d7lVar.j.getUrl()) || BrowserUtils.c(d7lVar.j.getUrl()) || d7lVar.j.r() || UrlMangler.c(d7lVar.j.getUrl()) || UrlMangler.d(d7lVar.j.getUrl())) ? false : true;
    }

    public final boolean H0() {
        return v3m.f(this.c.a) && this.f;
    }

    public final void J0(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        b2l b2lVar = this.d.o;
        if (b2lVar != null) {
            uy3 uy3VarF = uy3.F(b2lVar);
            ChromiumContent chromiumContent = uy3VarF != null ? uy3VarF.b : null;
            if (chromiumContent != null) {
                chromiumContent.O = z ? this.e : 0;
            }
        }
        v0();
    }
}
