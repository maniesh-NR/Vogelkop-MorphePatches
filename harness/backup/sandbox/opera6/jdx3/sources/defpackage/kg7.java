package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public enum kg7 {
    f(2131232083, 2130969231, 2130969230, 2130969232, 2130969225),
    g(2131231997, 2130969211, 2130969210, 2130969212, 2130969221),
    h(2131232289, 2130969234, 2130969233, 2130969235, 2130969226),
    i(2131232117, 2130969217, 2130969216, 2130969218, 2130969223),
    j(2131231981, 2130969205, 2130969204, 2130969206, 2130969219),
    k(2131232178, 2130969228, 2130969227, 2130969229, 2130969224),
    l(2131232066, 2130969214, 2130969213, 2130969215, 2130969222),
    m(2131232066, 2130969214, 2130969213, 2130969215, 2130969222),
    n(2131231985, 2130969208, 2130969207, 2130969209, 2130969220);

    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    kg7(int i2, int i3, int i4, int i5, int i6) {
        this.a = i2;
        this.d = i3;
        this.b = i4;
        this.e = i5;
        this.c = i6;
    }

    public static ColorStateList d(Context context, int i2, float f2) {
        return new ColorStateList(lg7.a, new int[]{p37.j0(f2, f03.t(2130969115, context, 2131101243)), i2});
    }

    public final Drawable g(int i2, Context context) {
        if (i2 == 1) {
            ColorStateList colorStateListD = d(context, f03.t(this.d, context, 2131101243), 0.12f);
            Drawable drawableF = sgb.F(2131231297, context);
            j14.o0(drawableF, colorStateListD);
            return drawableF;
        }
        if (i2 != 2) {
            hai.d();
            return null;
        }
        ColorStateList colorStateListD2 = d(context, f03.t(this.b, context, 2131101243), 0.12f);
        Drawable drawableF2 = sgb.F(2131231297, context);
        j14.o0(drawableF2, colorStateListD2);
        return drawableF2;
    }

    public final Drawable h(int i2, Context context) {
        Drawable drawableF = sgb.F(this.a, context);
        if (i2 == 1) {
            j14.o0(drawableF, d(context, f03.t(this.b, context, 2131101243), 0.48f));
            return drawableF;
        }
        if (i2 == 2) {
            j14.o0(drawableF, d(context, f03.t(this.c, context, 2131101243), 0.48f));
            return drawableF;
        }
        hai.d();
        return null;
    }

    public final int i(Context context) {
        return f03.t(this.b, context, 2131101243);
    }
}
