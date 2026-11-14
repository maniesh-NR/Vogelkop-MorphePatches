package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.TextSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.opera.android.widget.ThemeableLottieAnimationView;

/* loaded from: classes.dex */
public final class g49 extends Fragment {
    public static final long f;
    public static final long g;
    public static final long h;
    public final umi a;
    public final m9k b;
    public final ucc c;
    public b7k d;
    public oml e;

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.e;
        f = cs5.x0(15, un7Var);
        g = cs5.x0(5, un7Var);
        h = cs5.x0(500, un7.d);
    }

    public g49(umi umiVar, m9k m9kVar, orm ormVar) {
        this.a = umiVar;
        this.b = m9kVar;
        this.c = new ucc(new s2(2, ormVar, orm.class, "logDependenciesLoadingScreenDuration", "logDependenciesLoadingScreenDuration(Lcom/opera/android/analytics/AggroLoadingScreenExitReason;J)V", 0, (byte) 8));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m9k m9kVar = this.b;
        if (!((Boolean) m9kVar.e.g()).booleanValue()) {
            oml omlVar = m9kVar.h;
            if (omlVar != null) {
                omlVar.cancel(false);
            }
            m9kVar.h = null;
            oml omlVar2 = new oml(m9kVar.a.d(new mni(m9kVar, (byte) 24)));
            coh.k(omlVar2, (Object) null, f);
            m9kVar.h = omlVar2;
        }
        getLifecycle().a(this.c);
        m9kVar.e.j(this, new hze(m9kVar, new f49(this, (byte) 1), (byte) 6));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131559365, viewGroup, false);
        int i = 2131362034;
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) w1h.j(2131362034, constraintLayoutInflate);
        if (themeableLottieAnimationView != null) {
            i = 2131364730;
            TextSwitcher textSwitcher = (TextSwitcher) w1h.j(2131364730, constraintLayoutInflate);
            if (textSwitcher != null) {
                b7k b7kVar = new b7k(constraintLayoutInflate, themeableLottieAnimationView, textSwitcher);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                long j = h;
                alphaAnimation.setStartOffset(pn7.f(j));
                alphaAnimation.setDuration(pn7.f(j));
                textSwitcher.setInAnimation(alphaAnimation);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setDuration(pn7.f(j));
                textSwitcher.setOutAnimation(alphaAnimation2);
                themeableLottieAnimationView.z(new i3d("ThemeColor", 2130969303), new i3d("SurfaceColor", 2130969329));
                themeableLottieAnimationView.h();
                this.d = b7kVar;
                if (this.e == null) {
                    oml omlVar = new oml(this.a.d(new f49(this, (byte) 0)));
                    coh.k(omlVar, (Object) null, g);
                    this.e = omlVar;
                }
                b7k b7kVar2 = this.d;
                if (b7kVar2 != null) {
                    return b7kVar2.b;
                }
                return null;
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        oml omlVar = this.e;
        if (omlVar != null) {
            omlVar.cancel(false);
        }
        this.e = null;
        this.d = null;
    }
}
