package defpackage;

/* loaded from: classes.dex */
public final class ii4 {
    public final int a;
    public final int b;

    public ii4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii4)) {
            return false;
        }
        ii4 ii4Var = (ii4) obj;
        return this.a == ii4Var.a && this.b == ii4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CaptureEncodeRates(captureRate=");
        sb.append(this.a);
        sb.append(", encodeRate=");
        return fki.s(sb, this.b, ')');
    }
}
