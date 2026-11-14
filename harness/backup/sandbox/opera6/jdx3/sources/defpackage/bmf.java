package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.opera.android.ui.catalog.widget.OperaRadioButton;

/* loaded from: classes.dex */
public final class bmf extends cmf {
    public jmf l;

    public final void F(ViewGroup viewGroup) {
        viewGroup.setVisibility(0);
        LayoutInflater.from(viewGroup.getContext()).inflate(2131559189, viewGroup);
        OperaRadioButton operaRadioButton = (OperaRadioButton) w1h.j(2131362308, viewGroup);
        if (operaRadioButton != null) {
            this.l = new jmf(viewGroup, operaRadioButton, (byte) 1);
        } else {
            t3p.q("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(2131362308)));
        }
    }

    @Override // defpackage.cmf
    public final CompoundButton t0() {
        jmf jmfVar = this.l;
        if (jmfVar == null) {
            jmfVar = null;
        }
        return jmfVar.c;
    }
}
