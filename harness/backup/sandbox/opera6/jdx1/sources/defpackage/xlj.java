package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class xlj extends nt5 {
    public pfe t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ylj w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlj(ylj yljVar, mt5 mt5Var) {
        super(mt5Var);
        this.w = yljVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.c(null, this);
    }
}
