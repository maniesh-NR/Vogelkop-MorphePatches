package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class l8h extends nt5 {
    public vvh t;
    public /* synthetic */ Object u;
    public final /* synthetic */ q8h v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8h(q8h q8hVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = q8hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.d(null, this);
    }
}
