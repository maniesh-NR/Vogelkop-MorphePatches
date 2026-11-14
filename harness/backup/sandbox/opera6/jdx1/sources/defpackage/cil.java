package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class cil extends nt5 {
    public dil t;
    public /* synthetic */ Object u;
    public final /* synthetic */ dil v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cil(dil dilVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = dilVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.t(this);
    }
}
