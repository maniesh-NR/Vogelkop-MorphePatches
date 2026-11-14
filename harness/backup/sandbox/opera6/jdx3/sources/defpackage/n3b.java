package defpackage;

/* loaded from: classes.dex */
public final class n3b {
    public static final n3b d = new n3b(true, true, true);
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public n3b(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3b)) {
            return false;
        }
        n3b n3bVar = (n3b) obj;
        return this.a == n3bVar.a && this.b == n3bVar.b && this.c == n3bVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fki.k(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
