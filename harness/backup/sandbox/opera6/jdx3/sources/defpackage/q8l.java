package defpackage;

/* loaded from: classes.dex */
public final class q8l {
    public static final q8l c = new q8l(p8l.a, n8l.a);
    public final p8l a;
    public final uyg b;

    public q8l(p8l p8lVar, uyg uygVar) {
        this.a = p8lVar;
        this.b = uygVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8l)) {
            return false;
        }
        q8l q8lVar = (q8l) obj;
        return this.a == q8lVar.a && this.b.equals(q8lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
