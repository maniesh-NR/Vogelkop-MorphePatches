package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class oa2 extends nt5 {
    public Object a;
    public Object b;
    public rg3 c;
    public rg3 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xa2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa2(xa2 xa2Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = xa2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a((n13) null, this);
    }
}
