package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class laf extends nt5 {
    public i19 t;
    public i19 u;
    public slh v;
    public /* synthetic */ Object w;
    public final /* synthetic */ maf x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laf(maf mafVar, nt5 nt5Var) {
        super(nt5Var);
        this.x = mafVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= LinearLayoutManager.INVALID_OFFSET;
        return this.x.d(this, null);
    }
}
