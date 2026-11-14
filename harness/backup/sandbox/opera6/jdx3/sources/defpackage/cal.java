package defpackage;

/* loaded from: classes.dex */
public final class cal {
    public final int a;
    public final int b;

    public cal(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cal)) {
            return false;
        }
        cal calVar = (cal) obj;
        return this.a == calVar.a && this.b == calVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
