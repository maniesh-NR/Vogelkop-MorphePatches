package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class lq3 extends nt5 {
    public yq3 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yq3 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq3(yq3 yq3Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = yq3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return yq3.d(this.d, this);
    }
}
