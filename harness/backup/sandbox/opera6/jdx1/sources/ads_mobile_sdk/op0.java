package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.fvo;

/* loaded from: classes.dex */
public final class op0 extends nt5 {
    public qp0 a;
    public fvo b;
    public /* synthetic */ Object c;
    public final /* synthetic */ qp0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op0(qp0 qp0Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = qp0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return qp0.b(this.d, (fvo) null, this);
    }
}
