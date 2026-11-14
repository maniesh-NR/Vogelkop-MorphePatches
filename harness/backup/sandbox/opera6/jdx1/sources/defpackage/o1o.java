package defpackage;

/* loaded from: classes.dex */
public final class o1o implements jud {
    public final sd3 a;
    public final int b;

    public o1o(sd3 sd3Var, int i) {
        this.a = sd3Var;
        this.b = i;
    }

    @Override // defpackage.jud
    public final int a(ccb ccbVar, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        return i >= i2 - (i3 << 1) ? Math.round(((i2 - i) / 2.0f) * 1.0f) : djh.c(this.a.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1o)) {
            return false;
        }
        o1o o1oVar = (o1o) obj;
        return this.a.equals(o1oVar.a) && this.b == o1oVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return fki.s(sb, this.b, ')');
    }
}
