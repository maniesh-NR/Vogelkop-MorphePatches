package defpackage;

/* loaded from: classes.dex */
public final class lxk {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public lxk(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = z && z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxk)) {
            return false;
        }
        lxk lxkVar = (lxk) obj;
        return this.a == lxkVar.a && this.b == lxkVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
