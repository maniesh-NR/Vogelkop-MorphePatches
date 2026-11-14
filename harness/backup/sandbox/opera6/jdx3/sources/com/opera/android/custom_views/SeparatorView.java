package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.khh;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/custom_views/SeparatorView;", "Landroid/view/View;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SeparatorView extends View {
    public final int a;
    public final int b;

    public SeparatorView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 2132083450);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.E, 0, 2132083450);
            this.a = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            this.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i = this.b;
        int i2 = this.a;
        if (i2 == 0 && i == 0) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        if (i2 != 0) {
            marginLayoutParams.setMarginStart(getResources().getDimensionPixelSize(i2));
        }
        if (i != 0) {
            marginLayoutParams.setMarginEnd(getResources().getDimensionPixelSize(i));
        }
        setLayoutParams(marginLayoutParams);
    }
}
