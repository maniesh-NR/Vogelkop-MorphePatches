package org.chromium.ui.hierarchicalmenu;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.chromium.ui.base.LocalizationUtils;

/* loaded from: classes.dex */
public class MenuItemWithSubmenuView extends LinearLayout {
    public boolean a;

    public MenuItemWithSubmenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_EXPAND);
        if (Build.VERSION.SDK_INT >= 36) {
            accessibilityNodeInfo.setExpandedState(this.a ? 3 : 1);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if ((keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers() || ((keyEvent.getKeyCode() != 22 && (keyEvent.isNumLockOn() || keyEvent.getKeyCode() != 150)) || LocalizationUtils.isLayoutRtl())) && (keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers() || ((keyEvent.getKeyCode() != 21 && (keyEvent.isNumLockOn() || keyEvent.getKeyCode() != 148)) || !LocalizationUtils.isLayoutRtl()))) {
            return super.onKeyDown(i, keyEvent);
        }
        performClick();
        return true;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (i != AccessibilityNodeInfo.AccessibilityAction.ACTION_EXPAND.getId()) {
            return super.performAccessibilityAction(i, bundle);
        }
        performClick();
        return true;
    }
}
