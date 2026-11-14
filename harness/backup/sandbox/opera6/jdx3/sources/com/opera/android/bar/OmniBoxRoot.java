package com.opera.android.bar;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.LayoutDirectionRelativeLayout;

/* loaded from: classes.dex */
public class OmniBoxRoot extends LayoutDirectionRelativeLayout {
    public OmniBoxRoot(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void d() {
        measureChildren(0, 0);
    }
}
