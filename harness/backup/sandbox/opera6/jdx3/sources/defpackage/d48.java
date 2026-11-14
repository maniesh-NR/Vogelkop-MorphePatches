package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class d48 {
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final fci p;
    public static final long q;
    public final b2l a;
    public final ViewGroup b;
    public final ViewGroup c;
    public final View d;
    public final RecyclerView e;
    public final RecyclerView f;
    public final z5l g;
    public final f9l h;
    public final j1k i;
    public final c1f j;
    public final long k = SystemClock.uptimeMillis();

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.d;
        l = cs5.x0(100, un7Var);
        m = cs5.x0(0, un7Var);
        n = cs5.x0(20, un7Var);
        o = cs5.x0(400, un7Var);
        p = new fci();
        q = cs5.x0(150, un7Var);
    }

    public d48(b2l b2lVar, ViewGroup viewGroup, ViewGroup viewGroup2, View view, RecyclerView recyclerView, RecyclerView recyclerView2, z5l z5lVar, f9l f9lVar, j1k j1kVar) {
        this.a = b2lVar;
        this.b = viewGroup;
        this.c = viewGroup2;
        this.d = view;
        this.e = recyclerView;
        this.f = recyclerView2;
        this.g = z5lVar;
        this.h = f9lVar;
        this.i = j1kVar;
        this.j = c1f.c(viewGroup2);
        b();
    }

    public final void a() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = this.c.animate();
        long j = l;
        viewPropertyAnimatorAnimate.setDuration(pn7.f(j)).alpha(1.0f).setUpdateListener(new nl2(this, (byte) 6)).withStartAction(new a48(this, (byte) 1)).withEndAction(new a48(this, (byte) 2));
        View view = this.d;
        view.setAlpha(0.0f);
        view.setScaleX(0.7f);
        view.setScaleY(0.7f);
        view.animate().setInterpolator(lf1.d).setStartDelay(pn7.f(j)).setDuration(pn7.f(o)).scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
    }

    public final void b() {
        long jF;
        float width;
        float height;
        final float f;
        final d48 d48Var = this;
        float f2 = 0.0f;
        d48Var.c.setAlpha(0.0f);
        if (SystemClock.uptimeMillis() > d48Var.k + 200) {
            d48Var.a();
            return;
        }
        zwg zwgVarD = d48Var.g.d(d48Var.a);
        if (zwgVarD.equals(z2l.a)) {
            d48Var.b.postOnAnimation(new a48(d48Var, (byte) 0));
            return;
        }
        if (zwgVarD.equals(y2l.a)) {
            d48Var.a();
            return;
        }
        if (!(zwgVarD instanceof a3l)) {
            h9o.p();
            return;
        }
        d48Var.a();
        RecyclerView recyclerView = d48Var.f;
        recyclerView.setAlpha(0.0f);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = recyclerView.animate().alpha(1.0f);
        long j = l;
        viewPropertyAnimatorAlpha.setStartDelay(pn7.f(j)).setDuration(pn7.f(q)).start();
        View view = ((a3l) zwgVarD).d;
        RecyclerView recyclerView2 = d48Var.e;
        recyclerView2.invalidate();
        Rect rectT = q9n.t(recyclerView2);
        Rect rectT2 = q9n.t(view);
        float fI = z7h.i(view.getContext(), 200.0f);
        float fI2 = z7h.i(view.getContext(), 32.0f);
        h6n it = new g6n(recyclerView2).iterator();
        while (true) {
            h6n h6nVar = it;
            if (!h6nVar.hasNext()) {
                return;
            }
            final View view2 = (View) h6nVar.next();
            i iVarT = recyclerView2.T(view2);
            float width2 = ((view2.getWidth() / 2.0f) + (view2.getLeft() + rectT.left)) - rectT2.exactCenterX();
            float height2 = ((view2.getHeight() / 2.0f) + (view2.getTop() + rectT.top)) - rectT2.exactCenterY();
            long j2 = j;
            float fSqrt = (float) Math.sqrt((height2 * height2) + (width2 * width2));
            float f3 = fSqrt / fI;
            float f4 = (fSqrt <= f2 || (iVarT instanceof kj8)) ? f2 : ((fI2 * width2) / fSqrt) * f3;
            float f5 = (fSqrt <= f2 || (iVarT instanceof kj8)) ? f2 : ((fI2 * height2) / fSqrt) * f3;
            if (zed.b(width2) == 0 && zed.b(height2) == 0) {
                width = rm5.G(view2.getWidth() / 2.0f, rectT.exactCenterX() - rectT2.left, 0.2f);
                height = rm5.G(view2.getHeight() / 2.0f, rectT.exactCenterY() - rectT2.top, 0.2f);
                jF = 0;
                f = 1.2f;
            } else {
                jF = pn7.f(m) + zed.b(pn7.f(n) * f3);
                width = view2.getWidth() / 2.0f;
                height = view2.getHeight() / 2.0f;
                f = 1.0f;
                f2 = 0.0f;
            }
            view2.setAlpha(f2);
            view2.setTranslationX(f4);
            view2.setTranslationY(f5);
            view2.setScaleX(f);
            view2.setScaleY(f);
            view2.setPivotX(width);
            view2.setPivotY(height);
            ValueAnimator valueAnimatorF = a26.f(view2, x46.b);
            final float f6 = f5;
            final float f7 = f4;
            valueAnimatorF.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: b48
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.e.invalidate();
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    View view3 = view2;
                    view3.setAlpha((1.0f * fFloatValue) + 0.0f);
                    float f8 = f7;
                    view3.setTranslationX(((0.0f - f8) * fFloatValue) + f8);
                    float f9 = f6;
                    view3.setTranslationY(((0.0f - f9) * fFloatValue) + f9);
                    float f10 = f;
                    float f11 = ((1.0f - f10) * fFloatValue) + f10;
                    view3.setScaleX(f11);
                    view3.setScaleY(f11);
                }
            });
            valueAnimatorF.addListener(new c48(view2));
            valueAnimatorF.setStartDelay(pn7.f(j2) + jF);
            valueAnimatorF.setDuration(pn7.f(o));
            valueAnimatorF.setInterpolator(p);
            valueAnimatorF.start();
            d48Var = this;
            j = j2;
        }
    }
}
