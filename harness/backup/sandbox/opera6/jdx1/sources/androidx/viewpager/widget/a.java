package androidx.viewpager.widget;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import defpackage.f8;

/* loaded from: classes.dex */
public final class a extends f8 {
    public final /* synthetic */ ViewPager d;

    public a(ViewPager viewPager) {
        this.d = viewPager;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // defpackage.f8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
        /*
            r1 = this;
            super.c(r2, r3)
            java.lang.String r2 = "androidx.viewpager.widget.ViewPager"
            r3.setClassName(r2)
            androidx.viewpager.widget.ViewPager r1 = r1.d
            androidx.viewpager.widget.PagerAdapter r2 = r1.mAdapter
            if (r2 == 0) goto L15
            int r2 = r2.getCount()
            r0 = 1
            if (r2 > r0) goto L16
        L15:
            r0 = 0
        L16:
            r3.setScrollable(r0)
            int r2 = r3.getEventType()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r2 != r0) goto L36
            androidx.viewpager.widget.PagerAdapter r2 = r1.mAdapter
            if (r2 == 0) goto L36
            int r2 = r2.getCount()
            r3.setItemCount(r2)
            int r2 = r1.mCurItem
            r3.setFromIndex(r2)
            int r1 = r1.mCurItem
            r3.setToIndex(r1)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.a.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // defpackage.f8
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        accessibilityNodeInfoCompat.t("androidx.viewpager.widget.ViewPager");
        ViewPager viewPager = this.d;
        PagerAdapter pagerAdapter = viewPager.mAdapter;
        accessibilityNodeInfoCompat.z(pagerAdapter != null && pagerAdapter.getCount() > 1);
        if (viewPager.canScrollHorizontally(1)) {
            accessibilityNodeInfoCompat.a(4096);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            accessibilityNodeInfoCompat.a(8192);
        }
    }

    @Override // defpackage.f8
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        ViewPager viewPager = this.d;
        if (i == 4096) {
            if (!viewPager.canScrollHorizontally(1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.mCurItem + 1);
            return true;
        }
        if (i != 8192 || !viewPager.canScrollHorizontally(-1)) {
            return false;
        }
        viewPager.setCurrentItem(viewPager.mCurItem - 1);
        return true;
    }
}
