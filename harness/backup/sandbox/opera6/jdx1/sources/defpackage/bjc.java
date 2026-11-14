package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;

/* loaded from: classes.dex */
public final class bjc implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final t0g a;
    public final t0g b;

    public bjc(ejc ejcVar) {
        Boolean bool = Boolean.FALSE;
        this.a = hyg.k(bool);
        this.b = hyg.k(bool);
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.a.setValue(Boolean.valueOf(ejc.b(accessibilityManager)));
        this.b.setValue(Boolean.valueOf(ejc.c(accessibilityManager)));
    }
}
