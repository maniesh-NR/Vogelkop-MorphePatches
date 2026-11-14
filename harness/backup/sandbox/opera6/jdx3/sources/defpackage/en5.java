package defpackage;

import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class en5 extends bn5 {
    public final /* synthetic */ byte b = 0;
    public final a5n c;

    public en5(jt jtVar) {
        super(jtVar.b);
        this.c = jtVar;
    }

    public en5(mn5 mn5Var) {
        super(mn5Var.b);
        this.c = mn5Var;
    }

    private final void X() {
    }

    private final void Y() {
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    @Override // defpackage.bn5
    public final void U(gn5 gn5Var, int i) {
        byte b = this.b;
        a5n a5nVar = this.c;
        switch (b) {
            case 0:
                dn5 dn5Var = (dn5) gn5Var;
                ?? r1 = ((jt) a5nVar).b;
                r1.getContext();
                r1.E(new rxh(dn5Var.b));
                u35.k(dn5Var.c, (OperaListItem) r1);
                break;
            default:
                ((mn5) a5nVar).b.setText(((fn5) gn5Var).a);
                break;
        }
    }

    @Override // defpackage.bn5
    public final void V() {
        byte b = this.b;
    }
}
