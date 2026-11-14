package com.opera.android.custom_views;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.m3l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class TabCountButton extends StylingImageButton {
    public static final /* synthetic */ int l = 0;
    public final m3l k;

    /* JADX WARN: Multi-variable type inference failed */
    public TabCountButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 2130968614);
        m3l m3lVar = new m3l(context, attributeSet);
        this.k = m3lVar;
        setForeground(m3lVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.textColor}, 2130968614, 0);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        if (colorStateList != null) {
            f(colorStateList);
        }
    }

    public final void f(ColorStateList colorStateList) {
        m3l m3lVar = this.k;
        if (Intrinsics.a(colorStateList, m3lVar.g)) {
            return;
        }
        m3lVar.g = colorStateList;
        m3lVar.invalidateSelf();
    }
}
