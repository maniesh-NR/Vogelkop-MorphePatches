package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c67 implements uki {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Function1 b;

    public c67(Function1 function1, Function2 function2) {
        this.b = function1;
        this.a = function2;
    }

    public c67(Function2 function2, Function1 function1) {
        this.a = function2;
        this.b = function1;
    }

    @Override // defpackage.uki
    public final Object a(rji rjiVar, Object obj) {
        return this.a.invoke(rjiVar, obj);
    }
}
