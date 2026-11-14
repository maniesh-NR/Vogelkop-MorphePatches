package defpackage;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x1j extends j0i implements Function2 {
    public final /* synthetic */ br9 A;
    public final /* synthetic */ byte u = 0;
    public boolean v;
    public Object w;
    public Object x;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1j(m2m m2mVar, ali aliVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.z = m2mVar;
        this.A = aliVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1j(nx5 nx5Var, lwg lwgVar, dk7 dk7Var, Function1 function1, mt5 mt5Var) {
        super(2, mt5Var);
        this.x = nx5Var;
        this.y = lwgVar;
        this.z = dk7Var;
        this.A = function1;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.u;
        Function1 function1 = this.A;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                x1j x1jVar = new x1j((m2m) obj2, (ali) function1, mt5Var);
                x1jVar.y = obj;
                return x1jVar;
            default:
                x1j x1jVar2 = new x1j((nx5) this.x, (lwg) this.y, (dk7) obj2, function1, mt5Var);
                x1jVar2.w = obj;
                return x1jVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.u) {
            case 0:
                return create((l1j) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((uuk) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Iterator l2mVar;
        Object next;
        byte b = this.u;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                l1j l1jVar = (l1j) this.y;
                px5 px5Var = px5.a;
                boolean z = this.v;
                if (!z) {
                    ybh.y(obj);
                    l2mVar = new l2m((m2m) obj2);
                    if (!((l2m) l2mVar).b.hasNext()) {
                        break;
                    } else {
                        next = l2mVar.next();
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    next = this.w;
                    l2mVar = (Iterator) this.x;
                    ybh.y(obj);
                }
                if (!l2mVar.hasNext()) {
                    break;
                } else {
                    Object next2 = l2mVar.next();
                    Pair pair = new Pair(next, next2);
                    this.y = l1jVar;
                    this.x = l2mVar;
                    this.w = next2;
                    this.v = true;
                    l1jVar.a(this, pair);
                    break;
                }
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.v;
                if (!z2) {
                    ybh.y(obj);
                    Function1 function1 = this.A;
                    this.v = true;
                    if (xbl.g((uuk) this.w, (nx5) this.x, (lwg) this.y, (dk7) obj2, function1, this) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
        }
        return Unit.a;
    }
}
