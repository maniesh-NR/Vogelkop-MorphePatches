package com.opera.android.custom_views;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import defpackage.khh;
import defpackage.pih;
import defpackage.q9n;
import defpackage.yhe;

/* loaded from: classes.dex */
public class RadioButton extends StylingTextView implements Checkable {
    public static final int[] o = {R.attr.state_checked};
    public yhe m;
    public boolean n;

    /* JADX WARN: Multi-variable type inference failed */
    public RadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        Drawable drawable = (Drawable) this.i.c;
        if (drawable != null) {
            drawable.mutate();
        }
        setClickable(true);
        setFocusable(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.C, R.attr.radioButtonStyle, 0);
        setChecked(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        return this.n ? View.mergeDrawableStates(super/*android.view.View*/.onCreateDrawableState(i + 1), o) : super/*android.view.View*/.onCreateDrawableState(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super/*android.view.View*/.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(this.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        f03.g0(accessibilityNodeInfo, this.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean performClick() {
        toggle();
        boolean zPerformClick = super/*android.view.View*/.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.n != z) {
            this.n = z;
            refreshDrawableState();
            yhe yheVar = this.m;
            if (yheVar != null) {
                int id = getId();
                OperaRadioGroup operaRadioGroup = (OperaRadioGroup) yheVar.b;
                if (!operaRadioGroup.b) {
                    operaRadioGroup.b = true;
                    int i = operaRadioGroup.a;
                    if (i != -1) {
                        operaRadioGroup.c(i, false);
                    }
                    operaRadioGroup.b = false;
                    operaRadioGroup.b(id);
                }
            }
            if (!z || getParent() == null) {
                return;
            }
            q9n.J((View) getParent(), RadioButton.class, new pih(this, this));
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (this.n) {
            return;
        }
        setChecked(true);
    }
}
