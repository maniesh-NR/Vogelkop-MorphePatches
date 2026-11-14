package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class uo2 {
    public final Size a;
    public final Rect b;
    public final zd4 c;
    public final int d;
    public final boolean e;

    public uo2(Size size, Rect rect, zd4 zd4Var, int i, boolean z) {
        if (size == null) {
            t3p.q("Null inputSize");
            throw null;
        }
        this.a = size;
        if (rect == null) {
            t3p.q("Null inputCropRect");
            throw null;
        }
        this.b = rect;
        this.c = zd4Var;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uo2) {
            uo2 uo2Var = (uo2) obj;
            if (this.a.equals(uo2Var.a) && this.b.equals(uo2Var.b)) {
                zd4 zd4Var = uo2Var.c;
                zd4 zd4Var2 = this.c;
                if (zd4Var2 != null ? zd4Var2.equals(zd4Var) : zd4Var == null) {
                    if (this.d == uo2Var.d && this.e == uo2Var.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        zd4 zd4Var = this.c;
        return ((((iHashCode ^ (zd4Var == null ? 0 : zd4Var.hashCode())) * 1000003) ^ this.d) * 1000003) ^ (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return z1m.m(sb, this.e, "}");
    }
}
