package androidx.fragment.app;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import defpackage.hyj;
import defpackage.wv6;
import defpackage.yk9;

/* loaded from: classes.dex */
public final class c extends hyj {
    public final d c;

    public c(d dVar) {
        this.c = dVar;
    }

    @Override // defpackage.hyj
    public final void b(ViewGroup viewGroup) {
        c0 c0Var = this.c.a;
        View view = c0Var.c.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        c0Var.c(this);
        if (w.N(2)) {
            c0Var.toString();
        }
    }

    @Override // defpackage.hyj
    public final void c(ViewGroup viewGroup) throws Resources.NotFoundException {
        Animation animation;
        d dVar = this.c;
        c0 c0Var = dVar.a;
        if (dVar.a()) {
            c0Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = c0Var.c.mView;
        yqa yqaVarB = dVar.b(context);
        if (yqaVarB == null || (animation = (Animation) yqaVarB.b) == null) {
            qp2.n("Required value was null.");
            return;
        }
        if (c0Var.a != 1) {
            view.startAnimation(animation);
            c0Var.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        yk9 yk9Var = new yk9(animation, viewGroup, view);
        yk9Var.setAnimationListener(new wv6(c0Var, viewGroup, view, this));
        view.startAnimation(yk9Var);
        if (w.N(2)) {
            c0Var.toString();
        }
    }
}
