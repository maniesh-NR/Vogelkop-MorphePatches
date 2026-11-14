package defpackage;

/* loaded from: classes.dex */
public final class jzk {
    public final int a;
    public final int b;

    public jzk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzk)) {
            return false;
        }
        jzk jzkVar = (jzk) obj;
        return this.a == jzkVar.a && this.b == jzkVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
