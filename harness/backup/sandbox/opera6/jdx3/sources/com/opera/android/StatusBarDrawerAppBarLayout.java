package com.opera.android;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.c1f;
import defpackage.kqe;
import defpackage.qzg;

/* loaded from: classes.dex */
public class StatusBarDrawerAppBarLayout extends AppBarLayout {
    public static final /* synthetic */ int H = 0;
    public final kqe C;
    public final qzg D;
    public c1f E;
    public boolean F;
    public final boolean G;

    public StatusBarDrawerAppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = new kqe(this, (byte) 2);
        this.D = new qzg(this, (byte) 20);
        this.G = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dispatchDraw(Canvas canvas) {
        if (this.G) {
            super/*android.view.View*/.dispatchDraw(canvas);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        c1f c1fVar;
        c1f c1fVar2;
        super.onAttachedToWindow();
        this.E = c1f.c(this);
        boolean zIsAttachedToWindow = isAttachedToWindow();
        kqe kqeVar = this.C;
        qzg qzgVar = this.D;
        if (zIsAttachedToWindow && getVisibility() == 0) {
            if (this.F || (c1fVar2 = this.E) == null) {
                return;
            }
            this.F = true;
            ((ode) c1fVar2.g).k(qzgVar);
            this.E.d(kqeVar);
            return;
        }
        if (!this.F || (c1fVar = this.E) == null) {
            return;
        }
        this.F = false;
        ((ode) c1fVar.g).p(qzgVar);
        this.E.g(kqeVar);
    }

    public final void onDetachedFromWindow() {
        c1f c1fVar;
        super.onDetachedFromWindow();
        if (this.F && (c1fVar = this.E) != null) {
            this.F = false;
            ((ode) c1fVar.g).p(this.D);
            this.E.g(this.C);
        }
        this.E = null;
    }
}
