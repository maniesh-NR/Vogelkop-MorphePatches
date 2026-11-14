package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class LayoutDirectionLinearLayoutManager extends LinearLayoutManager {
    public RecyclerView a;

    public LayoutDirectionLinearLayoutManager(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final int getLayoutDirection() {
        RecyclerView recyclerView = this.a;
        if (recyclerView == null) {
            return 0;
        }
        return cs5.L(recyclerView);
    }

    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super/*androidx.recyclerview.widget.f*/.onAttachedToWindow(recyclerView);
        this.a = recyclerView;
    }
}
