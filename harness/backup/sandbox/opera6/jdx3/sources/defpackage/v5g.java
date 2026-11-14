package defpackage;

/* loaded from: classes.dex */
public final class v5g {
    public boolean a;
    public int b;
    public y2b c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5g)) {
            return false;
        }
        v5g v5gVar = (v5g) obj;
        return this.a == v5gVar.a && this.b == v5gVar.b && this.c == v5gVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + rfp.c(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
