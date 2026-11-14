package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;

/* loaded from: classes.dex */
public final class nmm extends lj {
    public jm9 r;
    public final ua7 s;

    public nmm(gjm gjmVar) {
        super(2132020339, 0);
        this.s = new ua7((Fragment) this, gjmVar);
    }

    public final void G0() {
        Context contextRequireContext = requireContext();
        cbl cblVar = new cbl(this, (byte) 29);
        if (!wi2.l) {
            String[] strArr = OperaApplication.K;
            SettingsManager settingsManagerJ = ((OperaApplication) contextRequireContext.getApplicationContext()).J();
            if (!wi2.l) {
                wi2.j = settingsManagerJ;
                wi2.k = u55.Ro;
                wi2.l = true;
            }
        }
        wi2.i.b(contextRequireContext, cblVar);
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        G0();
        jm9 jm9Var = this.r;
        if (jm9Var == null) {
            jm9Var = null;
        }
        jm9Var.c.setOnClickListener(new pkm(this, (byte) 1));
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131558890, viewGroup, false);
        viewGroup.addView(constraintLayoutInflate);
        int i = 2131363183;
        if (((ImageView) w1h.j(2131363183, constraintLayoutInflate)) != null) {
            i = 2131363485;
            if (((TextView) w1h.j(2131363485, constraintLayoutInflate)) != null) {
                i = 2131364949;
                OperaMaterialButton operaMaterialButton = (OperaMaterialButton) w1h.j(2131364949, constraintLayoutInflate);
                if (operaMaterialButton != null) {
                    this.r = new jm9(constraintLayoutInflate, operaMaterialButton);
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
    }
}
