package com.opera.android.search.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.b8h;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/opera/android/search/behavior/ToolbarScrollingBehavior;", "Lcom/opera/android/search/behavior/ViewOffsetBehavior;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ToolbarScrollingBehavior extends ViewOffsetBehavior<View> {
    /* JADX WARN: Illegal instructions before constructor call */
    public ToolbarScrollingBehavior(@NotNull Context context) {
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public ToolbarScrollingBehavior(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public /* synthetic */ ToolbarScrollingBehavior(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static View y(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            DecelerateInterpolator decelerateInterpolator = ScrollableToolbarBehavior.g;
            if (b8h.h(view) != null) {
                return view;
            }
        }
        h9o.h("Collection contains no element matching the predicate.");
        return null;
    }

    public final boolean f(View view, View view2) {
        DecelerateInterpolator decelerateInterpolator = ScrollableToolbarBehavior.g;
        return b8h.h(view2) != null;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        DecelerateInterpolator decelerateInterpolator = ScrollableToolbarBehavior.g;
        ScrollableToolbarBehavior scrollableToolbarBehaviorH = b8h.h(view2);
        if (scrollableToolbarBehaviorH == null) {
            return false;
        }
        view.offsetTopAndBottom((view2.getVisibility() == 0 ? scrollableToolbarBehaviorH.c ? view2.getBottom() : view2.getTop() - view.getHeight() : 0) - view.getTop());
        return false;
    }

    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        y(coordinatorLayout.j(view));
        coordinatorLayout.s(i, i2, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), view);
        return true;
    }

    @Override // com.opera.android.search.behavior.ViewOffsetBehavior
    public final void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewY = y(coordinatorLayout.j(view));
        DecelerateInterpolator decelerateInterpolator = ScrollableToolbarBehavior.g;
        ScrollableToolbarBehavior scrollableToolbarBehaviorH = b8h.h(viewY);
        if (scrollableToolbarBehaviorH == null || viewY.getVisibility() != 0) {
            coordinatorLayout.r(i, view);
            return;
        }
        qv5 layoutParams = view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        if (scrollableToolbarBehaviorH.c) {
            int bottom = viewY.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            view.layout(paddingLeft, bottom, view.getMeasuredWidth() + paddingLeft, view.getMeasuredHeight() + bottom);
        } else {
            int top = (viewY.getTop() - view.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            view.layout(paddingLeft, top, view.getMeasuredWidth() + paddingLeft, view.getMeasuredHeight() + top);
        }
    }
}
