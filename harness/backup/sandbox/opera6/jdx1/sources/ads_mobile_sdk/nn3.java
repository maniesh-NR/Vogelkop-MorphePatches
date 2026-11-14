package ads_mobile_sdk;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class nn3 {
    public final pn3 a;
    public final boolean b;
    public final int c;
    public final Rect d;
    public final boolean e;
    public final Rect f;
    public final Rect g;
    public final boolean h;
    public final Rect i;
    public final boolean j;
    public final Rect k;

    public nn3(pn3 pn3Var, boolean z, int i, Rect rect, boolean z2, Rect rect2, Rect rect3, boolean z3, Rect rect4, boolean z4, Rect rect5) {
        this.a = pn3Var;
        this.b = z;
        this.c = i;
        this.d = rect;
        this.e = z2;
        this.f = rect2;
        this.g = rect3;
        this.h = z3;
        this.i = rect4;
        this.j = z4;
        this.k = rect5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn3)) {
            return false;
        }
        nn3 nn3Var = (nn3) obj;
        return this.a == nn3Var.a && this.b == nn3Var.b && this.c == nn3Var.c && this.d.equals(nn3Var.d) && this.e == nn3Var.e && this.f.equals(nn3Var.f) && this.g.equals(nn3Var.g) && this.h == nn3Var.h && this.i.equals(nn3Var.i) && this.j == nn3Var.j && this.k.equals(nn3Var.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iHashCode2 = (this.d.hashCode() + n6h.a(this.c, (iHashCode + i) * 31)) * 31;
        boolean z2 = this.e;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int iHashCode3 = (this.g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + i2) * 31)) * 31)) * 31;
        boolean z3 = this.h;
        int i3 = z3;
        if (z3 != 0) {
            i3 = 1;
        }
        int iHashCode4 = (this.i.hashCode() + ((iHashCode3 + i3) * 31)) * 31;
        boolean z4 = this.j;
        return this.k.hashCode() + ((iHashCode4 + (z4 ? 1 : z4 ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "ViewabilityEvent(viewabilityUpdateEvent=" + this.a + ", isVisible=" + this.b + ", windowVisibility=" + this.c + ", adPosition=" + this.d + ", isAttachedToWindow=" + this.e + ", screenPosition=" + this.f + ", globalVisibleBox=" + this.g + ", globalVisibleBoxVisible=" + this.h + ", localVisibleBox=" + this.i + ", localVisibleBoxVisible=" + this.j + ", hitRect=" + this.k + ")";
    }
}
