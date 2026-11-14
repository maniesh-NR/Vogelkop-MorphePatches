package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes.dex */
public class LayoutDirectionFloatingActionButton extends FloatingActionButton {
    public LayoutDirectionFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getLayoutDirection() {
        return cs5.W(this) ? 1 : 0;
    }
}
