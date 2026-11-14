package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class gok extends vi7 {
    public final /* synthetic */ hok u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gok(hok hokVar, umi umiVar, int i, boolean z, hok hokVar2) {
        super(umiVar, i, z, 500, hokVar2, true);
        this.u = hokVar;
    }

    @Override // defpackage.blb
    public final int h(RecyclerView recyclerView, i iVar) {
        hq8 hq8Var = iVar instanceof fs8 ? ((fs8) iVar).f : null;
        if (hq8Var == null || ((qok) hq8Var).e.d != 3) {
            return super.h(recyclerView, iVar);
        }
        return 0;
    }

    @Override // defpackage.vi7
    public final void v(i iVar, ti7 ti7Var) {
        super.v(iVar, ti7Var);
        hq8 hq8Var = iVar instanceof fs8 ? ((fs8) iVar).f : null;
        if (hq8Var != null) {
            this.u.b0(hq8Var, true);
        }
    }
}
