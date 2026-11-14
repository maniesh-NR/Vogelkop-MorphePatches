package defpackage;

import android.graphics.drawable.GradientDrawable;

/* loaded from: classes.dex */
public final class eyh extends w3a {
    public final int d;
    public final int e;

    public eyh(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{p37.j0(0.0f, i), i});
        gradientDrawable.setSize(0, i2);
        super(gradientDrawable, 87, false);
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyh)) {
            return false;
        }
        eyh eyhVar = (eyh) obj;
        return this.d == eyhVar.d && this.e == eyhVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (Integer.hashCode(this.d) * 31);
    }

    public final String toString() {
        return "";
    }
}
