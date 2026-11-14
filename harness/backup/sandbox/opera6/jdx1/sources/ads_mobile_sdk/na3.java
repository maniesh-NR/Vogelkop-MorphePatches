package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class na3 extends nt5 {
    public oa3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oa3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na3(oa3 oa3Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = oa3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return oa3.a(this.c, this);
    }
}
