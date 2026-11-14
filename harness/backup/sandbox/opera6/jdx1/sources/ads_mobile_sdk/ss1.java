package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ss1 extends nt5 {
    public ts1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ts1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss1(ts1 ts1Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = ts1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a(null, 0, this);
    }
}
