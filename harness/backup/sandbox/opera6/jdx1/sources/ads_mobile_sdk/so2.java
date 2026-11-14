package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class so2 extends nt5 {
    public td1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uo2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so2(uo2 uo2Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = uo2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a((td1) null, this);
    }
}
