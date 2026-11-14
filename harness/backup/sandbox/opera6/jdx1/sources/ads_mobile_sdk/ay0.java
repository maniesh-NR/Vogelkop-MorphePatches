package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ay0 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ cy0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay0(cy0 cy0Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = cy0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.c(null, this);
    }
}
