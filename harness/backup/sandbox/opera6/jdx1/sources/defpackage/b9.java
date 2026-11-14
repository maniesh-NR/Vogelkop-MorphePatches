package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class b9 {
    public final AccessibilityNodeInfo.SelectionPosition a;

    public b9(xr5 xr5Var, int i, int i2) {
        if (z04.a()) {
            this.a = z8.b(xr5Var, i, i2);
        } else {
            this.a = null;
        }
    }

    public final boolean equals(Object obj) {
        AccessibilityNodeInfo.SelectionPosition selectionPosition;
        if (!z04.a()) {
            return this == obj;
        }
        if ((obj instanceof b9) && (selectionPosition = this.a) != null) {
            return selectionPosition.equals(((b9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        AccessibilityNodeInfo.SelectionPosition selectionPosition;
        if (!z04.a() || (selectionPosition = this.a) == null) {
            return 0;
        }
        return selectionPosition.hashCode();
    }
}
