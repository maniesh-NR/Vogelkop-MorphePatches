package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class hs1 implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ks1 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ hs1(ks1 ks1Var, Function1 function1, Function0 function0, Function0 function02) {
        this.b = ks1Var;
        this.c = function1;
        this.d = function0;
        this.e = function02;
    }

    public /* synthetic */ hs1(ks1 ks1Var, Function1 function1, Function0 function0, Function0 function02, int i) {
        this.b = ks1Var;
        this.c = function1;
        this.d = function0;
        this.e = function02;
    }

    public final Object invoke(Object obj, Object obj2) throws oye {
        switch (this.a) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                byte b = 0;
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strQ = mzg.q(vt9Var, 2132018449);
                    ks1 ks1Var = this.b;
                    j14.c(null, null, strQ, gyg.P(268599378, new fx0(ks1Var, this.c, (byte) 5), vt9Var), gyg.P(1486878995, new fx0(ks1Var, this.d, (byte) 6), vt9Var), gyg.P(-1589808684, new is1(this.e, b), vt9Var), 0L, 0, 0, false, vt9Var, 224256, 963);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                aib.a(this.b, this.c, this.d, this.e, (ih5) obj, aoh.m(9));
                break;
        }
        return Unit.a;
    }
}
