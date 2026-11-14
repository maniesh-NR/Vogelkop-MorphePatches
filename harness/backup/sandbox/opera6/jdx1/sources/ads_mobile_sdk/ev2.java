package ads_mobile_sdk;

import android.graphics.Point;
import android.graphics.Rect;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class ev2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final av f;
    public final Rect g;
    public final Pair h;
    public final Pair i;

    public ev2(int i, int i2, int i3, int i4, boolean z, av avVar, Rect rect, Pair pair, Pair pair2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = avVar;
        this.g = rect;
        this.h = pair;
        this.i = pair2;
    }

    public final Point a() {
        Rect rect = this.g;
        int i = rect.left + this.c;
        int i2 = rect.top + this.d;
        if (!this.e) {
            Pair pair = this.i;
            int iIntValue = ((Number) pair.a).intValue();
            int iIntValue2 = ((Number) pair.b).intValue();
            int iIntValue3 = ((Number) this.h.a).intValue();
            if (i < 0) {
                i = 0;
            } else {
                int i3 = this.a;
                if (i + i3 > iIntValue3) {
                    i = iIntValue3 - i3;
                }
            }
            if (i2 < iIntValue) {
                i2 = iIntValue;
            } else {
                int i4 = this.b;
                if (i2 + i4 > iIntValue2) {
                    i2 = iIntValue2 - i4;
                }
            }
        }
        return new Point(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev2)) {
            return false;
        }
        ev2 ev2Var = (ev2) obj;
        return this.a == ev2Var.a && this.b == ev2Var.b && this.c == ev2Var.c && this.d == ev2Var.d && this.e == ev2Var.e && this.f == ev2Var.f && this.g.equals(ev2Var.g) && this.h.equals(ev2Var.h) && this.i.equals(ev2Var.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iA = n6h.a(this.d, n6h.a(this.c, n6h.a(this.b, Integer.hashCode(this.a) * 31)));
        boolean z = this.e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iA + i) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = sko.o(this.a, this.b, "ResizeParams(widthDips=", ", heightDips=", ", offsetXDips=");
        sko.r(this.c, this.d, ", offsetYDips=", ", allowOffScreen=", sbO);
        sbO.append(this.e);
        sbO.append(", closeButtonPosition=");
        sbO.append(this.f);
        sbO.append(", originalAdPosition=");
        sbO.append(this.g);
        sbO.append(", activityWindowDimensions=");
        sbO.append(this.h);
        sbO.append(", activityVerticalLimits=");
        sbO.append(this.i);
        sbO.append(")");
        return sbO.toString();
    }
}
