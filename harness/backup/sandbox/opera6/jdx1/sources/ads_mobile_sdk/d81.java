package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class d81 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ d91 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d81(d91 d91Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = d91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.r(this);
    }
}
