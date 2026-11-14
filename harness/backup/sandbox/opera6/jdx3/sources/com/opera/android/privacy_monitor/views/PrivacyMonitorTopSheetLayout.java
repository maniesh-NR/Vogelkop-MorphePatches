package com.opera.android.privacy_monitor.views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class PrivacyMonitorTopSheetLayout extends FrameLayout {
    public int a;

    public PrivacyMonitorTopSheetLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        setPadding(0, g3o.g((View) null, windowInsets).a.i(519).b, 0, 0);
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i != this.a) {
            this.a = i;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = getResources().getDimensionPixelSize(2131167338);
                setLayoutParams(layoutParams);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131167340);
        if (dimensionPixelSize > 0) {
            i = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
