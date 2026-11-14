package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class x5o extends nt5 {
    public z5o t;
    public /* synthetic */ Object u;
    public final /* synthetic */ z5o v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5o(z5o z5oVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = z5oVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.c(this);
    }
}
