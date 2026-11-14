package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ujn extends dt1 implements d4a {
    public final n1 e;
    public final agm f;
    public final tjn g;
    public final aan h = new aan();

    public ujn(n1 n1Var, agm agmVar, SettingsManager settingsManager, tjn tjnVar) {
        this.e = n1Var;
        this.f = agmVar;
        this.g = tjnVar;
        I(ekb.class, new roj(this, settingsManager, (byte) 11), new bxl((byte) 26));
        I(bkb.class, new bxl((byte) 29), new sjn((byte) 0));
        final byte b = 2;
        I(jkb.class, new yjj(this) { // from class: rjn
            public final /* synthetic */ ujn b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup viewGroup) {
                byte b2 = b;
                int i = 2131362594;
                ujn ujnVar = this.b;
                switch (b2) {
                    case 0:
                        ConstraintLayout constraintLayoutN = j7c.n(viewGroup, 2131559553, viewGroup, false);
                        if (((StylingImageView) w1h.j(2131362594, constraintLayoutN)) != null) {
                            i = 2131363525;
                            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363525, constraintLayoutN);
                            if (stylingTextView != null) {
                                i = 2131365061;
                                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131365061, constraintLayoutN);
                                if (stylingImageView != null) {
                                    return new w6n(new nck(constraintLayoutN, stylingTextView, stylingImageView), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN.getResources().getResourceName(i)));
                        return null;
                    case 1:
                        return new x6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 2:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 3:
                        return new v6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 4:
                        Context context = viewGroup.getContext();
                        n1 n1Var2 = ujnVar.e;
                        n1Var2.getClass();
                        return new u6n(context, n1Var2 instanceof vjn, n1Var2.k0(), ujnVar.f, ujnVar.g);
                    case 5:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 6:
                        return new m6n(viewGroup.getContext(), f03.w(2130969435, (Context) ujnVar.e.b, 2131165498), ujnVar.g);
                    case 7:
                        Context context2 = viewGroup.getContext();
                        int iK0 = ujnVar.e.k0();
                        tjn tjnVar2 = ujnVar.g;
                        l6n l6nVar = new l6n(new y46(context2, (hcb) null, new k6n(tjnVar2, (byte) 0)), iK0, tjnVar2);
                        bt1.a(LayoutInflater.from(((i) l6nVar).itemView.getContext()), (ViewGroup) ((i) l6nVar).itemView);
                        q9n.f(((i) l6nVar).itemView, new svk(l6nVar, (byte) 13));
                        return l6nVar;
                    default:
                        ConstraintLayout constraintLayoutN2 = j7c.n(viewGroup, 2131559541, viewGroup, false);
                        AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131362594, constraintLayoutN2);
                        if (appCompatImageView != null) {
                            i = 2131364080;
                            MaterialButton materialButtonJ = w1h.j(2131364080, constraintLayoutN2);
                            if (materialButtonJ != null) {
                                i = 2131363485;
                                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363485, constraintLayoutN2);
                                if (stylingTextView2 != null) {
                                    return new r6n(new vs((ViewGroup) constraintLayoutN2, (View) appCompatImageView, (Object) materialButtonJ, (Object) stylingTextView2, (byte) 26), ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN2.getResources().getResourceName(i)));
                        return null;
                }
            }
        }, new sjn((byte) 1));
        final byte b2 = 4;
        I(hkb.class, new yjj(this) { // from class: rjn
            public final /* synthetic */ ujn b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup viewGroup) {
                byte b22 = b2;
                int i = 2131362594;
                ujn ujnVar = this.b;
                switch (b22) {
                    case 0:
                        ConstraintLayout constraintLayoutN = j7c.n(viewGroup, 2131559553, viewGroup, false);
                        if (((StylingImageView) w1h.j(2131362594, constraintLayoutN)) != null) {
                            i = 2131363525;
                            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363525, constraintLayoutN);
                            if (stylingTextView != null) {
                                i = 2131365061;
                                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131365061, constraintLayoutN);
                                if (stylingImageView != null) {
                                    return new w6n(new nck(constraintLayoutN, stylingTextView, stylingImageView), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN.getResources().getResourceName(i)));
                        return null;
                    case 1:
                        return new x6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 2:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 3:
                        return new v6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 4:
                        Context context = viewGroup.getContext();
                        n1 n1Var2 = ujnVar.e;
                        n1Var2.getClass();
                        return new u6n(context, n1Var2 instanceof vjn, n1Var2.k0(), ujnVar.f, ujnVar.g);
                    case 5:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 6:
                        return new m6n(viewGroup.getContext(), f03.w(2130969435, (Context) ujnVar.e.b, 2131165498), ujnVar.g);
                    case 7:
                        Context context2 = viewGroup.getContext();
                        int iK0 = ujnVar.e.k0();
                        tjn tjnVar2 = ujnVar.g;
                        l6n l6nVar = new l6n(new y46(context2, (hcb) null, new k6n(tjnVar2, (byte) 0)), iK0, tjnVar2);
                        bt1.a(LayoutInflater.from(((i) l6nVar).itemView.getContext()), (ViewGroup) ((i) l6nVar).itemView);
                        q9n.f(((i) l6nVar).itemView, new svk(l6nVar, (byte) 13));
                        return l6nVar;
                    default:
                        ConstraintLayout constraintLayoutN2 = j7c.n(viewGroup, 2131559541, viewGroup, false);
                        AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131362594, constraintLayoutN2);
                        if (appCompatImageView != null) {
                            i = 2131364080;
                            MaterialButton materialButtonJ = w1h.j(2131364080, constraintLayoutN2);
                            if (materialButtonJ != null) {
                                i = 2131363485;
                                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363485, constraintLayoutN2);
                                if (stylingTextView2 != null) {
                                    return new r6n(new vs((ViewGroup) constraintLayoutN2, (View) appCompatImageView, (Object) materialButtonJ, (Object) stylingTextView2, (byte) 26), ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN2.getResources().getResourceName(i)));
                        return null;
                }
            }
        }, new k6n(tjnVar, (byte) 7));
        final byte b3 = 5;
        I(fkb.class, new yjj(this) { // from class: rjn
            public final /* synthetic */ ujn b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup viewGroup) {
                byte b22 = b3;
                int i = 2131362594;
                ujn ujnVar = this.b;
                switch (b22) {
                    case 0:
                        ConstraintLayout constraintLayoutN = j7c.n(viewGroup, 2131559553, viewGroup, false);
                        if (((StylingImageView) w1h.j(2131362594, constraintLayoutN)) != null) {
                            i = 2131363525;
                            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363525, constraintLayoutN);
                            if (stylingTextView != null) {
                                i = 2131365061;
                                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131365061, constraintLayoutN);
                                if (stylingImageView != null) {
                                    return new w6n(new nck(constraintLayoutN, stylingTextView, stylingImageView), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN.getResources().getResourceName(i)));
                        return null;
                    case 1:
                        return new x6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 2:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 3:
                        return new v6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 4:
                        Context context = viewGroup.getContext();
                        n1 n1Var2 = ujnVar.e;
                        n1Var2.getClass();
                        return new u6n(context, n1Var2 instanceof vjn, n1Var2.k0(), ujnVar.f, ujnVar.g);
                    case 5:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 6:
                        return new m6n(viewGroup.getContext(), f03.w(2130969435, (Context) ujnVar.e.b, 2131165498), ujnVar.g);
                    case 7:
                        Context context2 = viewGroup.getContext();
                        int iK0 = ujnVar.e.k0();
                        tjn tjnVar2 = ujnVar.g;
                        l6n l6nVar = new l6n(new y46(context2, (hcb) null, new k6n(tjnVar2, (byte) 0)), iK0, tjnVar2);
                        bt1.a(LayoutInflater.from(((i) l6nVar).itemView.getContext()), (ViewGroup) ((i) l6nVar).itemView);
                        q9n.f(((i) l6nVar).itemView, new svk(l6nVar, (byte) 13));
                        return l6nVar;
                    default:
                        ConstraintLayout constraintLayoutN2 = j7c.n(viewGroup, 2131559541, viewGroup, false);
                        AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131362594, constraintLayoutN2);
                        if (appCompatImageView != null) {
                            i = 2131364080;
                            MaterialButton materialButtonJ = w1h.j(2131364080, constraintLayoutN2);
                            if (materialButtonJ != null) {
                                i = 2131363485;
                                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363485, constraintLayoutN2);
                                if (stylingTextView2 != null) {
                                    return new r6n(new vs((ViewGroup) constraintLayoutN2, (View) appCompatImageView, (Object) materialButtonJ, (Object) stylingTextView2, (byte) 26), ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN2.getResources().getResourceName(i)));
                        return null;
                }
            }
        }, new sjn((byte) 2));
        final byte b4 = 3;
        I(ikb.class, new yjj(this) { // from class: rjn
            public final /* synthetic */ ujn b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup viewGroup) {
                byte b22 = b4;
                int i = 2131362594;
                ujn ujnVar = this.b;
                switch (b22) {
                    case 0:
                        ConstraintLayout constraintLayoutN = j7c.n(viewGroup, 2131559553, viewGroup, false);
                        if (((StylingImageView) w1h.j(2131362594, constraintLayoutN)) != null) {
                            i = 2131363525;
                            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363525, constraintLayoutN);
                            if (stylingTextView != null) {
                                i = 2131365061;
                                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131365061, constraintLayoutN);
                                if (stylingImageView != null) {
                                    return new w6n(new nck(constraintLayoutN, stylingTextView, stylingImageView), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN.getResources().getResourceName(i)));
                        return null;
                    case 1:
                        return new x6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 2:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 3:
                        return new v6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 4:
                        Context context = viewGroup.getContext();
                        n1 n1Var2 = ujnVar.e;
                        n1Var2.getClass();
                        return new u6n(context, n1Var2 instanceof vjn, n1Var2.k0(), ujnVar.f, ujnVar.g);
                    case 5:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 6:
                        return new m6n(viewGroup.getContext(), f03.w(2130969435, (Context) ujnVar.e.b, 2131165498), ujnVar.g);
                    case 7:
                        Context context2 = viewGroup.getContext();
                        int iK0 = ujnVar.e.k0();
                        tjn tjnVar2 = ujnVar.g;
                        l6n l6nVar = new l6n(new y46(context2, (hcb) null, new k6n(tjnVar2, (byte) 0)), iK0, tjnVar2);
                        bt1.a(LayoutInflater.from(((i) l6nVar).itemView.getContext()), (ViewGroup) ((i) l6nVar).itemView);
                        q9n.f(((i) l6nVar).itemView, new svk(l6nVar, (byte) 13));
                        return l6nVar;
                    default:
                        ConstraintLayout constraintLayoutN2 = j7c.n(viewGroup, 2131559541, viewGroup, false);
                        AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131362594, constraintLayoutN2);
                        if (appCompatImageView != null) {
                            i = 2131364080;
                            MaterialButton materialButtonJ = w1h.j(2131364080, constraintLayoutN2);
                            if (materialButtonJ != null) {
                                i = 2131363485;
                                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363485, constraintLayoutN2);
                                if (stylingTextView2 != null) {
                                    return new r6n(new vs((ViewGroup) constraintLayoutN2, (View) appCompatImageView, (Object) materialButtonJ, (Object) stylingTextView2, (byte) 26), ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN2.getResources().getResourceName(i)));
                        return null;
                }
            }
        }, new sjn((byte) 3));
        final byte b5 = 6;
        I(gkb.class, new yjj(this) { // from class: rjn
            public final /* synthetic */ ujn b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup viewGroup) {
                byte b22 = b5;
                int i = 2131362594;
                ujn ujnVar = this.b;
                switch (b22) {
                    case 0:
                        ConstraintLayout constraintLayoutN = j7c.n(viewGroup, 2131559553, viewGroup, false);
                        if (((StylingImageView) w1h.j(2131362594, constraintLayoutN)) != null) {
                            i = 2131363525;
                            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363525, constraintLayoutN);
                            if (stylingTextView != null) {
                                i = 2131365061;
                                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131365061, constraintLayoutN);
                                if (stylingImageView != null) {
                                    return new w6n(new nck(constraintLayoutN, stylingTextView, stylingImageView), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN.getResources().getResourceName(i)));
                        return null;
                    case 1:
                        return new x6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 2:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 3:
                        return new v6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 4:
                        Context context = viewGroup.getContext();
                        n1 n1Var2 = ujnVar.e;
                        n1Var2.getClass();
                        return new u6n(context, n1Var2 instanceof vjn, n1Var2.k0(), ujnVar.f, ujnVar.g);
                    case 5:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 6:
                        return new m6n(viewGroup.getContext(), f03.w(2130969435, (Context) ujnVar.e.b, 2131165498), ujnVar.g);
                    case 7:
                        Context context2 = viewGroup.getContext();
                        int iK0 = ujnVar.e.k0();
                        tjn tjnVar2 = ujnVar.g;
                        l6n l6nVar = new l6n(new y46(context2, (hcb) null, new k6n(tjnVar2, (byte) 0)), iK0, tjnVar2);
                        bt1.a(LayoutInflater.from(((i) l6nVar).itemView.getContext()), (ViewGroup) ((i) l6nVar).itemView);
                        q9n.f(((i) l6nVar).itemView, new svk(l6nVar, (byte) 13));
                        return l6nVar;
                    default:
                        ConstraintLayout constraintLayoutN2 = j7c.n(viewGroup, 2131559541, viewGroup, false);
                        AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131362594, constraintLayoutN2);
                        if (appCompatImageView != null) {
                            i = 2131364080;
                            MaterialButton materialButtonJ = w1h.j(2131364080, constraintLayoutN2);
                            if (materialButtonJ != null) {
                                i = 2131363485;
                                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363485, constraintLayoutN2);
                                if (stylingTextView2 != null) {
                                    return new r6n(new vs((ViewGroup) constraintLayoutN2, (View) appCompatImageView, (Object) materialButtonJ, (Object) stylingTextView2, (byte) 26), ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN2.getResources().getResourceName(i)));
                        return null;
                }
            }
        }, new sjn((byte) 4));
        final byte b6 = 7;
        I(akb.class, new yjj(this) { // from class: rjn
            public final /* synthetic */ ujn b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup viewGroup) {
                byte b22 = b6;
                int i = 2131362594;
                ujn ujnVar = this.b;
                switch (b22) {
                    case 0:
                        ConstraintLayout constraintLayoutN = j7c.n(viewGroup, 2131559553, viewGroup, false);
                        if (((StylingImageView) w1h.j(2131362594, constraintLayoutN)) != null) {
                            i = 2131363525;
                            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363525, constraintLayoutN);
                            if (stylingTextView != null) {
                                i = 2131365061;
                                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131365061, constraintLayoutN);
                                if (stylingImageView != null) {
                                    return new w6n(new nck(constraintLayoutN, stylingTextView, stylingImageView), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN.getResources().getResourceName(i)));
                        return null;
                    case 1:
                        return new x6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 2:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 3:
                        return new v6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 4:
                        Context context = viewGroup.getContext();
                        n1 n1Var2 = ujnVar.e;
                        n1Var2.getClass();
                        return new u6n(context, n1Var2 instanceof vjn, n1Var2.k0(), ujnVar.f, ujnVar.g);
                    case 5:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 6:
                        return new m6n(viewGroup.getContext(), f03.w(2130969435, (Context) ujnVar.e.b, 2131165498), ujnVar.g);
                    case 7:
                        Context context2 = viewGroup.getContext();
                        int iK0 = ujnVar.e.k0();
                        tjn tjnVar2 = ujnVar.g;
                        l6n l6nVar = new l6n(new y46(context2, (hcb) null, new k6n(tjnVar2, (byte) 0)), iK0, tjnVar2);
                        bt1.a(LayoutInflater.from(((i) l6nVar).itemView.getContext()), (ViewGroup) ((i) l6nVar).itemView);
                        q9n.f(((i) l6nVar).itemView, new svk(l6nVar, (byte) 13));
                        return l6nVar;
                    default:
                        ConstraintLayout constraintLayoutN2 = j7c.n(viewGroup, 2131559541, viewGroup, false);
                        AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131362594, constraintLayoutN2);
                        if (appCompatImageView != null) {
                            i = 2131364080;
                            MaterialButton materialButtonJ = w1h.j(2131364080, constraintLayoutN2);
                            if (materialButtonJ != null) {
                                i = 2131363485;
                                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363485, constraintLayoutN2);
                                if (stylingTextView2 != null) {
                                    return new r6n(new vs((ViewGroup) constraintLayoutN2, (View) appCompatImageView, (Object) materialButtonJ, (Object) stylingTextView2, (byte) 26), ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN2.getResources().getResourceName(i)));
                        return null;
                }
            }
        }, new sjn((byte) 5));
        I(ckb.class, new sjn((byte) 6), new sjn((byte) 7));
        final byte b7 = 8;
        I(dkb.class, new yjj(this) { // from class: rjn
            public final /* synthetic */ ujn b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup viewGroup) {
                byte b22 = b7;
                int i = 2131362594;
                ujn ujnVar = this.b;
                switch (b22) {
                    case 0:
                        ConstraintLayout constraintLayoutN = j7c.n(viewGroup, 2131559553, viewGroup, false);
                        if (((StylingImageView) w1h.j(2131362594, constraintLayoutN)) != null) {
                            i = 2131363525;
                            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363525, constraintLayoutN);
                            if (stylingTextView != null) {
                                i = 2131365061;
                                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131365061, constraintLayoutN);
                                if (stylingImageView != null) {
                                    return new w6n(new nck(constraintLayoutN, stylingTextView, stylingImageView), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN.getResources().getResourceName(i)));
                        return null;
                    case 1:
                        return new x6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 2:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 3:
                        return new v6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 4:
                        Context context = viewGroup.getContext();
                        n1 n1Var2 = ujnVar.e;
                        n1Var2.getClass();
                        return new u6n(context, n1Var2 instanceof vjn, n1Var2.k0(), ujnVar.f, ujnVar.g);
                    case 5:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 6:
                        return new m6n(viewGroup.getContext(), f03.w(2130969435, (Context) ujnVar.e.b, 2131165498), ujnVar.g);
                    case 7:
                        Context context2 = viewGroup.getContext();
                        int iK0 = ujnVar.e.k0();
                        tjn tjnVar2 = ujnVar.g;
                        l6n l6nVar = new l6n(new y46(context2, (hcb) null, new k6n(tjnVar2, (byte) 0)), iK0, tjnVar2);
                        bt1.a(LayoutInflater.from(((i) l6nVar).itemView.getContext()), (ViewGroup) ((i) l6nVar).itemView);
                        q9n.f(((i) l6nVar).itemView, new svk(l6nVar, (byte) 13));
                        return l6nVar;
                    default:
                        ConstraintLayout constraintLayoutN2 = j7c.n(viewGroup, 2131559541, viewGroup, false);
                        AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131362594, constraintLayoutN2);
                        if (appCompatImageView != null) {
                            i = 2131364080;
                            MaterialButton materialButtonJ = w1h.j(2131364080, constraintLayoutN2);
                            if (materialButtonJ != null) {
                                i = 2131363485;
                                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363485, constraintLayoutN2);
                                if (stylingTextView2 != null) {
                                    return new r6n(new vs((ViewGroup) constraintLayoutN2, (View) appCompatImageView, (Object) materialButtonJ, (Object) stylingTextView2, (byte) 26), ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN2.getResources().getResourceName(i)));
                        return null;
                }
            }
        }, new bxl((byte) 25));
        final byte b8 = 0;
        I(kkb.class, new yjj(this) { // from class: rjn
            public final /* synthetic */ ujn b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup viewGroup) {
                byte b22 = b8;
                int i = 2131362594;
                ujn ujnVar = this.b;
                switch (b22) {
                    case 0:
                        ConstraintLayout constraintLayoutN = j7c.n(viewGroup, 2131559553, viewGroup, false);
                        if (((StylingImageView) w1h.j(2131362594, constraintLayoutN)) != null) {
                            i = 2131363525;
                            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363525, constraintLayoutN);
                            if (stylingTextView != null) {
                                i = 2131365061;
                                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131365061, constraintLayoutN);
                                if (stylingImageView != null) {
                                    return new w6n(new nck(constraintLayoutN, stylingTextView, stylingImageView), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN.getResources().getResourceName(i)));
                        return null;
                    case 1:
                        return new x6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 2:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 3:
                        return new v6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 4:
                        Context context = viewGroup.getContext();
                        n1 n1Var2 = ujnVar.e;
                        n1Var2.getClass();
                        return new u6n(context, n1Var2 instanceof vjn, n1Var2.k0(), ujnVar.f, ujnVar.g);
                    case 5:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 6:
                        return new m6n(viewGroup.getContext(), f03.w(2130969435, (Context) ujnVar.e.b, 2131165498), ujnVar.g);
                    case 7:
                        Context context2 = viewGroup.getContext();
                        int iK0 = ujnVar.e.k0();
                        tjn tjnVar2 = ujnVar.g;
                        l6n l6nVar = new l6n(new y46(context2, (hcb) null, new k6n(tjnVar2, (byte) 0)), iK0, tjnVar2);
                        bt1.a(LayoutInflater.from(((i) l6nVar).itemView.getContext()), (ViewGroup) ((i) l6nVar).itemView);
                        q9n.f(((i) l6nVar).itemView, new svk(l6nVar, (byte) 13));
                        return l6nVar;
                    default:
                        ConstraintLayout constraintLayoutN2 = j7c.n(viewGroup, 2131559541, viewGroup, false);
                        AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131362594, constraintLayoutN2);
                        if (appCompatImageView != null) {
                            i = 2131364080;
                            MaterialButton materialButtonJ = w1h.j(2131364080, constraintLayoutN2);
                            if (materialButtonJ != null) {
                                i = 2131363485;
                                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363485, constraintLayoutN2);
                                if (stylingTextView2 != null) {
                                    return new r6n(new vs((ViewGroup) constraintLayoutN2, (View) appCompatImageView, (Object) materialButtonJ, (Object) stylingTextView2, (byte) 26), ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN2.getResources().getResourceName(i)));
                        return null;
                }
            }
        }, new bxl((byte) 27));
        final byte b9 = 1;
        I(lkb.class, new yjj(this) { // from class: rjn
            public final /* synthetic */ ujn b;

            {
                this.b = this;
            }

            @Override // defpackage.yjj
            public final i c(ViewGroup viewGroup) {
                byte b22 = b9;
                int i = 2131362594;
                ujn ujnVar = this.b;
                switch (b22) {
                    case 0:
                        ConstraintLayout constraintLayoutN = j7c.n(viewGroup, 2131559553, viewGroup, false);
                        if (((StylingImageView) w1h.j(2131362594, constraintLayoutN)) != null) {
                            i = 2131363525;
                            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363525, constraintLayoutN);
                            if (stylingTextView != null) {
                                i = 2131365061;
                                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131365061, constraintLayoutN);
                                if (stylingImageView != null) {
                                    return new w6n(new nck(constraintLayoutN, stylingTextView, stylingImageView), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN.getResources().getResourceName(i)));
                        return null;
                    case 1:
                        return new x6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 2:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 3:
                        return new v6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.g);
                    case 4:
                        Context context = viewGroup.getContext();
                        n1 n1Var2 = ujnVar.e;
                        n1Var2.getClass();
                        return new u6n(context, n1Var2 instanceof vjn, n1Var2.k0(), ujnVar.f, ujnVar.g);
                    case 5:
                        return new y6n(viewGroup.getContext(), ujnVar.e.k0(), ujnVar.f, ujnVar.g);
                    case 6:
                        return new m6n(viewGroup.getContext(), f03.w(2130969435, (Context) ujnVar.e.b, 2131165498), ujnVar.g);
                    case 7:
                        Context context2 = viewGroup.getContext();
                        int iK0 = ujnVar.e.k0();
                        tjn tjnVar2 = ujnVar.g;
                        l6n l6nVar = new l6n(new y46(context2, (hcb) null, new k6n(tjnVar2, (byte) 0)), iK0, tjnVar2);
                        bt1.a(LayoutInflater.from(((i) l6nVar).itemView.getContext()), (ViewGroup) ((i) l6nVar).itemView);
                        q9n.f(((i) l6nVar).itemView, new svk(l6nVar, (byte) 13));
                        return l6nVar;
                    default:
                        ConstraintLayout constraintLayoutN2 = j7c.n(viewGroup, 2131559541, viewGroup, false);
                        AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131362594, constraintLayoutN2);
                        if (appCompatImageView != null) {
                            i = 2131364080;
                            MaterialButton materialButtonJ = w1h.j(2131364080, constraintLayoutN2);
                            if (materialButtonJ != null) {
                                i = 2131363485;
                                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363485, constraintLayoutN2);
                                if (stylingTextView2 != null) {
                                    return new r6n(new vs((ViewGroup) constraintLayoutN2, (View) appCompatImageView, (Object) materialButtonJ, (Object) stylingTextView2, (byte) 26), ujnVar.g);
                                }
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(constraintLayoutN2.getResources().getResourceName(i)));
                        return null;
                }
            }
        }, new bxl((byte) 28));
    }

    public final int P(String str) {
        ArrayList arrayList = (ArrayList) this.d;
        for (int i = 0; i < arrayList.size(); i++) {
            if (str.equals(((mkb) arrayList.get(i)).a())) {
                return i;
            }
        }
        return -1;
    }

    public final void T(List list) {
        this.g.e();
        K(this.e.P(list));
    }

    @Override // defpackage.d4a
    public final e4a getItem(int i) {
        return (e4a) ((ArrayList) this.d).get(i);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        aan aanVar = this.h;
        aanVar.e(recyclerView);
        aanVar.b(true);
    }

    @Override // defpackage.dt1
    public final void onBindViewHolder(i iVar, int i) {
        z6n z6nVar = (z6n) iVar;
        super.onBindViewHolder(z6nVar, i);
        this.h.f(z6nVar);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        aan aanVar = this.h;
        recyclerView.t0(aanVar.d);
        z61 z61Var = aanVar.e;
        if (z61Var != null) {
            recyclerView.removeOnAttachStateChangeListener(z61Var);
            if (recyclerView.isAttachedToWindow()) {
                recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) z61Var.b);
            }
            aanVar.e = null;
        }
        aanVar.b(false);
    }

    @Override // defpackage.dt1
    public final void onViewRecycled(i iVar) {
        z6n z6nVar = (z6n) iVar;
        super.onViewRecycled(z6nVar);
        aan aanVar = this.h;
        aanVar.getClass();
        if (z6nVar instanceof y9n) {
            aanVar.a(((i) z6nVar).itemView);
        }
    }
}
