package com.opera.android.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.FadingRecyclerView;
import defpackage.q9n;

/* loaded from: classes.dex */
public class FeedPageRecyclerView extends FadingRecyclerView {
    public FeedPageRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        FeedContainerView feedContainerView;
        if (motionEvent.getAction() == 0) {
            ViewParent parent = getParent();
            while (true) {
                if (parent == null) {
                    feedContainerView = null;
                    break;
                }
                if (parent instanceof FeedContainerView) {
                    feedContainerView = (FeedContainerView) parent;
                    break;
                }
                parent = parent.getParent();
            }
            if (feedContainerView != null) {
                float x = motionEvent.getX() + q9n.q(this, feedContainerView).x;
                if (x < feedContainerView.a || x > feedContainerView.getWidth() - feedContainerView.a) {
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
