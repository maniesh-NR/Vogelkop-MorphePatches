package defpackage;

/* loaded from: classes.dex */
public final class bab {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public bab(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bab)) {
            return false;
        }
        bab babVar = (bab) obj;
        return this.a == babVar.a && this.b == babVar.b && this.c == babVar.c && this.d == babVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbO = sko.o(this.a, this.b, "InsetsValues(left=", ", top=", ", right=");
        sbO.append(this.c);
        sbO.append(", bottom=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
