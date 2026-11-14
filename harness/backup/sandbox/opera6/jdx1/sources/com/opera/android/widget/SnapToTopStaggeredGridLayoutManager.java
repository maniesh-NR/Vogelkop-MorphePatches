package com.opera.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import defpackage.qrj;
import defpackage.vph;

/* loaded from: classes.dex */
public class SnapToTopStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public SnapToTopStaggeredGridLayoutManager(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.f
    public final void smoothScrollToPosition(RecyclerView recyclerView, vph vphVar, int i) {
        qrj qrjVar = new qrj(recyclerView.getContext(), (byte) 1);
        qrjVar.setTargetPosition(i);
        startSmoothScroll(qrjVar);
    }
}
