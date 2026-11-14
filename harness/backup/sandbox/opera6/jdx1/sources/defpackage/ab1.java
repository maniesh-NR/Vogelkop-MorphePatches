package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ab1 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eb1 b;
    public final /* synthetic */ lfl c;

    public /* synthetic */ ab1(eb1 eb1Var, lfl lflVar, byte b) {
        this.a = b;
        this.b = eb1Var;
        this.c = lflVar;
    }

    public final Object invoke() {
        byte b = this.a;
        lfl lflVar = this.c;
        eb1 eb1Var = this.b;
        switch (b) {
            case 0:
                za1 za1Var = eb1Var.f;
                pa paVar = new pa(lflVar, (byte) 19);
                pqh pqhVar = new pqh();
                eb1Var.e.e("dataBuilder", za1Var, new x2(pqhVar, paVar, (byte) 13));
                Object obj = pqhVar.a;
                if (obj == null) {
                    obj = Unit.a;
                }
                return (kfl) obj;
            case 1:
                za1 za1Var2 = eb1Var.g;
                ab1 ab1Var = new ab1(eb1Var, lflVar, (byte) 2);
                pqh pqhVar2 = new pqh();
                eb1Var.e.e("positioner", za1Var2, new x2(pqhVar2, ab1Var, (byte) 13));
                Object obj2 = pqhVar2.a;
                if (obj2 == null) {
                    obj2 = Unit.a;
                }
                return (voh) obj2;
            default:
                Object objInvoke = eb1Var.c.invoke();
                if (!((b2c) objInvoke).f()) {
                    objInvoke = null;
                }
                b2c b2cVar = (b2c) objInvoke;
                return b2cVar == null ? voh.e : lflVar.W(b2cVar).i(b2cVar.U(0L));
        }
    }
}
