package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class qd9 extends nt5 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ rd9 v;
    public l99 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd9(rd9 rd9Var, mt5 mt5Var) {
        super(mt5Var);
        this.v = rd9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.emit(null, this);
    }
}
