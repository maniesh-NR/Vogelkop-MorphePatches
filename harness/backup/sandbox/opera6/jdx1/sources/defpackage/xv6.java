package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c0;
import androidx.fragment.app.e;
import androidx.fragment.app.w;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xv6 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c0 d;
    public final /* synthetic */ e e;

    public xv6(ViewGroup viewGroup, View view, boolean z, c0 c0Var, e eVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = c0Var;
        this.e = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        c0 c0Var = this.d;
        if (z || c0Var.a == 3) {
            fki.a(c0Var.a, view, viewGroup);
        }
        e eVar = this.e;
        eVar.c.a.c(eVar);
        if (w.N(2)) {
            Objects.toString(c0Var);
        }
    }
}
