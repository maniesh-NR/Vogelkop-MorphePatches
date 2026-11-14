package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.android.ui.catalog.widget.OperaProgressIndicator;
import com.opera.android.view.TouchIgnoringViewPager;
import java.util.List;

/* loaded from: classes.dex */
public abstract class y9k extends Fragment implements eak {
    public final pde a = new pde(null);
    public FrameLayout b;
    public r9i c;
    public ghf d;
    public x9k e;
    public wzg f;
    public List g;

    @Override // defpackage.eak
    public final ikc T() {
        return this.a;
    }

    public abstract void f0();

    public abstract List g0(Context context);

    public abstract int h0();

    public final void i0() {
        r9i r9iVar;
        r9i r9iVar2 = this.c;
        final byte b = 0;
        int iQ = r9iVar2 == null ? 0 : ((TouchIgnoringViewPager) r9iVar2.e).q();
        this.b.removeAllViews();
        FrameLayout frameLayout = this.b;
        int i = 2131365011;
        if (j0()) {
            ConstraintLayout constraintLayoutInflate = LayoutInflater.from(frameLayout.getContext()).inflate(2131559374, (ViewGroup) frameLayout, false);
            frameLayout.addView(constraintLayoutInflate);
            OperaMaterialButton operaMaterialButton = (OperaMaterialButton) w1h.j(2131363948, constraintLayoutInflate);
            if (operaMaterialButton != null) {
                OperaMaterialButton operaMaterialButton2 = (OperaMaterialButton) w1h.j(2131364482, constraintLayoutInflate);
                if (operaMaterialButton2 != null) {
                    OperaProgressIndicator operaProgressIndicator = (OperaProgressIndicator) w1h.j(2131365010, constraintLayoutInflate);
                    if (operaProgressIndicator != null) {
                        TouchIgnoringViewPager touchIgnoringViewPager = (TouchIgnoringViewPager) w1h.j(2131365011, constraintLayoutInflate);
                        if (touchIgnoringViewPager != null) {
                            r9iVar = new r9i(constraintLayoutInflate, operaMaterialButton, operaMaterialButton2, operaProgressIndicator, touchIgnoringViewPager);
                        }
                    } else {
                        i = 2131365010;
                    }
                } else {
                    i = 2131364482;
                }
            } else {
                i = 2131363948;
            }
            t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
            return;
        }
        ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(frameLayout.getContext()).inflate(2131559373, (ViewGroup) frameLayout, false);
        frameLayout.addView(constraintLayoutInflate2);
        OperaMaterialButton operaMaterialButton3 = (OperaMaterialButton) w1h.j(2131363948, constraintLayoutInflate2);
        if (operaMaterialButton3 != null) {
            OperaMaterialButton operaMaterialButton4 = (OperaMaterialButton) w1h.j(2131364482, constraintLayoutInflate2);
            if (operaMaterialButton4 != null) {
                OperaProgressIndicator operaProgressIndicator2 = (OperaProgressIndicator) w1h.j(2131365010, constraintLayoutInflate2);
                if (operaProgressIndicator2 != null) {
                    TouchIgnoringViewPager touchIgnoringViewPager2 = (TouchIgnoringViewPager) w1h.j(2131365011, constraintLayoutInflate2);
                    if (touchIgnoringViewPager2 != null) {
                        r9iVar = new r9i(constraintLayoutInflate2, operaMaterialButton3, operaMaterialButton4, operaProgressIndicator2, touchIgnoringViewPager2);
                    }
                } else {
                    i = 2131365010;
                }
            } else {
                i = 2131364482;
            }
        } else {
            i = 2131363948;
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i)));
        return;
        this.c = r9iVar;
        x9k x9kVar = new x9k(this.g, j0());
        this.e = x9kVar;
        ((TouchIgnoringViewPager) this.c.e).setAdapter(x9kVar);
        Object obj = this.c.d;
        boolean zM0 = m0();
        r9i r9iVar3 = this.c;
        if (zM0) {
            new ro9((OperaProgressIndicator) r9iVar3.d, (TouchIgnoringViewPager) r9iVar3.e, Integer.valueOf(h0()));
        } else {
            ((OperaProgressIndicator) r9iVar3.d).setVisibility(4);
        }
        wzg wzgVar = this.f;
        if (wzgVar != null) {
            ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) wzgVar.c;
            wzgVar.c = null;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
        }
        MaterialButton materialButton = (OperaMaterialButton) this.c.b;
        this.f = new wzg((TextView) materialButton);
        materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: v9k
            public final /* synthetic */ y9k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                y9k y9kVar = this.b;
                switch (b2) {
                    case 0:
                        y9kVar.k0(true);
                        break;
                    default:
                        y9kVar.k0(false);
                        break;
                }
            }
        });
        final byte b2 = 1;
        ((OperaMaterialButton) this.c.c).setOnClickListener(new View.OnClickListener(this) { // from class: v9k
            public final /* synthetic */ y9k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                y9k y9kVar = this.b;
                switch (b22) {
                    case 0:
                        y9kVar.k0(true);
                        break;
                    default:
                        y9kVar.k0(false);
                        break;
                }
            }
        });
        n0((z65) this.e.a.get(iQ), false);
        this.d = new ghf((TouchIgnoringViewPager) this.c.e, ye1.a);
        int iR = ((TouchIgnoringViewPager) this.c.e).r(iQ);
        ((TouchIgnoringViewPager) this.c.e).setCurrentItem(iR);
        z65 z65Var = (z65) this.g.get(iR);
        this.a.r(z65Var.f);
        pn pnVar = z65Var.g;
        if (pnVar != null) {
            pnVar.run();
        }
        TouchIgnoringViewPager touchIgnoringViewPager3 = (TouchIgnoringViewPager) this.c.e;
        touchIgnoringViewPager3.addOnPageChangeListener(new r2c(touchIgnoringViewPager3, new r93(this, (byte) 3)));
    }

    public boolean j0() {
        return getResources().getConfiguration().orientation == 1;
    }

    public final void k0(boolean z) {
        if (((ViewPropertyAnimator) this.f.c) == null) {
            z65 z65Var = (z65) this.e.a.get(((TouchIgnoringViewPager) this.c.e).q());
            boolean z2 = z65Var.h;
            Runnable runnable = z65Var.c;
            if (z2) {
                ks3.B("User stuck on onboarding", "Page step=" + ((int) z65Var.f.a) + " done but user still stuck in it.");
                if (z) {
                    return;
                }
                runnable.run();
                l0(z65Var, true);
                return;
            }
            if (!z) {
                runnable.run();
                l0(z65Var, true);
            } else if (z65Var.i) {
                l0(z65Var, false);
            } else {
                z65Var.b.run(new w9k(this, z65Var));
            }
        }
    }

    public final void l0(z65 z65Var, boolean z) {
        if (!z) {
            z65Var.i = true;
        }
        r9i r9iVar = this.c;
        if (r9iVar != null) {
            int iQ = ((TouchIgnoringViewPager) r9iVar.e).q();
            int size = this.e.a.size() - 1;
            r9i r9iVar2 = this.c;
            if (iQ >= size) {
                ((OperaMaterialButton) r9iVar2.c).R(z);
                ((OperaMaterialButton) this.c.c).setVisibility(z ? 0 : 8);
                boolean z2 = !z;
                ((OperaMaterialButton) this.c.b).R(z2);
                ((OperaMaterialButton) this.c.b).setEnabled(z2);
                f0();
            } else {
                int iQ2 = ((TouchIgnoringViewPager) r9iVar2.e).q();
                if (!this.d.G()) {
                    return;
                } else {
                    n0((z65) this.e.a.get(iQ2 + 1), true);
                }
            }
            z65Var.h = true;
        }
    }

    public abstract boolean m0();

    public final void n0(z65 z65Var, boolean z) {
        wzg wzgVar = this.f;
        if (wzgVar != null) {
            TextView textView = (TextView) wzgVar.b;
            if (this.c != null) {
                if (z) {
                    jri jriVar = new jri(wzgVar, z65Var.a, (byte) 15);
                    if (((ViewPropertyAnimator) wzgVar.c) == null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = textView.animate();
                        wzgVar.c = viewPropertyAnimatorAnimate;
                        viewPropertyAnimatorAnimate.setDuration(350L).withEndAction(new jri(wzgVar, jriVar, (byte) 16)).alpha(0.0f).start();
                    }
                } else {
                    String str = z65Var.a;
                    ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) wzgVar.c;
                    wzgVar.c = null;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    textView.setText(str);
                }
                ((OperaMaterialButton) this.c.c).setVisibility(z65Var.e ? 0 : 8);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i0();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        List listG0 = g0(requireContext());
        this.g = listG0;
        if (listG0.isEmpty()) {
            f0();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b = new FrameLayout(layoutInflater.getContext());
        i0();
        return this.b;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.c = null;
    }

    public final void onStop() {
        yqd yqdVar = ((z65) this.e.a.get(((TouchIgnoringViewPager) this.c.e).q())).d;
        if (yqdVar != null) {
            yqdVar.run();
        }
        super.onStop();
    }
}
