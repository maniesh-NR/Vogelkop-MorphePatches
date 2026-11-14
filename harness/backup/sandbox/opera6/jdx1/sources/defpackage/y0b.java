package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class y0b implements Serializable {
    public static final y0b c = new y0b(new int[0]);
    public final int[] a;
    public final int b;

    public y0b(int[] iArr) {
        int length = iArr.length;
        this.a = iArr;
        this.b = length;
    }

    public static y0b g(int i, int i2) {
        return new y0b(new int[]{i, i2});
    }

    public final int d(int i) {
        z4o.A(i, this.b);
        return this.a[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0b) {
            y0b y0bVar = (y0b) obj;
            int i = y0bVar.b;
            int i2 = this.b;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (d(i3) == y0bVar.d(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = 0; i < this.b; i++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.a[i]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
