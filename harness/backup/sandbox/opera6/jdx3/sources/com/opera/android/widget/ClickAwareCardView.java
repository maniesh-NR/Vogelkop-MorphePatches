package com.opera.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.CardView;
import defpackage.v35;

/* loaded from: classes.dex */
public class ClickAwareCardView extends CardView {
    public final GestureDetector p;
    public View.OnClickListener q;

    public ClickAwareCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new GestureDetector(context, new v35(this, (byte) 0));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.p.onTouchEvent(motionEvent);
        return false;
    }
}
