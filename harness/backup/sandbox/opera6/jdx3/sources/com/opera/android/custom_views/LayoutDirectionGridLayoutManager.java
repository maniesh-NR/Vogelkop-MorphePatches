package com.opera.android.custom_views;

import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: classes.dex */
public class LayoutDirectionGridLayoutManager extends GridLayoutManager {
    public final FadingRecyclerView m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LayoutDirectionGridLayoutManager(FadingRecyclerView fadingRecyclerView) {
        super(6, 1);
        fadingRecyclerView.getContext();
        this.m = fadingRecyclerView;
    }

    public final int getExtraLayoutSpace(vph vphVar) {
        return Math.max(super/*androidx.recyclerview.widget.LinearLayoutManager*/.getExtraLayoutSpace(vphVar), 0);
    }

    public final int getLayoutDirection() {
        return cs5.L(this.m);
    }

    public final void scrollToPosition(int i) {
        scrollToPositionWithOffset(i, 0);
    }
}
