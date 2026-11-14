package defpackage;

/* loaded from: classes.dex */
public final class xe1 implements iak {
    public final j8m a;
    public final t0g b;
    public if1 c;
    public long d;
    public long e;
    public boolean f;

    public /* synthetic */ xe1(j8m j8mVar, Object obj, if1 if1Var, int i) {
        this(j8mVar, obj, (i & 4) != 0 ? null : if1Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public xe1(j8m j8mVar, Object obj, if1 if1Var, long j, long j2, boolean z) {
        if1 if1VarM;
        this.a = j8mVar;
        this.b = hyg.k(obj);
        if (if1Var != null) {
            if1VarM = nb6.m(if1Var);
        } else {
            if1VarM = (if1) j8mVar.a.invoke(obj);
            if1VarM.d();
        }
        this.c = if1VarM;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final Object b() {
        return this.a.b.invoke(this.c);
    }

    @Override // defpackage.iak
    public final Object getValue() {
        return this.b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.b.getValue() + ", velocity=" + b() + ", isRunning=" + this.f + ", lastFrameTimeNanos=" + this.d + ", finishedTimeNanos=" + this.e + ")";
    }
}
