package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class sj4 extends nt5 {
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ tj4 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj4(tj4 tj4Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = tj4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.a(null, 0, null, 0, 0, 0, this);
    }
}
