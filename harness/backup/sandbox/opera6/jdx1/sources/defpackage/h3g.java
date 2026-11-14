package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class h3g extends nt5 {
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ j3g v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3g(j3g j3gVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = j3gVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.d(null, null, this);
    }
}
