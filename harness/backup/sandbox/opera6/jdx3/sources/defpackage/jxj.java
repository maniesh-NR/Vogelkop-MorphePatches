package defpackage;

/* loaded from: classes.dex */
public final class jxj {
    public final int a;
    public final int b;

    public jxj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxj)) {
            return false;
        }
        jxj jxjVar = (jxj) obj;
        return this.a == jxjVar.a && this.b == jxjVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
