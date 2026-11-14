package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.w;
import com.google.android.material.button.MaterialButton;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class gge extends lj implements jbl {
    public final bf9 r;
    public final SettingsManager s;
    public kf t;
    public zq2 u;
    public Runnable v;

    /* JADX WARN: Illegal instructions before constructor call */
    public gge(bf9 bf9Var, SettingsManager settingsManager) {
        u7k u7kVarF = u7k.f(fki.a);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.k = 2;
        u7kVarF.s(2132019117);
        super(itlVar);
        this.r = bf9Var;
        this.s = settingsManager;
    }

    public static boolean G0(w wVar) {
        fge fgeVarF = wVar.F("flow");
        boolean zY = false;
        if (fgeVarF != null && !fgeVarF.u.r(fgeVarF.t)) {
            zY = wVar.Y(-1, 1, "flow");
        }
        if (zY) {
            return true;
        }
        return wVar.Y(-1, 1, "flow-onboarding");
    }

    public static void H0(View view) throws Resources.NotFoundException {
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(2131167197);
        l5b l5bVar = q9n.c;
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.leftMargin == dimensionPixelSize && marginLayoutParams.rightMargin == dimensionPixelSize) {
                return;
            }
            marginLayoutParams.setMargins(dimensionPixelSize, marginLayoutParams.topMargin, dimensionPixelSize, marginLayoutParams.bottomMargin);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // defpackage.k24, defpackage.ryl
    public final void h0(w wVar) {
        G0(wVar);
    }

    @Override // defpackage.ltl
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        kf kfVar = this.t;
        if (kfVar == null || this.u == null) {
            return;
        }
        H0((LinearLayout) kfVar.c);
        H0(this.u.c);
        H0(this.u.d);
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        Runnable runnable;
        super.onDestroy();
        if (this.s.r(this.r) && (runnable = this.v) != null) {
            runnable.run();
        }
        this.v = null;
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        this.t = null;
        this.u = null;
        super.onDestroyView();
    }

    @Override // defpackage.ltl
    public final void u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559121, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131362401;
        MaterialButton materialButtonJ = w1h.j(2131362401, viewInflate);
        if (materialButtonJ != null) {
            i = 2131363315;
            MaterialButton materialButtonJ2 = w1h.j(2131363315, viewInflate);
            if (materialButtonJ2 != null) {
                this.u = new zq2((LinearLayout) viewInflate, materialButtonJ, materialButtonJ2, (byte) 1);
                materialButtonJ.setOnClickListener(new n42(this, (byte) 2));
                this.u.d.setOnClickListener(new n42((byte) 3));
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559122, viewGroup, false);
        viewGroup.addView(viewInflate);
        if (viewInflate == null) {
            t3p.q("rootView");
        } else {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            this.t = new kf((byte) 19, linearLayout, linearLayout);
        }
    }

    @Override // defpackage.jbl
    public final String y() {
        return "flow-onboarding";
    }
}
