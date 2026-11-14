package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class xkb implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final i e;
    public final byte f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ i o;
    public final /* synthetic */ glb p;

    /* JADX WARN: Multi-variable type inference failed */
    public xkb(glb glbVar, i iVar, int i, float f, float f2, float f3, float f4, int i2, i iVar2) {
        this.p = glbVar;
        this.n = i2;
        this.o = iVar2;
        this.f = i;
        this.e = iVar;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new jq3(this, (byte) 4));
        valueAnimatorOfFloat.setTarget(iVar.itemView);
        valueAnimatorOfFloat.addListener(this);
        this.m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.l) {
            this.e.setIsRecyclable(true);
        }
        this.l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.k) {
            return;
        }
        int i = this.n;
        i iVar = this.o;
        glb glbVar = this.p;
        if (i <= 0) {
            glbVar.m.b(glbVar.r, iVar);
        } else {
            glbVar.a.add(iVar.itemView);
            this.h = true;
            if (i > 0) {
                glbVar.r.post(new sq1((byte) 2, i, glbVar, this, false));
            }
        }
        View view = glbVar.w;
        View view2 = iVar.itemView;
        if (view == view2 && view2 == view) {
            glbVar.w = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
