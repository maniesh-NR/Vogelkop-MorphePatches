package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import defpackage.cs5;
import defpackage.qe;

/* loaded from: classes.dex */
public class LayoutDirectionActionMenuView extends qe {
    public LayoutDirectionActionMenuView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, android.view.ViewParent
    public final int getLayoutDirection() {
        return cs5.W(this) ? 1 : 0;
    }
}
