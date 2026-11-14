package defpackage;

import android.os.Bundle;
import androidx.fragment.app.r;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class alj extends eog {
    public final zkj i;
    public final String j;

    public alj(zkj zkjVar, String str) {
        this.i = zkjVar;
        this.j = str;
    }

    public final void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.i*/.onCreate(bundle);
        r activity = getActivity();
        ps5 ps5Var = new ps5(activity);
        ps5Var.c = this;
        ps5Var.e = this;
        zkj zkjVar = this.i;
        int value = zkjVar.t().getValue();
        Iterator it = zkjVar.c().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                ps5Var.setHeaderTitle(this.j);
                ps5Var.setGroupCheckable(1, true, true);
                this.d = ps5Var;
                this.h = new axe(this, (byte) 1);
                return;
            }
            lrf lrfVar = (lrf) it.next();
            int i2 = i + 1;
            qtd qtdVarA = ps5Var.a(1, i, 0, lrfVar.getDescription() == 0 ? lrfVar.d(getResources()) : m5h.h(getActivity(), lrfVar.d(getResources()), getString(lrfVar.getDescription())));
            qtdVarA.setChecked(lrfVar.getValue() == value);
            int icon = lrfVar.getIcon();
            if (icon != 0) {
                qtdVarA.setIcon(sgb.F(icon, activity));
            }
            i = i2;
        }
    }
}
