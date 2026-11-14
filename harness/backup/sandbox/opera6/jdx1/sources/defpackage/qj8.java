package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class qj8 extends f8 {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
    public static final j06 o = new j06((byte) 7);
    public static final r16 p = new r16();
    public final AccessibilityManager h;
    public final View i;
    public x31 j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = LinearLayoutManager.INVALID_OFFSET;
    public int l = LinearLayoutManager.INVALID_OFFSET;
    public int m = LinearLayoutManager.INVALID_OFFSET;

    public qj8(View view) {
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.f8
    public final ole b(View view) {
        x31 x31Var = this.j;
        if (x31Var != null) {
            return x31Var;
        }
        x31 x31Var2 = new x31(this, (byte) 1);
        this.j = x31Var2;
        return x31Var2;
    }

    @Override // defpackage.f8
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        s(accessibilityNodeInfoCompat);
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = LinearLayoutManager.INVALID_OFFSET;
        u(i, false);
        w(i, 8);
        return true;
    }

    public final AccessibilityEvent k(int i, int i2) {
        View view = this.i;
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i2);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatQ = q(i);
        accessibilityEventObtain2.getText().add(accessibilityNodeInfoCompatQ.n());
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompatQ.a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            h9o.r("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            return null;
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(view, i);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final AccessibilityNodeInfoCompat l(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoCompat.t("android.view.View");
        Rect rect = n;
        accessibilityNodeInfoCompat.r(rect);
        accessibilityNodeInfoCompat.s(rect);
        accessibilityNodeInfoCompat.b = -1;
        View view = this.i;
        accessibilityNodeInfoObtain.setParent(view);
        t(i, accessibilityNodeInfoCompat);
        if (accessibilityNodeInfoCompat.n() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            h9o.r("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.e;
        accessibilityNodeInfoObtain.getBoundsInParent(rect2);
        Rect rect3 = this.d;
        accessibilityNodeInfoCompat.g(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            h9o.r("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            h9o.r("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
            h9o.r("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        accessibilityNodeInfoCompat.c = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        if (this.k == i) {
            accessibilityNodeInfoCompat.p(true);
            accessibilityNodeInfoCompat.a(NotificationCompat.FLAG_HIGH_PRIORITY);
        } else {
            accessibilityNodeInfoCompat.p(false);
            accessibilityNodeInfoCompat.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            accessibilityNodeInfoCompat.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            accessibilityNodeInfoCompat.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            accessibilityNodeInfoCompat.r(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (accessibilityNodeInfoCompat.b != -1) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
                Rect rect5 = new Rect();
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3 = accessibilityNodeInfoCompat;
                while (true) {
                    int i2 = accessibilityNodeInfoCompat3.b;
                    if (i2 == -1) {
                        break;
                    }
                    accessibilityNodeInfoCompat2.b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat2.a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfoCompat2.r(rect);
                    t(i2, accessibilityNodeInfoCompat2);
                    accessibilityNodeInfo.getBoundsInParent(rect5);
                    rect4.offset(rect5.left, rect5.top);
                    accessibilityNodeInfoCompat3 = accessibilityNodeInfoCompat2;
                }
            }
            view.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            accessibilityNodeInfoCompat.s(rect4);
            accessibilityNodeInfoCompat.g(rect3);
        }
        Rect rect6 = this.f;
        if (view.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect6)) {
                accessibilityNodeInfoCompat.s(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfoCompat.D(true);
                        }
                    }
                }
            }
        }
        return accessibilityNodeInfoCompat;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iN = n(motionEvent.getX(), motionEvent.getY());
            int i2 = this.m;
            if (i2 != iN) {
                this.m = iN;
                w(iN, NotificationCompat.FLAG_HIGH_PRIORITY);
                w(i2, NotificationCompat.FLAG_LOCAL_ONLY);
            }
            if (iN == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.m = LinearLayoutManager.INVALID_OFFSET;
                w(LinearLayoutManager.INVALID_OFFSET, NotificationCompat.FLAG_HIGH_PRIORITY);
                w(i, NotificationCompat.FLAG_LOCAL_ONLY);
                return true;
            }
        }
        return true;
    }

    public abstract int n(float f, float f2);

    public abstract void o(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(int r21, android.graphics.Rect r22) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj8.p(int, android.graphics.Rect):boolean");
    }

    public final AccessibilityNodeInfoCompat q(int i) {
        if (i != -1) {
            return l(i);
        }
        View view = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = r5n.a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            h9o.r("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            accessibilityNodeInfoCompat.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return accessibilityNodeInfoCompat;
    }

    public abstract boolean r(int i, int i2, Bundle bundle);

    public void s(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public abstract void t(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    public void u(int i, boolean z) {
    }

    public final boolean v(int i) {
        int i2;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        u(i, true);
        w(i, 8);
        return true;
    }

    public final void w(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i, i2));
    }
}
