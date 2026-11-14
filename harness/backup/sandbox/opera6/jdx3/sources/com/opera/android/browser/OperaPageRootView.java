package com.opera.android.browser;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.LayoutDirectionFrameLayout;
import defpackage.c1f;
import defpackage.h03;
import defpackage.i7f;
import defpackage.pde;
import defpackage.qg2;

/* loaded from: classes.dex */
public class OperaPageRootView extends LayoutDirectionFrameLayout {
    public final h03 c;
    public final i7f d;
    public c1f e;
    public int f;
    public int g;
    public final pde h;

    public OperaPageRootView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = new h03(this, (byte) 1);
        this.d = new i7f();
        this.f = 0;
        this.g = 0;
        this.h = new pde(new Size(0, 0));
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c1f c1fVarC = c1f.c(this);
        this.e = c1fVarC;
        if (c1fVarC != null) {
            c1fVarC.d(this.c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c1f c1fVar = this.e;
        if (c1fVar != null) {
            c1fVar.g(this.c);
            this.e = null;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.d.forEach(new qg2((byte) 9));
        this.h.r(new Size(i, i2));
    }
}
