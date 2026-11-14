package com.opera.android.custom_views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import defpackage.cs5;

/* loaded from: classes.dex */
public class LayoutDirectionToolbar extends Toolbar {
    public LayoutDirectionToolbar(Context context, @Nullable AttributeSet attributeSet) {
        super(new mbi(context, (byte) 0), attributeSet);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void A(Drawable drawable) {
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
        super.A(drawable);
    }

    @Override // android.view.View, android.view.ViewParent
    public final int getLayoutDirection() {
        return cs5.W(this) ? 1 : 0;
    }
}
