package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.khh;

/* loaded from: classes.dex */
public class ContentWrapperLayout extends LayoutDirectionFrameLayout {
    public final int c;
    public final int d;

    public ContentWrapperLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.i, 0, 0);
        this.c = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(this.c, (ViewGroup) this, true);
        View viewFindViewById = findViewById(this.d);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
    }
}
