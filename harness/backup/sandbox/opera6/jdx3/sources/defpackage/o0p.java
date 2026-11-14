package defpackage;

import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class o0p {

    @NotNull
    public static final n0p Companion = new n0p();
    public final int a;
    public final int b;

    public o0p(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public o0p(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, m0p.b);
            throw null;
        }
        this.a = i2;
        this.b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0p)) {
            return false;
        }
        o0p o0pVar = (o0p) obj;
        return this.a == o0pVar.a && this.b == o0pVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerFormat(w=");
        sb.append(this.a);
        sb.append(", h=");
        return fki.s(sb, this.b, ')');
    }
}
