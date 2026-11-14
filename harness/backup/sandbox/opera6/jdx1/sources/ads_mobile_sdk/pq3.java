package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class pq3 extends nt5 {
    public Object a;
    public rg3 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yq3 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq3(yq3 yq3Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = yq3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return yq3.c(this.d, this);
    }
}
