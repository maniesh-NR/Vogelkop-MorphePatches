package defpackage;

/* loaded from: classes.dex */
public final class toe {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public toe(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toe)) {
            return false;
        }
        toe toeVar = (toe) obj;
        return this.a == toeVar.a && this.b == toeVar.b && this.c == toeVar.c && this.d == toeVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fki.k(fki.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ')';
    }
}
