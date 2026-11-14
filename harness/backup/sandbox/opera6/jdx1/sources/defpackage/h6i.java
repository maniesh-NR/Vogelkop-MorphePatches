package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class h6i extends nt5 {
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ b6i v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6i(b6i b6iVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = b6iVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.s(this);
    }
}
