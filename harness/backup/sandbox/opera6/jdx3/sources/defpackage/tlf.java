package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.opera.android.ui.catalog.widget.OperaSwitch;

/* loaded from: classes.dex */
public final class tlf extends ulf {
    public kf h;

    @Override // defpackage.ulf
    public final CompoundButton O() {
        kf kfVar = this.h;
        if (kfVar == null) {
            kfVar = null;
        }
        return (OperaSwitch) kfVar.c;
    }

    public final void v(ViewGroup viewGroup) {
        viewGroup.setVisibility(0);
        LayoutInflater.from(viewGroup.getContext()).inflate(2131559186, viewGroup);
        OperaSwitch operaSwitch = (OperaSwitch) w1h.j(2131362050, viewGroup);
        if (operaSwitch != null) {
            this.h = new kf((byte) 21, viewGroup, operaSwitch);
        } else {
            t3p.q("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(2131362050)));
        }
    }
}
