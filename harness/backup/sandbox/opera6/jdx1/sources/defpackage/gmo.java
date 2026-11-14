package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class gmo extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ cpj u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmo(cpj cpjVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = cpjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.e(null, this);
    }
}
