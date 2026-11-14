package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class bh2 {
    public static final bh2 e = new bh2(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public bh2(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = tym.I(i3) ? tym.s(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh2)) {
            return false;
        }
        bh2 bh2Var = (bh2) obj;
        return this.a == bh2Var.a && this.b == bh2Var.b && this.c == bh2Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return fki.s(sb, this.c, ']');
    }
}
