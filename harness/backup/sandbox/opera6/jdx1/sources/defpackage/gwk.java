package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes.dex */
public abstract class gwk extends SwitchCompat {
    public static final int[][] a0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public final gx7 T;
    public ColorStateList U;
    public ColorStateList V;
    public final boolean W;

    public gwk(Context context, AttributeSet attributeSet) {
        super(wxe.g0(context, attributeSet, 2130970926, 2132084857), attributeSet, 2130970926);
        Context context2 = getContext();
        this.T = new gx7(context2);
        scd.o(context2, attributeSet, 2130970926, 2132084857);
        int[] iArr = ihh.U;
        scd.r(context2, attributeSet, iArr, 2130970926, 2132084857, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130970926, 2132084857);
        this.W = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        int[][] iArr = a0;
        boolean z = this.W;
        if (z && this.b == null) {
            ColorStateList colorStateList = this.U;
            if (colorStateList == null) {
                int iX = fr3.X(getContext(), f03.d0(2130969325, this));
                int iX2 = fr3.X(getContext(), f03.d0(2130969108, this));
                float dimension = getResources().getDimension(2131167173);
                gx7 gx7Var = this.T;
                if (gx7Var.a) {
                    float elevation = 0.0f;
                    for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                        elevation += ((View) parent).getElevation();
                    }
                    dimension += elevation;
                }
                int iA = gx7Var.a(dimension, iX);
                ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{fr3.R(1.0f, iX, iX2), iA, fr3.R(0.38f, iX, iX2), iA});
                this.U = colorStateList2;
                colorStateList = colorStateList2;
            }
            j(colorStateList);
        }
        if (z && this.g == null) {
            ColorStateList colorStateList3 = this.V;
            if (colorStateList3 == null) {
                int iX3 = fr3.X(getContext(), f03.d0(2130969325, this));
                int iX4 = fr3.X(getContext(), f03.d0(2130969108, this));
                int iX5 = fr3.X(getContext(), f03.d0(2130969284, this));
                colorStateList3 = new ColorStateList(iArr, new int[]{fr3.R(0.54f, iX3, iX4), fr3.R(0.32f, iX3, iX5), fr3.R(0.12f, iX3, iX4), fr3.R(0.12f, iX3, iX5)});
                this.V = colorStateList3;
            }
            l(colorStateList3);
        }
    }
}
