package defpackage;

import com.opera.android.browser.chromium.ChromiumContent;

/* loaded from: classes.dex */
public final class i18 extends iz4 {
    public static final d18 g = new d18();
    public static final long h;
    public final umi a;
    public final x5f b;
    public final hd c;
    public final ki d;
    public final ci7 e;
    public f18 f;

    static {
        on7 on7Var = pn7.b;
        h = cs5.x0(500, un7.d);
    }

    public i18(umi umiVar, x5f x5fVar, hd hdVar, ki kiVar) {
        ci7 ci7Var = new ci7(1, g, d18.class, "isReallyVisible", "isReallyVisible(Landroid/view/View;)Z", 0, (byte) 2);
        c18 c18Var = c18.a;
        this.a = umiVar;
        this.b = x5fVar;
        this.c = hdVar;
        this.d = kiVar;
        this.e = ci7Var;
    }

    public final void M() {
        f18 f18Var = this.f;
        if (f18Var != null) {
            oml omlVar = f18Var.d;
            if (omlVar != null) {
                omlVar.cancel(false);
            }
            f18Var.b.a();
            f18Var.a.y(this);
        }
        this.f = null;
    }

    @Override // defpackage.iz4
    public final void h() {
        f18 f18Var = this.f;
        if (f18Var != null) {
            e18 e18Var = f18Var.c;
            e18Var.e = true;
            e18Var.b(false);
        }
    }

    @Override // defpackage.iz4
    public final void j(ChromiumContent chromiumContent) {
        M();
    }

    @Override // defpackage.iz4
    public final void u(ChromiumContent chromiumContent, boolean z) {
        if (z && chromiumContent.e().f0()) {
            M();
        }
    }
}
