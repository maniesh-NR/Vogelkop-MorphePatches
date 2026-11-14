package defpackage;

/* loaded from: classes.dex */
public final class hl5 {
    public final boolean a;
    public final f14 b;
    public final boolean c;
    public final boolean d;

    static {
        new hl5(false, f14.a, false, 16);
    }

    public hl5(boolean z, f14 f14Var, boolean z2, int i) {
        if ((i & 4) != 0) {
            z = !(f14Var == f14.a);
        }
        this.a = z;
        this.b = f14Var;
        this.c = z;
        this.d = z2;
        if (z) {
            if (f14Var == f14.a) {
                qp2.o("Failed requirement.");
                throw null;
            }
            if (z) {
                return;
            }
            qp2.o("Failed requirement.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl5)) {
            return false;
        }
        hl5 hl5Var = (hl5) obj;
        return this.a == hl5Var.a && this.b == hl5Var.b && this.c == hl5Var.c && this.d == hl5Var.d;
    }

    public final int hashCode() {
        return ((Boolean.hashCode(this.d) + fki.k((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c)) * 31) + 1231;
    }

    public final String toString() {
        return "Configuration(isPublicBuild=" + this.a + ", buildType=" + this.b + ", requireAuthentication=" + this.c + ", isEmbedded=" + this.d + ", buildDeepLinkBackStack=true)";
    }
}
