package defpackage;

/* loaded from: classes.dex */
public final class uzj {
    public final boolean a;
    public final p7j b;
    public final boolean c;
    public final boolean d;

    public uzj(boolean z, p7j p7jVar, boolean z2, boolean z3) {
        this.a = z;
        this.b = p7jVar;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzj)) {
            return false;
        }
        uzj uzjVar = (uzj) obj;
        return this.a == uzjVar.a && this.b == uzjVar.b && this.c == uzjVar.c && this.d == uzjVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fki.k((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
