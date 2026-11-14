package defpackage;

import ads_mobile_sdk.c33;
import ads_mobile_sdk.h1;
import ads_mobile_sdk.u23;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m76 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Function1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m76(Function1 function1, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m76(mt5 mt5Var, Function1 function1, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = function1;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Function1 function1 = this.v;
        switch (b) {
            case 0:
                m76 m76Var = new m76(mt5Var, function1, (byte) 0);
                m76Var.u = obj;
                return m76Var;
            case 1:
                m76 m76Var2 = new m76(mt5Var, function1, (byte) 1);
                m76Var2.u = obj;
                return m76Var2;
            case 2:
                m76 m76Var3 = new m76(function1, mt5Var, (byte) 2);
                m76Var3.u = obj;
                return m76Var3;
            case 3:
                m76 m76Var4 = new m76(function1, mt5Var, (byte) 3);
                m76Var4.u = obj;
                return m76Var4;
            case 4:
                m76 m76Var5 = new m76(function1, mt5Var, (byte) 4);
                m76Var5.u = obj;
                return m76Var5;
            default:
                m76 m76Var6 = new m76(function1, mt5Var, (byte) 5);
                m76Var6.u = obj;
                return m76Var6;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Function1 function1 = this.v;
        switch (b) {
            case 0:
                return create((g3g) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((g3g) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((ggb) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((lee) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                m76 m76Var = new m76(function1, (mt5) obj2, (byte) 4);
                m76Var.u = (h1) obj;
                return m76Var.invokeSuspend(Unit.a);
            default:
                m76 m76Var2 = new m76(function1, (mt5) obj2, (byte) 5);
                m76Var2.u = (u23) obj;
                return m76Var2.invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Function1 function1 = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                return function1.invoke(((g3g) this.u).b());
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                return function1.invoke(((g3g) this.u).b());
            case 2:
                ggb ggbVar = (ggb) this.u;
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                return function1.invoke(ggbVar);
            case 3:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                function1.invoke((lee) this.u);
                return Unit.a;
            case 4:
                px5 px5Var5 = px5.a;
                ybh.y(obj);
                return function1.invoke((h1) this.u);
            default:
                px5 px5Var6 = px5.a;
                ybh.y(obj);
                cip cipVar = (cip) ((u23) this.u).n();
                function1.invoke(new c33(cipVar));
                return (u23) cipVar.a();
        }
    }
}
