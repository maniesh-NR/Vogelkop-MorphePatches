package defpackage;

/* loaded from: classes.dex */
public final class xmc {
    public final int a;
    public final int b;

    public xmc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmc)) {
            return false;
        }
        xmc xmcVar = (xmc) obj;
        return this.a == xmcVar.a && this.b == xmcVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
