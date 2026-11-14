package defpackage;

import android.content.Context;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.mainmenu.MainMenuSheetToggleLayout;
import com.opera.android.mainmenu.ToggleAnimationView;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class vrl extends k8 implements tdn {
    public final ydn o;
    public final xt8 p;
    public final i3j q;
    public final ro9 r;

    public vrl(MainMenuSheetToggleLayout mainMenuSheetToggleLayout, crk crkVar, ydn ydnVar, xt8 xt8Var, i3j i3jVar) {
        super(mainMenuSheetToggleLayout, crkVar);
        this.o = ydnVar;
        this.p = xt8Var;
        this.q = i3jVar;
        this.r = new ro9((ToggleAnimationView) mainMenuSheetToggleLayout.a.c);
        u0();
        boolean zIsEnabled = ydnVar.c.isEnabled();
        ToggleAnimationView toggleAnimationView = (ToggleAnimationView) mainMenuSheetToggleLayout.a.c;
        if (zIsEnabled != toggleAnimationView.y) {
            toggleAnimationView.y = zIsEnabled;
            toggleAnimationView.invalidate();
        }
        t0();
    }

    @Override // defpackage.tdn
    public final void C() {
        t0();
    }

    @Override // defpackage.k8
    public final void P() {
        ((MainMenuSheetToggleLayout) this.a).setOnClickListener(null);
        this.o.H(this);
    }

    @Override // defpackage.k8
    public final int W() {
        return 0;
    }

    @Override // defpackage.k8
    public final boolean isEnabled() {
        return this.o.d.a;
    }

    @Override // defpackage.k8
    public final void k0(boolean z) {
        this.o.C(z);
    }

    @Override // defpackage.k8
    public final boolean m0() {
        xt8 xt8Var = this.p;
        return uup.K(xt8Var, 0) || (this.o.p().e && ((svg) tvg.t(((MainMenuSheetToggleLayout) this.a).getContext()).i()).a(2) && uup.K(xt8Var, 2));
    }

    @Override // defpackage.k8
    public final void q0() {
        pxh pxhVarF;
        MainMenuSheetToggleLayout mainMenuSheetToggleLayout = (MainMenuSheetToggleLayout) this.a;
        ydn ydnVar = this.o;
        int iA = vep.A(ydnVar.q());
        if (iA == 0) {
            pxhVarF = ydnVar.f.g() ? ydnVar.f.f(mainMenuSheetToggleLayout.getContext()) : new rxh(2132021994);
        } else if (iA != 2) {
            pxhVarF = iA != 3 ? ydnVar.d.b() ? new rxh(2132019668) : new rxh(2132021995) : new rxh(2132022275);
        } else {
            pxhVarF = new rxh(ydnVar.e.d ? 2132022276 : 2132021630);
        }
        mainMenuSheetToggleLayout.d = pxhVarF.a(mainMenuSheetToggleLayout.getResources());
        mainMenuSheetToggleLayout.a();
    }

    @Override // defpackage.k8
    public final void r0(qrl qrlVar) {
        i3j i3jVar = this.q;
        Context context = (Context) i3jVar.a;
        SettingsManager settingsManager = (SettingsManager) i3jVar.b;
        boolean zI = settingsManager.i("compression");
        if (!settingsManager.i("show_conflicting_settings_warning") || !zI || ((ydn) i3jVar.c).c.isEnabled()) {
            qrlVar.run();
            return;
        }
        String string = context.getString(2132018504);
        String string2 = context.getString(2132022134);
        String string3 = ((Context) i3jVar.a).getString(2132019667);
        z77 z77Var = (z77) i3jVar.d;
        ql5 ql5Var = new ql5(string, string2, string3, (SettingsManager) i3jVar.b, qrlVar);
        z77Var.getClass();
        z77Var.b(ql5Var, ijm.b);
    }

    @Override // defpackage.tdn
    public final void s() {
        if (u0()) {
            s0();
            MainMenuSheetToggleLayout mainMenuSheetToggleLayout = (MainMenuSheetToggleLayout) this.a;
            boolean zIsEnabled = this.o.c.isEnabled();
            ToggleAnimationView toggleAnimationView = (ToggleAnimationView) mainMenuSheetToggleLayout.a.c;
            if (zIsEnabled != toggleAnimationView.y) {
                toggleAnimationView.y = zIsEnabled;
                toggleAnimationView.invalidate();
            }
        }
    }

    public final void s0() {
        k2d k2dVar = ro9.g;
        q0();
        int iQ = this.o.q();
        MainMenuSheetToggleLayout mainMenuSheetToggleLayout = (MainMenuSheetToggleLayout) this.a;
        int iA = vep.A(iQ);
        mainMenuSheetToggleLayout.c = iA == 1 || iA == 2;
        mainMenuSheetToggleLayout.a();
        ro9 ro9Var = this.r;
        if (iQ != ro9Var.b) {
            ro9Var.b = iQ;
            k2d k2dVar2 = ro9.f;
            if (((n2d) ((ToggleAnimationView) ro9Var.c)).m != null) {
                int iA2 = vep.A(iQ);
                if (iA2 != 0) {
                    if (iA2 == 1) {
                        k2d k2dVar3 = (k2d) ro9Var.d;
                        if (k2dVar3 == k2dVar) {
                            ro9Var.D(ro9.h);
                            return;
                        } else {
                            if (k2dVar3 == k2dVar2 || k2dVar3 == k2dVar) {
                                return;
                            }
                            ro9Var.D(k2dVar2);
                            return;
                        }
                    }
                    if (iA2 == 2) {
                        k2d k2dVar4 = (k2d) ro9Var.d;
                        if (k2dVar4 == k2dVar2 || k2dVar4 == k2dVar) {
                            return;
                        }
                        ro9Var.D(k2dVar2);
                        return;
                    }
                    if (iA2 != 3) {
                        return;
                    }
                }
                ro9Var.D(ro9.j);
            }
        }
    }

    @Override // defpackage.tdn
    public final void t() {
    }

    public final void t0() {
        MainMenuSheetToggleLayout mainMenuSheetToggleLayout = (MainMenuSheetToggleLayout) this.a;
        ((StylingTextView) mainMenuSheetToggleLayout.a.e).setText(mainMenuSheetToggleLayout.getContext().getString(this.o.c.isEnabled() ? 2132022254 : 2132022280));
    }

    public final boolean u0() {
        MainMenuSheetToggleLayout mainMenuSheetToggleLayout = (MainMenuSheetToggleLayout) this.a;
        ydn ydnVar = this.o;
        if (!ydnVar.p().a || (((tfn) ydnVar.o.i()).a & 8) == 0) {
            mainMenuSheetToggleLayout.setVisibility(8);
            return false;
        }
        mainMenuSheetToggleLayout.setVisibility(0);
        return true;
    }
}
