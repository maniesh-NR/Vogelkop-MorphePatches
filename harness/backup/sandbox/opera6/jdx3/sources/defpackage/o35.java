package defpackage;

import android.view.LayoutInflater;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class o35 {
    public final r25 a;
    public final OperaListItem b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public o35(p35 p35Var, LayoutInflater layoutInflater, r25 r25Var, boolean z) {
        this.a = r25Var;
        ?? r5 = (OperaListItem) layoutInflater.inflate(2131559296, p35Var.t, false);
        this.b = r5;
        p35Var.t.addView(r5);
        r5.E(r25Var.b);
        int iB = r25Var.b();
        if (iB != 0) {
            u35.k(iB, (OperaListItem) r5);
        }
        r5.z(new lxh(r25Var.d));
        r5.u = new vw(z, p35Var);
    }
}
