package ads_mobile_sdk;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.fq;

/* loaded from: classes.dex */
public final class fv2 extends FrameLayout {
    public fq a;

    public fv2(Context context, fq fqVar) {
        super(context);
        this.a = fqVar;
        setMinimumHeight((int) TypedValue.applyDimension(1, fqVar.b, ioh.g(context)));
        setMinimumWidth((int) TypedValue.applyDimension(1, this.a.a, context.getResources().getDisplayMetrics()));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iApplyDimension;
        int iApplyDimension2;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            Context context = getContext();
            int i3 = this.a.a;
            iApplyDimension = (i3 == -4 || i3 == -3) ? -1 : (int) TypedValue.applyDimension(1, i3, context.getResources().getDisplayMetrics());
            int i4 = this.a.b;
            iApplyDimension2 = (i4 == -4 || i4 == -3) ? -1 : (int) TypedValue.applyDimension(1, i4, context.getResources().getDisplayMetrics());
        } else {
            measureChild(childAt, i, i2);
            iApplyDimension = childAt.getMeasuredWidth();
            iApplyDimension2 = childAt.getMeasuredHeight();
        }
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (iApplyDimension < suggestedMinimumWidth) {
            iApplyDimension = suggestedMinimumWidth;
        }
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (iApplyDimension2 < suggestedMinimumHeight) {
            iApplyDimension2 = suggestedMinimumHeight;
        }
        setMeasuredDimension(View.resolveSize(iApplyDimension, i), View.resolveSize(iApplyDimension2, i2));
    }
}
