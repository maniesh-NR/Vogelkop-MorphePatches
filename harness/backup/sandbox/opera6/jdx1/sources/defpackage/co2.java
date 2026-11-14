package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes.dex */
public final class co2 {
    public final UUID a;
    public final byte b;
    public final short c;
    public final Rect d;
    public final Size e;
    public final int f;
    public final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public co2(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid == null) {
            t3p.q("Null getUuid");
            throw null;
        }
        this.a = uuid;
        this.b = i;
        this.c = i2;
        if (rect == null) {
            t3p.q("Null getCropRect");
            throw null;
        }
        this.d = rect;
        if (size == null) {
            t3p.q("Null getSize");
            throw null;
        }
        this.e = size;
        this.f = i3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof co2)) {
            return false;
        }
        co2 co2Var = (co2) obj;
        return this.a.equals(co2Var.a) && this.b == co2Var.b && this.c == co2Var.c && this.d.equals(co2Var.d) && this.e.equals(co2Var.e) && this.f == co2Var.f && this.g == co2Var.g;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.a);
        sb.append(", getTargets=");
        sb.append((int) this.b);
        sb.append(", getFormat=");
        sb.append((int) this.c);
        sb.append(", getCropRect=");
        sb.append(this.d);
        sb.append(", getSize=");
        sb.append(this.e);
        sb.append(", getRotationDegrees=");
        sb.append(this.f);
        sb.append(", isMirroring=");
        return z1m.m(sb, this.g, ", shouldRespectInputCropRect=false}");
    }
}
