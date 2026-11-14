package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class dh5 implements Function2 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ fh5 b;
    public final /* synthetic */ v31 c;
    public final /* synthetic */ ue5 d;

    public /* synthetic */ dh5(fh5 fh5Var, v31 v31Var, ue5 ue5Var, int i) {
        this.b = fh5Var;
        this.c = v31Var;
        this.d = ue5Var;
    }

    public /* synthetic */ dh5(v31 v31Var, fh5 fh5Var, ue5 ue5Var) {
        this.c = v31Var;
        this.b = fh5Var;
        this.d = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ue5 ue5Var = this.d;
        v31 v31Var = this.c;
        fh5 fh5Var = this.b;
        ih5 ih5Var = (ih5) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vt9Var.W(866651995);
                    mi5.a(v31Var, fh5Var.l, ue5Var, vt9Var, 0);
                    vt9Var.p(false);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                num.getClass();
                fh5Var.a(v31Var, ue5Var, ih5Var, aoh.m(1));
                break;
        }
        return Unit.a;
    }
}
