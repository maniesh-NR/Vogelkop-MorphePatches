package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class bo8 extends ran {
    /* JADX WARN: Multi-variable type inference failed */
    public bo8(int i) {
        this.F = i;
    }

    public static float U(k3m k3mVar, float f) {
        Float f2;
        return (k3mVar == null || (f2 = (Float) k3mVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // defpackage.ran
    public final ObjectAnimator R(ViewGroup viewGroup, View view, k3m k3mVar, k3m k3mVar2) {
        s73 s73Var = s9n.a;
        return T(view, U(k3mVar, 0.0f), 1.0f);
    }

    @Override // defpackage.ran
    public final ObjectAnimator S(ViewGroup viewGroup, View view, k3m k3mVar, k3m k3mVar2) {
        s73 s73Var = s9n.a;
        ObjectAnimator objectAnimatorT = T(view, U(k3mVar, 1.0f), 0.0f);
        if (objectAnimatorT == null) {
            view.setTransitionAlpha(U(k3mVar2, 1.0f));
        }
        return objectAnimatorT;
    }

    public final ObjectAnimator T(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        s73 s73Var = s9n.a;
        view.setTransitionAlpha(f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) s9n.a, f2);
        ao8 ao8Var = new ao8(view);
        objectAnimatorOfFloat.addListener(ao8Var);
        r().b(ao8Var);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.y2m
    public final void j(k3m k3mVar) {
        ran.P(k3mVar);
        View view = k3mVar.b;
        Float fValueOf = (Float) view.getTag(2131364838);
        if (fValueOf == null) {
            if (view.getVisibility() == 0) {
                s73 s73Var = s9n.a;
                fValueOf = Float.valueOf(view.getTransitionAlpha());
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        k3mVar.a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // defpackage.y2m
    public final boolean w() {
        return true;
    }
}
