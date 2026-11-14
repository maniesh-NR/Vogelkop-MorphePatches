package com.opera.android.tabui2.recently_closed_tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.opera.android.widget.ThemeableLottieAnimationView;
import defpackage.kf;
import defpackage.mnh;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/opera/android/tabui2/recently_closed_tabs/RecentlyClosedTabsSheetLayoutSwitcher;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mnh", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecentlyClosedTabsSheetLayoutSwitcher extends FrameLayout {
    public mnh a;
    public int b;

    public RecentlyClosedTabsSheetLayoutSwitcher(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final kf a() {
        View childAt = getChildAt(1);
        int i = 2131362034;
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) w1h.j(2131362034, childAt);
        if (themeableLottieAnimationView != null) {
            i = 2131362690;
            if (((TextView) w1h.j(2131362690, childAt)) != null) {
                return new kf((byte) 24, (LinearLayout) childAt, themeableLottieAnimationView);
            }
        }
        t3p.q("Missing required view with ID: ".concat(childAt.getResources().getResourceName(i)));
        return null;
    }
}
