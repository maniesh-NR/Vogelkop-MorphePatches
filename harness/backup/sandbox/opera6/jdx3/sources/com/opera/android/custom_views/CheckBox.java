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
import defpackage.av4;
import defpackage.khh;
import defpackage.qp2;
import defpackage.zu4;

/* loaded from: classes.dex */
public class CheckBox extends StylingTextView implements Checkable {
    public static final int[] q = {R.attr.state_checked};
    public av4 m;
    public boolean n;
    public final int o;
    public final zu4 p;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckBox(Context context, AttributeSet attributeSet) {
        Drawable drawableF;
        super(context, attributeSet, 2130968998);
        this.o = 1;
        setClickable(true);
        setFocusable(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.g, 2130968998, 0);
        this.o = typedArrayObtainStyledAttributes.getInteger(1, this.o);
        setChecked(typedArrayObtainStyledAttributes.getBoolean(2, false));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (this.o != 3 && resourceId == 0) {
            qp2.o("Specify a box drawable");
            throw null;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (this.o == 3 || (drawableF = sgb.F(resourceId, getContext())) == null) {
            return;
        }
        zu4 zu4Var = new zu4(this, drawableF.mutate());
        this.p = zu4Var;
        int i = this.o;
        s((i == 1 || i == 4) ? zu4Var : null, i == 2 ? zu4Var : null);
    }

    @Override // com.opera.android.custom_views.StylingTextView
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ol7 ol7Var = this.p;
        if (ol7Var != null) {
            ol7Var.invalidateSelf();
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        return this.n ? View.mergeDrawableStates(super/*android.view.View*/.onCreateDrawableState(i + 1), q) : super/*android.view.View*/.onCreateDrawableState(i);
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
            av4 av4Var = this.m;
            if (av4Var != null) {
                av4Var.E(this);
            }
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.n);
    }
}
