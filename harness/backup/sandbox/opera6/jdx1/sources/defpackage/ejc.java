package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class ejc implements AccessibilityManager.AccessibilityStateChangeListener, iak {
    public final boolean a;
    public final boolean b;
    public final t0g c = hyg.k(Boolean.FALSE);
    public final cjc d;
    public final bjc e;

    public ejc(boolean z, boolean z2, boolean z3) {
        this.a = z2;
        this.b = z3;
        bjc bjcVar = null;
        this.d = z ? new cjc() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            bjcVar = new bjc(this);
        }
        this.e = bjcVar;
    }

    public static boolean b(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && StringsKt.E(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && StringsKt.E(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public final void d(AccessibilityManager accessibilityManager) {
        bjc bjcVar;
        this.c.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
        accessibilityManager.addAccessibilityStateChangeListener(this);
        cjc cjcVar = this.d;
        if (cjcVar != null) {
            cjcVar.a.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
            accessibilityManager.addTouchExplorationStateChangeListener(cjcVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (bjcVar = this.e) == null) {
            return;
        }
        bjcVar.a.setValue(Boolean.valueOf(b(accessibilityManager)));
        bjcVar.b.setValue(Boolean.valueOf(c(accessibilityManager)));
        accessibilityManager.addAccessibilityServicesStateChangeListener(bjcVar);
    }

    public final void f(AccessibilityManager accessibilityManager) {
        bjc bjcVar;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        cjc cjcVar = this.d;
        if (cjcVar != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(cjcVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (bjcVar = this.e) == null) {
            return;
        }
        accessibilityManager.removeAccessibilityServicesStateChangeListener(bjcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // defpackage.iak
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getValue() {
        /*
            r3 = this;
            t0g r0 = r3.c
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4b
            r0 = 1
            cjc r1 = r3.d
            if (r1 == 0) goto L21
            t0g r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == r0) goto L4c
        L21:
            boolean r1 = r3.a
            bjc r2 = r3.e
            if (r1 == 0) goto L37
            if (r2 == 0) goto L37
            t0g r1 = r2.a
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == r0) goto L4c
        L37:
            boolean r3 = r3.b
            if (r3 == 0) goto L4b
            if (r2 == 0) goto L4b
            t0g r3 = r2.b
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == r0) goto L4c
        L4b:
            r0 = 0
        L4c:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejc.getValue():java.lang.Object");
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.c.setValue(Boolean.valueOf(z));
    }
}
