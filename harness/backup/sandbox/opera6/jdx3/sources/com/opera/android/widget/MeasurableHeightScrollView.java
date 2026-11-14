package com.opera.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.opera.android.custom_views.FadingNestedScrollView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/opera/android/widget/MeasurableHeightScrollView;", "Lcom/opera/android/custom_views/FadingNestedScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MeasurableHeightScrollView extends FadingNestedScrollView {
    public boolean L;
    public int M;

    public MeasurableHeightScrollView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (this.L) {
            return zOnInterceptTouchEvent;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.custom_views.FadingNestedScrollView
    public final void onMeasure(int i, int i2) {
        View childAt;
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.M;
        if (i3 != 0 && i3 != size && (childAt = getChildAt(0)) != null) {
            childAt.forceLayout();
        }
        this.M = size;
        super.onMeasure(i, i2);
    }
}
