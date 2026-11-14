package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class r92 extends nt5 {
    public u92 a;
    public w92 b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ u92 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r92(u92 u92Var, mt5 mt5Var) {
        super(mt5Var);
        this.e = u92Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return u92.a(this.e, (w92) null, (mt5) this);
    }
}
