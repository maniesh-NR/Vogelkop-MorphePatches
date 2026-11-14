package com.opera.android.custom_views;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import defpackage.g7f;
import defpackage.h7f;
import defpackage.kc;
import defpackage.otl;
import defpackage.vgb;
import defpackage.w6f;

/* loaded from: classes.dex */
public class ToolbarProgressBar extends SmoothProgressBar implements w6f {
    public int e;
    public ObjectAnimator f;
    public ObjectAnimator g;
    public final h7f h;

    public ToolbarProgressBar(Context context, AttributeSet attributeSet) {
        Drawable drawableFindDrawableByLayerId;
        super(context, attributeSet);
        this.h = new h7f();
        setVisibility(0);
        Drawable progressDrawable = getProgressDrawable();
        if (!(progressDrawable instanceof LayerDrawable) || (drawableFindDrawableByLayerId = ((LayerDrawable) progressDrawable).findDrawableByLayerId(R.id.background)) == null) {
            return;
        }
        drawableFindDrawableByLayerId.setVisible(false, false);
        drawableFindDrawableByLayerId.setAlpha(0);
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.h.b((otl) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.h.c((otl) obj);
    }

    @Override // com.opera.android.custom_views.SmoothProgressBar
    public final void a(int i) {
        super.a(i);
        boolean z = false;
        boolean z2 = i == getMax();
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            z = true;
        }
        if (!z2 && z) {
            this.g.cancel();
        }
        if (z2 && !z) {
            if (this.g == null) {
                c();
            }
            this.g.start();
        }
        e();
    }

    public final void c() {
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f.end();
        }
        ObjectAnimator objectAnimator2 = this.g;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            this.g.end();
        }
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<ToolbarProgressBar, Float>) property, 0.0f, 1.0f);
        this.f = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(150L);
        this.f.setInterpolator(vgb.b);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<ToolbarProgressBar, Float>) property, 1.0f, 0.0f);
        this.g = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(150L);
        this.g.setInterpolator(vgb.a);
        this.g.addListener(new kc(this, (byte) 27));
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        ObjectAnimator objectAnimator2 = this.g;
        if (objectAnimator2 != null) {
            objectAnimator2.end();
        }
        this.a = false;
        setIndeterminate(false);
        super.setProgress(0);
    }

    public final void e() {
        int i = this.e;
        if (i != 0) {
            super.setVisibility(i);
            return;
        }
        int i2 = (getProgress() > 0 || isIndeterminate()) ? 0 : 8;
        if (getVisibility() != i2) {
            super.setVisibility(i2);
            h7f h7fVar = this.h;
            if (h7fVar != null) {
                g7f g7fVar = new g7f(h7fVar);
                while (g7fVar.hasNext()) {
                    otl otlVar = (otl) g7fVar.next();
                    if (i2 == 0) {
                        otlVar.b();
                    } else {
                        otlVar.a();
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c();
        setPivotY(getHeight());
    }

    @Override // com.opera.android.custom_views.SmoothProgressBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setProgressDrawable(getProgressDrawable());
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        super.a(0);
        super.setIndeterminate(z);
        e();
        this.a = false;
    }

    @Override // com.opera.android.custom_views.SmoothProgressBar, android.widget.ProgressBar
    public final synchronized void setProgress(int i) {
        ObjectAnimator objectAnimator;
        boolean z = getProgress() > 0 || isIndeterminate() || ((objectAnimator = this.f) != null && objectAnimator.isStarted());
        boolean z2 = i > 0;
        if (i > 0) {
            super.setProgress(i);
        }
        if (z != z2) {
            if (this.f == null || this.g == null) {
                c();
            }
            if (this.f.isRunning()) {
                this.f.end();
            }
            if (z2) {
                this.f.start();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        this.e = i;
        e();
    }
}
