package defpackage;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.BigSwitchButton;
import com.opera.android.settings.SettingsManager;
import com.opera.android.settings.SettingsStatisticView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.widget.GraphView;
import java.text.NumberFormat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class wyl extends i93 implements p5j {
    public boolean A;
    public final uk t;
    public final SettingsManager u;
    public final tni v;
    public final tk w;
    public final ArrayList x;
    public final crk y;
    public pt1 z;

    public wyl(SettingsManager settingsManager, tni tniVar) {
        super(2132021976, 2131755055);
        this.t = new uk(this, (byte) 1);
        this.w = new tk(this, (byte) 3);
        this.x = new ArrayList();
        this.y = new crk(this, (byte) 20);
        this.u = settingsManager;
        this.v = tniVar;
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return this.y;
    }

    public final void H0() {
        boolean z = this.u.i("tracker_blocker") && this.A;
        ((FrameLayout) this.z.b).setEnabled(z);
        SettingsStatisticView settingsStatisticView = (SettingsStatisticView) this.z.f;
        long jE = xi5.a(getContext()).e();
        ((StylingTextView) settingsStatisticView.f.d).setText(NumberFormat.getNumberInstance().format(jE));
        settingsStatisticView.setActivated(z);
        GraphView graphView = (GraphView) this.z.c;
        graphView.i = f03.u(2130969831, graphView.getContext(), 2131099816);
        graphView.invalidate();
        graphView.h = f03.u(2130969829, graphView.getContext(), 2131099816);
        graphView.a();
        graphView.setVisibility(jE > 0 ? 0 : 4);
        q9n.A(graphView, new cbl(graphView, (byte) 16));
        r0(2131364069).setVisible(xi5.a(getContext()).e() > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I0() {
        boolean z = this.u.i("tracker_blocker") && this.A;
        BigSwitchButton bigSwitchButton = (BigSwitchButton) this.z.d;
        bigSwitchButton.d(z ? 3 : 0);
        bigSwitchButton.setOnClickListener(new j5g(this, bigSwitchButton, (byte) 22));
        new View[]{(OperaListItem) this.z.e}[0].setVisibility(z ? 0 : 8);
        pt1 pt1Var = this.z;
        if (z) {
            BigSwitchButton bigSwitchButton2 = (BigSwitchButton) pt1Var.d;
            bigSwitchButton2.d(3);
            bigSwitchButton2.b(new rxh(2132021460));
            bigSwitchButton2.c(new rxh(2132020558));
            return;
        }
        BigSwitchButton bigSwitchButton3 = (BigSwitchButton) pt1Var.d;
        bigSwitchButton3.d(0);
        bigSwitchButton3.b(new rxh(2132021459));
        bigSwitchButton3.c(new rxh(2132018833));
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("tracker_blocker".equals(str)) {
            I0();
            H0();
        }
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((b87) obj).finish(hjm.b);
        }
        arrayList.clear();
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        xi5 xi5VarA = xi5.a(getContext());
        xi5VarA.i.c(this.t);
        this.u.H(this);
        this.v.c(this.w);
        this.z = null;
        super.onDestroyView();
    }

    @Override // defpackage.i93, defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (super.onMenuItemClick(menuItem)) {
            return true;
        }
        if (menuItem.getItemId() != 2131364069) {
            return false;
        }
        this.x.add(g25.b(getContext(), 0, 2132021454, 2132021455, new sk(this, (byte) 13)));
        return true;
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.v.a(this.w);
        this.u.F(this);
        getContext();
        this.A = true;
        FrameLayout frameLayout = (FrameLayout) this.z.b;
        svk svkVar = new svk(this, (byte) 9);
        dll dllVarS = q9n.s(frameLayout);
        if (dllVarS != null) {
            u8n.b(dllVarS, frameLayout, svkVar);
        }
        ((OperaListItem) this.z.e).setOnClickListener(new ic(this, (byte) 15));
        I0();
        H0();
        ((BigSwitchButton) this.z.d).jumpDrawablesToCurrentState();
        ((LinearLayout) this.z.g).setLayoutTransition(new LayoutTransition());
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.v0(layoutInflater, viewGroup);
        View viewInflate = layoutInflater.inflate(2131559318, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131362136;
        BigSwitchButton bigSwitchButton = (BigSwitchButton) w1h.j(2131362136, viewInflate);
        if (bigSwitchButton != null) {
            i = 2131363155;
            FrameLayout frameLayout = (FrameLayout) w1h.j(2131363155, viewInflate);
            if (frameLayout != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                i = 2131364826;
                OperaListItem operaListItem = (OperaListItem) w1h.j(2131364826, viewInflate);
                if (operaListItem != null) {
                    i = 2131364828;
                    SettingsStatisticView settingsStatisticView = (SettingsStatisticView) w1h.j(2131364828, viewInflate);
                    if (settingsStatisticView != null) {
                        i = 2131364970;
                        GraphView graphView = (GraphView) w1h.j(2131364970, viewInflate);
                        if (graphView != null) {
                            this.z = new pt1(linearLayout, bigSwitchButton, frameLayout, operaListItem, settingsStatisticView, graphView);
                            return;
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
