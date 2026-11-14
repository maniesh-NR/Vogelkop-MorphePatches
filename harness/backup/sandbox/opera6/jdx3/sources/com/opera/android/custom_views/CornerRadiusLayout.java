package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.khh;
import defpackage.l9n;
import defpackage.q9n;

/* loaded from: classes.dex */
public class CornerRadiusLayout extends FrameLayout {
    public CornerRadiusLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.j, 0, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        l5b l5bVar = q9n.c;
        setOutlineProvider(new l9n(dimensionPixelSize));
        setClipToOutline(true);
    }
}
