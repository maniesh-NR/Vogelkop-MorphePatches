package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.g;
import com.opera.android.widget.SnapToTopGridLayoutManager;

/* loaded from: classes.dex */
public final class sw8 extends SnapToTopGridLayoutManager {
    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.f
    public final void onInitializeAccessibilityNodeInfoForItem(g gVar, vph vphVar, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof lph) && ((lph) layoutParams).a.isInvalid()) {
            return;
        }
        super.onInitializeAccessibilityNodeInfoForItem(gVar, vphVar, view, accessibilityNodeInfoCompat);
    }
}
