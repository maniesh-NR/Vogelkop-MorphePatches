package defpackage;

import android.animation.Animator;
import android.view.View;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class zkb extends elb {
    public final /* synthetic */ int u;
    public final /* synthetic */ i v;
    public final /* synthetic */ flb w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zkb(flb flbVar, i iVar, int i, int i2, float f, float f2, float f3, float f4, int i3, i iVar2) {
        super(iVar, i, i2, f, f2, f3, f4);
        this.u = i3;
        this.v = iVar2;
        this.w = flbVar;
    }

    @Override // defpackage.elb, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.q) {
            return;
        }
        int i = this.u;
        i iVar = this.v;
        flb flbVar = this.w;
        if (i <= 0) {
            flbVar.q.d(flbVar.v, iVar);
        } else {
            flbVar.a.add(iVar.itemView);
            this.i = true;
            if (i > 0) {
                flbVar.v.post(new sq1(flbVar, this, i));
            }
        }
        View view = flbVar.A;
        View view2 = iVar.itemView;
        if (view == view2 && view2 == view) {
            flbVar.A = null;
        }
    }
}
