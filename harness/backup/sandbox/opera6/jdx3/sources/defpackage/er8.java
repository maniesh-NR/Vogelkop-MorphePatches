package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;

/* loaded from: classes.dex */
public class er8 extends fr8 implements gq8, ValueAnimator.AnimatorUpdateListener {
    public int A;
    public hq8 s;
    public final yr8 t;
    public boolean u;
    public ValueAnimator v;
    public ValueAnimator w;
    public final float x;
    public final int y;
    public final int z;

    public er8(Context context, tta ttaVar, vr8 vr8Var, zzj zzjVar) {
        super(context, ttaVar, vr8Var);
        this.x = fan.a(2.0f, context.getResources());
        int i = this.c;
        Resources resources = context.getResources();
        this.y = ((i - (fan.a(7.0f, resources) << 1)) - fan.a(2.0f, resources)) / 2;
        this.z = getResources().getInteger(2131492882);
        this.t = new yr8(context, new nv6(this), this.a, this.b, zzjVar);
    }

    @Override // defpackage.gq8
    public final void Q(hq8 hq8Var) {
    }

    @Override // defpackage.fr8
    public final void b(vr8 vr8Var, boolean z) {
        super.b(vr8Var, z);
        yr8 yr8Var = this.t;
        if (yr8Var != null) {
            yr8Var.h();
        }
        if (z) {
            q(true);
        }
    }

    @Override // defpackage.fr8
    public final void n(Canvas canvas, Rect rect) {
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (fFloatValue > 0.0f) {
                int iSave = canvas.save();
                canvas.scale(fFloatValue, fFloatValue, rect.exactCenterX(), rect.exactCenterY());
                this.a.b(rect.width(), this.b).b(canvas, rect.left, rect.top, this.A);
                canvas.restoreToCount(iSave);
            }
        }
        ValueAnimator valueAnimator2 = this.w;
        if (valueAnimator2 == null || ((Float) valueAnimator2.getAnimatedValue()).floatValue() <= 0.0f) {
            v(canvas, rect, 1.0f);
            return;
        }
        float fFloatValue2 = ((Float) this.w.getAnimatedValue()).floatValue();
        int iSave2 = canvas.save();
        float f = this.x * fFloatValue2;
        canvas.translate(f, f);
        float fWidth = (rect.width() - ((rect.width() - this.y) * fFloatValue2)) / rect.width();
        canvas.scale(fWidth, fWidth, rect.left, rect.top);
        v(canvas, rect, 1.0f - fFloatValue2);
        canvas.restoreToCount(iSave2);
    }

    @Override // defpackage.fr8
    public void o() {
        super.o();
        this.A = f03.t(2130969724, getContext(), 2131103876);
        yr8 yr8Var = this.t;
        if (yr8Var != null) {
            yr8Var.h();
        }
    }

    @Override // defpackage.fr8
    public final void q(boolean z) {
        this.t.f(z);
    }

    @Override // defpackage.gq8
    public final void r(int i, hq8 hq8Var) {
        if (i == 4) {
            s();
        } else if (i == 7 || i == 5) {
            q(true);
        }
    }

    @Override // defpackage.fr8
    public final void s() {
        String strH;
        hq8 hq8Var = this.s;
        if (hq8Var == null) {
            return;
        }
        if (this.l) {
            strH = " ";
        } else {
            strH = hq8Var.h();
            String[] strArr = aik.a;
            if (strH == null) {
                strH = "";
            }
        }
        setText(strH);
    }

    public final Float t() {
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator == null) {
            return null;
        }
        Float f = (Float) valueAnimator.getAnimatedValue();
        this.v.cancel();
        this.v.removeUpdateListener(this);
        this.v = null;
        return f;
    }

    public vmj u(String str) {
        Context context = getContext();
        int i = vmj.g;
        int i2 = this.c;
        return tmj.j(context, str, i2, i2, 48);
    }

    public void v(Canvas canvas, Rect rect, float f) {
        yr8 yr8Var = this.t;
        if (yr8Var.g == null && yr8Var.l == null && yr8Var.h == null) {
            this.a.b(rect.width(), this.b).b(canvas, rect.left, rect.top, this.A);
        }
        this.t.a(canvas, rect.left, rect.top, rect.right, rect.bottom);
    }

    public String w() {
        return this.s.i(p6l.a);
    }

    public void x() {
    }

    public void y() {
    }
}
