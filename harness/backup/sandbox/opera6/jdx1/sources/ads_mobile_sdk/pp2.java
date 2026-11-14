package ads_mobile_sdk;

import defpackage.dqo;
import defpackage.oie;
import defpackage.xep;

/* loaded from: classes.dex */
public final class pp2 extends on2 {
    public final oie m;
    public final ab0 n;
    public final int o;

    public pp2(nx5 nx5Var, nx5 nx5Var2, oie oieVar, kh3 kh3Var, qr0 qr0Var, ux2 ux2Var, String str, av2 av2Var, i41 i41Var, boolean z, j71 j71Var, ab0 ab0Var, int i, gdj gdjVar) {
        super(nx5Var, nx5Var2, kh3Var, qr0Var, ux2Var, str, av2Var, oieVar, z, i41Var, j71Var, gdjVar);
        this.m = oieVar;
        this.n = ab0Var;
        this.o = i;
    }

    @Override // ads_mobile_sdk.on2
    public final Object b(mt5 mt5Var) {
        xep xepVar = (xep) this.n.get();
        oie oieVar = this.m;
        rc0 rc0Var = (rc0) a(xepVar, oieVar);
        oieVar.getClass();
        rc0Var.m = oieVar;
        rc0Var.l = Integer.valueOf(this.o);
        rc0Var.n = Boolean.FALSE;
        rc0Var.o = new dqo();
        return ((qc1) rc0Var.a().J0.get()).a(mt5Var);
    }
}
