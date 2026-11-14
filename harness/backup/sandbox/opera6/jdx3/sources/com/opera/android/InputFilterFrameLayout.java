package com.opera.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.PointerIcon;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.LayoutDirectionFrameLayout;
import defpackage.fan;

/* loaded from: classes.dex */
public class InputFilterFrameLayout extends LayoutDirectionFrameLayout {
    public static final /* synthetic */ int c = 0;

    public InputFilterFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static boolean d(MotionEvent motionEvent) {
        int actionMasked;
        return (motionEvent.getSource() & 2) != 0 && motionEvent.getToolType(0) == 3 && ((actionMasked = motionEvent.getActionMasked()) == 8 || actionMasked == 11 || actionMasked == 12);
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return d(motionEvent) && fan.b(this, this, (int) motionEvent.getX(), (int) motionEvent.getY()) != null;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (fan.b(this, this, (int) motionEvent.getX(), (int) motionEvent.getY()) != null) {
            return true;
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        PointerIcon pointerIconOnResolvePointerIcon = super.onResolvePointerIcon(motionEvent, i);
        return (pointerIconOnResolvePointerIcon != null || fan.b(this, this, (int) motionEvent.getX(), (int) motionEvent.getY()) == null) ? pointerIconOnResolvePointerIcon : PointerIcon.getSystemIcon(getContext(), 1000);
    }
}
