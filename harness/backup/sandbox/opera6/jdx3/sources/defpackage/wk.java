package defpackage;

import android.animation.LayoutTransition;
import android.content.res.Resources;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.BigSwitchButton;
import com.opera.android.settings.SettingsManager;
import com.opera.android.settings.SettingsStatisticView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.widget.GraphView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wk extends i93 implements p5j, o37 {
    public final ArrayList A;
    public final ua7 B;
    public rf2 C;
    public boolean D;
    public final uk t;
    public final SettingsManager u;
    public final tk v;
    public final bi w;
    public final tni x;
    public final xi5 y;
    public final rj z;

    public wk(gjm gjmVar, SettingsManager settingsManager, tni tniVar, xi5 xi5Var, d8j d8jVar, rj rjVar) {
        super(2132021072, 2131755055, 2, false);
        this.t = new uk(this, (byte) 0);
        this.v = new tk(this, (byte) 0);
        this.A = new ArrayList();
        this.B = new ua7((Fragment) this, gjmVar);
        this.u = settingsManager;
        this.x = tniVar;
        this.y = xi5Var;
        this.z = rjVar;
        Objects.requireNonNull(d8jVar);
        this.w = new bi(d8jVar, (byte) 1);
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return this.w;
    }

    public final void H0() {
        boolean z = this.u.i("ad_blocking") && this.D;
        ((FrameLayout) this.C.b).setEnabled(z);
        SettingsStatisticView settingsStatisticView = (SettingsStatisticView) this.C.f;
        xi5 xi5Var = this.y;
        long jB = xi5Var.b();
        ((StylingTextView) settingsStatisticView.f.d).setText(NumberFormat.getNumberInstance().format(jB));
        settingsStatisticView.setActivated(z);
        GraphView graphView = (GraphView) this.C.k;
        graphView.i = f03.u(2130969831, graphView.getContext(), 2131099816);
        graphView.invalidate();
        graphView.h = f03.u(2130969829, graphView.getContext(), 2131099816);
        graphView.a();
        graphView.setVisibility(jB > 0 ? 0 : 4);
        q9n.A(graphView, new xa(this, graphView, (byte) 2));
        r0(2131364069).setVisible(xi5Var.b() > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I0() throws Resources.NotFoundException {
        rxh rxhVar;
        SettingsManager settingsManager = this.u;
        byte b = 1;
        boolean z = settingsManager.i("ad_blocking") && this.D;
        BigSwitchButton bigSwitchButton = (BigSwitchButton) this.C.g;
        bigSwitchButton.d(z ? 3 : 0);
        bigSwitchButton.setOnClickListener(new nf(this, bigSwitchButton, (byte) 2));
        rf2 rf2Var = this.C;
        View[] viewArr = {(SeparatorView) rf2Var.i, (OperaListItem) rf2Var.e, (OperaListItem) rf2Var.h, (SeparatorView) rf2Var.j, (OperaListItem) rf2Var.c};
        int i = 0;
        while (true) {
            int i2 = 8;
            if (i >= 5) {
                break;
            }
            GLSurfaceView gLSurfaceView = viewArr[i];
            if (z) {
                i2 = 0;
            }
            gLSurfaceView.setVisibility(i2);
            i++;
        }
        rf2 rf2Var2 = this.C;
        if (z) {
            BigSwitchButton bigSwitchButton2 = (BigSwitchButton) rf2Var2.g;
            bigSwitchButton2.d(3);
            bigSwitchButton2.b(new rxh(2132021073));
            bigSwitchButton2.c(new rxh(2132017363));
            OperaListItem operaListItem = (OperaListItem) this.C.e;
            int iOrdinal = settingsManager.b().ordinal();
            if (iOrdinal == 0) {
                rxhVar = new rxh(2132017294);
            } else if (iOrdinal == 1) {
                rxhVar = new rxh(2132017300);
            } else {
                if (iOrdinal != 2) {
                    throw new RuntimeException(null, null);
                }
                rxhVar = new rxh(2132017298);
            }
            operaListItem.C(rxhVar);
            operaListItem.setOnClickListener(new rk(this, b));
            OperaListItem operaListItem2 = (OperaListItem) this.C.h;
            operaListItem2.setChecked(settingsManager.i("banner_blocker"));
            operaListItem2.u = new bi(this, (byte) 2);
        } else {
            BigSwitchButton bigSwitchButton3 = (BigSwitchButton) rf2Var2.g;
            bigSwitchButton3.d(0);
            bigSwitchButton3.b(new rxh(2132021071));
            bigSwitchButton3.c(new rxh(2132017362));
        }
        new View[]{(OperaListItem) this.C.e}[0].setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.p5j
    public final void M(String str) throws Resources.NotFoundException {
        if ("ad_blocking".equals(str) || "banner_blocker".equals(str) || "tracker_blocker".equals(str) || "ad_blocking_mode".equals(str)) {
            I0();
            H0();
        }
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.A;
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
        this.y.i.c(this.t);
        this.u.H(this);
        this.x.c(this.v);
        this.C = null;
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
        this.A.add(g25.b(getContext(), 0, 2132021069, 2132021070, new sk(this, (byte) 0)));
        return true;
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) throws Resources.NotFoundException {
        super.onViewCreated(view, bundle);
        this.x.a(this.v);
        this.u.F(this);
        this.y.i.b(this.t);
        getContext();
        this.D = true;
        FrameLayout frameLayout = (FrameLayout) this.C.b;
        u7 u7Var = new u7(this, (byte) 3);
        dll dllVarS = q9n.s(frameLayout);
        if (dllVarS != null) {
            u8n.b(dllVarS, frameLayout, u7Var);
        }
        ((OperaListItem) this.C.c).setOnClickListener(new rk(this, (byte) 0));
        I0();
        H0();
        ((BigSwitchButton) this.C.g).jumpDrawablesToCurrentState();
        ((LinearLayout) this.C.d).setLayoutTransition(new LayoutTransition());
        this.s.F();
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.B;
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.v0(layoutInflater, viewGroup);
        View viewInflate = layoutInflater.inflate(2131559294, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131361907;
        OperaListItem operaListItem = (OperaListItem) w1h.j(2131361907, viewInflate);
        if (operaListItem != null) {
            i = 2131361925;
            OperaListItem operaListItem2 = (OperaListItem) w1h.j(2131361925, viewInflate);
            if (operaListItem2 != null) {
                i = 2131361926;
                SettingsStatisticView settingsStatisticView = (SettingsStatisticView) w1h.j(2131361926, viewInflate);
                if (settingsStatisticView != null) {
                    i = 2131362136;
                    BigSwitchButton bigSwitchButton = (BigSwitchButton) w1h.j(2131362136, viewInflate);
                    if (bigSwitchButton != null) {
                        i = 2131362139;
                        OperaListItem operaListItem3 = (OperaListItem) w1h.j(2131362139, viewInflate);
                        if (operaListItem3 != null) {
                            i = 2131362446;
                            SeparatorView separatorView = (SeparatorView) w1h.j(2131362446, viewInflate);
                            if (separatorView != null) {
                                i = 2131362756;
                                SeparatorView separatorView2 = (SeparatorView) w1h.j(2131362756, viewInflate);
                                if (separatorView2 != null) {
                                    i = 2131363155;
                                    FrameLayout frameLayout = (FrameLayout) w1h.j(2131363155, viewInflate);
                                    if (frameLayout != null) {
                                        i = 2131363227;
                                        if (((OperaListItem) w1h.j(2131363227, viewInflate)) != null) {
                                            i = 2131364970;
                                            GraphView graphView = (GraphView) w1h.j(2131364970, viewInflate);
                                            if (graphView != null) {
                                                this.C = new rf2((LinearLayout) viewInflate, operaListItem, operaListItem2, settingsStatisticView, bigSwitchButton, operaListItem3, separatorView, separatorView2, frameLayout, graphView);
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
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
