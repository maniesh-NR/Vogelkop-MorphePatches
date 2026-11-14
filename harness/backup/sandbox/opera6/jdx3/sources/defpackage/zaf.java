package defpackage;

import android.net.Uri;
import android.view.View;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.UrlMangler;
import com.opera.android.custom_views.ToolbarProgressBar;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class zaf extends y08 {
    public boolean a;
    public final /* synthetic */ gbf b;

    public zaf(gbf gbfVar) {
        this.b = gbfVar;
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        a0(b2lVar);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void G(b2l b2lVar) {
        gbf gbfVar = this.b;
        gbfVar.m(true);
        X(b2lVar, ((d7l) b2lVar).j.isLoading());
        W(b2lVar, true);
        gbfVar.m.C(b2lVar);
        gbfVar.t(false);
        d7l d7lVar = (d7l) b2lVar;
        d7lVar.j.P();
        d7lVar.j.Y();
        gbfVar.u(b2lVar);
        View view = gbfVar.i;
        kff.a(view, new j7n(new o5f(this, (byte) 7), view));
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void Q(b2l b2lVar, NavigationHandle navigationHandle) {
        if (navigationHandle.c) {
            return;
        }
        X(b2lVar, true);
        W(b2lVar, false);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void U(b2l b2lVar, long j) {
        dbf dbfVar = this.b.m;
        if (dbf.u(dbfVar.n)) {
            ((p0h) dbfVar.n.c).e(j);
        }
    }

    public final void W(b2l b2lVar, boolean z) {
        boolean z2 = this.a;
        gbf gbfVar = this.b;
        shf shfVar = gbfVar.n;
        if (!z2) {
            shfVar.r(false);
            return;
        }
        shfVar.G(z ? ((d7l) b2lVar).j.K() : 0, gbfVar.b.j());
        if (!z) {
            Y(b2lVar);
        }
        String strI = ((d7l) b2lVar).j.I();
        if (strI != null) {
            d7l d7lVar = (d7l) b2lVar;
            boolean z3 = UrlMangler.d(d7lVar.j.getUrl()) && BrowserUtils.getRendererUrl(d7lVar.j.getUrl()).equals(strI);
            Uri uri = Uri.parse(strI);
            boolean z4 = z3 || ("opera-distiller".equals(uri.getScheme()) && "readermode".equals(uri.getAuthority()));
            ToolbarProgressBar toolbarProgressBar = (ToolbarProgressBar) shfVar.a;
            if (toolbarProgressBar.isIndeterminate() != z4) {
                toolbarProgressBar.setIndeterminate(z4);
                shfVar.Q();
            }
        }
    }

    public final void X(b2l b2lVar, boolean z) {
        String strI = ((d7l) b2lVar).j.I();
        this.a = (!z || wqm.w(strI) || wqm.z(strI)) ? false : true;
        Z(b2lVar);
        a0(b2lVar);
        this.b.u(b2lVar);
    }

    public final void Y(b2l b2lVar) {
        shf shfVar = this.b.n;
        if (((ToolbarProgressBar) shfVar.a).isIndeterminate()) {
            return;
        }
        int iK = this.a ? ((d7l) b2lVar).j.K() : 0;
        shfVar.Q();
        n4h n4hVar = (n4h) shfVar.c;
        if (n4hVar.a != -1) {
            n4hVar.b = iK;
            return;
        }
        ToolbarProgressBar toolbarProgressBar = (ToolbarProgressBar) n4hVar.c.a;
        toolbarProgressBar.a = true;
        toolbarProgressBar.setProgress(iK);
    }

    public final void Z(b2l b2lVar) {
        vbf vbfVar = this.b.j;
        boolean z = this.a && !wqm.w(((d7l) b2lVar).j.I());
        vbfVar.q();
        vbfVar.r(32L, z);
    }

    public final void a0(b2l b2lVar) {
        gbf gbfVar = this.b;
        gbfVar.j.s(b2lVar);
        gbfVar.m.C(b2lVar);
        gbfVar.b.z(b2lVar);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void f(b2l b2lVar) {
        this.b.n.r(false);
        a0(b2lVar);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void g(b2l b2lVar, long j) {
        dbf dbfVar = this.b.m;
        if (dbf.u(dbfVar.n)) {
            ((p0h) dbfVar.n.c).h(j);
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void i(b2l b2lVar, qwi qwiVar) {
        gbf gbfVar = this.b;
        vbf vbfVar = gbfVar.j;
        vbfVar.q();
        vbfVar.q();
        vbfVar.t.d = qwiVar;
        gbfVar.m.C(b2lVar);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void j(b2l b2lVar) {
        this.b.n.r(this.a);
        X(b2lVar, false);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void l(b2l b2lVar, int i) {
        Y(b2lVar);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void r(d7l d7lVar) {
        a0(d7lVar);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void v(b2l b2lVar) {
        a0(b2lVar);
        Z(b2lVar);
        gbf gbfVar = this.b;
        gbfVar.u(b2lVar);
        gbfVar.t(false);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void x(b2l b2lVar) {
        a0(b2lVar);
    }
}
