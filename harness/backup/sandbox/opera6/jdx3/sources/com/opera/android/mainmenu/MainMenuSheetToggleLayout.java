package com.opera.android.mainmenu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.StylingTextView;
import defpackage.khh;
import defpackage.vs;

/* loaded from: classes.dex */
public class MainMenuSheetToggleLayout extends FrameLayout {
    public vs a;
    public final sv2 b;
    public boolean c;
    public CharSequence d;

    public MainMenuSheetToggleLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        if (attributeSet == null) {
            this.b = null;
            return;
        }
        sv2 sv2Var = new sv2();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.q, 0, 0);
        sv2Var.a = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        sv2Var.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        sv2Var.c = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        typedArrayObtainStyledAttributes.getColor(0, context.getResources().getColor(2131101021));
        typedArrayObtainStyledAttributes.recycle();
        this.b = sv2Var;
    }

    public final void a() {
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            ((StylingTextView) this.a.d).setText(charSequence);
            return;
        }
        sv2 sv2Var = this.b;
        if (sv2Var != null) {
            int i = sv2Var.c;
            int i2 = sv2Var.b;
            int i3 = this.c ? i2 : i;
            if (i3 != 0) {
                ((StylingTextView) this.a.d).setText(i3);
                if (this.c) {
                    i = i2;
                }
                ((FrameLayout) this.a.b).setContentDescription(((FrameLayout) this.a.b).getResources().getString(sv2Var.a) + " " + ((FrameLayout) this.a.b).getResources().getString(i));
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131559011, (ViewGroup) this, false);
        addView(viewInflate);
        int i = 2131362594;
        n2d n2dVar = (ToggleAnimationView) w1h.j(2131362594, viewInflate);
        if (n2dVar != null) {
            i = 2131364785;
            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131364785, viewInflate);
            if (stylingTextView != null) {
                i = 2131364786;
                yq1 yq1Var = (StylingTextView) w1h.j(2131364786, viewInflate);
                if (yq1Var != null) {
                    this.a = new vs((ViewGroup) viewInflate, (View) n2dVar, (Object) stylingTextView, (Object) yq1Var, (byte) 17);
                    sv2 sv2Var = this.b;
                    if (sv2Var == null) {
                        return;
                    }
                    yq1Var.setText(sv2Var.a);
                    a();
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // android.view.View
    public final void onHoverChanged(boolean z) {
        ToggleAnimationView toggleAnimationView = (ToggleAnimationView) this.a.c;
        if (z == toggleAnimationView.J) {
            return;
        }
        toggleAnimationView.J = z;
        toggleAnimationView.invalidate();
    }
}
