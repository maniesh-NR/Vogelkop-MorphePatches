package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class g8i {
    public static final Typeface h = Typeface.SANS_SERIF;
    public final Context a;
    public int b;
    public Drawable d;
    public String e;
    public int g;
    public int c = -1;
    public int f = -1275068417;

    public g8i(Context context) {
        this.a = context;
    }

    public final Drawable a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        int i = this.b;
        Context context = this.a;
        Resources resources = context.getResources();
        int dimensionPixelSize = i != 0 ? resources.getDimensionPixelSize(i) : fan.a(40.0f, resources);
        gradientDrawable.setSize(dimensionPixelSize, dimensionPixelSize);
        gradientDrawable.setColor(this.c);
        Drawable drawable = this.d;
        ngl nglVar = null;
        Drawable w3aVar = drawable == null ? null : new w3a(drawable, 17, false);
        if (this.e != null) {
            int i2 = this.g;
            Resources resources2 = context.getResources();
            nglVar = new ngl(this.e, h, i2 != 0 ? resources2.getDimensionPixelSize(i2) : fan.a(24.0f, resources2), this.f);
        }
        if (w3aVar == null) {
            w3aVar = nglVar;
        }
        return w3aVar == null ? gradientDrawable : new LayerDrawable(new Drawable[]{gradientDrawable, w3aVar});
    }
}
