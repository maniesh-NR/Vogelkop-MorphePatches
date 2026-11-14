package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class bma extends b8e implements u5m, omg, hi5 {
    public lh7 o;
    public o91 p;
    public boolean q;

    public bma(o91 o91Var, lh7 lh7Var) {
        this.o = lh7Var;
        this.p = o91Var;
    }

    @Override // defpackage.b8e
    public final void M0() throws pxb {
        X0();
    }

    public final void T0() throws pxb {
        o91 o91Var;
        pqh pqhVar = new pqh();
        zch.C(this, new q9a(pqhVar, (byte) 11));
        bma bmaVar = (bma) pqhVar.a;
        if (bmaVar == null || (o91Var = bmaVar.p) == null) {
            o91Var = this.p;
        }
        U0(o91Var);
    }

    public void U0(o91 o91Var) {
        s31 s31Var = (s31) z4o.N(this, mi5.w);
        if (s31Var != null) {
            s31Var.a = o91Var;
        }
    }

    public final void V0() throws pxb {
        lqh lqhVar = new lqh();
        lqhVar.a = true;
        zch.E(this, new ph7(lqhVar));
        if (lqhVar.a) {
            T0();
        }
    }

    public boolean W0(int i) {
        return (i == 3 || i == 4) ? false : true;
    }

    public final void X0() throws pxb {
        if (this.q) {
            this.q = false;
            if (this.n) {
                pqh pqhVar = new pqh();
                zch.C(this, new j31(pqhVar, (byte) 3));
                bma bmaVar = (bma) pqhVar.a;
                if (bmaVar != null) {
                    bmaVar.T0();
                } else {
                    U0(null);
                }
            }
        }
    }

    @Override // defpackage.omg
    public final long Y() {
        if (this.o == null) {
            return uwl.a;
        }
        n27 n27Var = ui6.e0(this).y;
        int i = uwl.b;
        return y4h.l(n27Var.M(10.0f), n27Var.M(40.0f), n27Var.M(10.0f), n27Var.M(40.0f));
    }

    @Override // defpackage.omg
    public final void g0() throws pxb {
        X0();
    }

    @Override // defpackage.omg
    public final void n(fmg fmgVar, gmg gmgVar, long j) throws pxb {
        if (gmgVar == gmg.b) {
            List list = fmgVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (W0(((lmg) list.get(i)).i)) {
                    byte b = fmgVar.f;
                    if (b == 4) {
                        this.q = true;
                        V0();
                        return;
                    } else {
                        if (b == 5) {
                            X0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
