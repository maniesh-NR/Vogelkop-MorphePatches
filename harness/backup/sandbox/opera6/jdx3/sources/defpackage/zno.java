package defpackage;

/* loaded from: classes.dex */
public final class zno extends Exception {
    public final bm a;

    public zno(bm bmVar) {
        super(bmVar.c);
        this.a = bmVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zno) && ((zno) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return z1m.l(new StringBuilder("AdException("), this.a.c, ")");
    }
}
