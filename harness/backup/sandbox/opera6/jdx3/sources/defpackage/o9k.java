package defpackage;

import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.opera.android.startup.ContentWrapperLayout;
import com.opera.android.startup.WelcomeActivity;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.android.ui.catalog.widget.OperaProgressIndicator;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o9k extends Fragment implements eak {
    public final ikc a;
    public final msl b;
    public final WelcomeActivity c;
    public final mcj d;
    public final pde e = new pde(kl0.j);
    public final pde f = new pde(Boolean.FALSE);
    public or2 g;
    public d0n h;
    public d0n i;
    public d0n j;
    public boolean k;
    public boolean l;
    public boolean m;

    public o9k(ikc ikcVar, msl mslVar, WelcomeActivity welcomeActivity, mcj mcjVar) {
        this.a = ikcVar;
        this.b = mslVar;
        this.c = welcomeActivity;
        this.d = mcjVar;
    }

    @Override // defpackage.eak
    public final ikc T() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.opera.android.widget.LottieAnimationView, com.opera.android.widget.ThemeableLottieAnimationView, n2d] */
    public final void f0(d0n d0nVar, boolean z) {
        d0nVar.h.q(getViewLifecycleOwner());
        d0nVar.g = false;
        ?? r1 = d0nVar.d;
        r1.setVisibility(8);
        nl2 nl2Var = d0nVar.i;
        f3d f3dVar = ((n2d) r1).d;
        f3dVar.b.removeUpdateListener(nl2Var);
        r1.q();
        f3dVar.p(0);
        r1.w();
        TextView textView = d0nVar.e;
        textView.clearAnimation();
        textView.setAlpha(0.0f);
        textView.setTranslationY(0.0f);
        textView.setText("");
        textView.setVisibility(4);
        if (!z) {
            d0nVar.a(0.0f);
            return;
        }
        or2 or2Var = this.g;
        if (or2Var == null) {
            or2Var = null;
        }
        or2Var.c.postOnAnimation(new jri(this, d0nVar, (byte) 13));
    }

    public final d0n g0() {
        d0n d0nVar = this.h;
        if (!(d0nVar == null ? null : d0nVar).g) {
            d0n d0nVar2 = this.i;
            if (!(d0nVar2 == null ? null : d0nVar2).g) {
                d0n d0nVar3 = this.j;
                if ((d0nVar3 == null ? null : d0nVar3).g && d0nVar3 != null) {
                    return d0nVar3;
                }
            } else if (d0nVar2 != null) {
                return d0nVar2;
            }
        } else if (d0nVar != null) {
            return d0nVar;
        }
        return null;
    }

    public final d0n h0(e0n e0nVar) {
        int iOrdinal = e0nVar.ordinal();
        if (iOrdinal == 0) {
            d0n d0nVar = this.h;
            if (d0nVar == null) {
                return null;
            }
            return d0nVar;
        }
        if (iOrdinal == 1) {
            d0n d0nVar2 = this.i;
            if (d0nVar2 == null) {
                return null;
            }
            return d0nVar2;
        }
        if (iOrdinal != 2) {
            h9o.p();
            return null;
        }
        d0n d0nVar3 = this.j;
        if (d0nVar3 == null) {
            return null;
        }
        return d0nVar3;
    }

    public final void i0() {
        if (this.l && Intrinsics.a(this.a.g(), s9k.a)) {
            or2 or2Var = this.g;
            if (or2Var == null) {
                or2Var = null;
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) or2Var.b;
            WeakHashMap weakHashMap = r5n.a;
            h5n.c(constraintLayout, (bcf) null);
            or2 or2Var2 = this.g;
            ((ConstraintLayout) (or2Var2 != null ? or2Var2 : null).b).setPadding(0, 0, 0, 0);
            this.b.b(true);
            this.c.X();
        }
    }

    public final void j0() {
        if (this.k) {
            or2 or2Var = this.g;
            if (or2Var == null) {
                or2Var = null;
            }
            if (((OperaMaterialButton) or2Var.e).getVisibility() != 0) {
                or2 or2Var2 = this.g;
                if (or2Var2 == null) {
                    or2Var2 = null;
                }
                ((OperaMaterialButton) or2Var2.e).forceLayout();
                or2 or2Var3 = this.g;
                if (or2Var3 == null) {
                    or2Var3 = null;
                }
                ((ContentWrapperLayout) or2Var3.d).forceLayout();
                or2 or2Var4 = this.g;
                ((OperaMaterialButton) (or2Var4 != null ? or2Var4 : null).e).postOnAnimationDelayed(new mni(this, (byte) 25), 440L);
            }
            k0(h0(e0n.a), 440L);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, com.opera.android.widget.LottieAnimationView, com.opera.android.widget.ThemeableLottieAnimationView, n2d] */
    public final void k0(d0n d0nVar, long j) {
        d0nVar.g = true;
        ?? r1 = d0nVar.d;
        r1.j(d0nVar.b);
        PointF pointF = k3d.a;
        r1.z(new i3d(2130969325, 1, "Neutral colors/surface", false), new i3d(2130969325, 2, "Stroke/Neutral colors/surface", false));
        ((n2d) r1).d.b.addUpdateListener(d0nVar.i);
        r1.setVisibility(0);
        if (d0nVar.g) {
            r1.h();
            TextView textView = d0nVar.e;
            textView.setText(d0nVar.c);
            textView.forceLayout();
            textView.postOnAnimationDelayed(new npl(d0nVar, textView, (byte) 17), j + 440);
        }
        d0nVar.h.j(getViewLifecycleOwner(), new q59(this, d0nVar, (byte) 3));
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaMaterialButton] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131559366, viewGroup, false);
        int i = 2131362423;
        ContentWrapperLayout contentWrapperLayout = (ContentWrapperLayout) w1h.j(2131362423, constraintLayoutInflate);
        if (contentWrapperLayout != null) {
            i = 2131362433;
            ?? r8 = (OperaMaterialButton) w1h.j(2131362433, constraintLayoutInflate);
            if (r8 != 0) {
                i = 2131362985;
                OperaProgressIndicator operaProgressIndicator = (OperaProgressIndicator) w1h.j(2131362985, constraintLayoutInflate);
                if (operaProgressIndicator != null) {
                    i = 2131363958;
                    if (w1h.j(2131363958, constraintLayoutInflate) != null) {
                        i = 2131364177;
                        OperaProgressIndicator operaProgressIndicator2 = (OperaProgressIndicator) w1h.j(2131364177, constraintLayoutInflate);
                        if (operaProgressIndicator2 != null) {
                            i = 2131364530;
                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) w1h.j(2131364530, constraintLayoutInflate);
                            if (themeableLottieAnimationView != null) {
                                i = 2131364741;
                                OperaProgressIndicator operaProgressIndicator3 = (OperaProgressIndicator) w1h.j(2131364741, constraintLayoutInflate);
                                if (operaProgressIndicator3 != null) {
                                    i = 2131364988;
                                    ConstraintLayout constraintLayoutJ = w1h.j(2131364988, constraintLayoutInflate);
                                    if (constraintLayoutJ != null) {
                                        i = 2131364989;
                                        ThemeableLottieAnimationView themeableLottieAnimationView2 = (ThemeableLottieAnimationView) w1h.j(2131364989, constraintLayoutInflate);
                                        if (themeableLottieAnimationView2 != null) {
                                            i = 2131364990;
                                            TextView textView = (TextView) w1h.j(2131364990, constraintLayoutInflate);
                                            if (textView != null) {
                                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                                or2 or2Var = new or2(constraintLayout, contentWrapperLayout, r8, operaProgressIndicator, operaProgressIndicator2, themeableLottieAnimationView, operaProgressIndicator3, constraintLayoutJ, themeableLottieAnimationView2, textView);
                                                a3j a3jVar = new a3j((byte) 13);
                                                WeakHashMap weakHashMap = r5n.a;
                                                h5n.c(constraintLayoutJ, a3jVar);
                                                mcj mcjVar = this.d;
                                                mcjVar.t(true);
                                                mcjVar.r(false);
                                                ((n2d) themeableLottieAnimationView).d.b.addListener(new al9((byte) 3, or2Var, this, false));
                                                this.f.j(getViewLifecycleOwner(), new t7d(new d7k((Object) this, (Object) or2Var, (byte) 3), (byte) 20));
                                                this.h = new d0n(e0n.a, 2131951684, "Browse with confidence", themeableLottieAnimationView2, textView, operaProgressIndicator);
                                                this.i = new d0n(e0n.b, 2131951685, "Block ads, boost speed!", themeableLottieAnimationView2, textView, operaProgressIndicator2);
                                                this.j = new d0n(e0n.c, 2131951686, "Chat with browser AI", themeableLottieAnimationView2, textView, operaProgressIndicator3);
                                                r8.setOnClickListener(new j5g(this, or2Var, (byte) 19));
                                                contentWrapperLayout.d = kl0.j;
                                                this.g = or2Var;
                                                this.a.j(getViewLifecycleOwner(), new t7d(new n6k((Object) this, (byte) 9), (byte) 20));
                                                if (!this.m) {
                                                    this.b.a();
                                                }
                                                this.c.Y();
                                                return constraintLayout;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void onPause() {
        super.onPause();
        this.k = false;
        or2 or2Var = this.g;
        if (or2Var == null) {
            or2Var = null;
        }
        if (((ThemeableLottieAnimationView) or2Var.f).getVisibility() == 0) {
            or2 or2Var2 = this.g;
            ((ThemeableLottieAnimationView) (or2Var2 != null ? or2Var2 : null).f).q();
        } else {
            d0n d0nVarG0 = g0();
            if (d0nVarG0 != null) {
                f0(d0nVarG0, false);
            }
            or2 or2Var3 = this.g;
            if (or2Var3 == null) {
                or2Var3 = null;
            }
            ((OperaMaterialButton) or2Var3.e).clearAnimation();
            or2 or2Var4 = this.g;
            ((ContentWrapperLayout) (or2Var4 != null ? or2Var4 : null).d).clearAnimation();
        }
        this.b.b(false);
    }

    public final void onResume() {
        super.onResume();
        this.k = true;
        or2 or2Var = this.g;
        if (or2Var == null) {
            or2Var = null;
        }
        if (((ThemeableLottieAnimationView) or2Var.f).getVisibility() == 0) {
            or2 or2Var2 = this.g;
            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) (or2Var2 != null ? or2Var2 : null).f;
            f3d f3dVar = ((n2d) themeableLottieAnimationView).d;
            themeableLottieAnimationView.q();
            if (f3dVar.b.b() > 0.0f) {
                themeableLottieAnimationView.o(1.0f, true);
                xf8.F0(this.f, Boolean.TRUE);
            } else {
                themeableLottieAnimationView.q();
                if (f3dVar.a == null) {
                    f3dVar.e.add(new c3d(f3dVar, 0, (byte) 0));
                } else {
                    f3dVar.b.l(0.0f, (int) r0.k);
                }
                themeableLottieAnimationView.h();
            }
        } else {
            j0();
        }
        if (this.m) {
            return;
        }
        this.b.a();
    }
}
