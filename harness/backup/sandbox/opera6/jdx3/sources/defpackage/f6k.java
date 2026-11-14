package defpackage;

/* loaded from: classes.dex */
public final class f6k {
    public final zch a;
    public final mv8 b;
    public final int c;

    public f6k(zch zchVar, mv8 mv8Var, int i) {
        this.a = zchVar;
        this.b = mv8Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6k)) {
            return false;
        }
        f6k f6kVar = (f6k) obj;
        return this.a.equals(f6kVar.a) && this.b.equals(f6kVar.b) && this.c == f6kVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
