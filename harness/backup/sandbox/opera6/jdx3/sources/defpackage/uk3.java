package defpackage;

import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class uk3 extends kuk implements cr9 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk3(byte b, mt5 mt5Var, Object obj) {
        super(3, mt5Var);
        this.t = b;
        this.u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk3(int i, mt5 mt5Var, byte b) {
        super(i, mt5Var);
        this.t = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = 3;
        switch (this.t) {
            case 0:
                uk3 uk3Var = new uk3((int) b, (mt5) obj3, (byte) 0);
                uk3Var.u = (spa) obj;
                uk3Var.invokeSuspend(Unit.a);
                return null;
            case 1:
                return new uk3((byte) 1, (mt5) obj3, this.u).invokeSuspend(Unit.a);
            case 2:
                return new uk3((byte) 2, (mt5) obj3, this.u).invokeSuspend(Unit.a);
            default:
                uk3 uk3Var2 = new uk3(b, (mt5) obj3, b);
                uk3Var2.u = (List) obj;
                return uk3Var2.invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                spa spaVar = (spa) this.u;
                px5 px5Var = px5.a;
                ybh.y(obj);
                if (spaVar.f.e(vk3.a) != null) {
                    h9o.t();
                }
                return null;
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                ti9 ti9Var = ((cq6) this.u).d;
                ti9Var.n = true;
                nak nakVar = (nak) ti9Var.k.d;
                Boolean bool = Boolean.FALSE;
                nakVar.getClass();
                nakVar.k((Object) null, bool);
                nak nakVar2 = ti9Var.m;
                Boolean boolValueOf = Boolean.valueOf(!ti9Var.n);
                nakVar2.getClass();
                nakVar2.k((Object) null, boolValueOf);
                return Unit.a;
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                ((pjb) this.u).e.decrementAndGet();
                return Unit.a;
            default:
                List list = (List) this.u;
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                return list;
        }
    }
}
