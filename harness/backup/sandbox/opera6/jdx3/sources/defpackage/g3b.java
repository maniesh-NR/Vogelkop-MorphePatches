package defpackage;

import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.OrientationFitConstraintLayout;
import com.opera.android.import_data.ImportChromePasswordsActivity;

/* loaded from: classes.dex */
public final class g3b extends lj {
    public final /* synthetic */ byte r = 1;
    public Object s;
    public final Object t;
    public Object u;

    public g3b(fdn fdnVar, tah tahVar) {
        super(0, 0);
        this.s = fdnVar;
        this.t = tahVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g3b(gjm gjmVar) {
        u7k u7kVarF = u7k.f(2);
        u7kVarF.s(2132021132);
        super((itl) u7kVarF.a);
        this.t = z4c.b(new t2(this, (byte) 26));
        this.u = new ua7((Fragment) this, gjmVar);
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        switch (this.r) {
            case 1:
                super.onViewCreated(view, bundle);
                fdn fdnVar = (fdn) this.s;
                this.l.D(fdnVar.c);
                AppCompatImageView appCompatImageView = ((owc) ((q5g) this.u).d).c;
                svk svkVar = new svk(this, (byte) 21);
                q9n.e(appCompatImageView, svkVar);
                svkVar.a(appCompatImageView);
                ((owc) ((q5g) this.u).d).e.setText(2132021551);
                ((owc) ((q5g) this.u).d).h.setText(2132022145);
                ((owc) ((q5g) this.u).d).g.setVisibility(8);
                ((owc) ((q5g) this.u).d).i.setVisibility(8);
                ((owc) ((q5g) this.u).d).b.setOnClickListener(new pkm(this, (byte) 8));
                FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) ((q5g) this.u).c;
                ev5 ev5Var = new ev5(fdnVar, (tah) this.t);
                view.getContext();
                fadingRecyclerView.C0(new LinearLayoutManager(1, false));
                fadingRecyclerView.y0(ev5Var);
                break;
            default:
                super.onViewCreated(view, bundle);
                break;
        }
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        final byte b = 0;
        switch (this.r) {
            case 0:
                ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131558936, viewGroup, false);
                viewGroup.addView(constraintLayoutInflate);
                int i = 2131362414;
                if (((LinearLayout) w1h.j(2131362414, constraintLayoutInflate)) != null) {
                    i = 2131363183;
                    if (((ImageView) w1h.j(2131363183, constraintLayoutInflate)) != null) {
                        i = 2131363191;
                        if (((OrientationFitConstraintLayout) w1h.j(2131363191, constraintLayoutInflate)) != null) {
                            i = 2131363193;
                            MaterialButton materialButtonJ = w1h.j(2131363193, constraintLayoutInflate);
                            if (materialButtonJ != null) {
                                i = 2131363194;
                                MaterialButton materialButtonJ2 = w1h.j(2131363194, constraintLayoutInflate);
                                if (materialButtonJ2 != null) {
                                    i = 2131363951;
                                    TextView textView = (TextView) w1h.j(2131363951, constraintLayoutInflate);
                                    if (textView != null) {
                                        this.s = new f2b(constraintLayoutInflate, materialButtonJ, materialButtonJ2, textView, (byte) 1);
                                        SpannableString spannableStringD = n1h.d(getString(2132020211), new owj[]{new owj("<ps>", "</ps>", new jng(2, requireContext(), new rl((byte) 4)))});
                                        f2b f2bVar = (f2b) this.s;
                                        if (f2bVar == null) {
                                            f2bVar = null;
                                        }
                                        phj.u0(f2bVar.e, spannableStringD);
                                        f2b f2bVar2 = (f2b) this.s;
                                        if (f2bVar2 == null) {
                                            f2bVar2 = null;
                                        }
                                        f2bVar2.c.setOnClickListener(new View.OnClickListener(this) { // from class: e3b
                                            public final /* synthetic */ g3b b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                byte b2 = b;
                                                byte b3 = 1;
                                                g3b g3bVar = this.b;
                                                switch (b2) {
                                                    case 0:
                                                        h3b h3bVar = (h3b) ((zyk) g3bVar.t).getValue();
                                                        f3b f3bVar = new f3b(g3bVar, b3);
                                                        ot2 ot2Var = h3bVar.b;
                                                        qj2 qj2Var = new qj2(f3bVar, (byte) 7);
                                                        ot2Var.getClass();
                                                        int i2 = ImportChromePasswordsActivity.b0;
                                                        k1g.f0(ot2Var.a, qj2Var, w2b.d);
                                                        ((x5f) h3bVar.e).l0(gm0.d);
                                                        break;
                                                    default:
                                                        h3b h3bVar2 = (h3b) ((zyk) g3bVar.t).getValue();
                                                        f3b f3bVar2 = new f3b(g3bVar, (byte) 0);
                                                        ot2 ot2Var2 = h3bVar2.b;
                                                        g2b g2bVar = new g2b(f3bVar2, h3bVar2, b3);
                                                        z77 z77Var = ((qim) ot2Var2.c.get()).c;
                                                        wen wenVar = new wen(new x2(ot2Var2, g2bVar, (byte) 25), (byte) 5);
                                                        z77Var.getClass();
                                                        z77Var.b(wenVar, ijm.b);
                                                        ((x5f) h3bVar2.e).l0(gm0.e);
                                                        break;
                                                }
                                            }
                                        });
                                        f2b f2bVar3 = (f2b) this.s;
                                        final byte b2 = 1;
                                        (f2bVar3 != null ? f2bVar3 : null).d.setOnClickListener(new View.OnClickListener(this) { // from class: e3b
                                            public final /* synthetic */ g3b b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                byte b22 = b2;
                                                byte b3 = 1;
                                                g3b g3bVar = this.b;
                                                switch (b22) {
                                                    case 0:
                                                        h3b h3bVar = (h3b) ((zyk) g3bVar.t).getValue();
                                                        f3b f3bVar = new f3b(g3bVar, b3);
                                                        ot2 ot2Var = h3bVar.b;
                                                        qj2 qj2Var = new qj2(f3bVar, (byte) 7);
                                                        ot2Var.getClass();
                                                        int i2 = ImportChromePasswordsActivity.b0;
                                                        k1g.f0(ot2Var.a, qj2Var, w2b.d);
                                                        ((x5f) h3bVar.e).l0(gm0.d);
                                                        break;
                                                    default:
                                                        h3b h3bVar2 = (h3b) ((zyk) g3bVar.t).getValue();
                                                        f3b f3bVar2 = new f3b(g3bVar, (byte) 0);
                                                        ot2 ot2Var2 = h3bVar2.b;
                                                        g2b g2bVar = new g2b(f3bVar2, h3bVar2, b3);
                                                        z77 z77Var = ((qim) ot2Var2.c.get()).c;
                                                        wen wenVar = new wen(new x2(ot2Var2, g2bVar, (byte) 25), (byte) 5);
                                                        z77Var.getClass();
                                                        z77Var.b(wenVar, ijm.b);
                                                        ((x5f) h3bVar2.e).l0(gm0.e);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                break;
            default:
                View viewInflate = layoutInflater.inflate(2131559504, viewGroup, false);
                viewGroup.addView(viewInflate);
                int i2 = 2131362333;
                FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) w1h.j(2131362333, viewInflate);
                if (fadingRecyclerView != null) {
                    i2 = 2131363776;
                    View viewJ = w1h.j(2131363776, viewInflate);
                    if (viewJ != null) {
                        this.u = new q5g((LinearLayout) viewInflate, fadingRecyclerView, owc.a(viewJ), (byte) 12);
                        break;
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                break;
        }
    }
}
