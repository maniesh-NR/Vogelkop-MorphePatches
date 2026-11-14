package com.opera.android.feed;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.f;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.opera.android.startpage.common.SnappingRecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/opera/android/feed/HeightAnimatingSnappingRecyclerView;", "Lcom/opera/android/startpage/common/SnappingRecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeightAnimatingSnappingRecyclerView extends SnappingRecyclerView {
    public static final long J0;
    public static final /* synthetic */ int K0 = 0;
    public int G0;
    public int H0;
    public ValueAnimator I0;

    static {
        on7 on7Var = pn7.b;
        J0 = cs5.x0(MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, un7.d);
    }

    public HeightAnimatingSnappingRecyclerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void C0(f fVar) {
        if (fVar != null) {
            fVar.setMeasurementCacheEnabled(false);
        }
        super.C0(fVar);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            r6 = 0
            super.onMeasure(r5, r6)
            boolean r6 = r4.s
            if (r6 != 0) goto L9
            return
        L9:
            int r6 = r4.getMeasuredHeight()
            int r0 = r4.G0
            r1 = 0
            r2 = 1
            if (r6 == r0) goto L6f
            android.animation.ValueAnimator r0 = r4.I0
            if (r0 == 0) goto L24
            boolean r0 = r0.isRunning()
            if (r0 != r2) goto L24
            int r0 = r4.H0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 == 0) goto L2d
            int r0 = r0.intValue()
            if (r0 == r6) goto L6f
        L2d:
            int r0 = r4.G0
            if (r0 == 0) goto L6f
            android.animation.ValueAnimator r1 = r4.I0
            if (r1 == 0) goto L38
            r1.cancel()
        L38:
            r4.H0 = r6
            int[] r1 = new int[]{r0, r6}
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
            if (r6 <= r0) goto L47
            android.view.animation.DecelerateInterpolator r6 = defpackage.lf1.d
            goto L49
        L47:
            android.view.animation.AccelerateDecelerateInterpolator r6 = defpackage.lf1.a
        L49:
            r1.setInterpolator(r6)
            long r2 = com.opera.android.feed.HeightAnimatingSnappingRecyclerView.J0
            long r2 = pn7.f(r2)
            r1.setDuration(r2)
            nl2 r6 = new nl2
            r0 = 10
            r6.<init>(r4, r0)
            r1.addUpdateListener(r6)
            kc r6 = new kc
            r0 = 12
            r6.<init>(r4, r0)
            r1.addListener(r6)
            r1.start()
            r4.I0 = r1
            goto L83
        L6f:
            android.animation.ValueAnimator r0 = r4.I0
            if (r0 == 0) goto L7f
            boolean r0 = r0.isRunning()
            if (r0 != r2) goto L7f
            int r0 = r4.H0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L7f:
            if (r1 != 0) goto L83
            r4.G0 = r6
        L83:
            int r6 = r4.G0
            r0 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            super.onMeasure(r5, r6)
            int r5 = r4.getMeasuredWidth()
            int r6 = r4.G0
            r4.setMeasuredDimension(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.feed.HeightAnimatingSnappingRecyclerView.onMeasure(int, int):void");
    }
}
