package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class p3d extends ValueAnimator implements Choreographer.FrameCallback {
    public p2d l;
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public float d = 1.0f;
    public boolean e = false;
    public long f = 0;
    public float g = 0.0f;
    public float h = 0.0f;
    public int i = 0;
    public float j = -2.1474836E9f;
    public float k = 2.1474836E9f;
    public boolean m = false;
    public boolean n = false;

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.add(animatorUpdateListener);
    }

    public final float b() {
        p2d p2dVar = this.l;
        if (p2dVar == null) {
            return 0.0f;
        }
        float f = this.h;
        float f2 = p2dVar.j;
        return (f - f2) / (p2dVar.k - f2);
    }

    public final float c() {
        p2d p2dVar = this.l;
        if (p2dVar == null) {
            return 0.0f;
        }
        float f = this.k;
        return f == 2.1474836E9f ? p2dVar.k : f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        g(f());
        j(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.m) {
            j(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        p2d p2dVar = this.l;
        if (p2dVar == null || !this.m) {
            return;
        }
        float fAbs = (this.f != 0 ? j - r2 : 0L) / ((1.0E9f / p2dVar.l) / Math.abs(this.d));
        float f = this.g;
        if (f()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fE = e();
        float fC = c();
        PointF pointF = l1e.a;
        if (f2 >= fE && f2 <= fC) {
            z = true;
        }
        float f3 = this.g;
        float fB = l1e.b(f2, e(), c());
        this.g = fB;
        if (this.n) {
            fB = (float) Math.floor(fB);
        }
        this.h = fB;
        this.f = j;
        if (!this.n || this.g != f3) {
            i();
        }
        if (!z) {
            if (getRepeatCount() == -1 || this.i < getRepeatCount()) {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.i++;
                if (getRepeatMode() == 2) {
                    this.e = !this.e;
                    this.d = -this.d;
                } else {
                    float fC2 = f() ? c() : e();
                    this.g = fC2;
                    this.h = fC2;
                }
                this.f = j;
            } else {
                float fE2 = this.d < 0.0f ? e() : c();
                this.g = fE2;
                this.h = fE2;
                j(true);
                g(f());
            }
        }
        if (this.l != null) {
            float f4 = this.h;
            float f5 = this.j;
            if (f4 < f5 || f4 > this.k) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f5), Float.valueOf(this.k), Float.valueOf(this.h)));
            }
        }
    }

    public final float e() {
        p2d p2dVar = this.l;
        if (p2dVar == null) {
            return 0.0f;
        }
        float f = this.j;
        return f == -2.1474836E9f ? p2dVar.j : f;
    }

    public final boolean f() {
        return this.d < 0.0f;
    }

    public final void g(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this, z);
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fE;
        float fC;
        float fE2;
        if (this.l == null) {
            return 0.0f;
        }
        if (f()) {
            fE = c() - this.h;
            fC = c();
            fE2 = e();
        } else {
            fE = this.h - e();
            fC = c();
            fE2 = e();
        }
        return fE / (fC - fE2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(b());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        p2d p2dVar = this.l;
        if (p2dVar == null) {
            return 0L;
        }
        return (long) p2dVar.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void i() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.m;
    }

    public final void j(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.m = false;
        }
    }

    public final void k(float f) {
        if (this.g == f) {
            return;
        }
        float fB = l1e.b(f, e(), c());
        this.g = fB;
        if (this.n) {
            fB = (float) Math.floor(fB);
        }
        this.h = fB;
        this.f = 0L;
        i();
    }

    public final void l(float f, float f2) {
        if (f > f2) {
            j9h.k("minFrame (", f, ") must be <= maxFrame (", f2, ")");
            return;
        }
        p2d p2dVar = this.l;
        float f3 = p2dVar == null ? -3.4028235E38f : p2dVar.j;
        float f4 = p2dVar == null ? Float.MAX_VALUE : p2dVar.k;
        float fB = l1e.b(f, f3, f4);
        float fB2 = l1e.b(f2, f3, f4);
        if (fB == this.j && fB2 == this.k) {
            return;
        }
        this.j = fB;
        this.k = fB2;
        k((int) l1e.b(this.h, fB, fB2));
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.b.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.a.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.e) {
            return;
        }
        this.e = false;
        this.d = -this.d;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
