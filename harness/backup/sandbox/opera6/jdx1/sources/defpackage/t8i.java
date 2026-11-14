package defpackage;

import android.graphics.Point;

/* loaded from: classes.dex */
public final class t8i {
    public final byte a;
    public final int b;
    public final Point c;

    /* JADX WARN: Multi-variable type inference failed */
    public t8i(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.a = i;
        this.b = i2;
        this.c = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t8i)) {
            return false;
        }
        t8i t8iVar = (t8i) obj;
        return this.a == t8iVar.a && this.b == t8iVar.b && this.c.equals(t8iVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        byte b = this.a;
        sb.append(b != 0 ? b != 1 ? b != 2 ? b != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.b);
        sb.append(", center=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
