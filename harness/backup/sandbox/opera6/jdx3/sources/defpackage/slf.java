package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.opera.android.ui.catalog.widget.OperaRadioButton;

/* loaded from: classes.dex */
public final class slf extends ulf {
    public jmf h;

    @Override // defpackage.ulf
    public final CompoundButton O() {
        jmf jmfVar = this.h;
        if (jmfVar == null) {
            jmfVar = null;
        }
        return jmfVar.c;
    }

    public final void v(ViewGroup viewGroup) {
        viewGroup.setVisibility(0);
        LayoutInflater.from(viewGroup.getContext()).inflate(2131559185, viewGroup);
        OperaRadioButton operaRadioButton = (OperaRadioButton) w1h.j(2131362308, viewGroup);
        if (operaRadioButton != null) {
            this.h = new jmf(viewGroup, operaRadioButton, (byte) 0);
        } else {
            t3p.q("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(2131362308)));
        }
    }
}
