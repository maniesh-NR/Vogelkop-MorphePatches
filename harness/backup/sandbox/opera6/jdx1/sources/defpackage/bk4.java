package defpackage;

import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class bk4 extends kuk implements Function2 {
    public final /* synthetic */ byte t = 0;
    public boolean u;
    public final /* synthetic */ short v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public bk4(long j, dk4 dk4Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = (int) j;
        this.x = dk4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public bk4(hnl hnlVar, Function1 function1, long j, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = hnlVar;
        this.x = function1;
        this.v = (int) j;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        short s = this.v;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                bk4 bk4Var = new bk4(s, (dk4) obj2, mt5Var);
                bk4Var.w = obj;
                return bk4Var;
            default:
                return new bk4((hnl) this.w, (Function1) obj2, s, mt5Var);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws Exception {
        byte b = this.t;
        short s = this.v;
        Object obj2 = this.x;
        mt5 mt5Var = null;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    Objects.toString((nx5) this.w);
                    this.u = true;
                    if (nb6.p(s, this) == px5Var) {
                        return px5Var;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                ((dk4) obj2).g(0L);
                return Unit.a;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (z2) {
                    if (z2) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                hnl hnlVar = (hnl) this.w;
                l3h l3hVar = new l3h(na2.g(hnlVar.b, hnlVar.f, null, new wc2((Function1) obj2, mt5Var, (byte) 3), 2), (mt5) null, (byte) 1);
                this.u = true;
                Object objW = uyg.w(s, l3hVar, this);
                return objW == px5Var2 ? px5Var2 : objW;
        }
    }
}
