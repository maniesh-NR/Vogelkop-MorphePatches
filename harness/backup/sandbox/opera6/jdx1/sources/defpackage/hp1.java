package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ResourceManagerInternal;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class hp1 {
    public final View a;
    public km5 d;
    public km5 e;
    public km5 f;
    public int c = -1;
    public final AppCompatDrawableManager b = AppCompatDrawableManager.a();

    public hp1(View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                km5 km5Var = this.f;
                if (km5Var == null) {
                    km5Var = new km5();
                    this.f = km5Var;
                }
                km5Var.c = null;
                km5Var.b = false;
                km5Var.d = null;
                km5Var.a = false;
                WeakHashMap weakHashMap = r5n.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    km5Var.b = true;
                    km5Var.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    km5Var.a = true;
                    km5Var.d = backgroundTintMode;
                }
                if (km5Var.b || km5Var.a) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = AppCompatDrawableManager.a;
                    ResourceManagerInternal.i(background, km5Var, drawableState);
                    return;
                }
            }
            km5 km5Var2 = this.e;
            if (km5Var2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = AppCompatDrawableManager.a;
                ResourceManagerInternal.i(background, km5Var2, drawableState2);
            } else {
                km5 km5Var3 = this.d;
                if (km5Var3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = AppCompatDrawableManager.a;
                    ResourceManagerInternal.i(background, km5Var3, drawableState3);
                }
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = zhh.B;
        ghf ghfVarH = ghf.H(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) ghfVarH.c;
        Context context2 = view.getContext();
        TypedArray typedArray2 = (TypedArray) ghfVarH.c;
        WeakHashMap weakHashMap = r5n.a;
        n5n.b(view, context2, iArr, attributeSet, typedArray2, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                ColorStateList colorStateListE = this.b.e(this.c, view.getContext());
                if (colorStateListE != null) {
                    e(colorStateListE);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(ghfVarH.s(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(kl7.c(typedArray.getInt(2, -1), null));
            }
        } finally {
            ghfVarH.J();
        }
    }

    public final void c() {
        this.c = -1;
        e(null);
        a();
    }

    public final void d(int i) {
        this.c = i;
        AppCompatDrawableManager appCompatDrawableManager = this.b;
        e(appCompatDrawableManager != null ? appCompatDrawableManager.e(i, this.a.getContext()) : null);
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList != null) {
            km5 km5Var = this.d;
            if (km5Var == null) {
                km5Var = new km5();
                this.d = km5Var;
            }
            km5Var.c = colorStateList;
            km5Var.b = true;
        } else {
            this.d = null;
        }
        a();
    }
}
