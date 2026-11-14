package com.opera.android.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.dll;
import defpackage.q9n;
import defpackage.rpm;
import defpackage.u8n;

/* loaded from: classes.dex */
public class ThemeableRecyclerView extends RecyclerView {
    /* JADX WARN: Multi-variable type inference failed */
    public ThemeableRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        rpm rpmVar = new rpm(new zg(this, attributeSet, 0), (byte) 1);
        dll dllVarS = q9n.s(this);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, this, rpmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThemeableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        rpm rpmVar = new rpm(new zg(this, attributeSet, 0), (byte) 1);
        dll dllVarS = q9n.s(this);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, this, rpmVar);
    }
}
