package defpackage;

/* loaded from: classes.dex */
public final class hg5 extends IllegalStateException {
    public final String a;

    public hg5(String str) {
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
