package defpackage;

import android.transition.Transition;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c0;
import androidx.fragment.app.f;

/* loaded from: classes.dex */
public final class ew6 extends f {
    public final Object b;
    public final boolean c;
    public final Object d;

    public ew6(c0 c0Var, boolean z, boolean z2) {
        super(c0Var);
        int i = c0Var.a;
        Fragment fragment = c0Var.c;
        this.b = i == 2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
        this.c = c0Var.a == 2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
        this.d = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
    }

    public final gn9 b() {
        Object obj = this.b;
        gn9 gn9VarC = c(obj);
        Object obj2 = this.d;
        gn9 gn9VarC2 = c(obj2);
        if (gn9VarC == null || gn9VarC2 == null || gn9VarC == gn9VarC2) {
            return gn9VarC == null ? gn9VarC2 : gn9VarC;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final gn9 c(Object obj) {
        if (obj == null) {
            return null;
        }
        fn9 fn9Var = an9.a;
        if (obj instanceof Transition) {
            return fn9Var;
        }
        gn9 gn9Var = an9.b;
        if (gn9Var != null && gn9Var.g(obj)) {
            return gn9Var;
        }
        StringBuilder sb = new StringBuilder("Transition ");
        sb.append(obj);
        Fragment fragment = this.a.c;
        sb.append(" for fragment ");
        sb.append(fragment);
        sb.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb.toString());
    }
}
