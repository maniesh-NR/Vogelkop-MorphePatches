package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.khh;
import defpackage.njk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/custom_views/StylingImageRadio;", "Lnjk;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StylingImageRadio extends njk {
    /* JADX WARN: Multi-variable type inference failed */
    public StylingImageRadio(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setFocusable(true);
        setClickable(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.L, 0, 0);
        this.k = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.njk, android.widget.Checkable
    public final void toggle() {
        if (this.k) {
            return;
        }
        super.toggle();
    }
}
