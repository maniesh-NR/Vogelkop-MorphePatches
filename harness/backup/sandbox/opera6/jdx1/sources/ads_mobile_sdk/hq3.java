package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class hq3 extends nt5 {
    public yq3 a;
    public rg3 b;
    public rg3 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ yq3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq3(yq3 yq3Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = yq3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return yq3.b(this.e, this);
    }
}
