package defpackage;

/* loaded from: classes.dex */
public final class go8 {
    public static final go8 d = new go8(false, gvl.e, rp3.d);
    public final boolean a;
    public final gvl b;
    public final rp3 c;

    public go8(boolean z, gvl gvlVar, rp3 rp3Var) {
        this.a = z;
        this.b = gvlVar;
        this.c = rp3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go8)) {
            return false;
        }
        go8 go8Var = (go8) obj;
        return this.a == go8Var.a && this.b.equals(go8Var.b) && this.c.equals(go8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
