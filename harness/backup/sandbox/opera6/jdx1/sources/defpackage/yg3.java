package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yg3 extends hyf {
    public final j71 f;
    public final long g;
    public boolean h;
    public final long i;
    public float j;
    public kh3 k;

    public yg3(j71 j71Var) {
        this(j71Var, (j71Var.a.getWidth() << 32) | (j71Var.a.getHeight() & 4294967295L));
    }

    public yg3(j71 j71Var, long j) {
        int i;
        this.f = j71Var;
        this.g = j;
        this.h = true;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > j71Var.a.getWidth() || i > j71Var.a.getHeight()) {
            qp2.o("Failed requirement.");
            throw null;
        }
        this.i = j;
        this.j = 1.0f;
    }

    @Override // defpackage.hyf
    public final boolean d(float f) {
        this.j = f;
        return true;
    }

    @Override // defpackage.hyf
    public final boolean e(kh3 kh3Var) {
        this.k = kh3Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg3)) {
            return false;
        }
        yg3 yg3Var = (yg3) obj;
        return Intrinsics.a(this.f, yg3Var.f) && ybb.a(0L, 0L) && gcb.a(this.g, yg3Var.g) && this.h == yg3Var.h;
    }

    @Override // defpackage.hyf
    public final long h() {
        return fr3.g0(this.i);
    }

    public final int hashCode() {
        return Integer.hashCode(this.h ? 1 : 0) + z1m.e(this.f.hashCode() * 961, 31, this.g);
    }

    @Override // defpackage.hyf
    public final void i(mk7 mk7Var) {
        mk7.e0(mk7Var, this.f, 0L, this.g, (Math.round(Float.intBitsToFloat((int) (mk7Var.e() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (mk7Var.e() & 4294967295L))) & 4294967295L), this.j, this.k, this.h ? 1 : 0, 328);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String strD = ybb.d(0L);
        String strB = gcb.b(this.g);
        boolean z = this.h;
        String str = z == 0 ? "None" : z == 1 ? "Low" : z == 2 ? "Medium" : z == 3 ? "High" : "Unknown";
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f);
        sb.append(", srcOffset=");
        sb.append(strD);
        sb.append(", srcSize=");
        return sko.n(sb, strB, ", filterQuality=", str, ")");
    }
}
