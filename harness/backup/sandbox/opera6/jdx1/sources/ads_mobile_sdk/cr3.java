package ads_mobile_sdk;

/* loaded from: classes.dex */
public final class cr3 {
    public final br3 a;
    public final int b;
    public final int c;
    public final boolean d;

    public /* synthetic */ cr3(br3 br3Var, int i, int i2, int i3) {
        this(br3Var, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, false);
    }

    public cr3(br3 br3Var, int i, int i2, boolean z) {
        this.a = br3Var;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr3)) {
            return false;
        }
        cr3 cr3Var = (cr3) obj;
        return this.a == cr3Var.a && this.b == cr3Var.b && this.c == cr3Var.c && this.d == cr3Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iA = n6h.a(this.c, n6h.a(this.b, this.a.hashCode() * 31));
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iA + i;
    }

    public final String toString() {
        return "WebViewSize(type=" + this.a + ", widthInPixels=" + this.b + ", heightInPixels=" + this.c + ", isFluidHeight=" + this.d + ")";
    }
}
