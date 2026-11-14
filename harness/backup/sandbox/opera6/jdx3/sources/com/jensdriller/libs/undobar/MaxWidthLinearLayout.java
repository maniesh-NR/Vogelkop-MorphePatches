package com.jensdriller.libs.undobar;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;

/* loaded from: classes.dex */
public class MaxWidthLinearLayout extends LayoutDirectionLinearLayout {
    public int c;

    public MaxWidthLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.maxWidth});
            this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // com.opera.android.custom_views.LayoutDirectionLinearLayout, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.c;
        if (i3 > 0 && i3 < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.c, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }
}
