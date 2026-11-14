package defpackage;

import android.content.res.Resources;
import android.view.ViewGroup;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class c35 {
    public final r25 a;
    public final OperaListItem b;
    public boolean c;
    public int d;
    public boolean e;
    public final /* synthetic */ e35 f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public c35(e35 e35Var, r25 r25Var) {
        this.f = e35Var;
        this.a = r25Var;
        ?? r0 = (OperaListItem) e35Var.s.inflate(2131559296, (ViewGroup) e35Var.t, false);
        this.b = r0;
        e35Var.t.addView(r0);
        r0.E(r25Var.b);
        r0.C(new rxh(2132021144));
        r0.z(new lxh(r25Var.d));
        r0.u = new jl4((Object) e35Var, (byte) 11);
    }

    public final void a(boolean z) throws Resources.NotFoundException {
        if (this.e) {
            this.b.setChecked(z);
        }
    }
}
