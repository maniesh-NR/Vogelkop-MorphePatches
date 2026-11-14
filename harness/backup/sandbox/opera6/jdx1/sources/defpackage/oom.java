package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class oom implements CoroutineContext.Element {
    public final oom a;
    public final ie6 b;

    public oom(oom oomVar, ie6 ie6Var) {
        this.a = oomVar;
        this.b = ie6Var;
    }

    public final void a(ie6 ie6Var) {
        if (this.b == ie6Var) {
            qp2.n("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        oom oomVar = this.a;
        if (oomVar != null) {
            oomVar.a(ie6Var);
        }
    }

    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final /* bridge */ CoroutineContext.Element get(g gVar) {
        return f.a(this, gVar);
    }

    public final g getKey() {
        return ydp.m;
    }

    public final /* bridge */ CoroutineContext minusKey(g gVar) {
        return f.b(this, gVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.a(this, coroutineContext);
    }
}
