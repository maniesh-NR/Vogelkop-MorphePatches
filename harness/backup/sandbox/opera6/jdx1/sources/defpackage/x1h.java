package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class x1h extends nt5 {
    public j3i t;
    public /* synthetic */ Object u;
    public final /* synthetic */ y1h v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1h(y1h y1hVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = y1hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        this.v.b(null, this);
        return px5.a;
    }
}
