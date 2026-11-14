package defpackage;

import android.animation.Animator;
import android.view.View;
import androidx.recyclerview.widget.i;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ykb extends elb {
    public boolean u;
    public final /* synthetic */ float v;
    public final /* synthetic */ float w;
    public final /* synthetic */ flb x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykb(flb flbVar, i iVar, float f, float f2, float f3, float f4) {
        super(iVar, 4, 1, f, f2, 0.0f, 0.0f);
        this.v = f3;
        this.w = f4;
        Objects.requireNonNull(flbVar);
        this.x = flbVar;
    }

    @Override // defpackage.elb
    public final void a(float f) {
        this.t = f;
        if (this.u) {
            return;
        }
        this.e.itemView.setAlpha(f);
        this.p = true;
        this.m = this.v;
        this.n = this.w;
        this.o = Float.valueOf(1.0f - f);
    }

    @Override // defpackage.elb, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.u = true;
        super.onAnimationCancel(animator);
        this.e.itemView.setAlpha(1.0f);
    }

    @Override // defpackage.elb, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        i iVar = this.e;
        iVar.itemView.setAlpha(1.0f);
        if (this.u || this.q) {
            return;
        }
        flb flbVar = this.x;
        flbVar.q.d(flbVar.v, iVar);
        View view = flbVar.A;
        View view2 = iVar.itemView;
        if (view == view2 && view2 == view) {
            flbVar.A = null;
        }
    }
}
