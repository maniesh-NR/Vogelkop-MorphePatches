package com.opera.android.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.khh;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/view/ConfigurationChangeFrameLayout;", "Landroid/widget/FrameLayout;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConfigurationChangeFrameLayout extends FrameLayout {
    public final int a;

    public ConfigurationChangeFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.h, 0, 0);
            this.a = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i = this.a;
        if (i == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = getResources().getDimensionPixelSize(i);
        setLayoutParams(layoutParams);
    }
}
