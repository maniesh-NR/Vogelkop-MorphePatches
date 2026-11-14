package com.opera.android.browser;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.jzk;
import defpackage.pde;
import defpackage.qt3;

/* loaded from: classes.dex */
public class BrowserFragmentFrameLayout extends FrameLayout {
    public qt3 a;
    public final pde b;
    public final pde c;

    public BrowserFragmentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new pde(new Size(0, 0));
        this.c = new pde(new jzk(0, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a != null && motionEvent.getAction() == 0) {
            this.a.run();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        r9b r9bVarI = g3o.g(this, windowInsets).a.i(519);
        xf8.F0(this.c, new jzk(r9bVarI.b, r9bVarI.d));
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        pde pdeVar = this.b;
        Size size = (Size) pdeVar.g();
        if (size.getWidth() == width && size.getHeight() == height) {
            return;
        }
        pdeVar.r(new Size(width, height));
    }
}
