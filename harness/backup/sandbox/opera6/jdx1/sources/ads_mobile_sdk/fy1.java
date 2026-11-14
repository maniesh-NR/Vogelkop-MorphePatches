package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class fy1 extends nt5 {
    public o6 a;
    public rg3 b;
    public rg3 c;
    public cy0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ o6 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy1(o6 o6Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = o6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return o6.a(this.f, null, this);
    }
}
