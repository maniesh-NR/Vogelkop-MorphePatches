package defpackage;

/* loaded from: classes.dex */
public final class o9b {
    public long a;
    public boolean b;
    public boolean c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9b)) {
            return false;
        }
        o9b o9bVar = (o9b) obj;
        return this.a == o9bVar.a && this.b == o9bVar.b && this.c == o9bVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fki.k(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
