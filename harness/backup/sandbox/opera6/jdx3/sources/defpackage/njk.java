package defpackage;

import android.R;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import com.opera.android.custom_views.StylingImageButton;

/* loaded from: classes.dex */
public abstract class njk extends StylingImageButton implements Checkable {
    public static final int[] m = {R.attr.state_checked};
    public boolean k;
    public nen l;

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        return this.k ? View.mergeDrawableStates(super/*android.view.View*/.onCreateDrawableState(i + 1), m) : super/*android.view.View*/.onCreateDrawableState(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super/*android.view.View*/.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent != null) {
            accessibilityEvent.setChecked(this.k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null) {
            f03.g0(accessibilityNodeInfo, this.k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean performClick() {
        boolean zPerformClick = super/*android.view.View*/.performClick();
        toggle();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (z != this.k) {
            this.k = z;
            refreshDrawableState();
            nen nenVar = this.l;
            if (nenVar == null || !this.k) {
                return;
            }
            wtm wtmVar = nenVar.a;
            Integer num = (Integer) getTag();
            num.getClass();
            kze kzeVar = (kze) wtmVar.c;
            kzeVar.r(oen.a((oen) kzeVar.g(), num, null, 6));
        }
    }

    public void toggle() {
        setChecked(!this.k);
    }
}
