package com.opera.android.search.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class ViewOffsetBehavior<V extends View> extends nv5 {
    public r05 a;
    public int b;

    public ViewOffsetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        x(coordinatorLayout, view, i);
        r05 r05Var = this.a;
        if (r05Var == null) {
            r05Var = new r05(view, (byte) 11);
            this.a = r05Var;
        }
        View view2 = (View) r05Var.e;
        r05Var.b = view2.getTop();
        r05Var.c = view2.getLeft();
        this.a.s();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        r05 r05Var2 = this.a;
        if (r05Var2.d != i2) {
            r05Var2.d = i2;
            r05Var2.s();
        }
        this.b = 0;
        return true;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.r(i, view);
    }
}
