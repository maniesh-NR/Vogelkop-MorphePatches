package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class qof implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ nof b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ue5 d;

    public /* synthetic */ qof(nof nofVar, boolean z, ue5 ue5Var) {
        this.b = nofVar;
        this.c = z;
        this.d = ue5Var;
    }

    public /* synthetic */ qof(nof nofVar, boolean z, ue5 ue5Var, int i) {
        this.b = nofVar;
        this.c = z;
        this.d = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ue5 ue5Var = this.d;
        boolean z = this.c;
        nof nofVar = this.b;
        vt9 vt9Var = (ih5) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rof.b(nofVar, z, ue5Var, vt9Var2, 384);
                } else {
                    vt9Var2.Q();
                }
                break;
            default:
                num.getClass();
                rof.b(nofVar, z, ue5Var, vt9Var, aoh.m(385));
                break;
        }
        return Unit.a;
    }
}
