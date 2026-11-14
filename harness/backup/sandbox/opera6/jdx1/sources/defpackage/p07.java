package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p07 extends kuk implements Function2 {
    public byte t;
    public final /* synthetic */ i07 u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p07(i07 i07Var, int i, mt5 mt5Var) {
        super(2, mt5Var);
        this.u = i07Var;
        this.v = i;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new p07(this.u, this.v, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        byte b = this.t;
        if (b == 0) {
            ybh.y(obj);
            this.t = (byte) 1;
            obj = this.u.A(this);
            if (obj != px5Var) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                ybh.y(obj);
                return obj;
            }
            qp2.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ybh.y(obj);
        List list = (List) obj;
        int size = list.size();
        int i = this.v;
        if (i >= size) {
            return null;
        }
        h07 h07Var = (h07) list.get(i);
        this.t = (byte) 2;
        Object objX = h07Var.X(this);
        return objX == px5Var ? px5Var : objX;
    }
}
