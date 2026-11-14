package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hc4 extends kuk implements Function2 {
    public int A;
    public l94 t;
    public byte u;
    public final /* synthetic */ l94 v;
    public final /* synthetic */ wrm w;
    public final /* synthetic */ int x;
    public final /* synthetic */ jc4 y;
    public wrm z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc4(l94 l94Var, mt5 mt5Var, wrm wrmVar, int i, jc4 jc4Var) {
        super(2, mt5Var);
        this.v = l94Var;
        this.w = wrmVar;
        this.x = i;
        this.y = jc4Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new hc4(this.v, mt5Var, this.w, this.x, this.y);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        l94 l94Var;
        int i;
        wrm wrmVar;
        l94 l94Var2;
        px5 px5Var = px5.a;
        byte b = this.u;
        if (b == 0) {
            ybh.y(obj);
            n79 n79Var = this.y.c;
            l94Var = this.v;
            this.t = l94Var;
            wrm wrmVar2 = this.w;
            this.z = wrmVar2;
            i = this.x;
            this.A = i;
            this.u = (byte) 1;
            obj = n79Var.c(this);
            if (obj != px5Var) {
                wrmVar = wrmVar2;
            }
            return px5Var;
        }
        if (b != 1) {
            if (b != 2) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l94Var2 = this.t;
            ybh.y(obj);
            l94Var2.b(obj);
            return Unit.a;
        }
        int i2 = this.A;
        wrmVar = this.z;
        l94 l94Var3 = this.t;
        ybh.y(obj);
        i = i2;
        l94Var = l94Var3;
        int iIntValue = ((Number) obj).intValue();
        this.t = l94Var;
        this.z = null;
        this.u = (byte) 2;
        obj = ((ni4) wrmVar.k.getValue()).b(i, iIntValue);
        if (obj != px5Var) {
            l94Var2 = l94Var;
            l94Var2.b(obj);
            return Unit.a;
        }
        return px5Var;
    }
}
