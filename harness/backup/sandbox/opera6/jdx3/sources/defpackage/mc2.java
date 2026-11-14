package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mc2 extends d1g {
    public final /* synthetic */ byte f = 1;
    public final l08 g;

    /* JADX WARN: Illegal instructions before constructor call */
    public mc2(ami amiVar) {
        ekc ekcVar = (ekc) ((zyk) amiVar.f).getValue();
        d9j[] d9jVarArr = d9j.a;
        super(ekcVar, 50000);
        this.g = l08.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mc2(igi igiVar) {
        ekc ekcVar = (ekc) ((zyk) igiVar.d).getValue();
        d9j[] d9jVarArr = d9j.a;
        super(ekcVar, 46000);
        this.g = l08.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mc2(psi psiVar) {
        hx5 hx5VarU = xf8.u(psiVar.t);
        d9j[] d9jVarArr = d9j.a;
        super(hx5VarU, 17000);
        this.g = l08.a;
    }

    @Override // defpackage.d1g, defpackage.s6j
    public final ix4 a(hx4 hx4Var, Object obj) {
        switch (this.f) {
            case 0:
                nc2 nc2Var = (nc2) obj;
                if (!nc2Var.b || !nc2Var.d) {
                    lc2[] lc2VarArr = lc2.a;
                    hx4Var.b(4);
                }
                if (!nc2Var.b || !nc2Var.c) {
                    lc2[] lc2VarArr2 = lc2.a;
                    hx4Var.b(11);
                }
                return super.a(hx4Var, nc2Var);
            case 1:
            default:
                return super.a(hx4Var, obj);
            case 2:
                msi msiVar = (msi) obj;
                if (!msiVar.t) {
                    jsi[] jsiVarArr = jsi.a;
                    hx4Var.b(10);
                }
                if (!msiVar.n) {
                    jsi[] jsiVarArr2 = jsi.a;
                    hx4Var.b(11);
                }
                if (!msiVar.p) {
                    jsi[] jsiVarArr3 = jsi.a;
                    hx4Var.b(13);
                }
                if (!msiVar.v) {
                    jsi[] jsiVarArr4 = jsi.a;
                    hx4Var.b(14);
                }
                if (!msiVar.b) {
                    jsi[] jsiVarArr5 = jsi.a;
                    hx4Var.b(15);
                }
                if (!msiVar.f) {
                    jsi[] jsiVarArr6 = jsi.a;
                    hx4Var.b(3);
                }
                return super.a(hx4Var, msiVar);
        }
    }

    @Override // defpackage.v6j
    public final List d() {
        switch (this.f) {
        }
        return this.g;
    }

    @Override // defpackage.d1g
    public final r6j g(int i, Object obj) {
        switch (this.f) {
            case 0:
                return new r6j(i, new x6j(d8j.class, new q92((byte) 1)), 2132017628, 2132017426, 2131231724, true, ((nc2) obj).a, (Function1) new f32((byte) 7));
            case 1:
                return new r6j(i, new x6j(d8j.class, new q92((byte) 4)), 2132018467, 2132018464, 2131232053, true, (Function1) new f32((byte) 28), 64);
            default:
                return new r6j(i, new x6j(d8j.class, new ali((byte) 6)), 2132021401, 2132021400, 2131232229, true, (Function1) new bli((byte) 6), 64);
        }
    }
}
