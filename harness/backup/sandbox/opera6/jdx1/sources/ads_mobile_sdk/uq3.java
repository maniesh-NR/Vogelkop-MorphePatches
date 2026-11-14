package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class uq3 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ yq3 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq3(yq3 yq3Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = yq3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return yq3.e(this.b, this);
    }
}
