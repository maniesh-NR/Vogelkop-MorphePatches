package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.k2c;
import defpackage.khh;
import defpackage.l2c;
import defpackage.lgl;
import defpackage.ua7;
import defpackage.vr3;

/* loaded from: classes.dex */
public class StylingTextView extends yq1 implements k2c, lgl {
    public final ua7 h;
    public final zg i;
    public final l2c j;
    public final fr k;
    public final vr3 l;

    public StylingTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StylingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ua7 ua7Var = new ua7((View) this, 4, PorterDuff.Mode.SRC_IN);
        this.h = ua7Var;
        zg zgVar = new zg(this);
        this.i = zgVar;
        vr3 vr3Var = new vr3((TextView) this);
        this.l = vr3Var;
        this.j = new l2c(this, this, attributeSet);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.O, i, 0);
        ua7Var.A(typedArrayObtainStyledAttributes, 0);
        typedArrayObtainStyledAttributes.recycle();
        vr3Var.g(attributeSet, i);
        zgVar.u(context, attributeSet, i);
        fr frVarF = fr.f(context, attributeSet);
        this.k = frVarF;
        if (frVarF != null) {
            frVarF.e(this);
        }
        if (!isInEditMode()) {
            xf8.r(new zg(this, attributeSet, i));
        }
        s((Drawable) zgVar.c, (Drawable) zgVar.d);
    }

    @Override // defpackage.k2c
    public final l2c b() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void draw(Canvas canvas) {
        Drawable[] compoundDrawables = getCompoundDrawables();
        ua7 ua7Var = this.h;
        int[] drawableState = ((View) ua7Var.b).getDrawableState();
        for (int i = 0; i < compoundDrawables.length; i++) {
            Drawable drawable = compoundDrawables[i];
            if (drawable != null) {
                ua7Var.X(drawableState, i, drawable);
            }
        }
        super/*android.view.View*/.draw(canvas);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        ua7 ua7Var = this.h;
        if (ua7Var != null) {
            ua7Var.G();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k2c
    public final void i(int i) {
        zg zgVar = this.i;
        if ((((Drawable) zgVar.c) != null || ((Drawable) zgVar.d) != null) && zgVar.a != i) {
            zgVar.L(i, false);
        }
        fr frVar = this.k;
        if (frVar != null) {
            frVar.e(this);
        }
        refreshDrawableState();
        this.l.c();
    }

    @Override // defpackage.lgl
    public final boolean l() {
        l2c l2cVar = this.j;
        return l2cVar != null && l2cVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        this.h.F();
        refreshDrawableState();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        vr3 vr3Var = this.l;
        if (vr3Var != null) {
            vr3Var.k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean performLongClick() {
        try {
            return super/*android.view.View*/.performLongClick();
        } catch (ClassCastException unused) {
            return true;
        }
    }

    public final void s(Drawable drawable, Drawable drawable2) {
        zg zgVar = this.i;
        zgVar.c = drawable;
        zgVar.d = drawable2;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        Drawable drawable3 = (Drawable) zgVar.d;
        if (drawable3 != null) {
            drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        }
        zgVar.L(cs5.L((TextView) zgVar.b), true);
    }
}
