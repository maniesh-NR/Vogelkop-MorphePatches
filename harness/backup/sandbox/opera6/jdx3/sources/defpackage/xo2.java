package defpackage;

import android.view.Surface;

/* loaded from: classes.dex */
public final class xo2 {
    public final byte a;
    public final Surface b;

    /* JADX WARN: Multi-variable type inference failed */
    public xo2(int i, Surface surface) {
        this.a = i;
        if (surface != null) {
            this.b = surface;
        } else {
            t3p.q("Null surface");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xo2)) {
            return false;
        }
        xo2 xo2Var = (xo2) obj;
        return this.a == xo2Var.a && this.b.equals(xo2Var.b);
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Result{resultCode=" + ((int) this.a) + ", surface=" + this.b + "}";
    }
}
