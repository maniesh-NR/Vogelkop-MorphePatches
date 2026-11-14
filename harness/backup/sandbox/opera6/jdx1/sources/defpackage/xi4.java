package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class xi4 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public l94 u;
    public byte v;
    public final /* synthetic */ l94 w;
    public final /* synthetic */ rj4 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi4(l94 l94Var, mt5 mt5Var, rj4 rj4Var, int i, int i2, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = l94Var;
        this.x = rj4Var;
        this.y = i;
        this.z = i2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new xi4(this.w, mt5Var, this.x, this.y, this.z, (byte) 0);
            default:
                return new xi4(this.w, mt5Var, this.x, this.y, this.z, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        l94 l94Var;
        xi4 xi4Var;
        l94 l94Var2;
        byte b = this.t;
        l94 l94Var3 = this.w;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                byte b2 = this.v;
                if (b2 == 0) {
                    ybh.y(obj);
                    List listSingletonList = Collections.singletonList(qi4.c);
                    this.u = l94Var3;
                    this.v = (byte) 1;
                    obj = this.x.h(listSingletonList, this.y, this.z, 1, null, this);
                    if (obj != px5Var) {
                    }
                    break;
                } else if (b2 == 1) {
                    l94Var3 = this.u;
                    ybh.y(obj);
                } else if (b2 != 2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    l94Var = this.u;
                    ybh.y(obj);
                    l94Var.b(null);
                    break;
                }
                this.u = l94Var3;
                this.v = (byte) 2;
                if (cs5.b0((Collection) obj, this) != px5Var) {
                    l94Var = l94Var3;
                    l94Var.b(null);
                }
            default:
                px5 px5Var2 = px5.a;
                byte b3 = this.v;
                if (b3 == 0) {
                    ybh.y(obj);
                    List listSingletonList2 = Collections.singletonList(qi4.a);
                    this.u = l94Var3;
                    this.v = (byte) 1;
                    xi4Var = this;
                    obj = this.x.h(listSingletonList2, this.y, this.z, 1, null, xi4Var);
                    if (obj != px5Var2) {
                    }
                    break;
                } else if (b3 == 1) {
                    l94Var3 = this.u;
                    ybh.y(obj);
                    xi4Var = this;
                } else if (b3 != 2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    l94Var2 = this.u;
                    ybh.y(obj);
                    l94Var2.b(null);
                    break;
                }
                xi4Var.u = l94Var3;
                xi4Var.v = (byte) 2;
                if (cs5.b0((Collection) obj, xi4Var) != px5Var2) {
                    l94Var2 = l94Var3;
                    l94Var2.b(null);
                }
        }
        return Unit.a;
    }
}
