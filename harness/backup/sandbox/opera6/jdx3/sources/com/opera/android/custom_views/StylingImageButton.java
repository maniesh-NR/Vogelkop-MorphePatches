package com.opera.android.custom_views;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.PointerIcon;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class StylingImageButton extends StylingImageView {
    public StylingImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StylingImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFocusable(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        PointerIcon pointerIconOnResolvePointerIcon = super/*android.view.View*/.onResolvePointerIcon(motionEvent, i);
        return (pointerIconOnResolvePointerIcon == null && isClickable() && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : pointerIconOnResolvePointerIcon;
    }

    public final boolean onSetAlpha(int i) {
        return false;
    }
}
