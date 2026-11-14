package defpackage;

import ads_mobile_sdk.hh3;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class fsg extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Function2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fsg(Function2 function2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = function2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Function2 function2 = this.w;
        switch (b) {
            case 0:
                fsg fsgVar = new fsg(function2, mt5Var, (byte) 0);
                fsgVar.v = obj;
                return fsgVar;
            case 1:
                fsg fsgVar2 = new fsg(function2, mt5Var, (byte) 1);
                fsgVar2.v = obj;
                return fsgVar2;
            case 2:
                fsg fsgVar3 = new fsg(function2, mt5Var, (byte) 2);
                fsgVar3.v = obj;
                return fsgVar3;
            default:
                fsg fsgVar4 = new fsg(function2, mt5Var, (byte) 3);
                fsgVar4.v = obj;
                return fsgVar4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((lee) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((lee) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                fsg fsgVar = new fsg(this.w, (mt5) obj2, (byte) 3);
                fsgVar.v = (nx5) obj;
                return fsgVar.invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Function2 function2 = this.w;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    lee leeVar = (lee) this.v;
                    this.u = true;
                    obj = function2.invoke(leeVar, this);
                    if (obj == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                lee leeVar2 = (lee) obj;
                ((AtomicBoolean) leeVar2.b.a).set(true);
                break;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    lee leeVar3 = new lee(new LinkedHashMap(((lee) this.v).a()), false);
                    this.v = leeVar3;
                    this.u = true;
                    if (function2.invoke(leeVar3, this) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    lee leeVar4 = (lee) this.v;
                    ybh.y(obj);
                    break;
                }
                break;
            case 2:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    nx5 nx5Var = (nx5) this.v;
                    this.u = true;
                    if (function2.invoke(nx5Var, this) == px5Var3) {
                        break;
                    }
                } else if (!z3) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    nx5 nx5Var2 = (nx5) this.v;
                    hh3.a(hh3.b(), null);
                    this.u = true;
                    if (function2.invoke(nx5Var2, this) == px5Var4) {
                        break;
                    }
                } else if (!z4) {
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
