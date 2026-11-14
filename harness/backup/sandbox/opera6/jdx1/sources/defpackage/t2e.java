package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class t2e implements dr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ h58 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ t2e(List list, h58 h58Var, Function1 function1, Function1 function12, Function1 function13, byte b) {
        this.a = b;
        this.b = list;
        this.c = h58Var;
        this.d = function1;
        this.e = function12;
        this.f = function13;
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        byte b = this.a;
        Function1 function1 = this.f;
        z7e z7eVar = z7e.b;
        h58 h58Var = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                y4c y4cVar = (y4c) obj;
                int iIntValue = ((Number) obj2).intValue();
                ih5 ih5Var = (ih5) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (((vt9) ih5Var).f(y4cVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= ((vt9) ih5Var).d(iIntValue) ? 32 : 16;
                }
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(i & 1, (i & 147) != 146)) {
                    g2e g2eVar = (g2e) list.get(iIntValue);
                    vt9Var.W(-1260804947);
                    oup.I(g2eVar, (jk8) h58Var.get(iIntValue % h58Var.d()), this.d, this.e, f03.O(a26.Z(z7eVar, 16.0f, 0.0f, 2), new jkc(function1, g2eVar.a().a, (byte) 12)), vt9Var, 0);
                    vt9Var.p(false);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                y4c y4cVar2 = (y4c) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ih5 ih5Var2 = (ih5) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (((vt9) ih5Var2).f(y4cVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= ((vt9) ih5Var2).d(iIntValue3) ? 32 : 16;
                }
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(i2 & 1, (i2 & 147) != 146)) {
                    g2e g2eVar2 = (g2e) list.get(iIntValue3);
                    vt9Var2.W(-1807030575);
                    oup.I(g2eVar2, (jk8) h58Var.get(iIntValue3 % h58Var.d()), this.d, this.e, f03.O(a26.Z(z7eVar, 16.0f, 0.0f, 2), new jkc(function1, g2eVar2.a().a, (byte) 12)), vt9Var2, 0);
                    vt9Var2.p(false);
                } else {
                    vt9Var2.Q();
                }
                break;
        }
        return Unit.a;
    }
}
