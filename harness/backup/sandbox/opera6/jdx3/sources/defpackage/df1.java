package defpackage;

import android.animation.Animator;
import android.graphics.RectF;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.search.behavior.ScrollableToolbarBehavior;
import java.util.Objects;

/* loaded from: classes.dex */
public final class df1 implements Animator.AnimatorListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public df1(OmniButtonView omniButtonView) {
        this.a = (byte) 3;
        Objects.requireNonNull(omniButtonView);
        this.b = omniButtonView;
    }

    public /* synthetic */ df1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    private final void v(Animator animator) {
    }

    private final void w(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((c9l) this.b).invoke();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                ql2 ql2Var = (ql2) obj;
                ql2Var.e = null;
                ql2Var.a.y(false);
                break;
            case 2:
                ydb ydbVar = (ydb) obj;
                RectF rectFC = ydbVar.c(ydbVar.b);
                float f = rectFC.left;
                if (f != 0.0f || rectFC.top != 0.0f) {
                    ydbVar.k(f, rectFC.top);
                    break;
                }
                break;
            case 3:
                OmniButtonView omniButtonView = (OmniButtonView) obj;
                bp bpVar = omniButtonView.e;
                bp bpVar2 = omniButtonView.f;
                if (bpVar2 != null) {
                    omniButtonView.d(bpVar2);
                }
                bp bpVar3 = omniButtonView.j;
                if (bpVar3 != null) {
                    bpVar3.U(false);
                }
                if (bpVar != null) {
                    bp bpVar4 = omniButtonView.g;
                    if (bpVar4 == null || ((uaf) bpVar.b).a != ((uaf) bpVar4.b).a) {
                        omniButtonView.f(bpVar, true);
                        break;
                    }
                }
                break;
            case 4:
                ((ScrollableToolbarBehavior) obj).e = null;
                break;
            case 5:
                ((fwk) obj).setDrawable(0, new ewk());
                break;
            case 6:
                ((uvl) obj).q = null;
                break;
            default:
                ((tqo) obj).g = null;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 3:
                ((OmniButtonView) this.b).setVisibility(0);
                break;
        }
    }
}
