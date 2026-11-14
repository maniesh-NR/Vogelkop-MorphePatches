package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q2m {
    public final j8m a;
    public final t0g b = hyg.k((Object) null);
    public final /* synthetic */ b3m c;

    public q2m(b3m b3mVar, j8m j8mVar, String str) {
        this.c = b3mVar;
        this.a = j8mVar;
    }

    public final p2m a(Function1 function1, Object obj, if1 if1Var, Function1 function12) {
        t0g t0gVar = this.b;
        p2m p2mVar = (p2m) t0gVar.getValue();
        b3m b3mVar = this.c;
        if (p2mVar == null) {
            Object objInvoke = function12.invoke(b3mVar.c());
            Object objInvoke2 = function12.invoke(b3mVar.c());
            j8m j8mVar = this.a;
            if1 if1Var2 = (if1) j8mVar.a.invoke(objInvoke2);
            if1Var2.d();
            w2m w2mVar = new w2m(b3mVar, objInvoke, if1Var2, j8mVar);
            p2mVar = new p2m(this, w2mVar, function1, function12);
            t0gVar.setValue(p2mVar);
            b3mVar.j.add(w2mVar);
        }
        p2mVar.c = function12;
        p2mVar.b = function1;
        p2mVar.b(b3mVar.f(), obj, if1Var);
        return p2mVar;
    }
}
