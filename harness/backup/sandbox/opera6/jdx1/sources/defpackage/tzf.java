package defpackage;

/* loaded from: classes.dex */
public final class tzf {
    public final y81 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public tzf(y81 y81Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = y81Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final long a(long j, boolean z) {
        if (z) {
            long j2 = xjl.b;
            if (xjl.b(j, j2)) {
                return j2;
            }
        }
        int i = xjl.c;
        int i2 = this.b;
        return upj.c(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final int b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return djh.c(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tzf) {
            tzf tzfVar = (tzf) obj;
            if (this.a == tzfVar.a && this.b == tzfVar.b && this.c == tzfVar.c && this.d == tzfVar.d && this.e == tzfVar.e && Float.compare(this.f, tzfVar.f) == 0 && Float.compare(this.g, tzfVar.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + sko.d(this.f, rfp.c(this.e, rfp.c(this.d, rfp.c(this.c, rfp.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sko.r(this.c, this.d, ", startLineIndex=", ", endLineIndex=", sb);
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return am2.n(sb, this.g, ")");
    }
}
