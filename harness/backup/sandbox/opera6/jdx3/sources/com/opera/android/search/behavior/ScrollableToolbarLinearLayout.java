package com.opera.android.search.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/search/behavior/ScrollableToolbarLinearLayout;", "Landroid/widget/LinearLayout;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollableToolbarLinearLayout extends LinearLayout {
    public ScrollableToolbarLinearLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        boolean z = getVisibility() == 0;
        super.setVisibility(i);
        if ((getVisibility() == 0) != z) {
            CoordinatorLayout parent = getParent();
            CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? parent : null;
            if (coordinatorLayout != null) {
                coordinatorLayout.f(this);
            }
        }
    }
}
