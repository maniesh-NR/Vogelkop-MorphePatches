package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class d1o extends nt5 {
    public pqh t;
    public pqh u;
    public String v;
    public String w;
    public /* synthetic */ Object x;
    public final /* synthetic */ m91 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1o(m91 m91Var, mt5 mt5Var) {
        super(mt5Var);
        this.y = m91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= LinearLayoutManager.INVALID_OFFSET;
        return this.y.b(this);
    }
}
