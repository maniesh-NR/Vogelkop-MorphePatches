package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class de6 extends nt5 {
    public boolean t;
    public fak u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ie6 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de6(ie6 ie6Var, mt5 mt5Var) {
        super(mt5Var);
        this.w = ie6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.g(false, this);
    }
}
