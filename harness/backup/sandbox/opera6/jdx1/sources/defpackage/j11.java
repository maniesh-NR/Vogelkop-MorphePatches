package defpackage;

/* loaded from: classes.dex */
public final class j11 implements jud {
    public final sd3 a;
    public final sd3 b;

    public j11(sd3 sd3Var, sd3 sd3Var2) {
        this.a = sd3Var;
        this.b = sd3Var2;
    }

    @Override // defpackage.jud
    public final int a(ccb ccbVar, long j, int i) {
        int iA = this.b.a(0, ccbVar.b());
        return ccbVar.b + iA + (-this.a.a(0, i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j11)) {
            return false;
        }
        j11 j11Var = (j11) obj;
        return this.a.equals(j11Var.a) && this.b.equals(j11Var.b);
    }

    public final int hashCode() {
        return sko.d(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        return "Vertical(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ", offset=0)";
    }
}
