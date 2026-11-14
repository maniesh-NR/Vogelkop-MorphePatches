package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class eo2 {
    public final Object a;
    public final rg8 b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final yb4 h;

    public eo2(Object obj, rg8 rg8Var, int i, Size size, Rect rect, int i2, Matrix matrix, yb4 yb4Var) {
        if (obj == null) {
            t3p.q("Null data");
            throw null;
        }
        this.a = obj;
        this.b = rg8Var;
        this.c = i;
        this.d = size;
        if (rect == null) {
            t3p.q("Null cropRect");
            throw null;
        }
        this.e = rect;
        this.f = i2;
        this.g = matrix;
        if (yb4Var != null) {
            this.h = yb4Var;
        } else {
            t3p.q("Null cameraCaptureResult");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eo2) {
            eo2 eo2Var = (eo2) obj;
            if (this.a.equals(eo2Var.a)) {
                rg8 rg8Var = eo2Var.b;
                rg8 rg8Var2 = this.b;
                if (rg8Var2 == null) {
                    if (rg8Var == null) {
                    }
                } else if (rg8Var2 != rg8Var) {
                    return false;
                }
                if (this.c == eo2Var.c && this.d.equals(eo2Var.d) && this.e.equals(eo2Var.e) && this.f == eo2Var.f && this.g.equals(eo2Var.g) && this.h.equals(eo2Var.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        rg8 rg8Var = this.b;
        return ((((((((((((iHashCode ^ (rg8Var == null ? 0 : rg8Var.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
