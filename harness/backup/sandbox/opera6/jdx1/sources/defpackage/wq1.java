package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ResourceManagerInternal;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class wq1 {
    public final TextView a;
    public km5 b;
    public km5 c;
    public km5 d;
    public km5 e;
    public km5 f;
    public km5 g;
    public final br1 h;
    public Typeface k;
    public boolean m;
    public int i = 0;
    public int j = -1;
    public String l = null;

    public wq1(TextView textView) {
        this.a = textView;
        this.h = new br1(textView);
    }

    public static km5 d(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList colorStateListE = appCompatDrawableManager.e(i, context);
        if (colorStateListE == null) {
            return null;
        }
        km5 km5Var = new km5();
        km5Var.b = true;
        km5Var.c = colorStateListE;
        return km5Var;
    }

    public final void a(Drawable drawable, km5 km5Var) {
        if (drawable == null || km5Var == null) {
            return;
        }
        int[] drawableState = this.a.getDrawableState();
        PorterDuff.Mode mode = AppCompatDrawableManager.a;
        ResourceManagerInternal.i(drawable, km5Var, drawableState);
    }

    public final void b() {
        km5 km5Var = this.b;
        TextView textView = this.a;
        if (km5Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final void c(boolean z) {
        Typeface typeface = this.k;
        TextView textView = this.a;
        if (typeface != null) {
            if (this.j == -1) {
                textView.setTypeface(typeface, this.i);
            } else {
                textView.setTypeface(typeface);
            }
        } else if (z) {
            textView.setTypeface(null);
        }
        String str = this.l;
        if (str != null) {
            uq1.a(textView, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:226:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.util.AttributeSet r26, int r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq1.e(android.util.AttributeSet, int):void");
    }

    public final void f(int i, Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, zhh.y);
        ghf ghfVar = new ghf(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        boolean zG = g(ghfVar, context);
        ghfVar.J();
        c(zG);
    }

    public final boolean g(ghf ghfVar, Context context) {
        String string;
        Typeface typeface;
        int i = this.i;
        TypedArray typedArray = (TypedArray) ghfVar.c;
        this.i = typedArray.getInt(2, i);
        int i2 = typedArray.getInt(11, -1);
        this.j = i2;
        if (i2 != -1) {
            this.i &= 2;
        }
        if (typedArray.hasValue(13)) {
            this.l = typedArray.getString(13);
        }
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.k = null;
            int i3 = typedArray.hasValue(12) ? 12 : 10;
            int i4 = this.j;
            int i5 = this.i;
            if (!context.isRestricted()) {
                try {
                    Typeface typefaceV = ghfVar.v(i3, this.i, new rq1(this, i4, i5, new WeakReference(this.a)));
                    if (typefaceV != null) {
                        if (this.j != -1) {
                            this.k = Typeface.create(Typeface.create(typefaceV, 0), this.j, (this.i & 2) != 0);
                        } else {
                            this.k = typefaceV;
                        }
                    }
                    this.m = this.k == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.k == null && (string = typedArray.getString(i3)) != null) {
                if (this.j != -1) {
                    this.k = Typeface.create(Typeface.create(string, 0), this.j, (this.i & 2) != 0);
                } else {
                    this.k = Typeface.create(string, this.i);
                }
            }
        } else {
            if (!typedArray.hasValue(1)) {
                int i6 = this.j;
                if (i6 == -1 || (typeface = this.k) == null) {
                    return false;
                }
                this.k = Typeface.create(typeface, i6, (this.i & 2) != 0);
                return true;
            }
            this.m = false;
            int i7 = typedArray.getInt(1, 1);
            if (i7 == 1) {
                this.k = Typeface.SANS_SERIF;
                return true;
            }
            if (i7 == 2) {
                this.k = Typeface.SERIF;
                return true;
            }
            if (i7 == 3) {
                this.k = Typeface.MONOSPACE;
                return true;
            }
        }
        return true;
    }
}
