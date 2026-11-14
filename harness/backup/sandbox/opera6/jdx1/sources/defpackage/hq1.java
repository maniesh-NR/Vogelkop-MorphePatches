package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class hq1 extends f1p {
    public final AppCompatSeekBar g;
    public Drawable h;
    public ColorStateList i;
    public PorterDuff.Mode j;
    public boolean k;
    public boolean l;

    public hq1(AppCompatSeekBar appCompatSeekBar) {
        super(appCompatSeekBar);
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.g = appCompatSeekBar;
    }

    public final void B() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.k || this.l) {
                Drawable drawableMutate = drawable.mutate();
                this.h = drawableMutate;
                if (this.k) {
                    drawableMutate.setTintList(this.i);
                }
                if (this.l) {
                    this.h.setTintMode(this.j);
                }
                if (this.h.isStateful()) {
                    this.h.setState(this.g.getDrawableState());
                }
            }
        }
    }

    public final void C(Canvas canvas) {
        if (this.h != null) {
            int max = this.g.getMax();
            if (max > 1) {
                int intrinsicWidth = this.h.getIntrinsicWidth();
                int intrinsicHeight = this.h.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.h.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.h.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public final void u(AttributeSet attributeSet, int i) {
        super.u(attributeSet, 2130970689);
        AppCompatSeekBar appCompatSeekBar = this.g;
        Context context = appCompatSeekBar.getContext();
        int[] iArr = zhh.h;
        ghf ghfVarH = ghf.H(2130970689, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) ghfVarH.c;
        Context context2 = appCompatSeekBar.getContext();
        TypedArray typedArray2 = (TypedArray) ghfVarH.c;
        WeakHashMap weakHashMap = r5n.a;
        n5n.b(appCompatSeekBar, context2, iArr, attributeSet, typedArray2, 2130970689, 0);
        Drawable drawableU = ghfVarH.u(0);
        if (drawableU != null) {
            appCompatSeekBar.setThumb(drawableU);
        }
        Drawable drawableT = ghfVarH.t(1);
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.h = drawableT;
        if (drawableT != null) {
            drawableT.setCallback(appCompatSeekBar);
            drawableT.setLayoutDirection(appCompatSeekBar.getLayoutDirection());
            if (drawableT.isStateful()) {
                drawableT.setState(appCompatSeekBar.getDrawableState());
            }
            B();
        }
        appCompatSeekBar.invalidate();
        if (typedArray.hasValue(3)) {
            this.j = kl7.c(typedArray.getInt(3, -1), this.j);
            this.l = true;
        }
        if (typedArray.hasValue(2)) {
            this.i = ghfVarH.s(2);
            this.k = true;
        }
        ghfVarH.J();
        B();
    }
}
