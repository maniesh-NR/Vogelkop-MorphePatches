package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class an0 extends nt5 {
    public bn0 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bn0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an0(bn0 bn0Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = bn0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return bn0.a(this.d, this);
    }
}
