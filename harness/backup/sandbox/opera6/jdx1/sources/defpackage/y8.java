package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class y8 {
    public final AccessibilityNodeInfo.MathInfo a;

    public y8(AccessibilityNodeInfo.MathInfo mathInfo) {
        this.a = mathInfo;
    }

    public final boolean equals(Object obj) {
        if (Build.VERSION.SDK_INT < 37 || !(obj instanceof y8)) {
            return this == obj;
        }
        AccessibilityNodeInfo.MathInfo mathInfo = this.a;
        AccessibilityNodeInfo.MathInfo mathInfo2 = ((y8) obj).a;
        return mathInfo == null ? mathInfo2 == null : mathInfo.equals(mathInfo2);
    }

    public final int hashCode() {
        if (Build.VERSION.SDK_INT >= 37) {
            return x8.l(this.a);
        }
        return 0;
    }
}
