package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.w;
import com.opera.android.BrowserActivity;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.premium.ui.view.SubscriptionPlanList;
import com.opera.android.utilities.DisplayUtil;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class cvg extends ltl implements sni {
    public final z77 r;
    public final rn9 s;
    public final tah t;
    public tn u;
    public tni v;
    public os1 w;

    public cvg(nvg nvgVar, z77 z77Var, db dbVar, xb xbVar, fmk fmkVar, af3 af3Var, slk slkVar, skm skmVar, ebh ebhVar) {
        super((itl) u7k.j(2131559234).a);
        this.r = z77Var;
        fmkVar.b();
        this.s = new rn9((k24) this, (byte) 27);
        this.t = new tah(this, nvgVar, this, dbVar, xbVar, fmkVar, af3Var, slkVar, skmVar, ebhVar);
    }

    public final void G0(LayoutInflater layoutInflater, View view) throws Resources.NotFoundException {
        WeakHashMap weakHashMap = r5n.a;
        ViewGroup viewGroup = (ViewGroup) ((View) m5n.f(view, 2131363735));
        Context contextRequireContext = requireContext();
        DisplayUtil.f(contextRequireContext);
        if (DisplayUtil.d(contextRequireContext, DisplayUtil.f) || getResources().getConfiguration().orientation != 2) {
            layoutInflater.inflate(2131559233, viewGroup, true);
        } else {
            layoutInflater.inflate(2131559235, viewGroup, true);
        }
        ViewStub viewStub = (ViewStub) ((View) m5n.f(viewGroup, 2131363899));
        Button button = (Button) ((View) m5n.f(viewGroup, 2131362050));
        tah tahVar = this.t;
        Objects.requireNonNull(tahVar);
        r9g r9gVar = new r9g((Object) tahVar, (byte) 6);
        tn tnVar = new tn();
        viewStub.setLayoutResource(2131559236);
        View viewInflate = viewStub.inflate();
        int i = 2131363347;
        View viewJ = w1h.j(2131363347, viewInflate);
        if (viewJ != null) {
            i = 2131363898;
            SubscriptionPlanList subscriptionPlanList = (SubscriptionPlanList) w1h.j(2131363898, viewInflate);
            if (subscriptionPlanList != null) {
                i = 2131363900;
                LinearLayout linearLayout = (LinearLayout) w1h.j(2131363900, viewInflate);
                if (linearLayout != null) {
                    i = 2131364853;
                    TextView textView = (TextView) w1h.j(2131364853, viewInflate);
                    if (textView != null) {
                        tnVar.b = new or2((FrameLayout) viewInflate, viewJ, subscriptionPlanList, linearLayout, textView, (byte) 22);
                        tnVar.c = button;
                        tnVar.d = r9gVar;
                        hz0 hz0Var = new hz0((byte) 6);
                        q9n.e(viewJ, hz0Var);
                        hz0Var.a(viewJ);
                        subscriptionPlanList.b = new r9g((Object) tnVar, (byte) 7);
                        button.setOnClickListener(new zvd(tnVar, (byte) 22));
                        this.u = tnVar;
                        Context contextRequireContext2 = requireContext();
                        bxc bxcVar = (bxc) cxc.t(contextRequireContext2).i();
                        String strA = bxcVar.a(23, contextRequireContext2);
                        if (strA != null) {
                            ((TextView) ((View) m5n.f(viewGroup, 2131363525))).setText(strA);
                        } else {
                            ((TextView) ((View) m5n.f(viewGroup, 2131363525))).setText(2132022214);
                        }
                        String strA2 = bxcVar.a(24, contextRequireContext2);
                        if (strA2 != null) {
                            ((TextView) ((View) m5n.f(viewGroup, 2131362512))).setText(strA2);
                            return;
                        } else {
                            ((TextView) ((View) m5n.f(viewGroup, 2131362512))).setText(2132022213);
                            return;
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void H0(gvg gvgVar) {
        if (gvgVar != null) {
            int iOrdinal = gvgVar.a.ordinal();
            if (iOrdinal == 0) {
                tn tnVar = this.u;
                or2 or2Var = (or2) tnVar.b;
                ((View) or2Var.d).setVisibility(0);
                ((LinearLayout) or2Var.f).setVisibility(4);
                ((Button) tnVar.c).setEnabled(false);
                return;
            }
            if (iOrdinal != 1) {
                return;
            }
            bmk bmkVar = ((dvg) gvgVar).b;
            tn tnVar2 = this.u;
            tnVar2.getClass();
            tnVar2.a = bmkVar.e;
            or2 or2Var2 = (or2) tnVar2.b;
            ((View) or2Var2.d).setVisibility(8);
            ((LinearLayout) or2Var2.f).setVisibility(0);
            SubscriptionPlanList subscriptionPlanList = (SubscriptionPlanList) or2Var2.e;
            subscriptionPlanList.d(bmkVar.c, new f8d(bmkVar.d, !tnVar2.a));
            subscriptionPlanList.f(null, true);
            ((Button) tnVar2.c).setEnabled(true);
        }
    }

    @Override // defpackage.sni
    public final void Y(boolean z) throws Resources.NotFoundException {
        amk amkVarA = ((SubscriptionPlanList) ((or2) this.u.b).e).a();
        View viewRequireView = requireView();
        WeakHashMap weakHashMap = r5n.a;
        ViewGroup viewGroup = (ViewGroup) ((View) m5n.f(viewRequireView, 2131363735));
        viewGroup.removeAllViews();
        G0(LayoutInflater.from(viewGroup.getContext()), requireView());
        H0((gvg) ((ode) this.t.j).g());
        if (amkVarA != null) {
            tn tnVar = this.u;
            ((SubscriptionPlanList) ((or2) tnVar.b).e).f(amkVarA.a.a, true);
        }
    }

    @Override // defpackage.k24, defpackage.ryl
    public final void h0(w wVar) {
        ((nvg) this.t.c).a(1);
    }

    @Override // defpackage.k24
    public final int k0() {
        return 2130970594;
    }

    @Override // defpackage.k24
    public final void onAttach(Context context) {
        super.onAttach(context);
        BrowserActivity browserActivityRequireActivity = requireActivity();
        int i = BrowserActivity.E1;
        tni tniVar = browserActivityRequireActivity.l;
        this.v = tniVar;
        tniVar.a(this);
    }

    @Override // defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w parentFragmentManager = getParentFragmentManager();
        tah tahVar = this.t;
        Objects.requireNonNull(tahVar);
        bvg bvgVar = new bvg(tahVar, (byte) 0);
        rn9 rn9Var = this.s;
        rn9Var.d = parentFragmentManager;
        parentFragmentManager.i0("SyncAuthPortalFragment_request", (ltl) rn9Var.c, new mgf((Object) rn9Var, (Object) bvgVar, (byte) 17));
    }

    @Override // defpackage.k24
    public final void onDetach() {
        super.onDetach();
        this.v.c(this);
        this.v = null;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((View) m5n.f(view, 2131364074)).setOnClickListener(new zvd(this, (byte) 21));
        ((ode) this.t.j).j(getViewLifecycleOwner(), new d8d(this, (byte) 25));
    }

    @Override // defpackage.ltl
    public final int s0() {
        return 2132018253;
    }

    @Override // defpackage.ltl
    public final int t0(Context context) {
        return 2131232034;
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) throws Resources.NotFoundException {
        G0(layoutInflater, statusBarDrawingFrameLayout);
    }
}
