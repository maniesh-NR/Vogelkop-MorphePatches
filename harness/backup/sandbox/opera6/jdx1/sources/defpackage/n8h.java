package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class n8h extends nt5 {
    public xvh t;
    public String u;
    public /* synthetic */ Object v;
    public final /* synthetic */ q8h w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8h(q8h q8hVar, nt5 nt5Var) {
        super(nt5Var);
        this.w = q8hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.f(null, this);
    }
}
