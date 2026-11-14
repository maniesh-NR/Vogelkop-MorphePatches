package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class sd1 extends ozb implements cr9 {
    public final /* synthetic */ Object i;
    public final /* synthetic */ puj j;
    public final /* synthetic */ de1 k;
    public final /* synthetic */ ue5 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd1(Object obj, puj pujVar, de1 de1Var, ue5 ue5Var) {
        super(3);
        this.i = obj;
        this.j = pujVar;
        this.k = de1Var;
        this.l = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ke1 ke1Var = (ke1) obj;
        ih5 ih5Var = (ih5) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? ((vt9) ih5Var).f(ke1Var) : ((vt9) ih5Var).h(ke1Var) ? 4 : 2;
        }
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            puj pujVar = this.j;
            boolean zF = vt9Var.f(pujVar);
            Object obj4 = this.i;
            boolean zH = zF | vt9Var.h(obj4);
            de1 de1Var = this.k;
            boolean zH2 = zH | vt9Var.h(de1Var);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (zH2 || objK == zpaVar) {
                objK = new rd1(pujVar, obj4, de1Var, (byte) 0);
                vt9Var.g0(objK);
            }
            rm5.a(ke1Var, obj4, (Function1) objK, vt9Var);
            de1Var.d.m(obj4, ((le1) ke1Var).a);
            Object objK2 = vt9Var.K();
            if (objK2 == zpaVar) {
                objK2 = new wd1();
                vt9Var.g0(objK2);
            }
            this.l.j((wd1) objK2, obj4, vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
