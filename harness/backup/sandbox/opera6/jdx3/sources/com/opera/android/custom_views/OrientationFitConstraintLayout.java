package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.i0l;
import defpackage.khh;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/custom_views/OrientationFitConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OrientationFitConstraintLayout extends ConstraintLayout {
    public View p;
    public View q;
    public final int r;
    public final int s;
    public final boolean t;

    public OrientationFitConstraintLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.x, 0, 0);
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            }
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            }
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                this.t = typedArrayObtainStyledAttributes.getBoolean(2, false);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        r(configuration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        if (getChildCount() < 2) {
            return;
        }
        this.p = getChildAt(0);
        this.q = getChildAt(1);
        r(getResources().getConfiguration());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(Configuration configuration) {
        so5 so5Var = new so5();
        so5Var.d(this);
        if (i0l.g() || r9n.B(getContext()) || configuration.orientation == 1 || configuration.screenWidthDp < 600) {
            View view = this.p;
            if (view == null) {
                view = null;
            }
            so5Var.e(view.getId(), 6, 0, 6);
            View view2 = this.p;
            if (view2 == null) {
                view2 = null;
            }
            so5Var.e(view2.getId(), 7, 0, 7);
            View view3 = this.q;
            if (view3 == null) {
                view3 = null;
            }
            so5Var.f(view3.getId(), 6, 0, 6, 0);
            View view4 = this.q;
            if (view4 == null) {
                view4 = null;
            }
            so5Var.f(view4.getId(), 7, 0, 7, 0);
            View view5 = this.q;
            if (view5 == null) {
                view5 = null;
            }
            int id = view5.getId();
            View view6 = this.p;
            so5Var.f(id, 3, (view6 != null ? view6 : null).getId(), 4, this.r);
        } else {
            View view7 = this.p;
            if (this.t) {
                if (view7 == null) {
                    view7 = null;
                }
                int id2 = view7.getId();
                View view8 = this.q;
                if (view8 == null) {
                    view8 = null;
                }
                so5Var.e(id2, 6, view8.getId(), 7);
                View view9 = this.q;
                if (view9 == null) {
                    view9 = null;
                }
                int id3 = view9.getId();
                View view10 = this.p;
                if (view10 == null) {
                    view10 = null;
                }
                so5Var.f(id3, 7, view10.getId(), 6, this.s);
            } else {
                if (view7 == null) {
                    view7 = null;
                }
                int id4 = view7.getId();
                View view11 = this.q;
                if (view11 == null) {
                    view11 = null;
                }
                so5Var.e(id4, 7, view11.getId(), 6);
                View view12 = this.q;
                if (view12 == null) {
                    view12 = null;
                }
                int id5 = view12.getId();
                View view13 = this.p;
                if (view13 == null) {
                    view13 = null;
                }
                so5Var.f(id5, 6, view13.getId(), 7, this.s);
            }
            View view14 = this.q;
            so5Var.f((view14 != null ? view14 : null).getId(), 3, 0, 3, 0);
        }
        so5Var.a(this);
    }
}
