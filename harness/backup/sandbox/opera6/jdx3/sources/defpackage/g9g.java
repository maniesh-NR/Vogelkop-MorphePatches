package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.chromium.OperaBrowserContextHandle;
import com.opera.android.custom_views.FadingScrollView;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.SideMarginContainer;
import com.opera.android.settings.SettingsManager;
import com.opera.android.settings.SettingsStatusView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class g9g extends lj implements View.OnClickListener, o37, q9g {
    public OperaListItem A;
    public final SettingsManager B;
    public th6 C;
    public ogf D;
    public final s9g r;
    public final b9g s;
    public final Lazy t;
    public final mw3 u;
    public final ua7 v;
    public String w;
    public uo7 x;
    public View y;
    public OperaListItem z;

    public g9g(gjm gjmVar, s9g s9gVar, b9g b9gVar, Lazy lazy, mw3 mw3Var, SettingsManager settingsManager) {
        super(2132020421, 0);
        this.r = s9gVar;
        this.s = b9gVar;
        this.t = lazy;
        this.u = mw3Var;
        this.B = settingsManager;
        this.v = new ua7((Fragment) this, gjmVar);
    }

    @Override // defpackage.q9g
    public final void A() {
        K0();
    }

    public final void G0() {
        if (this.y.findViewById(2131362337).isEnabled() || this.y.findViewById(2131363878).getVisibility() == 0) {
            return;
        }
        g0();
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void H0(int i, long j, boolean z) {
        this.y.findViewById(2131362337).setEnabled(i > 0 || j > 0);
        ?? r4 = (OperaListItem) this.y.findViewById(2131364579);
        Context context = r4.getContext();
        r4.E(new qxh(z ? getString(2132019809, new Object[]{aik.j(j, context)}) : getString(2132021649, new Object[]{aik.h(j, context)})));
    }

    public final void I0(boolean z) {
        int i = z ? 0 : 8;
        this.y.findViewById(2131365118).setVisibility(i);
        this.y.findViewById(2131365116).setVisibility(i);
        this.y.findViewById(2131365115).setVisibility(i);
        this.y.findViewById(2131365117).setVisibility(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J0(boolean r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.y
            r1 = 2131364460(0x7f0a0a6c, float:1.8348758E38)
            android.view.View r0 = r0.findViewById(r1)
            com.opera.android.settings.SettingsStatusView r0 = (com.opera.android.settings.SettingsStatusView) r0
            ogf r1 = r4.D
            r2 = 0
            if (r1 == 0) goto L41
            java.lang.String r3 = r4.w
            java.lang.String r1 = r1.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L41
            if (r5 == 0) goto L41
            android.graphics.drawable.LayerDrawable r5 = new android.graphics.drawable.LayerDrawable
            ogf r1 = r4.D
            android.graphics.drawable.Drawable r1 = r1.c
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[]{r1}
            r5.<init>(r1)
            r5.setId(r2, r2)
            b0j r1 = new b0j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Integer[] r3 = new java.lang.Integer[]{r3}
            r1.<init>(r5, r3)
            r5 = 2132019766(0x7f140a36, float:1.9677876E38)
            java.lang.String r4 = r4.getString(r5)
            goto L5e
        L41:
            android.content.Context r5 = r4.requireContext()
            r1 = 2131232166(0x7f0805a6, float:1.8080434E38)
            android.graphics.drawable.Drawable r1 = sgb.F(r1, r5)
            android.content.Context r5 = r4.requireContext()
            android.content.res.ColorStateList r5 = f03.v(r5)
            j14.o0(r1, r5)
            r5 = 2132020200(0x7f140be8, float:1.9678756E38)
            java.lang.String r4 = r4.getString(r5)
        L5e:
            nck r5 = r0.c
            com.opera.android.custom_views.StylingImageView r0 = r5.d
            r0.setImageDrawable(r1)
            com.opera.android.custom_views.StylingImageView r5 = r5.d
            r5.setContentDescription(r4)
            n1h.o(r5, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g9g.J0(boolean):void");
    }

    public final void K0() {
        th6 th6Var = this.C;
        th6Var.clear();
        th6Var.addAll(ui6.B(false, true, (String) th6Var.b, ui6.o));
        LayoutDirectionLinearLayout layoutDirectionLinearLayout = (LayoutDirectionLinearLayout) this.y.findViewById(2131363878);
        layoutDirectionLinearLayout.removeAllViews();
        int count = this.C.getCount();
        for (int i = 0; i < count; i++) {
            View view = this.C.getView(i, null, layoutDirectionLinearLayout);
            layoutDirectionLinearLayout.addView(view);
            view.setOnClickListener(this);
        }
        int i2 = count <= 0 ? 8 : 0;
        this.y.findViewById(2131363881).setVisibility(i2);
        this.y.findViewById(2131363879).setVisibility(i2);
        this.y.findViewById(2131363878).setVisibility(i2);
        this.y.findViewById(2131362340).setVisibility(i2);
    }

    public final boolean L0() {
        uo7 uo7Var = this.x;
        kag kagVar = kag.GRANTED;
        if (uo7Var == null) {
            if (s9g.h.g(lag.g, this.w, false) == kagVar) {
                return true;
            }
        } else if (uo7Var.d == kagVar) {
            return true;
        }
        return false;
    }

    @Override // defpackage.q9g
    public final void d(List list) {
        K0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kag kagVarA;
        int id = view.getId();
        mw3 mw3Var = this.u;
        ijm ijmVar = ijm.b;
        if (id == 2131365117) {
            OperaBrowserContextHandle operaBrowserContextHandle = (OperaBrowserContextHandle) N.M4QvXpDD();
            N.MvtzH5Ni(operaBrowserContextHandle, BrowserUtils.getHostString(this.w), N.MNitnPWj(operaBrowserContextHandle));
            N.M3MkeCX1(this.w);
            this.B.Q("text_wrap");
            I0(false);
            ysj ysjVar = (ysj) mw3Var.get();
            glj gljVar = new glj(2132022717, 2500);
            ysjVar.getClass();
            ysjVar.b(gljVar, ijmVar);
            return;
        }
        if (view.getId() == 2131362340) {
            N.MaOW0yoz(this.w);
            N.M3WHFAwg(this.w);
            s9g.h.c(this.w);
            ysj ysjVar2 = (ysj) mw3Var.get();
            G0();
            glj gljVar2 = new glj(2132021537, 2500);
            ysjVar2.getClass();
            ysjVar2.b(gljVar2, ijmVar);
            return;
        }
        if (view.getId() == 2131362337) {
            lx3.a(this.w, true);
            getContext().getSharedPreferences("open_in_app_count", 0).edit().remove(BrowserUtils.a(this.w)).apply();
            H0(0, 0L, false);
            ysj ysjVar3 = (ysj) mw3Var.get();
            G0();
            glj gljVar3 = new glj(2132018099, 2500);
            ysjVar3.getClass();
            ysjVar3.b(gljVar3, ijmVar);
            return;
        }
        View view2 = (View) view.getParent();
        if (view2 == null || view2.getId() != 2131363878) {
            return;
        }
        Pair pair = (Pair) view.getTag();
        lag lagVar = (lag) pair.first;
        kag kagVar = (kag) pair.second;
        if (lagVar == lag.b) {
            if (aoh.l(view.getContext(), this.w, kagVar == kag.GRANTED)) {
                return;
            }
        }
        OperaListItem operaListItem = (OperaListItem) view;
        String hostString = BrowserUtils.getHostString(this.w);
        ArrayList arrayList = new ArrayList(Arrays.asList(ui6.j(lagVar)));
        z77 z77VarU = sfe.U(getContext());
        pyc pycVarI0 = eog.i0(getContext());
        eog eogVar = (eog) pycVarI0.a;
        eogVar.h = new f9g(this, arrayList, lagVar, operaListItem, hostString);
        ps5 ps5Var = eogVar.d;
        jag jagVarF = s9g.h.f(this.w, false);
        kag kagVar2 = null;
        if (jagVarF != null && (kagVarA = jagVarF.a(lagVar, (kag) null)) != null) {
            kagVar2 = Boolean.TRUE.equals(jagVarF.b(lagVar)) ? kagVarA : kag.ASK;
        }
        int iIndexOf = arrayList.indexOf(kagVar2);
        int i = 0;
        while (i < arrayList.size()) {
            ps5Var.a(1, i, 0, ui6.R(getContext(), lagVar, (kag) arrayList.get(i), hostString)).setChecked(i == iIndexOf);
            i++;
        }
        ps5Var.setHeaderTitle(ui6.S(getContext(), lagVar));
        ps5Var.setGroupCheckable(1, true, true);
        z77VarU.getClass();
        z77VarU.b(pycVarI0, ijmVar);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        this.r.H(this);
        super.onDestroyView();
        this.y = null;
        this.C = null;
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.v;
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        this.w = ((c9g) this.v.p()).a;
        vo7 vo7Var = (vo7) this.t.get();
        GURL gurl = new GURL(this.w);
        vo7Var.getClass();
        this.x = vo7Var.a(gurl, false);
        View viewInflate = layoutInflater.inflate(2131559212, viewGroup);
        this.y = viewInflate;
        FadingScrollView fadingScrollView = (FadingScrollView) viewInflate.findViewById(2131362839);
        SideMarginContainer sideMarginContainer = (SideMarginContainer) this.y.findViewById(2131364447);
        Objects.requireNonNull(fadingScrollView);
        sideMarginContainer.a = new uk6(fadingScrollView, (byte) 20);
        SettingsStatusView settingsStatusView = (SettingsStatusView) this.y.findViewById(2131364460);
        settingsStatusView.c.c.setText(BrowserUtils.getHostString(this.w));
        settingsStatusView.c.d.setOnClickListener(new zvd(this, (byte) 14));
        this.C = new th6(getContext(), this.w);
        d9g d9gVar = new d9g(this);
        String str = this.w;
        i7f i7fVar = lx3.a;
        N.MOJ0_F$K(d9gVar, str, true);
        this.r.F(this);
        K0();
        this.y.findViewById(2131362340).setOnClickListener(this);
        this.y.findViewById(2131362337).setOnClickListener(this);
        OperaListItem operaListItem = (OperaListItem) this.y.findViewById(2131361924);
        String str2 = this.w;
        i7f i7fVar2 = hj.a;
        String strQ = wqm.q(str2);
        operaListItem.t(((strQ == null ? 0 : N.M$NXlYYm(strQ, false)) & 1) == 1);
        operaListItem.u = new e9g(str2, 1);
        OperaListItem operaListItem2 = (OperaListItem) this.y.findViewById(2131364829);
        String str3 = this.w;
        String strQ2 = wqm.q(str3);
        operaListItem2.t(((strQ2 == null ? 0 : N.M$NXlYYm(strQ2, false)) & 2) == 2);
        operaListItem2.u = new e9g(str3, 2);
        Double dValueOf = (Double) N.MO9jFwQ0(this.w);
        boolean z = dValueOf != null;
        if (!z) {
            dValueOf = Double.valueOf(N.MNitnPWj((OperaBrowserContextHandle) N.M4QvXpDD()));
        }
        int iRound = ((int) Math.round((Math.pow(1.2000000476837158d, dValueOf.doubleValue()) * 100.0d) / 5.0d)) * 5;
        Boolean bool = (Boolean) N.MzJrTmZH(this.w);
        ((OperaListItem) this.y.findViewById(2131365115)).E(new qxh(sko.v(getString(2132022715, new Object[]{Integer.valueOf(iRound)}), " • ", getString(bool != null ? bool.booleanValue() : this.B.i("text_wrap") ? 2132021875 : 2132021874))));
        this.y.findViewById(2131365117).setOnClickListener(this);
        I0(z || bool != null);
        String str4 = this.w;
        OperaListItem operaListItem3 = (OperaListItem) this.y.findViewById(2131364975);
        this.A = operaListItem3;
        int iM$OhQnXp = N.M$OhQnXp(str4, false);
        operaListItem3.setChecked(iM$OhQnXp != 1 && iM$OhQnXp == 2);
        this.A.u = new mgf(this, str4, (byte) 3);
        OperaListItem operaListItem4 = (OperaListItem) this.y.findViewById(2131362828);
        this.z = operaListItem4;
        uo7 uo7Var = this.x;
        if (uo7Var != null && uo7Var.b.e) {
            operaListItem4.t(true);
            this.z.setEnabled(false);
        } else {
            operaListItem4.t(L0());
            this.z.u = new d9g(this);
        }
        this.D = null;
        uo7 uo7Var2 = this.x;
        J0((uo7Var2 != null && uo7Var2.b.e) || L0());
        View view = this.y;
        l5b l5bVar = q9n.c;
        BrowserActivity browserActivityO = view == null ? null : q9n.o(view.getContext());
        pgf pgfVar = browserActivityO != null ? (pgf) browserActivityO.Z.getValue() : null;
        if (pgfVar != null) {
            pgfVar.d(this.w, new o8f(this, (byte) 16));
        }
        uo7 uo7Var3 = this.x;
        if (uo7Var3 == null || uo7Var3.f || !L0()) {
            return;
        }
        s9g.h.o(false, this.w, lag.g, kag.ASK, true);
    }
}
