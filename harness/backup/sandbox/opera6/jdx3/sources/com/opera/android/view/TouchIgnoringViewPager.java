package com.opera.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.LayoutDirectionViewPager;

/* loaded from: classes.dex */
public class TouchIgnoringViewPager extends LayoutDirectionViewPager {
    public TouchIgnoringViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
