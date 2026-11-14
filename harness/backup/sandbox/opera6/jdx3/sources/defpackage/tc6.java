package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.opera.android.custom_views.LayoutDirectionFrameLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.BigSwitchButton;
import com.opera.android.settings.SettingsManager;
import com.opera.android.settings.SettingsStatisticView;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.widget.GraphView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tc6 extends i93 implements jbl, p5j {
    public boolean A;
    public final bi t;
    public final SettingsManager u;
    public final ydn v;
    public final orm w;
    public final xi5 x;
    public final z77 y;
    public y83 z;

    public tc6(SettingsManager settingsManager, ydn ydnVar, orm ormVar, xi5 xi5Var, z77 z77Var, d8j d8jVar) {
        super(2132021182, 2131755028);
        this.u = settingsManager;
        this.v = ydnVar;
        this.w = ormVar;
        this.x = xi5Var;
        this.y = z77Var;
        Objects.requireNonNull(d8jVar);
        this.t = new bi(d8jVar, (byte) 1);
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return this.t;
    }

    public final void H0() {
        boolean zI = this.u.i("compression");
        ((LayoutDirectionFrameLayout) this.z.g).setEnabled(zI);
        GraphView graphView = (GraphView) this.z.h;
        long jG = this.x.c().g();
        if (jG == 0) {
            graphView.setVisibility(4);
        } else {
            graphView.setVisibility(0);
        }
        y83 y83Var = this.z;
        if (zI) {
            ((BigSwitchButton) y83Var.c).d(3);
            ((BigSwitchButton) this.z.c).b(new rxh(2132021181));
            ((BigSwitchButton) this.z.c).c(new rxh(2132018493));
        } else {
            ((BigSwitchButton) y83Var.c).d(0);
            ((BigSwitchButton) this.z.c).b(new rxh(2132021179));
            ((BigSwitchButton) this.z.c).c(new rxh(2132018489));
        }
        ((SettingsStatisticView) this.z.f).setActivated(zI);
        I0();
        r0(2131364069).setVisible(jG > 0);
        q9n.A(graphView, new fh4(this, graphView, (byte) 15));
    }

    public final void I0() {
        Context context = ((SettingsStatisticView) this.z.f).getContext();
        ui5 ui5VarC = this.x.c();
        long jG = ui5VarC.g();
        boolean z = this.A;
        y83 y83Var = this.z;
        if (z) {
            SettingsStatisticView settingsStatisticView = (SettingsStatisticView) y83Var.f;
            ((StylingTextView) settingsStatisticView.f.d).setText(getString(2132018500, new Object[]{Integer.valueOf(ui5VarC.f())}));
        } else {
            SettingsStatisticView settingsStatisticView2 = (SettingsStatisticView) y83Var.f;
            ((StylingTextView) settingsStatisticView2.f.d).setText(aik.h(jG, context));
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void J0() {
        ydn ydnVar = this.v;
        boolean z = ydnVar.d.a;
        SettingsManager settingsManager = this.u;
        ((OperaIconedMessage) this.z.e).setVisibility((!z || ydnVar.c.isEnabled() || settingsManager.i("compression")) ? 8 : 0);
        ?? r0 = (OperaListItem) this.z.d;
        r0.setVisibility(settingsManager.i("compression") ? 0 : 8);
        int turboImageQualityMode = settingsManager.getTurboImageQualityMode();
        m7j m7jVar = m7j.OFF;
        if (turboImageQualityMode != 1) {
            if (turboImageQualityMode == 2) {
                m7jVar = m7j.LOW;
            } else if (turboImageQualityMode == 3) {
                m7jVar = m7j.MEDIUM;
            } else if (turboImageQualityMode == 4) {
                m7jVar = m7j.HIGH;
            }
        }
        v0g.m((OperaListItem) r0, getResources().getString(m7jVar.a));
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        J0();
        if ("compression".equals(str)) {
            H0();
        }
    }

    @Override // defpackage.k24
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.u.F(this);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("extra_show_free_data_dialog", false)) {
            return;
        }
        arguments.remove("extra_show_free_data_dialog");
        getLifecycle().a(new y73(this, arguments.getBoolean("extra_enable_compression", false)));
    }

    @Override // defpackage.ltl
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        H0();
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.z = null;
    }

    @Override // defpackage.k24
    public final void onDetach() {
        this.u.H(this);
        super.onDetach();
    }

    @Override // defpackage.i93, defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (super.onMenuItemClick(menuItem)) {
            return true;
        }
        if (menuItem.getItemId() != 2131364069) {
            return false;
        }
        ol5 ol5Var = new ol5(2132018234, 2132018230, new jl4((Object) this, (byte) 26));
        z77 z77Var = this.y;
        z77Var.getClass();
        z77Var.b(ol5Var, ijm.b);
        return true;
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        GraphView graphView = (GraphView) this.z.h;
        pc5 pc5Var = new pc5(this, graphView);
        q9n.e(graphView, pc5Var);
        pc5Var.a(graphView);
        final byte b = 0;
        ((BigSwitchButton) this.z.c).setOnClickListener(new View.OnClickListener(this) { // from class: sc6
            public final /* synthetic */ tc6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b2 = b;
                tc6 tc6Var = this.b;
                switch (b2) {
                    case 0:
                        tc6Var.u.V(((BigSwitchButton) tc6Var.z.c).c == 3 ? 0 : 1, "compression");
                        tc6Var.J0();
                        tc6Var.H0();
                        break;
                    default:
                        tc6Var.A = !tc6Var.A;
                        tc6Var.I0();
                        break;
                }
            }
        });
        J0();
        H0();
        final byte b2 = 1;
        ((SettingsStatisticView) this.z.f).setOnClickListener(new View.OnClickListener(this) { // from class: sc6
            public final /* synthetic */ tc6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b2;
                tc6 tc6Var = this.b;
                switch (b22) {
                    case 0:
                        tc6Var.u.V(((BigSwitchButton) tc6Var.z.c).c == 3 ? 0 : 1, "compression");
                        tc6Var.J0();
                        tc6Var.H0();
                        break;
                    default:
                        tc6Var.A = !tc6Var.A;
                        tc6Var.I0();
                        break;
                }
            }
        });
        OperaListItem operaListItem = (OperaListItem) this.z.d;
        operaListItem.setOnClickListener(new nf(this, operaListItem, (byte) 29));
        ((BigSwitchButton) this.z.c).jumpDrawablesToCurrentState();
        ((LinearLayout) this.z.b).setLayoutTransition(new LayoutTransition());
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.v0(layoutInflater, viewGroup);
        View viewInflate = layoutInflater.inflate(2131559300, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131362136;
        BigSwitchButton bigSwitchButton = (BigSwitchButton) w1h.j(2131362136, viewInflate);
        if (bigSwitchButton != null) {
            i = 2131362392;
            OperaListItem operaListItem = (OperaListItem) w1h.j(2131362392, viewInflate);
            if (operaListItem != null) {
                i = 2131362492;
                OperaIconedMessage operaIconedMessage = (OperaIconedMessage) w1h.j(2131362492, viewInflate);
                if (operaIconedMessage != null) {
                    i = 2131362493;
                    SettingsStatisticView settingsStatisticView = (SettingsStatisticView) w1h.j(2131362493, viewInflate);
                    if (settingsStatisticView != null) {
                        i = 2131363155;
                        LayoutDirectionFrameLayout layoutDirectionFrameLayout = (LayoutDirectionFrameLayout) w1h.j(2131363155, viewInflate);
                        if (layoutDirectionFrameLayout != null) {
                            i = 2131364125;
                            GraphView graphView = (GraphView) w1h.j(2131364125, viewInflate);
                            if (graphView != null) {
                                this.z = new y83((LinearLayout) viewInflate, bigSwitchButton, operaListItem, operaIconedMessage, settingsStatisticView, layoutDirectionFrameLayout, graphView, (byte) 10);
                                return;
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.jbl
    public final String y() {
        return "data-savings";
    }
}
