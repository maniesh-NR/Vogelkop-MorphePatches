package defpackage;

/* loaded from: classes.dex */
public final class bzl {
    public final long a;
    public final long b;
    public final boolean c;

    public bzl(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final bzl a(bzl bzlVar) {
        return new bzl(y8f.e(this.a, bzlVar.a), Math.max(this.b, bzlVar.b), this.c || bzlVar.c);
    }
}
