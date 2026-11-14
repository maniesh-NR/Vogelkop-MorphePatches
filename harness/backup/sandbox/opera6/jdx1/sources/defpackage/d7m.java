package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class d7m extends nt5 {
    public final /* synthetic */ g7m A;
    public int B;
    public tng t;
    public String u;
    public String[] v;
    public int w;
    public int x;
    public byte y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7m(g7m g7mVar, nt5 nt5Var) {
        super(nt5Var);
        this.A = g7mVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= LinearLayoutManager.INVALID_OFFSET;
        return this.A.l(null, 0, this);
    }
}
