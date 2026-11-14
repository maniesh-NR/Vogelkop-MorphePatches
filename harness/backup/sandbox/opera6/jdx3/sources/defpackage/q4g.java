package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.r;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class q4g extends h53 implements View.OnClickListener, h4g {
    public final yu2 A;
    public final w4g B;
    public p4g C;
    public o4g D;
    public int E;
    public Drawable F;
    public final z77 G;
    public final i4d t;
    public final a4g u;
    public final w3g v;
    public final int w;
    public final int x;
    public final boolean y;
    public final yt7 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public q4g(a4g a4gVar, w3g w3gVar, boolean z, int i, p4g p4gVar, int i2, int i3, yu2 yu2Var, w4g w4gVar, z77 z77Var) {
        u7k u7kVarF = u7k.f(2);
        u7kVarF.s(i);
        super((itl) u7kVarF.a, true);
        this.t = new i4d((Object) this, (byte) 14);
        this.u = a4gVar;
        this.v = w3gVar;
        this.y = z;
        this.C = p4gVar;
        this.w = i2;
        this.x = i3;
        this.z = new yt7((byte) 6);
        this.A = yu2Var;
        this.B = w4gVar;
        this.G = z77Var;
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return this.z;
    }

    public final boolean H0() {
        return (((StylingTextView) this.D.f).getInputType() & 144) == 144;
    }

    @Override // defpackage.h4g
    public final boolean P(int i, String str) {
        w3g w3gVar = this.v;
        return i == w3gVar.a && str.equals(w3gVar.b.a);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r activity;
        String strC;
        or2 or2Var = (or2) this.D.l;
        boolean z = false;
        if (view == ((StylingImageButton) or2Var.d)) {
            CharSequence text = ((StylingTextView) or2Var.b).getText();
            if (text != null) {
                lcp.F(requireContext(), text.toString(), false);
                return;
            }
            return;
        }
        int id = view.getId();
        a4g a4gVar = this.u;
        w3g w3gVar = this.v;
        if (id == 2131363858) {
            if (sj2.g(requireContext())) {
                Context contextRequireContext = requireContext();
                if (wi2.i.e == 1 && sj2.g(contextRequireContext) && (strC = a4gVar.c(w3gVar)) != null) {
                    lcp.F(requireContext(), strC.toString(), true);
                    return;
                }
                return;
            }
            return;
        }
        if (view.getId() == 2131364437) {
            if (H0()) {
                ((StylingImageButton) this.D.j).setImageResource(2131232293);
                c5g.a((StylingTextView) this.D.f, false);
                ((StylingTextView) this.D.f).setText("fakepass");
                return;
            } else {
                if (sj2.g(requireContext())) {
                    Context contextRequireContext2 = requireContext();
                    if (wi2.i.e == 1 && sj2.g(contextRequireContext2) && sj2.g(requireContext())) {
                        ((StylingTextView) this.D.f).setText(a4gVar.c(w3gVar));
                        ((StylingImageButton) this.D.j).setImageResource(2131232292);
                        c5g.a((StylingTextView) this.D.f, true);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (view.getId() != 2131362655) {
            if (view.getId() != 2131362508 || (activity = getActivity()) == null) {
                return;
            }
            hy4 hy4Var = new hy4(getString(this.w, new Object[]{w3gVar.c}), getString(this.x), new kqd((Object) this, (byte) 29));
            z77 z77Var = (z77) activity.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
            z77Var.getClass();
            z77Var.b(hy4Var, ijm.b);
            return;
        }
        aw7 aw7Var = new aw7(H0(), this.A);
        aw7Var.y = this.t;
        Context context = aw7Var.getContext();
        if (context != null) {
            if (wi2.i.e == 1 && sj2.g(context)) {
                z = true;
            }
            aw7Var.I0(z);
        }
        zhj.a(aw7Var, 4099).c(requireContext());
    }

    @Override // defpackage.h53, defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131167472);
        this.E = dimensionPixelSize;
        new i4g(this.B, this.v, dimensionPixelSize, this);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.D = null;
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (sj2.g(requireContext())) {
            ((StylingImageButton) this.D.j).setOnClickListener(this);
            this.D.e.setOnClickListener(this);
            ((StylingImageButton) this.D.i).setOnClickListener(this);
        } else {
            View.OnClickListener zvdVar = new zvd(this, (byte) 11);
            ((StylingImageButton) this.D.j).setOnClickListener(zvdVar);
            this.D.e.setOnClickListener(zvdVar);
            ((StylingImageButton) this.D.i).setOnClickListener(zvdVar);
        }
        ((StylingImageButton) ((or2) this.D.l).d).setVisibility(0);
        ((StylingImageButton) ((or2) this.D.l).d).setOnClickListener(this);
        this.D.d.setOnClickListener(this);
        wi2.i.d.j(getViewLifecycleOwner(), new d8d(this, (byte) 20));
        o4g o4gVar = this.D;
        if (o4gVar != null) {
            ((StylingTextView) o4gVar.h).setVisibility(0);
            ((or2) this.D.k).c.setVisibility(0);
            boolean z = this.y;
            int i = z ? 8 : 0;
            ((or2) this.D.l).c.setVisibility(i);
            ((StylingTextView) this.D.f).setVisibility(i);
            ((StylingTextView) this.D.g).setVisibility(i);
            int i2 = z ? 8 : 0;
            ((StylingImageButton) this.D.j).setVisibility(i2);
            ((StylingImageButton) this.D.i).setVisibility(i2);
            this.D.e.setVisibility(i2);
            this.D.d.setText(z ? 2132020895 : 2132018535);
            yq1 yq1Var = (StylingTextView) this.D.h;
            w3g w3gVar = this.v;
            yq1Var.setText(w3gVar.c);
            ((StylingTextView) ((or2) this.D.k).b).setText(cqp.W(w3gVar));
            if (!z) {
                ((StylingTextView) ((or2) this.D.l).b).setText(w3gVar.f);
                ((StylingTextView) this.D.f).setText("fakepass");
            }
            if (i == 0) {
                ((StylingImageButton) ((or2) this.D.l).d).setEnabled(!((StylingTextView) r4.b).getText().toString().isEmpty());
            }
            Drawable drawable = this.F;
            if (drawable != null) {
                ((StylingImageView) this.D.c).setImageDrawable(drawable);
            }
        }
    }

    @Override // defpackage.h4g
    public final void s() {
        Context context = getContext();
        if (context != null) {
            String str = this.v.c;
            int i = this.E;
            int i2 = vmj.g;
            vmj vmjVarM = tmj.m(context, str, i, i, null, 48);
            this.F = vmjVarM;
            o4g o4gVar = this.D;
            if (o4gVar != null) {
                ((StylingImageView) o4gVar.c).setImageDrawable(vmjVarM);
            }
        }
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.v0(layoutInflater, viewGroup);
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131559206, viewGroup, false);
        viewGroup.addView(constraintLayoutInflate);
        int i = 2131362508;
        MaterialButton materialButtonJ = w1h.j(2131362508, constraintLayoutInflate);
        if (materialButtonJ != null) {
            i = 2131362655;
            MaterialButton materialButtonJ2 = w1h.j(2131362655, constraintLayoutInflate);
            if (materialButtonJ2 != null) {
                i = 2131362594;
                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362594, constraintLayoutInflate);
                if (stylingImageView != null) {
                    i = 2131363856;
                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363856, constraintLayoutInflate);
                    if (stylingTextView != null) {
                        i = 2131363858;
                        StylingImageButton stylingImageButton = (StylingImageButton) w1h.j(2131363858, constraintLayoutInflate);
                        if (stylingImageButton != null) {
                            i = 2131363860;
                            StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363860, constraintLayoutInflate);
                            if (stylingTextView2 != null) {
                                i = 2131364437;
                                StylingImageButton stylingImageButton2 = (StylingImageButton) w1h.j(2131364437, constraintLayoutInflate);
                                if (stylingImageButton2 != null) {
                                    i = 2131364458;
                                    View viewJ = w1h.j(2131364458, constraintLayoutInflate);
                                    if (viewJ != null) {
                                        or2 or2VarA = or2.a(viewJ);
                                        i = 2131363525;
                                        StylingTextView stylingTextView3 = (StylingTextView) w1h.j(2131363525, constraintLayoutInflate);
                                        if (stylingTextView3 != null) {
                                            i = 2131364500;
                                            View viewJ2 = w1h.j(2131364500, constraintLayoutInflate);
                                            if (viewJ2 != null) {
                                                this.D = new o4g(constraintLayoutInflate, materialButtonJ, materialButtonJ2, stylingImageView, stylingTextView, stylingImageButton, stylingTextView2, stylingImageButton2, or2VarA, stylingTextView3, or2.a(viewJ2));
                                                this.A.getClass();
                                                boolean z = Build.VERSION.SDK_INT >= 30;
                                                o4g o4gVar = this.D;
                                                if (z) {
                                                    ((StylingTextView) ((or2) o4gVar.k).f).setText(2132018743);
                                                } else {
                                                    ((StylingTextView) ((or2) o4gVar.k).f).setText(2132018745);
                                                }
                                                ((StylingTextView) ((or2) this.D.l).f).setText(2132018747);
                                                return;
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
    }

    @Override // defpackage.h4g
    public final void w(Bitmap bitmap) {
        Context context = getContext();
        if (context != null) {
            int i = this.E;
            PathInterpolator pathInterpolator = s8i.d;
            p8i p8iVar = new p8i(i, i / 2, context, bitmap);
            p8iVar.a(f03.t(2130969115, context, 2131101243));
            this.F = p8iVar;
            o4g o4gVar = this.D;
            if (o4gVar != null) {
                ((StylingImageView) o4gVar.c).setImageDrawable(p8iVar);
            }
        }
    }
}
