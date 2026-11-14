package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class da extends f8 {
    public final /* synthetic */ byte d;

    public /* synthetic */ da(byte b) {
        this.d = b;
    }

    @Override // defpackage.f8
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 8:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.p() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.p());
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.f8
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int iP;
        byte b = this.d;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (b) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                accessibilityNodeInfoCompat.t("android.widget.Button");
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                accessibilityNodeInfoCompat.y("link");
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfoCompat.w(tw2.r(0, 1, 0, 1, true, false));
                accessibilityNodeInfo.setHeading(true);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfoCompat.w(tw2.r(0, 1, 1, 1, true, false));
                accessibilityNodeInfo2.setHeading(true);
                break;
            case 4:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                accessibilityNodeInfoCompat.v(null);
                break;
            case 5:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                accessibilityNodeInfoCompat.z(false);
                break;
            case 6:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                accessibilityNodeInfoCompat.v(null);
                break;
            case 7:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                accessibilityNodeInfoCompat.t(Button.class.getName());
                break;
            case 8:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityNodeInfoCompat.t(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (iP = nestedScrollView.p()) > 0) {
                    accessibilityNodeInfoCompat.z(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        accessibilityNodeInfoCompat.b(s8.p);
                        accessibilityNodeInfoCompat.b(s8.A);
                    }
                    if (nestedScrollView.getScrollY() < iP) {
                        accessibilityNodeInfoCompat.b(s8.o);
                        accessibilityNodeInfoCompat.b(s8.C);
                        break;
                    }
                }
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                accessibilityNodeInfoCompat.D(false);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    @Override // defpackage.f8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            byte r0 = r3.d
            switch(r0) {
                case 8: goto La;
                default: goto L5;
            }
        L5:
            boolean r3 = super.g(r4, r5, r6)
            return r3
        La:
            boolean r3 = super.g(r4, r5, r6)
            r6 = 1
            if (r3 != 0) goto L9f
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            boolean r3 = r4.isEnabled()
            r0 = 0
            if (r3 == 0) goto L9e
            int r3 = r4.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Matrix r2 = r4.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 == 0) goto L37
            boolean r2 = r4.getGlobalVisibleRect(r1)
            if (r2 == 0) goto L37
            int r3 = r1.height()
        L37:
            r1 = 4096(0x1000, float:5.74E-42)
            r2 = 250(0xfa, float:3.5E-43)
            if (r5 == r1) goto L73
            r1 = 8192(0x2000, float:1.148E-41)
            if (r5 == r1) goto L4c
            r1 = 16908344(0x1020038, float:2.3877386E-38)
            if (r5 == r1) goto L4c
            r1 = 16908346(0x102003a, float:2.3877392E-38)
            if (r5 == r1) goto L73
            goto L9e
        L4c:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 - r3
            int r3 = java.lang.Math.max(r5, r0)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto L9e
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.B(r0, r3, r2, r6)
            goto L9f
        L73:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 + r3
            int r3 = r4.p()
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto L9e
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.B(r0, r3, r2, r6)
            goto L9f
        L9e:
            r6 = r0
        L9f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
