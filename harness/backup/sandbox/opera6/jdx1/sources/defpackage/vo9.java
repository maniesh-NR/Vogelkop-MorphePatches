package defpackage;

/* loaded from: classes.dex */
public final class vo9 extends RuntimeException {
    public final wo9 a;
    public final Throwable b;

    public vo9(wo9 wo9Var, Throwable th) {
        super(th);
        this.a = wo9Var;
        this.b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }
}
