package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class qd2 extends nt5 {
    public bza t;
    public /* synthetic */ Object u;
    public final /* synthetic */ rd2 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd2(rd2 rd2Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = rd2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.a(null, null, this);
    }
}
