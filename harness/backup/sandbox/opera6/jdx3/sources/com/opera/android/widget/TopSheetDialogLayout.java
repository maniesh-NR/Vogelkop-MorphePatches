package com.opera.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;

/* loaded from: classes.dex */
public class TopSheetDialogLayout extends LayoutDirectionLinearLayout {
    public TopSheetDialogLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        setPadding(0, g3o.g((View) null, windowInsets).a.i(519).b, 0, 0);
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // com.opera.android.custom_views.LayoutDirectionLinearLayout, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165352);
        if (dimensionPixelSize > 0) {
            i = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
