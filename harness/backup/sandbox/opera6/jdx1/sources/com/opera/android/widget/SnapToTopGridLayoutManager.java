package com.opera.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.qrj;
import defpackage.vph;

/* loaded from: classes.dex */
public class SnapToTopGridLayoutManager extends GridLayoutManager {
    public SnapToTopGridLayoutManager(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.f
    public final void smoothScrollToPosition(RecyclerView recyclerView, vph vphVar, int i) {
        qrj qrjVar = new qrj(recyclerView);
        qrjVar.setTargetPosition(i);
        startSmoothScroll(qrjVar);
    }
}
