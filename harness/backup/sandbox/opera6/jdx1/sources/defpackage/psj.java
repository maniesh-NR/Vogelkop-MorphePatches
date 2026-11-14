package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class psj extends nt5 {
    public osj t;
    public pfe u;
    public /* synthetic */ Object v;
    public final /* synthetic */ qsj w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psj(qsj qsjVar, nt5 nt5Var) {
        super(nt5Var);
        this.w = qsjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.a(null, this);
    }
}
