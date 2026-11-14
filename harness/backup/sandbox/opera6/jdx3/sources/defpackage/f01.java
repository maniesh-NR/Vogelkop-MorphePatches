package defpackage;

import com.opera.android.widget.RecyclerViewEmptyViewSwitcher;

/* loaded from: classes.dex */
public final class f01 extends yph {
    public final /* synthetic */ byte b = 1;
    public final /* synthetic */ lj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f01(RecyclerViewEmptyViewSwitcher recyclerViewEmptyViewSwitcher, jdo jdoVar) {
        super(recyclerViewEmptyViewSwitcher);
        this.c = jdoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f01(g01 g01Var, RecyclerViewEmptyViewSwitcher recyclerViewEmptyViewSwitcher) {
        super(recyclerViewEmptyViewSwitcher);
        this.c = g01Var;
    }

    @Override // defpackage.yph
    public final void j() {
        byte b = this.b;
        lj ljVar = this.c;
        switch (b) {
            case 0:
                g01 g01Var = (g01) ljVar;
                g01Var.r0(2131364146).setVisible(!g01Var.w.I());
                g01Var.r0(2131362507).setVisible(!g01Var.w.I());
                super.j();
                break;
            default:
                ((jdo) ljVar).H0();
                super.j();
                break;
        }
    }
}
