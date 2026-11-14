package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class p92 {
    public final boolean a;
    public final float b;
    public final int c;
    public final int d;
    public final boolean e;

    public p92(boolean z, float f, int i, int i2, boolean z2) {
        this.a = z;
        this.b = f;
        this.c = i;
        this.d = i2;
        this.e = z2;
    }

    public static p92 a(Resources resources) {
        return new p92(false, resources.getDimension(2131166669), resources.getDimensionPixelSize(2131166672), 1, true);
    }
}
