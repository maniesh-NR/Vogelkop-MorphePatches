package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class vkn {
    public final ujn a;
    public final RecyclerView b;
    public final q87 c;
    public final zk7 d;
    public final plk e;
    public final plk f;

    public vkn(qln qlnVar, RecyclerView recyclerView, n1 n1Var, int i, int i2, tjn tjnVar) {
        this.b = recyclerView;
        ujn ujnVar = new ujn(n1Var, qlnVar.g, null, tjnVar);
        this.a = ujnVar;
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(1, 0);
        t79 t79Var = new t79(recyclerView, gridLayoutManager, i2, 0, i, 0, 1, (byte) 0);
        k56 k56Var = new k56();
        k56Var.g = false;
        recyclerView.B0(k56Var);
        recyclerView.C0(gridLayoutManager);
        recyclerView.m(new i4a(t79Var));
        zk7 zk7Var = new zk7(new g00(recyclerView.getContext(), 2131233314, (byte) 2), new roj(this, qlnVar, (byte) 13));
        this.d = zk7Var;
        recyclerView.m(zk7Var);
        this.e = new plk(recyclerView, ujnVar, new r2n((Object) recyclerView, (byte) 10));
        this.f = new plk(recyclerView, ujnVar, new g00(recyclerView.getContext(), 2131233313, (byte) 2));
        q87 q87Var = new q87(recyclerView.getContext(), 2131233315, new ivg((byte) 13, this, qlnVar, false));
        this.c = q87Var;
        recyclerView.m(q87Var);
        recyclerView.y0(ujnVar);
    }
}
