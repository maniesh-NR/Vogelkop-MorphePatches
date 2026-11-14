package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: classes.dex */
public final class cea extends f8 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ int e;

    public /* synthetic */ cea(byte b, int i) {
        this.d = b;
        this.e = i;
    }

    @Override // defpackage.f8
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        byte b = this.d;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (b) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                accessibilityNodeInfoCompat.w(tw2.r(this.e, 1, 0, 1, false, false));
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                accessibilityNodeInfoCompat.w(tw2.r(this.e, 1, 1, 1, false, false));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(this.e, 2, false));
                break;
        }
    }
}
