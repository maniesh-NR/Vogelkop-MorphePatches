package defpackage;

import android.view.Choreographer;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qb1 implements d9e {
    public final Choreographer a;
    public final ob1 b;

    public qb1(Choreographer choreographer, ob1 ob1Var) {
        this.a = choreographer;
        this.b = ob1Var;
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
        ob1 ob1Var = this.b;
        byte b = 1;
        nh4 nh4Var = new nh4(1, hib.b(mt5Var));
        nh4Var.s();
        pb1 pb1Var = new pb1(nh4Var, this, function1);
        if (Intrinsics.a(ob1Var.b, this.a)) {
            synchronized (ob1Var.d) {
                ob1Var.f.add(pb1Var);
                if (!ob1Var.i) {
                    ob1Var.i = true;
                    ob1Var.b.postFrameCallback(ob1Var.j);
                }
            }
            nh4Var.u(new m91(ob1Var, pb1Var, b));
        } else {
            this.a.postFrameCallback(pb1Var);
            nh4Var.u(new m91((Object) this, (Object) pb1Var, (byte) 2));
        }
        Object objQ = nh4Var.q();
        px5 px5Var = px5.a;
        return objQ;
    }
}
