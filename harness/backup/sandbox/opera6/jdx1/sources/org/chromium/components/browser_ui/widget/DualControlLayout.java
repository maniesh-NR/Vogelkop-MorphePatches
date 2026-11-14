package org.chromium.components.browser_ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import org.chromium.ui.widget.ButtonCompat;

/* loaded from: classes.dex */
public final class DualControlLayout extends ViewGroup {
    public final int a;
    public final int b;
    public final int c;
    public boolean d;
    public View e;
    public View f;

    public DualControlLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.a = getContext().getResources().getDimensionPixelSize(2131165629);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, phh.c, 0, 0);
            if (typedArrayObtainStyledAttributes.hasValue(5)) {
                this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
            }
            String string = typedArrayObtainStyledAttributes.hasValue(3) ? typedArrayObtainStyledAttributes.getString(3) : null;
            if (!TextUtils.isEmpty(string)) {
                addView(a(getContext(), 0, string));
            }
            String string2 = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getString(4) : null;
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                addView(a(getContext(), 3, string2));
            }
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                this.b = typedArrayObtainStyledAttributes.getInt(0, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ButtonCompat a(Context context, int i, String str) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = 2132083218;
        } else if (i == 1) {
            i2 = 2132083932;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        qp2.o("Unknown button type");
                        return null;
                    }
                }
                i2 = 2132083932;
            }
            i2 = 2132083354;
        }
        ButtonCompat buttonCompat = new ButtonCompat(context, (AttributeSet) null, i2);
        if (i == 0 || i == 1 || i == 2) {
            i3 = 2131362232;
        } else {
            if (i != 3 && i != 4) {
                qp2.o("Unknown button type");
                return null;
            }
            i3 = 2131362234;
        }
        buttonCompat.setId(i3);
        buttonCompat.setOnClickListener(null);
        buttonCompat.setText(str);
        if (i != 2 && i != 4) {
            return buttonCompat;
        }
        buttonCompat.setAllCaps(false);
        return buttonCompat;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i6 = i3 - i;
        boolean z2 = true;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = this.b;
        if (!z3 ? !(i7 == 2 || i7 == 1) : i7 != 0) {
            z2 = false;
        }
        int measuredWidth2 = this.e.getVisibility() != 8 ? this.e.getMeasuredWidth() : 0;
        int i8 = z2 ? i6 - paddingRight : measuredWidth2 + paddingLeft;
        if (i7 == 3) {
            i8 = i6 - paddingRight;
            i5 = paddingLeft;
        } else {
            i5 = i8 - measuredWidth2;
        }
        int paddingTop = getPaddingTop();
        int measuredHeight = this.e.getMeasuredHeight() + paddingTop;
        this.e.layout(i5, paddingTop, i8, measuredHeight);
        View view = this.f;
        if (view == null) {
            return;
        }
        if (this.d) {
            int i9 = measuredHeight + this.c;
            int measuredHeight2 = view.getMeasuredHeight() + i9;
            View view2 = this.f;
            view2.layout(paddingLeft, i9, view2.getMeasuredWidth() + paddingLeft, measuredHeight2);
            return;
        }
        int measuredHeight3 = view.getMeasuredHeight();
        int i10 = ((paddingTop + measuredHeight) / 2) - (measuredHeight3 / 2);
        int i11 = measuredHeight3 + i10;
        if (i7 == 2) {
            if (!z2) {
                paddingLeft = (i6 - paddingRight) - this.f.getMeasuredWidth();
            }
            measuredWidth = this.f.getMeasuredWidth() + paddingLeft;
        } else {
            int i12 = this.a;
            if (z2) {
                if (measuredWidth2 > 0) {
                    i5 -= i12;
                }
                paddingLeft = i5 - this.f.getMeasuredWidth();
                measuredWidth = i5;
            } else {
                if (measuredWidth2 > 0) {
                    i8 += i12;
                }
                int i13 = i8;
                measuredWidth = this.f.getMeasuredWidth() + i8;
                paddingLeft = i13;
            }
        }
        this.f.layout(paddingLeft, i10, measuredWidth, i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.d = false;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int size = View.MeasureSpec.getMode(i) == 0 ? Integer.MAX_VALUE : View.MeasureSpec.getSize(i) - paddingRight;
        measureChild(this.e, 0, 0);
        int measuredWidth = this.e.getMeasuredWidth();
        int measuredHeight = this.e.getMeasuredHeight();
        View view = this.f;
        if (view != null) {
            measureChild(view, 0, 0);
            int measuredWidth2 = this.f.getMeasuredWidth() + this.e.getMeasuredWidth();
            if (this.e.getMeasuredWidth() > 0 && this.f.getMeasuredWidth() > 0) {
                measuredWidth2 += this.a;
            }
            if (measuredWidth2 > size || this.b == 3) {
                this.d = true;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                this.e.measure(iMakeMeasureSpec, 0);
                this.f.measure(iMakeMeasureSpec, 0);
                measuredHeight = this.f.getMeasuredHeight() + this.e.getMeasuredHeight() + this.c;
            } else {
                measuredHeight = Math.max(measuredHeight, this.f.getMeasuredHeight());
                size = measuredWidth2;
            }
        } else if (this.b == 3) {
            this.d = true;
            this.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
        } else {
            size = measuredWidth;
        }
        setMeasuredDimension(View.resolveSize(size + paddingRight, i), View.resolveSize(measuredHeight + paddingBottom, i2));
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.e == null) {
            this.e = view;
        } else if (this.f == null) {
            this.f = view;
        } else {
            qp2.n("Too many children added to DualControlLayout");
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        this.e = null;
        this.f = null;
        super.removeAllViews();
    }
}
