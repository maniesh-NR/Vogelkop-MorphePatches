package com.opera.android.search.behavior;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.af1;
import defpackage.b8h;
import defpackage.df1;
import defpackage.lf1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/opera/android/search/behavior/ScrollableToolbarBehavior;", "Lcom/opera/android/search/behavior/ViewOffsetBehavior;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "b8h", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollableToolbarBehavior extends ViewOffsetBehavior<View> {
    public static final long f;
    public static final DecelerateInterpolator g;
    public boolean c;
    public final boolean d;
    public ValueAnimator e;

    static {
        on7 on7Var = pn7.b;
        f = cs5.x0(120, un7.d);
        g = lf1.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ScrollableToolbarBehavior(@NotNull Context context) {
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public ScrollableToolbarBehavior(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
    }

    public /* synthetic */ ScrollableToolbarBehavior(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void g(qv5 qv5Var) {
        this.c = (qv5Var.c & 80) == 0;
    }

    public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i2 != 0) {
            ValueAnimator valueAnimator = this.e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            r05 r05Var = this.a;
            int i4 = 0;
            int i5 = r05Var != null ? r05Var.d : 0;
            int iC = djh.c(i5 - i2, z(view), y(view));
            if (i5 != iC) {
                r05 r05Var2 = this.a;
                if (r05Var2 == null) {
                    this.b = iC;
                } else if (r05Var2.d != iC) {
                    r05Var2.d = iC;
                    r05Var2.s();
                }
                i4 = i5 - iC;
            }
            iArr[1] = i4;
        }
    }

    public final void q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i3 != 0) {
            ValueAnimator valueAnimator = this.e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            r05 r05Var = this.a;
            int i4 = 0;
            int i5 = r05Var != null ? r05Var.d : 0;
            int iC = djh.c(i5 - i3, z(view), y(view));
            if (i5 != iC) {
                r05 r05Var2 = this.a;
                if (r05Var2 == null) {
                    this.b = iC;
                } else if (r05Var2.d != iC) {
                    r05Var2.d = iC;
                    r05Var2.s();
                }
                i4 = i5 - iC;
            }
            iArr[1] = i4;
        }
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        if (b8h.h(view) != null) {
            r05 r05Var = this.a;
            if ((r05Var != null ? r05Var.d : 0) != 0) {
                ValueAnimator valueAnimator = this.e;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                r05 r05Var2 = this.a;
                if (r05Var2 == null) {
                    this.b = 0;
                } else if (r05Var2.d != 0) {
                    r05Var2.d = 0;
                    r05Var2.s();
                }
                coordinatorLayout.f(view);
                return true;
            }
        }
        return false;
    }

    public final boolean u(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        return (i & 2) != 0;
    }

    public final void v(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (this.d) {
            ValueAnimator valueAnimator = this.e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (b8h.h(view) != null) {
                r05 r05Var = this.a;
                int i2 = r05Var != null ? r05Var.d : 0;
                int iZ = z(view);
                int iY = y(view);
                if (i2 - iZ >= iY - i2) {
                    iZ = iY;
                }
                if (i2 != iZ) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, iZ);
                    valueAnimatorOfInt.setDuration(pn7.f(f));
                    valueAnimatorOfInt.setInterpolator(g);
                    valueAnimatorOfInt.addUpdateListener(new af1(this, coordinatorLayout, view, (byte) 2));
                    valueAnimatorOfInt.addListener(new df1(this, (byte) 4));
                    valueAnimatorOfInt.start();
                    this.e = valueAnimatorOfInt;
                }
            }
        }
    }

    public final int y(View view) {
        if (view.getVisibility() != 0 || this.c) {
            return 0;
        }
        int measuredHeight = view.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
    }

    public final int z(View view) {
        if (view.getVisibility() != 0 || !this.c) {
            return 0;
        }
        int i = -view.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return i - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
    }
}
