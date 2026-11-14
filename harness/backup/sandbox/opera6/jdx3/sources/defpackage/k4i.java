package defpackage;

import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.TopPaddingFadingScrollView;
import com.opera.android.utilities.DisplayUtil;

/* loaded from: classes.dex */
public final class k4i extends ltl {
    public final ua7 r;
    public final zyk s;
    public kf t;
    public i4i u;
    public boolean v;
    public boolean w;

    /* JADX WARN: Illegal instructions before constructor call */
    public k4i(gjm gjmVar) {
        itl itlVar = (itl) u7k.j(2131558884).a;
        itlVar.e = true;
        super(itlVar);
        this.r = new ua7((Fragment) this, gjmVar);
        this.s = z4c.b(new yse(this, (byte) 10));
    }

    public final void G0(LayoutInflater layoutInflater, i4i i4iVar) {
        j4i j4iVar;
        this.u = i4iVar;
        kf kfVar = this.t;
        if (kfVar == null) {
            kfVar = null;
        }
        FrameLayout frameLayout = (FrameLayout) kfVar.c;
        boolean z = i4iVar.a;
        boolean z2 = i4iVar.b;
        int i = 2131364998;
        int i2 = 2131362414;
        if (!z) {
            if (!z2) {
                ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131558897, (ViewGroup) frameLayout, false);
                frameLayout.addView(constraintLayoutInflate);
                View viewJ = w1h.j(2131362414, constraintLayoutInflate);
                if (viewJ != null) {
                    om9.a(viewJ);
                    if (((ImageView) w1h.j(2131363183, constraintLayoutInflate)) != null) {
                        MaterialButton materialButtonJ = w1h.j(2131363948, constraintLayoutInflate);
                        if (materialButtonJ == null) {
                            i2 = 2131363948;
                        } else if (((TopPaddingFadingScrollView) w1h.j(2131364140, constraintLayoutInflate)) != null) {
                            j4iVar = new j4i(materialButtonJ);
                        } else {
                            i2 = 2131364140;
                        }
                    } else {
                        i2 = 2131363183;
                    }
                }
                t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
                return;
            }
            ConstraintLayout constraintLayoutInflate2 = layoutInflater.inflate(2131558896, (ViewGroup) frameLayout, false);
            frameLayout.addView(constraintLayoutInflate2);
            View viewJ2 = w1h.j(2131362414, constraintLayoutInflate2);
            if (viewJ2 != null) {
                om9.a(viewJ2);
                if (((ImageView) w1h.j(2131363183, constraintLayoutInflate2)) != null) {
                    MaterialButton materialButtonJ2 = w1h.j(2131363948, constraintLayoutInflate2);
                    if (materialButtonJ2 == null) {
                        i = 2131363948;
                    } else if (((TopPaddingFadingScrollView) w1h.j(2131364140, constraintLayoutInflate2)) == null) {
                        i = 2131364140;
                    } else if (w1h.j(2131364998, constraintLayoutInflate2) != null) {
                        j4iVar = new j4i(materialButtonJ2);
                    }
                } else {
                    i = 2131363183;
                }
            } else {
                i = 2131362414;
            }
            t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i)));
            return;
        }
        if (z2) {
            ConstraintLayout constraintLayoutInflate3 = layoutInflater.inflate(2131558898, (ViewGroup) frameLayout, false);
            frameLayout.addView(constraintLayoutInflate3);
            View viewJ3 = w1h.j(2131362414, constraintLayoutInflate3);
            if (viewJ3 != null) {
                om9.a(viewJ3);
                if (((ImageView) w1h.j(2131363183, constraintLayoutInflate3)) != null) {
                    MaterialButton materialButtonJ3 = w1h.j(2131363948, constraintLayoutInflate3);
                    if (materialButtonJ3 == null) {
                        i = 2131363948;
                    } else if (((TopPaddingFadingScrollView) w1h.j(2131364140, constraintLayoutInflate3)) == null) {
                        i = 2131364140;
                    } else if (w1h.j(2131364998, constraintLayoutInflate3) != null) {
                        j4iVar = new j4i(materialButtonJ3);
                    }
                } else {
                    i = 2131363183;
                }
            } else {
                i = 2131362414;
            }
            t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate3.getResources().getResourceName(i)));
            return;
        }
        ConstraintLayout constraintLayoutInflate4 = layoutInflater.inflate(2131558899, (ViewGroup) frameLayout, false);
        frameLayout.addView(constraintLayoutInflate4);
        View viewJ4 = w1h.j(2131362414, constraintLayoutInflate4);
        if (viewJ4 != null) {
            om9.a(viewJ4);
            if (((ImageView) w1h.j(2131363183, constraintLayoutInflate4)) != null) {
                i2 = 2131363184;
                if (w1h.j(2131363184, constraintLayoutInflate4) != null) {
                    MaterialButton materialButtonJ4 = w1h.j(2131363948, constraintLayoutInflate4);
                    if (materialButtonJ4 == null) {
                        i2 = 2131363948;
                    } else if (((TopPaddingFadingScrollView) w1h.j(2131364140, constraintLayoutInflate4)) != null) {
                        j4iVar = new j4i(materialButtonJ4);
                    } else {
                        i2 = 2131364140;
                    }
                }
            } else {
                i2 = 2131363183;
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate4.getResources().getResourceName(i2)));
        return;
        j4iVar.a.setOnClickListener(new h4i(this, (byte) 0));
    }

    public final i4i H0(Configuration configuration) {
        boolean z = configuration.orientation == 2;
        return (DisplayUtil.e(requireContext()) || i0l.g()) ? z ? i4i.TABLET_LANDSCAPE : i4i.TABLET_PORTRAIT : z ? i4i.PHONE_LANDSCAPE : i4i.PHONE_PORTRAIT;
    }

    @Override // defpackage.ltl
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i4i i4iVarH0 = H0(configuration);
        if (i4iVarH0 != this.u) {
            kf kfVar = this.t;
            if (kfVar == null) {
                kfVar = null;
            }
            ((FrameLayout) kfVar.c).removeAllViews();
            kf kfVar2 = this.t;
            G0(LayoutInflater.from(((FrameLayout) (kfVar2 != null ? kfVar2 : null).c).getContext()), i4iVarH0);
        }
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        yo0 yo0Var;
        l4i l4iVar = (l4i) this.s.getValue();
        o3i o3iVar = ((g4i) this.r.p()).a;
        boolean z = this.w;
        l4iVar.getClass();
        vb0 vb0Var = z ? vb0.b : vb0.c;
        int iOrdinal = o3iVar.ordinal();
        if (iOrdinal == 0) {
            yo0Var = yo0.b;
        } else if (iOrdinal == 1) {
            yo0Var = yo0.c;
        } else if (iOrdinal == 2) {
            yo0Var = yo0.d;
        } else if (iOrdinal == 3) {
            yo0Var = yo0.e;
        } else {
            if (iOrdinal != 4) {
                h9o.p();
                return;
            }
            yo0Var = yo0.f;
        }
        x5f x5fVar = (x5f) l4iVar.b;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF).d().b(new jkc(yo0Var, vb0Var, (byte) 24));
            x5fVar.U0(x56VarF);
        }
        super.onDestroy();
    }

    public final void onStart() {
        super.onStart();
        if (this.v) {
            return;
        }
        this.v = true;
        cqp.r0(this.r, new m4i(0));
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        this.t = kf.e(statusBarDrawingFrameLayout.findViewById(2131362473));
        G0(layoutInflater, H0(getResources().getConfiguration()));
    }
}
