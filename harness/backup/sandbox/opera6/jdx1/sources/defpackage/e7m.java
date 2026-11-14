package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class e7m extends nt5 {
    public int A;
    public tng t;
    public String u;
    public String[] v;
    public int w;
    public byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ g7m z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7m(g7m g7mVar, nt5 nt5Var) {
        super(nt5Var);
        this.z = g7mVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= LinearLayoutManager.INVALID_OFFSET;
        return this.z.m(null, 0, this);
    }
}
