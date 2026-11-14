package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public abstract class elb implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final i e;
    public final byte f;
    public final ValueAnimator g;
    public final byte h;
    public boolean i;
    public boolean j;
    public float k;
    public float l;
    public float m;
    public float n;
    public Float o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public float t;

    /* JADX WARN: Multi-variable type inference failed */
    public elb(i iVar, int i, int i2, float f, float f2, float f3, float f4) {
        this.f = i2;
        this.h = i;
        this.e = iVar;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new jq3(this, (byte) 3));
        valueAnimatorOfFloat.setTarget(iVar.itemView);
        valueAnimatorOfFloat.addListener(this);
        a(0.0f);
    }

    public void a(float f) {
        this.t = f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        a(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.s) {
            this.s = false;
            this.e.itemView.setHasTransientState(false);
        }
        this.r = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
