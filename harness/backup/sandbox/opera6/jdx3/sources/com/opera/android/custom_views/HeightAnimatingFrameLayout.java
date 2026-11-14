package com.opera.android.custom_views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/custom_views/HeightAnimatingFrameLayout;", "Landroid/widget/FrameLayout;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeightAnimatingFrameLayout extends FrameLayout {
    public static final long d;
    public static final /* synthetic */ int e = 0;
    public int a;
    public int b;
    public ValueAnimator c;

    static {
        on7 on7Var = pn7.b;
        d = cs5.x0(MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, un7.d);
    }

    public HeightAnimatingFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            r6 = 0
            super.onMeasure(r5, r6)
            boolean r6 = r4.isAttachedToWindow()
            if (r6 != 0) goto Lb
            return
        Lb:
            int r6 = r4.getMeasuredHeight()
            int r0 = r4.a
            r1 = 0
            r2 = 1
            if (r6 == r0) goto L71
            android.animation.ValueAnimator r0 = r4.c
            if (r0 == 0) goto L26
            boolean r0 = r0.isRunning()
            if (r0 != r2) goto L26
            int r0 = r4.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L27
        L26:
            r0 = r1
        L27:
            if (r0 == 0) goto L2f
            int r0 = r0.intValue()
            if (r0 == r6) goto L71
        L2f:
            int r0 = r4.a
            if (r0 == 0) goto L71
            android.animation.ValueAnimator r1 = r4.c
            if (r1 == 0) goto L3a
            r1.cancel()
        L3a:
            r4.b = r6
            int[] r1 = new int[]{r0, r6}
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
            if (r6 <= r0) goto L49
            android.view.animation.DecelerateInterpolator r6 = defpackage.lf1.d
            goto L4b
        L49:
            android.view.animation.AccelerateDecelerateInterpolator r6 = defpackage.lf1.a
        L4b:
            r1.setInterpolator(r6)
            long r2 = com.opera.android.custom_views.HeightAnimatingFrameLayout.d
            long r2 = pn7.f(r2)
            r1.setDuration(r2)
            nl2 r6 = new nl2
            r0 = 9
            r6.<init>(r4, r0)
            r1.addUpdateListener(r6)
            kc r6 = new kc
            r0 = 11
            r6.<init>(r4, r0)
            r1.addListener(r6)
            r1.start()
            r4.c = r1
            goto L85
        L71:
            android.animation.ValueAnimator r0 = r4.c
            if (r0 == 0) goto L81
            boolean r0 = r0.isRunning()
            if (r0 != r2) goto L81
            int r0 = r4.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L81:
            if (r1 != 0) goto L85
            r4.a = r6
        L85:
            int r6 = r4.a
            r0 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            super.onMeasure(r5, r6)
            int r5 = r4.getMeasuredWidth()
            int r6 = r4.a
            r4.setMeasuredDimension(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.custom_views.HeightAnimatingFrameLayout.onMeasure(int, int):void");
    }
}
