package com.opera.android.media;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.ui.PlayerView;

/* loaded from: classes.dex */
public class QuickJumpPlayerView extends PlayerView {
    public GestureDetector D;

    public QuickJumpPlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.D;
        if (gestureDetector == null) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        gestureDetector.onTouchEvent(motionEvent);
        return true;
    }
}
