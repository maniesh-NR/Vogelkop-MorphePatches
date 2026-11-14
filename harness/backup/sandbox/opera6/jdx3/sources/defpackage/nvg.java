package defpackage;

import androidx.fragment.app.r;

/* loaded from: classes.dex */
public final class nvg implements f7f {
    public final r a;
    public final ki b;
    public final p8f c;
    public final gmk d;
    public final nw3 e;
    public final vvg f;
    public final yvg g;
    public byte h = 0;

    public nvg(r rVar, ki kiVar, p8f p8fVar, vvg vvgVar, yvg yvgVar, gmk gmkVar, nw3 nw3Var) {
        this.a = rVar;
        this.b = kiVar;
        this.c = p8fVar;
        this.d = gmkVar;
        this.e = nw3Var;
        this.f = vvgVar;
        this.g = yvgVar;
    }

    public final void a(int i) {
        p8f p8fVar = this.c;
        if (p8fVar.v()) {
            this.d.a.p(this);
            p8fVar.C(i);
        }
        yvg yvgVar = this.g;
        if (i == 0) {
            yvgVar.a();
            yvgVar.b(1);
            yvgVar.c();
        } else if (i == 3) {
            yvgVar.a();
            yvgVar.c();
        }
        ((gjm) this.b.get()).b(new avg());
    }

    public final void b(uvg uvgVar) {
        if (uvgVar == uvg.ACTIVE && this.h == 0 && this.c.v() && !((Boolean) this.e.get()).booleanValue()) {
            a(4);
            yvg yvgVar = this.g;
            yvgVar.a();
            yvgVar.d();
        }
    }

    public final void d0(Object obj) {
        b((uvg) obj);
    }
}
