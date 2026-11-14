package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class vl1 extends nt5 {
    public Object a;
    public Object b;
    public rg3 c;
    public rg3 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ zl1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl1(zl1 zl1Var, mt5 mt5Var) {
        super(mt5Var);
        this.f = zl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a(null, null, this);
    }
}
