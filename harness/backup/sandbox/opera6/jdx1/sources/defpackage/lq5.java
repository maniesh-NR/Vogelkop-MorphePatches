package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class lq5 extends kuk implements Function2 {
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ mq5 v;
    public final /* synthetic */ vnm w;
    public final /* synthetic */ xs3 x;
    public final /* synthetic */ long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq5(mq5 mq5Var, vnm vnmVar, xs3 xs3Var, long j, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = mq5Var;
        this.w = vnmVar;
        this.x = xs3Var;
        this.y = j;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        lq5 lq5Var = new lq5(this.v, this.w, this.x, this.y, mt5Var);
        lq5Var.u = obj;
        return lq5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        mq5 mq5Var = this.v;
        wth wthVar = mq5Var.t;
        px5 px5Var = px5.a;
        boolean z = this.t;
        CancellationException cancellationException = null;
        try {
            try {
                if (!z) {
                    ybh.y(obj);
                    unb unbVarU = o0g.U(((nx5) this.u).l());
                    mq5Var.w = true;
                    spi spiVar = mq5Var.p;
                    gfe gfeVar = gfe.a;
                    kq5 kq5Var = new kq5(this.w, mq5Var, this.x, this.y, unbVarU, null);
                    this.t = true;
                    if (spiVar.g(gfeVar, kq5Var, this) == px5Var) {
                        return px5Var;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                wthVar.L();
                mq5Var.w = false;
                wthVar.e((CancellationException) null);
                mq5Var.u = false;
                return Unit.a;
            } catch (CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            }
        } catch (Throwable th) {
            mq5Var.w = false;
            wthVar.e(cancellationException);
            mq5Var.u = false;
            throw th;
        }
    }
}
