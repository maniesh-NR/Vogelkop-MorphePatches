package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class sb6 extends i93 implements o37 {
    public final j25 t;
    public final jl4 u;
    public final umi v;
    public final r65 w;
    public final ua7 x;
    public ei y;

    public sb6(umi umiVar, r65 r65Var, gjm gjmVar) {
        super(2132021176, 2131755021, fki.a, false);
        this.t = new j25(this, (byte) 1);
        this.u = new jl4(this, (byte) 24);
        this.v = umiVar;
        this.w = r65Var;
        this.x = new ua7((Fragment) this, gjmVar);
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return this.u;
    }

    public final SettingsManager H0() {
        Context contextRequireContext = requireContext();
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) contextRequireContext.getApplicationContext()).J();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void I0() {
        boolean zM = this.w.m();
        ei eiVar = this.y;
        if (zM) {
            ((OperaListItem) eiVar.c).setVisibility(8);
            ((OperaListItem) this.y.e).setVisibility(0);
            ((OperaListItem) this.y.e).setOnClickListener(new yk4(this, (byte) 9));
            return;
        }
        ((OperaListItem) eiVar.c).setVisibility(0);
        ((OperaListItem) this.y.e).setVisibility(8);
        ?? r0 = (OperaListItem) this.y.c;
        boolean zU = H0().u("personalized_ads");
        r0.setTag("personalized_ads");
        r0.setChecked(zU);
        r0.u = new qb6(r0);
    }

    @Override // defpackage.i93, defpackage.on9
    public final oba a() {
        int[] iArr;
        ua7 ua7Var = this.x;
        if (!((pb6) ua7Var.p()).a) {
            return ((pb6) ua7Var.p()).b;
        }
        boolean zI = H0().i("process_news_topics");
        boolean zU = H0().u("personalized_news");
        ei eiVar = this.y;
        int i = 0;
        if (zI == zU) {
            iArr = new int[]{((OperaListItem) eiVar.h).getId(), ((OperaListItem) this.y.d).getId()};
        } else {
            iArr = !zI ? new int[]{((OperaListItem) eiVar.h).getId(), ((OperaListItem) this.y.d).getId()} : new int[]{((OperaListItem) eiVar.d).getId(), ((OperaListItem) this.y.h).getId()};
            i = 1;
        }
        return new oba(iArr, i);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        H0().H(this.t);
        this.y = null;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) throws Resources.NotFoundException {
        super.onViewCreated(view, bundle);
        getViewLifecycleOwner().getLifecycle().a(new rb6(H0()));
        H0().F(this.t);
        ?? r2 = (OperaListItem) this.y.i;
        boolean zI = H0().i("ga_usage_statistics");
        r2.setTag("ga_usage_statistics");
        r2.setChecked(zI);
        r2.u = new qb6(r2);
        boolean zM = this.w.m();
        ei eiVar = this.y;
        if (zM) {
            ((OperaListItem) eiVar.f).setVisibility(8);
        } else {
            ?? r22 = (OperaListItem) eiVar.f;
            boolean zI2 = H0().i("collect_website_categories");
            r22.setTag("collect_website_categories");
            r22.setChecked(zI2);
            r22.u = new qb6(r22);
        }
        ?? r23 = (OperaListItem) this.y.h;
        boolean zI3 = H0().i("process_news_topics");
        r23.setTag("process_news_topics");
        r23.setChecked(zI3);
        r23.u = new qb6(r23);
        ?? r24 = (OperaListItem) this.y.g;
        boolean zI4 = H0().i("process_location");
        r24.setTag("process_location");
        r24.setChecked(zI4);
        r24.u = new qb6(r24);
        ?? r25 = (OperaListItem) this.y.d;
        boolean zU = H0().u("personalized_news");
        r25.setTag("personalized_news");
        r25.setChecked(zU);
        r25.u = new qb6(r25);
        I0();
        ((LinearLayout) this.y.b).jumpDrawablesToCurrentState();
        this.s.F();
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.x;
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.v0(layoutInflater, viewGroup);
        View viewInflate = layoutInflater.inflate(2131559299, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131364258;
        ConstraintLayout constraintLayout = (OperaListItem) w1h.j(2131364258, viewInflate);
        if (constraintLayout != null) {
            i = 2131364259;
            ConstraintLayout constraintLayout2 = (OperaListItem) w1h.j(2131364259, viewInflate);
            if (constraintLayout2 != null) {
                i = 2131364273;
                ConstraintLayout constraintLayout3 = (OperaListItem) w1h.j(2131364273, viewInflate);
                if (constraintLayout3 != null) {
                    i = 2131364295;
                    ConstraintLayout constraintLayout4 = (OperaListItem) w1h.j(2131364295, viewInflate);
                    if (constraintLayout4 != null) {
                        i = 2131364312;
                        ConstraintLayout constraintLayout5 = (OperaListItem) w1h.j(2131364312, viewInflate);
                        if (constraintLayout5 != null) {
                            i = 2131364317;
                            ConstraintLayout constraintLayout6 = (OperaListItem) w1h.j(2131364317, viewInflate);
                            if (constraintLayout6 != null) {
                                i = 2131364375;
                                ConstraintLayout constraintLayout7 = (OperaListItem) w1h.j(2131364375, viewInflate);
                                if (constraintLayout7 != null) {
                                    this.y = new ei((ViewGroup) viewInflate, (View) constraintLayout, (View) constraintLayout2, (View) constraintLayout3, (View) constraintLayout4, (View) constraintLayout5, (View) constraintLayout6, (View) constraintLayout7, (byte) 11);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
