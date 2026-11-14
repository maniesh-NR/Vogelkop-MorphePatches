package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class gma extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ ima u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gma(ima imaVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = imaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.U0(this);
    }
}
