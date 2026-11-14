package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.ceb;

/* loaded from: classes.dex */
public class InterceptableFrameLayout extends FrameLayout {
    public ceb a;

    public InterceptableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ceb cebVar = this.a;
        if (cebVar == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        cebVar.c(motionEvent);
        return false;
    }
}
