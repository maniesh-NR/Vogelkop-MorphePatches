package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class xc2 extends nt5 {
    public Object a;
    public rg3 b;
    public rg3 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ yc2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc2(yc2 yc2Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = yc2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return yc2.b(this.e, this);
    }
}
