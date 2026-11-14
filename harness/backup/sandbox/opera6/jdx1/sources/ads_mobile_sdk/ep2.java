package ads_mobile_sdk;

import defpackage.dqo;
import defpackage.kta;
import defpackage.oie;
import defpackage.xep;

/* loaded from: classes.dex */
public final class ep2 extends on2 {
    public final oie m;
    public final kta n;
    public final ab0 o;
    public final int p;

    public ep2(nx5 nx5Var, nx5 nx5Var2, oie oieVar, kta ktaVar, kh3 kh3Var, qr0 qr0Var, ux2 ux2Var, String str, av2 av2Var, i41 i41Var, boolean z, j71 j71Var, ab0 ab0Var, int i, gdj gdjVar) {
        super(nx5Var, nx5Var2, kh3Var, qr0Var, ux2Var, str, av2Var, oieVar, z, i41Var, j71Var, gdjVar);
        this.m = oieVar;
        this.n = ktaVar;
        this.o = ab0Var;
        this.p = i;
    }

    @Override // ads_mobile_sdk.on2
    public final Object b(mt5 mt5Var) {
        xep xepVar = (xep) this.o.get();
        kta ktaVar = this.n;
        jc0 jc0Var = (jc0) a(xepVar, ktaVar);
        ktaVar.getClass();
        jc0Var.m = ktaVar;
        oie oieVar = this.m;
        oieVar.getClass();
        jc0Var.l = oieVar;
        jc0Var.n = Integer.valueOf(this.p);
        jc0Var.o = Boolean.FALSE;
        jc0Var.p = new dqo();
        return ((qc1) jc0Var.a().L0.get()).a(mt5Var);
    }
}
