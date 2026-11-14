package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class us3 extends b8e implements ms3, z1c {
    public mq5 o;
    public boolean p;

    public static final voh T0(us3 us3Var, wye wyeVar, gb3 gb3Var) {
        voh vohVar;
        if (us3Var.n && us3Var.p) {
            wye wyeVarD0 = ui6.d0(us3Var);
            if (!wyeVar.Z0().n) {
                wyeVar = null;
            }
            if (wyeVar != null && (vohVar = (voh) gb3Var.invoke()) != null) {
                return vohVar.i(wyeVarD0.y(wyeVar, false).d());
            }
        }
        return null;
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    @Override // defpackage.z1c
    public final void X(b2c b2cVar) {
        this.p = true;
    }

    @Override // defpackage.ms3
    public final Object d0(wye wyeVar, gb3 gb3Var, nt5 nt5Var) {
        Object objQ = sgb.q(new ts3(this, wyeVar, gb3Var, new hv(this, wyeVar, gb3Var, (byte) 6), (mt5) null), nt5Var);
        return objQ == px5.a ? objQ : Unit.a;
    }
}
