package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.e9c;
import defpackage.f9c;
import defpackage.r9i;

/* loaded from: classes.dex */
public class CustomCollapsingToolbarLayout extends CollapsingToolbarLayout {
    public z0c K;

    public CustomCollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void f(int i) {
        super.f(i);
        z0c z0cVar = this.K;
        if (z0cVar != null) {
            f9c f9cVar = (f9c) z0cVar.b;
            e9c e9cVar = (e9c) z0cVar.c;
            float f = i / 255.0f;
            ((r9i) f9cVar.u).W(((double) f) < 0.5d);
            e9cVar.b = f;
        }
    }
}
