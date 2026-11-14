package defpackage;

/* loaded from: classes.dex */
public final class dtl {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;

    public dtl() {
        this(0, 0, false, 0, 0, 0, 0);
    }

    public dtl(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtl)) {
            return false;
        }
        dtl dtlVar = (dtl) obj;
        return this.a == dtlVar.a && this.b == dtlVar.b && this.c == dtlVar.c && this.d == dtlVar.d && this.e == dtlVar.e && this.f == dtlVar.f && this.g == dtlVar.g;
    }

    public final int hashCode() {
        return (((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0);
    }
}
