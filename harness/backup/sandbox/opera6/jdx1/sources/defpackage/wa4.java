package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class wa4 extends nt5 {
    public String t;
    public h07 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ za4 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa4(za4 za4Var, nt5 nt5Var) {
        super(nt5Var);
        this.w = za4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.a(null, this);
    }
}
