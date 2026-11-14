package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class al9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ al9(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ al9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public al9(nrl nrlVar, View view, ld9 ld9Var) {
        this.a = (byte) 0;
        this.b = view;
        this.c = ld9Var;
        Objects.requireNonNull(nrlVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                ((o8n) this.c).d();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((View) obj).post((ld9) obj2);
                break;
            case 1:
                View view = (View) obj;
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj2;
                hideBottomViewOnScrollBehavior.k = null;
                if (hideBottomViewOnScrollBehavior.j == 1 && view.getVisibility() == 0) {
                    view.setVisibility(4);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj2;
                hideViewOnScrollBehavior.k = null;
                if (hideViewOnScrollBehavior.j == 1 && view2.getVisibility() == 0) {
                    view2.setVisibility(4);
                    break;
                }
                break;
            case 3:
                if (((n2d) ((ThemeableLottieAnimationView) ((or2) obj).f)).d.b.b() > 0.0f) {
                    xf8.F0(((o9k) obj2).f, Boolean.TRUE);
                    break;
                }
                break;
            case 4:
                ((ArrayMap) obj).remove(animator);
                ((y2m) obj2).n.remove(animator);
                break;
            case 5:
                ((o8n) obj2).g();
                break;
            case 6:
                n2o n2oVar = (n2o) obj2;
                n2oVar.a.e(1.0f);
                j2o.f((View) obj, n2oVar);
                break;
            default:
                ((a3p) obj).setVisibility(8);
                ((qqo) obj2).invoke();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 4:
                ((y2m) obj).n.add(animator);
                break;
            case 5:
                ((o8n) obj).f();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
