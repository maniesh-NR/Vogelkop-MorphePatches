package com.opera.android.startpage.layout.toolbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import defpackage.q9n;
import defpackage.yqd;
import java.util.Collections;

/* loaded from: classes.dex */
public class NewsToolbarLayout extends NestedScrollView {
    public final Rect D;

    public NewsToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        Rect rect = this.D;
        rect.set(0, 0, width, height);
        setSystemGestureExclusionRects(q9n.x(this) ? Collections.singletonList(rect) : Collections.EMPTY_LIST);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onVisibilityChanged(View view, int i) {
        super/*android.view.View*/.onVisibilityChanged(view, i);
        setSystemGestureExclusionRects(q9n.x(this) ? Collections.singletonList(this.D) : Collections.EMPTY_LIST);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void postInvalidateOnAnimation() {
        super/*android.view.View*/.postInvalidateOnAnimation();
        postOnAnimation(new yqd(this, (byte) 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void postInvalidateOnAnimation(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.postInvalidateOnAnimation(i, i2, i3, i4);
        postOnAnimation(new yqd(this, (byte) 14));
    }
}
