package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class i93 extends nt5 {
    public k93 a;
    public rg3 b;
    public rg3 c;
    public cy0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ k93 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i93(k93 k93Var, mt5 mt5Var) {
        super(mt5Var);
        this.f = k93Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return k93.a(this.f, (mt5) this);
    }
}
