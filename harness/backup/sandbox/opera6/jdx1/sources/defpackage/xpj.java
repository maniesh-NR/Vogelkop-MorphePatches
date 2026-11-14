package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public final class xpj extends ran {
    public static final DecelerateInterpolator I = new DecelerateInterpolator();
    public static final AccelerateInterpolator J = new AccelerateInterpolator();
    public static final vpj K = new vpj();
    public wpj H;

    @Override // defpackage.ran
    public final ObjectAnimator R(ViewGroup viewGroup, View view, k3m k3mVar, k3m k3mVar2) {
        if (k3mVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) k3mVar2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return dbh.o(view, k3mVar2, iArr[0], iArr[1], this.H.b(viewGroup, view), this.H.a(viewGroup, view), translationX, translationY, I, this);
    }

    @Override // defpackage.ran
    public final ObjectAnimator S(ViewGroup viewGroup, View view, k3m k3mVar, k3m k3mVar2) {
        if (k3mVar == null) {
            return null;
        }
        int[] iArr = (int[]) k3mVar.a.get("android:slide:screenPosition");
        return dbh.o(view, k3mVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.H.b(viewGroup, view), this.H.a(viewGroup, view), J, this);
    }

    @Override // defpackage.ran, defpackage.y2m
    public final void f(k3m k3mVar) {
        ran.P(k3mVar);
        int[] iArr = new int[2];
        k3mVar.b.getLocationOnScreen(iArr);
        k3mVar.a.put("android:slide:screenPosition", iArr);
    }

    @Override // defpackage.y2m
    public final void j(k3m k3mVar) {
        ran.P(k3mVar);
        int[] iArr = new int[2];
        k3mVar.b.getLocationOnScreen(iArr);
        k3mVar.a.put("android:slide:screenPosition", iArr);
    }

    @Override // defpackage.y2m
    public final boolean w() {
        return true;
    }
}
