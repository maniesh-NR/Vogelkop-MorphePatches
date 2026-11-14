package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class e0f implements Function2 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e0f(int i, long j, String str) {
        this.d = str;
        this.b = j;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e0f(long j, Function0 function0, int i) {
        this.b = j;
        this.d = function0;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = this.c;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                lcp.c(this.b, (Function0) obj3, (ih5) obj, aoh.m(b2 | 1));
                break;
            default:
                String str = (String) obj3;
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    voi voiVarQ0 = oup.q0(vt9Var);
                    c8e c8eVarZ = a26.Z(oup.s0(y7h.m(voiVarQ0, vt9Var), voiVarQ0, true, true), gkf.c, 0.0f, 2);
                    unf unfVar = pof.a;
                    ijl.b(str, c8eVarZ, this.b, 0L, null, 0L, null, new pel(b2), 0L, 0, false, 0, 0, pof.b(vt9Var).k, vt9Var, 0, 0, 130040);
                } else {
                    vt9Var.Q();
                }
                break;
        }
        return Unit.a;
    }
}
