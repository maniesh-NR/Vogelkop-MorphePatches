package defpackage;

import com.opera.android.browser.chromium.ChromiumContent;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class eq9 {
    public final d37 a;
    public boolean b;
    public final h7f c = new h7f();
    public final pde d = new pde(Boolean.FALSE);
    public final ty3 e = new ty3(this, 5);

    public eq9(umi umiVar, x5f x5fVar, hd hdVar, ki kiVar) {
        d37 d37Var = new d37();
        d37Var.c = umiVar;
        d37Var.d = x5fVar;
        d37Var.e = hdVar;
        d37Var.f = kiVar;
        this.a = d37Var;
    }

    public final void a(iq9 iq9Var) {
        this.c.b(iq9Var);
    }

    public final void b() {
        d37 d37Var = this.a;
        if (!d37Var.p() || ((ChromiumContent) d37Var.g).h()) {
            return;
        }
        WebContents webContentsE = ((ChromiumContent) d37Var.g).e();
        if (webContentsE.isDestroyed()) {
            return;
        }
        webContentsE.z1();
    }

    public final boolean c() {
        return this.b || this.a.p();
    }

    public final void d(boolean z) {
        if (this.b != z) {
            this.b = z;
            h7f h7fVar = this.c;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((iq9) g7fVarH.next()).P(z);
            }
        }
    }

    public final void e() {
        ChromiumContent chromiumContent;
        int i;
        d37 d37Var = this.a;
        boolean z = d37Var.p() && (chromiumContent = (ChromiumContent) d37Var.g) != null && ((i = chromiumContent.E) == 2 || i == 3);
        pde pdeVar = this.d;
        if (z != ((Boolean) pdeVar.g()).booleanValue()) {
            pdeVar.r(Boolean.valueOf(z));
        }
    }
}
