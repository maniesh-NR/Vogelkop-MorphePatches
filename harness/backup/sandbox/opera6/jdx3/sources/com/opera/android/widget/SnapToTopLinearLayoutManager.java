package com.opera.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class SnapToTopLinearLayoutManager extends LinearLayoutManager {
    public SnapToTopLinearLayoutManager(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public qrj D(RecyclerView recyclerView) {
        return new qrj(recyclerView);
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, vph vphVar, int i) {
        qrj qrjVarD = D(recyclerView);
        qrjVarD.setTargetPosition(i);
        startSmoothScroll(qrjVarD);
    }
}
