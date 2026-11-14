package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import defpackage.hyj;
import defpackage.jz2;
import defpackage.xv6;
import defpackage.yv6;
import defpackage.zv6;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e extends hyj {
    public final d c;
    public AnimatorSet d;

    public e(d dVar) {
        this.c = dVar;
    }

    @Override // defpackage.hyj
    public final void b(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.d;
        c0 c0Var = this.c.a;
        if (animatorSet == null) {
            c0Var.c(this);
            return;
        }
        if (c0Var.g) {
            zv6.a.a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (w.N(2)) {
            c0Var.toString();
        }
    }

    @Override // defpackage.hyj
    public final void c(ViewGroup viewGroup) {
        c0 c0Var = this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            c0Var.c(this);
            return;
        }
        animatorSet.start();
        if (w.N(2)) {
            Objects.toString(c0Var);
        }
    }

    @Override // defpackage.hyj
    public final void d(jz2 jz2Var) {
        c0 c0Var = this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            c0Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !c0Var.c.mTransitioning) {
            return;
        }
        if (w.N(2)) {
            c0Var.toString();
        }
        long jA = yv6.a.a(animatorSet);
        long j = (long) (jz2Var.c * jA);
        if (j == 0) {
            j = 1;
        }
        if (j == jA) {
            j = jA - 1;
        }
        if (w.N(2)) {
            animatorSet.toString();
            c0Var.toString();
        }
        zv6.a.b(animatorSet, j);
    }

    @Override // defpackage.hyj
    public final void e(ViewGroup viewGroup) throws Resources.NotFoundException {
        e eVar;
        d dVar = this.c;
        if (dVar.a()) {
            return;
        }
        yqa yqaVarB = dVar.b(viewGroup.getContext());
        this.d = yqaVarB != null ? (AnimatorSet) yqaVarB.c : null;
        c0 c0Var = dVar.a;
        Fragment fragment = c0Var.c;
        boolean z = c0Var.a == 3;
        View view = fragment.mView;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            eVar = this;
            animatorSet.addListener(new xv6(viewGroup, view, z, c0Var, eVar));
        } else {
            eVar = this;
        }
        AnimatorSet animatorSet2 = eVar.d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
