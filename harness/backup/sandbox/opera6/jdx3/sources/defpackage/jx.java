package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class jx extends fr8 {
    public final /* synthetic */ byte s = 0;
    public final Object t;
    public Object u;

    public jx(Context context, Drawable drawable, String str, tta ttaVar) {
        jl6 jl6Var;
        super(context, ttaVar, vr8.l);
        this.t = str;
        if (drawable != null) {
            int i = this.c;
            jl6Var = new jl6(scd.l0(drawable, i, i), this.a, this.b, this.f);
        } else {
            jl6Var = null;
        }
        this.u = jl6Var;
        l();
        this.l = false;
        s();
        invalidate();
    }

    public jx(Context context, lf5 lf5Var, tta ttaVar, vr8 vr8Var) {
        super(context, ttaVar, vr8Var);
        this.t = lf5Var;
        l();
    }

    @Override // defpackage.fr8
    public final void b(vr8 vr8Var, boolean z) {
        switch (this.s) {
            case 1:
                super.b(vr8Var, z);
                this.u = null;
                invalidate();
                break;
            default:
                super.b(vr8Var, z);
                break;
        }
    }

    @Override // defpackage.fr8
    public final void n(Canvas canvas, Rect rect) {
        switch (this.s) {
            case 0:
                this.a.b(rect.width(), this.b).b(canvas, rect.left, rect.top, this.h.e.a(getContext()));
                jl6 jl6Var = (jl6) this.u;
                if (jl6Var != null) {
                    jl6Var.c = this.f;
                    jl6Var.g(canvas, rect.left, rect.top, rect.right, rect.bottom);
                    break;
                }
                break;
            default:
                Drawable drawable = (Drawable) this.u;
                if (drawable == null) {
                    drawable = (Drawable) ((lf5) this.t).invoke(this, Integer.valueOf(this.c), this.h);
                    this.u = drawable;
                }
                drawable.setBounds(rect);
                drawable.draw(canvas);
                break;
        }
    }

    @Override // defpackage.fr8
    public final void o() {
        switch (this.s) {
            case 1:
                if (this.m) {
                    super.o();
                    break;
                }
                break;
            default:
                super.o();
                break;
        }
    }

    @Override // defpackage.fr8
    public final void q(boolean z) {
        switch (this.s) {
            case 0:
                invalidate();
                break;
            default:
                this.u = null;
                invalidate();
                break;
        }
    }

    @Override // defpackage.fr8
    public final void s() {
        switch (this.s) {
            case 0:
                setText(!this.l ? (String) this.t : " ");
                break;
            default:
                setText(" ");
                break;
        }
    }
}
