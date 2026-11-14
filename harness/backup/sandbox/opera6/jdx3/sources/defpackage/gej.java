package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.opera.android.widget.MeasurableHeightScrollView;

/* loaded from: classes.dex */
public abstract class gej extends ViewGroup {
    public final int a;
    public int b;

    public gej(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = fan.a(240.0f, getResources());
    }

    public void a(int i, View view) {
    }

    public int b() {
        return getChildAt(0).getMeasuredHeight();
    }

    public int c() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.opera.android.widget.MeasurableHeightScrollView] */
    public final void e() {
        ?? r0 = (MeasurableHeightScrollView) getParent();
        this.b = ((r0.M - r0.getPaddingTop()) - r0.getPaddingBottom()) - ((MeasurableHeightScrollView) getParent()).getTop();
        requestLayout();
    }

    public void f(int i) {
        getChildAt(0).layout(0, 0, getChildAt(0).getMeasuredWidth(), getChildAt(0).getMeasuredHeight());
    }

    public void g(int i) {
        getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [android.view.View, com.opera.android.widget.MeasurableHeightScrollView] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.b;
        int iC = c();
        if (i5 < iC) {
            i5 = iC;
        }
        f(i5);
        int i6 = this.b;
        int iC2 = c();
        if (i6 < iC2) {
            i6 = iC2;
        }
        getChildAt(1).layout(0, getChildAt(0).getMeasuredHeight(), getChildAt(1).getMeasuredWidth(), getChildAt(0).getMeasuredHeight() + (i6 - b()));
        View childAt = getChildAt(1);
        ?? r4 = (MeasurableHeightScrollView) getParent();
        int paddingTop = ((r4.M - r4.getPaddingTop()) - r4.getPaddingBottom()) - b();
        a(paddingTop >= 0 ? paddingTop : 0, childAt);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.View, com.opera.android.widget.MeasurableHeightScrollView] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        g(size);
        ?? r6 = (MeasurableHeightScrollView) getParent();
        int paddingTop = (r6.M - r6.getPaddingTop()) - r6.getPaddingBottom();
        int i3 = this.b;
        int iC = c();
        if (i3 < iC) {
            i3 = iC;
        }
        getChildAt(1).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i3 - b(), 1073741824));
        setMeasuredDimension(size, paddingTop);
    }
}
