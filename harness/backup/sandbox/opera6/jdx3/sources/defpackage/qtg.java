package defpackage;

/* loaded from: classes.dex */
public final class qtg {
    public final int a;
    public final int b;

    public qtg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtg)) {
            return false;
        }
        qtg qtgVar = (qtg) obj;
        return this.a == qtgVar.a && this.b == qtgVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (((Integer.hashCode(this.a) * 31) - 2032180703) * 31);
    }

    public final String toString() {
        return "";
    }
}
