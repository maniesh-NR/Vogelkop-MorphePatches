package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class sm2 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ on2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm2(on2 on2Var, mt5 mt5Var) {
        super(mt5Var);
        this.b = on2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return on2.a(this.b, (mt5) this);
    }
}
