package defpackage;

/* loaded from: classes.dex */
public final class tta {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final sta h;

    public tta(int i, int i2, int i3, int i4, int i5, int i6, int i7, sta staVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = staVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tta)) {
            return false;
        }
        tta ttaVar = (tta) obj;
        return this.a == ttaVar.a && this.b == ttaVar.b && this.c == ttaVar.c && this.d == ttaVar.d && this.e == ttaVar.e && this.f == ttaVar.f && this.g == ttaVar.g && this.h.equals(ttaVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((vep.A(1) + rfp.c(this.g, rfp.c(this.f, rfp.c(this.e, rfp.c(this.d, rfp.c(this.c, rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
