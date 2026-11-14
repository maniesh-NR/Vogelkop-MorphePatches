package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class DialogTitle extends StylingTextView {
    public final int m;

    /* JADX WARN: Multi-variable type inference failed */
    public DialogTitle(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int maxLines = getMaxLines();
        this.m = maxLines <= 0 ? 2 : maxLines;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        int lineCount;
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0) {
            return;
        }
        int ellipsisCount = layout.getEllipsisCount(lineCount - 1);
        CharSequence text = layout.getText();
        if (ellipsisCount > 0 || !(lineCount <= 1 || text == null || text.toString().contains(" "))) {
            setSingleLine(false);
            setMaxLines(this.m);
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, zhh.y, 2130971053, 2132083327);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, dimensionPixelSize);
            }
            typedArrayObtainStyledAttributes.recycle();
            super.onMeasure(i, i2);
        }
    }
}
