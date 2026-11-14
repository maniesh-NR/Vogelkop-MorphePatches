package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: classes.dex */
public final class d8 extends ClickableSpan {
    public final int a;
    public final AccessibilityNodeInfoCompat b;
    public final int c;

    public d8(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, int i2) {
        this.a = i;
        this.b = accessibilityNodeInfoCompat;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}
