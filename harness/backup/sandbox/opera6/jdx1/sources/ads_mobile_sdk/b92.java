package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class b92 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ f92 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b92(f92 f92Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = f92Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        this.b.a((String) null, this);
        return Boolean.FALSE;
    }
}
