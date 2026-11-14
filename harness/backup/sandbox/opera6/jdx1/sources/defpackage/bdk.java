package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class bdk extends nt5 {
    public zck t;
    public zrm u;
    public /* synthetic */ Object v;
    public final /* synthetic */ cdk w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdk(cdk cdkVar, nt5 nt5Var) {
        super(nt5Var);
        this.w = cdkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.a(null, null, this);
    }
}
