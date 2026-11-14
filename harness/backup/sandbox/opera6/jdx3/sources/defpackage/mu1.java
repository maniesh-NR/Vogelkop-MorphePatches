package defpackage;

import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final /* synthetic */ class mu1 implements vlf {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pu1 b;

    public /* synthetic */ mu1(pu1 pu1Var, byte b) {
        this.a = b;
        this.b = pu1Var;
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        byte b = this.a;
        pu1 pu1Var = this.b;
        switch (b) {
            case 0:
                dxe dxeVar = pu1Var.I0().h;
                if (dxeVar != null) {
                    dxeVar.T(z, true);
                    break;
                }
                break;
            case 1:
                pu1Var.I0().b.V(z ? 1 : 0, "darken_websites_dark_theme");
                break;
            default:
                yu1 yu1Var = pu1Var.I0().i;
                e7j e7jVar = z ? e7j.d : e7j.c;
                ev1 ev1Var = yu1Var.b;
                if (ev1Var.a != e7jVar) {
                    ev1Var.a = e7jVar;
                    yu1Var.c();
                    break;
                }
                break;
        }
    }
}
