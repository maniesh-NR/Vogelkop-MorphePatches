package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class q23 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ r23 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q23(r23 r23Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = r23Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.d(this);
    }
}
