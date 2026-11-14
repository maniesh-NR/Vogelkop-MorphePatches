package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ve1 {
    public final j8m a;
    public final Object b;
    public final long c;
    public final Function0 d;
    public final t0g e;
    public if1 f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final t0g i = hyg.k(Boolean.TRUE);

    public ve1(Object obj, j8m j8mVar, if1 if1Var, long j, Object obj2, long j2, Function0 function0) {
        this.a = j8mVar;
        this.b = obj2;
        this.c = j2;
        this.d = function0;
        this.e = hyg.k(obj);
        this.f = nb6.m(if1Var);
        this.g = j;
    }

    public final void a() {
        this.i.setValue(Boolean.FALSE);
        this.d.invoke();
    }
}
