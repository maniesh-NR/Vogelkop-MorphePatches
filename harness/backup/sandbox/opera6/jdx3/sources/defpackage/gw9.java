package defpackage;

/* loaded from: classes.dex */
public final class gw9 {
    public final f03 a;
    public final f03 b;
    public final boolean c;
    public final qhj d;

    public gw9(f03 f03Var, f03 f03Var2, boolean z, qhj qhjVar) {
        this.a = f03Var;
        this.b = f03Var2;
        this.c = z;
        this.d = qhjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw9)) {
            return false;
        }
        gw9 gw9Var = (gw9) obj;
        return this.a.equals(gw9Var.a) && this.b.equals(gw9Var.b) && this.c == gw9Var.c && this.d == gw9Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + fki.k((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
