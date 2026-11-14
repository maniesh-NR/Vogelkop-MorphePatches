package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class bt3 implements d9e {
    public final boh a;
    public final wjh b = new wjh((byte) 10);

    public bt3(boh bohVar) {
        this.a = bohVar;
    }

    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final CoroutineContext.Element get(g gVar) {
        return f.a(this, gVar);
    }

    public final CoroutineContext minusKey(g gVar) {
        return f.b(this, gVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.a(this, coroutineContext);
    }

    @Override // defpackage.d9e
    public final Object t(Function1 function1, mt5 mt5Var) {
        nh4 nh4Var = new nh4(1, hib.b(mt5Var));
        nh4Var.s();
        at3 at3Var = new at3();
        at3Var.a = nh4Var;
        at3Var.b = function1;
        nh4Var.u(new v91(this.b.c(at3Var, this.a), (byte) 2));
        Object objQ = nh4Var.q();
        px5 px5Var = px5.a;
        return objQ;
    }
}
