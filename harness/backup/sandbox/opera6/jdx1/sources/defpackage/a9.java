package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class a9 {
    public final AccessibilityNodeInfo.Selection a;

    public a9(b9 b9Var, b9 b9Var2) {
        if (!z04.a()) {
            this.a = null;
        } else {
            z8.c();
            this.a = z8.a(b9Var.a, b9Var2.a);
        }
    }

    public final boolean equals(Object obj) {
        AccessibilityNodeInfo.Selection selection;
        if (!z04.a()) {
            return this == obj;
        }
        if ((obj instanceof a9) && (selection = this.a) != null) {
            return selection.equals(((a9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        AccessibilityNodeInfo.Selection selection;
        if (!z04.a() || (selection = this.a) == null) {
            return 0;
        }
        return selection.hashCode();
    }
}
