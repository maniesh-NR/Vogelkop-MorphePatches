package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ad1 extends kuk implements Function1 {
    public xe1 t;
    public lqh u;
    public boolean v;
    public final /* synthetic */ cd1 w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ ecl y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad1(cd1 cd1Var, Object obj, ecl eclVar, long j, mt5 mt5Var) {
        super(1, mt5Var);
        this.w = cd1Var;
        this.x = obj;
        this.y = eclVar;
        this.z = j;
    }

    public final mt5 create(mt5 mt5Var) {
        return new ad1(this.w, this.x, this.y, this.z, mt5Var);
    }

    public final Object invoke(Object obj) {
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        xe1 xe1Var;
        lqh lqhVar;
        ecl eclVar = this.y;
        px5 px5Var = px5.a;
        boolean z = this.v;
        cd1 cd1Var = this.w;
        try {
            if (!z) {
                ybh.y(obj);
                cd1Var.c.c = (if1) cd1Var.a.a.invoke(this.x);
                cd1Var.e.setValue(eclVar.c);
                cd1Var.d.setValue(Boolean.TRUE);
                xe1 xe1Var2 = cd1Var.c;
                xe1 xe1Var3 = new xe1(xe1Var2.a, xe1Var2.b.getValue(), nb6.m(xe1Var2.c), xe1Var2.d, Long.MIN_VALUE, xe1Var2.f);
                lqh lqhVar2 = new lqh();
                long j = this.z;
                f9 f9Var = new f9(cd1Var, xe1Var3, lqhVar2, (byte) 2);
                this.t = xe1Var3;
                this.u = lqhVar2;
                this.v = true;
                if (mfh.f(xe1Var3, eclVar, j, f9Var, this) == px5Var) {
                    return px5Var;
                }
                xe1Var = xe1Var3;
                lqhVar = lqhVar2;
            } else {
                if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lqhVar = this.u;
                xe1Var = this.t;
                ybh.y(obj);
            }
            oe1 oe1Var = lqhVar.a ? oe1.a : oe1.b;
            cd1Var.c();
            return new ue1(xe1Var, oe1Var);
        } catch (CancellationException e) {
            cd1Var.c();
            throw e;
        }
    }
}
