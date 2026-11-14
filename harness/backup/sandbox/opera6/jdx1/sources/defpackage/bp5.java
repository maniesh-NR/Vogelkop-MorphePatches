package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class bp5 extends nt5 {
    public pqh t;
    public /* synthetic */ Object u;
    public final /* synthetic */ cp5 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp5(cp5 cp5Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = cp5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.f(this);
    }
}
