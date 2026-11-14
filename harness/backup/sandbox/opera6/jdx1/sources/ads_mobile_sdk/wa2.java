package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class wa2 extends nt5 {
    public xa2 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xa2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa2(xa2 xa2Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = xa2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.c(this);
    }
}
