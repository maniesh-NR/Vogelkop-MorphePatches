package defpackage;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class tn2 implements sxa {
    public final hbl a;
    public final long b;
    public final int c;
    public final Matrix d;
    public final int e;

    public tn2(hbl hblVar, long j, int i, Matrix matrix, int i2) {
        if (hblVar == null) {
            t3p.q("Null tagBundle");
            throw null;
        }
        this.a = hblVar;
        this.b = j;
        this.c = i;
        this.d = matrix;
        this.e = i2;
    }

    @Override // defpackage.sxa
    public final void a(xg8 xg8Var) {
        xg8Var.d(this.c);
    }

    @Override // defpackage.sxa
    public final Matrix b() {
        return this.d;
    }

    @Override // defpackage.sxa
    public final int c() {
        return this.e;
    }

    @Override // defpackage.sxa
    public final hbl d() {
        return this.a;
    }

    @Override // defpackage.sxa
    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tn2)) {
            return false;
        }
        tn2 tn2Var = (tn2) obj;
        return this.a.equals(tn2Var.a) && this.b == tn2Var.b && this.c == tn2Var.c && this.d.equals(tn2Var.d) && this.e == tn2Var.e;
    }

    @Override // defpackage.sxa
    public final int f() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", rotationDegrees=");
        sb.append(this.c);
        sb.append(", sensorToBufferTransformMatrix=");
        sb.append(this.d);
        sb.append(", flashState=");
        return p3p.k(this.e, "}", sb);
    }
}
