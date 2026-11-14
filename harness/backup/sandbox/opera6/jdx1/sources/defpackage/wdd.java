package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class wdd extends fq1 {
    public static final int[][] g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    public wdd(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListL;
        super(wxe.g0(context, attributeSet, 2130970615, 2132084856), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayA0 = scd.a0(context2, attributeSet, ihh.E, 2130970615, 2132084856, new int[0]);
        if (typedArrayA0.hasValue(0)) {
            setButtonTintList(j14.L(context2, typedArrayA0, 0));
        }
        if (typedArrayA0.hasValue(1) && (colorStateListL = j14.L(context2, typedArrayA0, 1)) != null) {
            Drawable background = getBackground();
            background = background instanceof DrawableWrapper ? ((DrawableWrapper) background).getDrawable() : background;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(colorStateListL);
            }
        }
        this.f = typedArrayA0.getBoolean(2, false);
        typedArrayA0.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && getButtonTintList() == null) {
            this.f = true;
            ColorStateList colorStateList = this.e;
            if (colorStateList == null) {
                int iX = fr3.X(getContext(), f03.d0(2130969108, this));
                int iX2 = fr3.X(getContext(), f03.d0(2130969284, this));
                int iX3 = fr3.X(getContext(), f03.d0(2130969325, this));
                ColorStateList colorStateList2 = new ColorStateList(g, new int[]{fr3.R(1.0f, iX3, iX), fr3.R(0.54f, iX3, iX2), fr3.R(0.38f, iX3, iX2), fr3.R(0.38f, iX3, iX2)});
                this.e = colorStateList2;
                colorStateList = colorStateList2;
            }
            setButtonTintList(colorStateList);
        }
    }
}
