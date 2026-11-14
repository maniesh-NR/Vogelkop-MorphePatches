package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.android.premium.ui.view.SubscriptionPlanList;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import java.util.List;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class h8d extends uim implements dmk, hf3 {
    public final boolean d = true;
    public final String e;
    public final qb7 f;
    public final g8d g;
    public final fmk h;
    public final boolean i;
    public q5g j;
    public String k;

    /* JADX WARN: Multi-variable type inference failed */
    public h8d(g8d g8dVar, fmk fmkVar, qb7 qb7Var, int i, String str) {
        this.g = g8dVar;
        this.h = fmkVar;
        this.e = g8dVar.Q();
        this.k = str;
        this.f = qb7Var;
        this.i = i;
    }

    @Override // defpackage.hf3
    public final void D() {
    }

    @Override // defpackage.hf3
    public final void E() {
        this.g.J();
        dismiss();
    }

    @Override // defpackage.uim
    public final Dialog g0(Bundle bundle) {
        zp1 z46Var = new z46(getContext(), getTheme());
        if (this.d) {
            z46Var.setOnShowListener(new kim());
        }
        return z46Var;
    }

    @Override // defpackage.dmk
    public final void handleSubscriptionPlans(bmk bmkVar) {
        float f = bmkVar.d;
        List list = bmkVar.c;
        f8d f8dVar = new f8d(f);
        boolean z = this.i;
        if (z) {
            if (z) {
                ((SubscriptionPlanList) this.j.d).d((List) list.stream().filter(new zx1(this, (byte) 14)).collect(Collectors.toList()), f8dVar);
                ((SubscriptionPlanList) this.j.d).f(this.k, true);
                return;
            }
            return;
        }
        ((SubscriptionPlanList) this.j.d).d(list, f8dVar);
        if (((SubscriptionPlanList) this.j.d).f(this.k, false)) {
            return;
        }
        ((SubscriptionPlanList) this.j.d).f(this.e, true);
    }

    @Override // defpackage.dmk
    public final void handleSubscriptionPlans(cmk cmkVar) {
    }

    @Override // defpackage.dmk
    public final void handleSubscriptionPlans(zlk zlkVar) {
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131559230, (ViewGroup) null, false);
        int i = 2131362302;
        OperaMaterialButton operaMaterialButton = (OperaMaterialButton) w1h.j(2131362302, viewInflate);
        if (operaMaterialButton != null) {
            i = 2131364594;
            SubscriptionPlanList subscriptionPlanList = (SubscriptionPlanList) w1h.j(2131364594, viewInflate);
            if (subscriptionPlanList != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                this.j = new q5g(linearLayout, operaMaterialButton, subscriptionPlanList, (byte) 1);
                subscriptionPlanList.b = new yzb((Object) this, (byte) 17);
                return linearLayout;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void onDestroyView() {
        super/*androidx.fragment.app.i*/.onDestroyView();
        this.j = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        byte b = 0;
        this.h.c.j(getViewLifecycleOwner(), new d8d(this, b));
        MaterialButton materialButton = (OperaMaterialButton) this.j.c;
        boolean z = this.i;
        if (!z) {
            b = 2132021652;
        } else if (z) {
            b = 2132018208;
        }
        materialButton.setText(b);
        ((OperaMaterialButton) this.j.c).setOnClickListener(new sma(this, (byte) 23));
    }

    @Override // defpackage.hf3
    public final void v() {
    }
}
