package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class o8h extends nt5 {
    public qwh t;
    public String u;
    public Object v;
    public /* synthetic */ Object w;
    public final /* synthetic */ q8h x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8h(q8h q8hVar, nt5 nt5Var) {
        super(nt5Var);
        this.x = q8hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= LinearLayoutManager.INVALID_OFFSET;
        return this.x.g(null, this);
    }
}
