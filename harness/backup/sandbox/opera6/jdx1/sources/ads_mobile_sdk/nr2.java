package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class nr2 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ or2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr2(or2 or2Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = or2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.a(false, (mt5) this);
    }
}
