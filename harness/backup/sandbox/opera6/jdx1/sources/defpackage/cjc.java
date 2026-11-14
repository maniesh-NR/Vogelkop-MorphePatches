package defpackage;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class cjc implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final t0g a = hyg.k(Boolean.FALSE);

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }
}
