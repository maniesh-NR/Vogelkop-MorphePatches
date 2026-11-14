package defpackage;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class r9b {
    public static final r9b e = new r9b(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public r9b(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static r9b a(r9b r9bVar, r9b r9bVar2) {
        return c(Math.max(r9bVar.a, r9bVar2.a), Math.max(r9bVar.b, r9bVar2.b), Math.max(r9bVar.c, r9bVar2.c), Math.max(r9bVar.d, r9bVar2.d));
    }

    public static r9b b(r9b r9bVar, r9b r9bVar2) {
        return c(Math.min(r9bVar.a, r9bVar2.a), Math.min(r9bVar.b, r9bVar2.b), Math.min(r9bVar.c, r9bVar2.c), Math.min(r9bVar.d, r9bVar2.d));
    }

    public static r9b c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new r9b(i, i2, i3, i4);
    }

    public static r9b d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return Insets.of(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r9b.class != obj.getClass()) {
            return false;
        }
        r9b r9bVar = (r9b) obj;
        return this.d == r9bVar.d && this.a == r9bVar.a && this.c == r9bVar.c && this.b == r9bVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return fki.s(sb, this.d, '}');
    }
}
