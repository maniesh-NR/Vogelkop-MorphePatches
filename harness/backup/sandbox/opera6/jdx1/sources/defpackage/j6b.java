package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j6b extends i17 implements hi5 {
    public final f74 A;
    public boolean q;
    public lde r;
    public float s = 2.0f;
    public float t = 1.0f;
    public boolean u;
    public d3k v;
    public sgl w;
    public cd1 x;
    public paj y;
    public final cd1 z;

    public j6b(boolean z, lde ldeVar, sgl sglVar, paj pajVar) throws pxb {
        this.q = z;
        this.r = ldeVar;
        this.w = sglVar;
        this.y = pajVar;
        this.z = new cd1(new gh7((this.u && z) ? 2.0f : 1.0f), a26.g, null, 12);
        f74 f74Var = new f74(new g74(), new nna(this, (byte) 7));
        T0(f74Var);
        this.A = f74Var;
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    @Override // defpackage.b8e
    public final void L0() {
        this.v = na2.B(H0(), null, null, new i6b(this, null, (byte) 2), 3);
        if (this.x == null) {
            sgl sglVarB = this.w;
            if (sglVarB == null) {
                sglVarB = ulp.B((sa5) z4o.N(this, ua5.a), (akl) z4o.N(this, bkl.a));
            }
            long jC = sglVarB.c(this.q, false, this.u);
            this.x = new cd1(new u95(jC), new j8m(h50.p, new b11((Object) u95.e(jC), (byte) 7)), null, 12);
        }
    }

    public final void W0() {
        mt5 mt5Var = null;
        na2.B(H0(), null, null, new i6b(this, mt5Var, (byte) 0), 3);
        na2.B(H0(), null, null, new i6b(this, mt5Var, (byte) 1), 3);
    }

    public final Object X0(kuk kukVar) {
        this.u = false;
        this.r.a.collect(new o23(new ArrayList(), this, (byte) 10), kukVar);
        return px5.a;
    }
}
