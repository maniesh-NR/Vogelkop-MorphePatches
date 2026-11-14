package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class p2m implements iak {
    public final w2m a;
    public Function1 b;
    public Function1 c;
    public final /* synthetic */ q2m d;

    public p2m(q2m q2mVar, w2m w2mVar, Function1 function1, Function1 function12) {
        this.d = q2mVar;
        this.a = w2mVar;
        this.b = function1;
        this.c = function12;
    }

    public final void b(u2m u2mVar, Object obj, if1 if1Var) {
        Object objInvoke = this.c.invoke(u2mVar.a());
        boolean zG = this.d.c.g();
        w2m w2mVar = this.a;
        if (zG) {
            w2mVar.g(this.c.invoke(u2mVar.b()), objInvoke, (h49) this.b.invoke(u2mVar));
        } else {
            w2mVar.h(objInvoke, (h49) this.b.invoke(u2mVar), obj, if1Var);
        }
    }

    @Override // defpackage.iak
    public final Object getValue() {
        b(this.d.c.f(), null, null);
        return this.a.h.getValue();
    }
}
