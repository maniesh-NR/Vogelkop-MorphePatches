package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class t17 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v17 b;

    public /* synthetic */ t17(v17 v17Var, byte b) {
        this.a = b;
        this.b = v17Var;
    }

    public final Object invoke() throws pxb {
        j5i j5iVar;
        byte b = this.a;
        v17 v17Var = this.b;
        switch (b) {
            case 0:
                k5i k5iVar = (k5i) z4o.N(v17Var, n5i.a);
                fa1 fa1Var = v17Var.u;
                if (k5iVar == null) {
                    if (fa1Var != null) {
                        v17Var.U0(fa1Var);
                    }
                    v17Var.u = null;
                } else if (fa1Var == null) {
                    u17 u17Var = new u17(v17Var);
                    t17 t17Var = new t17(v17Var, (byte) 1);
                    lde ldeVar = v17Var.q;
                    boolean z = v17Var.r;
                    float f = v17Var.s;
                    e8m e8mVar = o5i.a;
                    fa1 fa1Var2 = new fa1(ldeVar, z, f, u17Var, t17Var);
                    v17Var.T0(fa1Var2);
                    v17Var.u = fa1Var2;
                }
                return Unit.a;
            default:
                k5i k5iVar2 = (k5i) z4o.N(v17Var, n5i.a);
                return (k5iVar2 == null || (j5iVar = k5iVar2.b) == null) ? x1p.k : j5iVar;
        }
    }
}
