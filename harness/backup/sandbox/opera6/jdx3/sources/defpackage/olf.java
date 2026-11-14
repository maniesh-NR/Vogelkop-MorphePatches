package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.checkbox.MaterialCheckBox;

/* loaded from: classes.dex */
public final class olf extends ulf {
    public hmf h;

    @Override // defpackage.ulf
    public final CompoundButton O() {
        hmf hmfVar = this.h;
        if (hmfVar == null) {
            hmfVar = null;
        }
        return hmfVar.c;
    }

    public final void v(ViewGroup viewGroup) {
        viewGroup.setVisibility(0);
        LayoutInflater.from(viewGroup.getContext()).inflate(2131559183, viewGroup);
        MaterialCheckBox materialCheckBoxJ = w1h.j(2131362308, viewGroup);
        if (materialCheckBoxJ != null) {
            this.h = new hmf(viewGroup, materialCheckBoxJ, (byte) 0);
        } else {
            t3p.q("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(2131362308)));
        }
    }
}
