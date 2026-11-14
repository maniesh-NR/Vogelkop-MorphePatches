package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class h7o extends d7o {
    public final xol k;

    public h7o(kf kfVar, tsd tsdVar, tsd tsdVar2, lrk lrkVar) {
        super(kfVar, tsdVar, tsdVar2, 2131559580, g7o.a, new q0n((byte) 23), lrkVar);
        xol xolVar = new xol(new cs((byte) 8));
        this.k = xolVar;
        RecyclerView recyclerView = ((a7o) this.g).c;
        recyclerView.getContext();
        recyclerView.C0(new LinearLayoutManager(0, false));
        recyclerView.y0(xolVar);
    }

    @Override // defpackage.ab2
    public final void Y() {
        this.k.I(null);
    }

    @Override // defpackage.d7o
    public final void b0(a5n a5nVar, p6o p6oVar) {
        this.k.I((k7o) p6oVar);
    }
}
