package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w7o implements yh5, idc {
    public final v31 a;
    public final fi5 b;
    public boolean c;
    public tcc d;
    public ue5 e = z4o.a;

    public w7o(v31 v31Var, fi5 fi5Var) {
        this.a = v31Var;
        this.b = fi5Var;
    }

    @Override // defpackage.idc
    public final void E(ndc ndcVar, occ occVar) {
        if (occVar == occ.ON_DESTROY) {
            a();
        } else {
            if (occVar != occ.ON_CREATE || this.c) {
                return;
            }
            b(this.e);
        }
    }

    public final void a() {
        if (!this.c) {
            this.c = true;
            v31 v31Var = this.a;
            v31Var.setTag(2131365108, null);
            tcc tccVar = this.d;
            if (tccVar != null) {
                tccVar.b(this);
            }
            this.d = null;
            yb7 yb7Var = v31Var.f;
            if (yb7Var != null) {
                yb7Var.b.invoke();
            }
            v31Var.f = null;
        }
        this.b.m();
    }

    public final void b(Function2 function2) {
        gil gilVar = new gil(this, (ue5) function2, (byte) 26);
        v31 v31Var = this.a;
        ((Boolean) v31Var.p.getValue()).getClass();
        if (v31Var.isAttachedToWindow()) {
            gilVar.invoke(v31Var.o());
        } else {
            v31Var.c0 = gilVar;
        }
    }
}
