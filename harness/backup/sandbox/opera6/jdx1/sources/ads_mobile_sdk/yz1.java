package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class yz1 extends nt5 {
    public a02 a;
    public rg3 b;
    public rg3 c;
    public cy0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ a02 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz1(a02 a02Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = a02Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return a02.a(this.f, this);
    }
}
