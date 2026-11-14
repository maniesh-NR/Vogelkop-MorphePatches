package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class fr1 extends nt5 {
    public hr1 a;
    public g21 b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ hr1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr1(hr1 hr1Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = hr1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a(null, null, this);
    }
}
