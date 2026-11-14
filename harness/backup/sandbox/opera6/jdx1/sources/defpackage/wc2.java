package defpackage;

import ads_mobile_sdk.hh3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class wc2 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ Function1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc2(Function1 function1, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = function1;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Function1 function1 = this.v;
        switch (b) {
            case 0:
                return new wc2(function1, mt5Var, (byte) 0);
            case 1:
                return new wc2(function1, mt5Var, (byte) 1);
            case 2:
                return new wc2(function1, mt5Var, (byte) 2);
            case 3:
                return new wc2(function1, mt5Var, (byte) 3);
            case 4:
                return new wc2(function1, mt5Var, (byte) 4);
            case 5:
                return new wc2(function1, mt5Var, (byte) 5);
            default:
                return new wc2(function1, mt5Var, (byte) 6);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Function1 function1 = this.v;
        switch (b) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                return new wc2(function1, (mt5) obj2, (byte) 4).invokeSuspend(Unit.a);
            case 5:
                return new wc2(function1, (mt5) obj2, (byte) 5).invokeSuspend(Unit.a);
            default:
                return new wc2(function1, (mt5) obj2, (byte) 6).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Function1 function1 = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    this.u = true;
                    Object objInvoke = function1.invoke(this);
                    return objInvoke == px5Var ? px5Var : objInvoke;
                }
                if (z) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    this.u = true;
                    if (function1.invoke(this) == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 2:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    this.u = true;
                    if (function1.invoke(this) == px5Var3) {
                        return px5Var3;
                    }
                } else {
                    if (!z3) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 3:
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    this.u = true;
                    Object objInvoke2 = function1.invoke(this);
                    return objInvoke2 == px5Var4 ? px5Var4 : objInvoke2;
                }
                if (z4) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                px5 px5Var5 = px5.a;
                boolean z5 = this.u;
                if (!z5) {
                    ybh.y(obj);
                    this.u = true;
                    Object objInvoke3 = function1.invoke(this);
                    return objInvoke3 == px5Var5 ? px5Var5 : objInvoke3;
                }
                if (z5) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                px5 px5Var6 = px5.a;
                boolean z6 = this.u;
                if (z6) {
                    if (z6) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                hh3.a(hh3.b(), null);
                this.u = true;
                Object objInvoke4 = function1.invoke(this);
                return objInvoke4 == px5Var6 ? px5Var6 : objInvoke4;
            default:
                px5 px5Var7 = px5.a;
                boolean z7 = this.u;
                if (!z7) {
                    ybh.y(obj);
                    this.u = true;
                    Object objInvoke5 = function1.invoke(this);
                    return objInvoke5 == px5Var7 ? px5Var7 : objInvoke5;
                }
                if (z7) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
