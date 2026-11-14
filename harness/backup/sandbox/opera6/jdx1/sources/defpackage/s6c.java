package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class s6c extends nt5 {
    public gfe t;
    public kuk u;
    public /* synthetic */ Object v;
    public final /* synthetic */ u6c w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6c(u6c u6cVar, nt5 nt5Var) {
        super(nt5Var);
        this.w = u6cVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.b(null, null, this);
    }
}
