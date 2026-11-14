package defpackage;

import androidx.work.CoroutineWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class tx5 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ CoroutineWorker v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tx5(CoroutineWorker coroutineWorker, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = coroutineWorker;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        CoroutineWorker coroutineWorker = this.v;
        switch (b) {
            case 0:
                return new tx5(coroutineWorker, mt5Var, (byte) 0);
            default:
                return new tx5(coroutineWorker, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
            case 0:
                tx5 tx5VarCreate = create(nx5Var, mt5Var);
                Unit unit = Unit.a;
                tx5VarCreate.invokeSuspend(unit);
                return unit;
            default:
                return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    this.u = true;
                    qp2.n("Not implemented");
                } else {
                    if (z) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    this.u = true;
                    Object objC = this.v.c(this);
                    return objC == px5Var2 ? px5Var2 : objC;
                }
                if (z2) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
