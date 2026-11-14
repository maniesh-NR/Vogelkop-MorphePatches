package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class t81 extends nt5 {
    public d91 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d91 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t81(d91 d91Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = d91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return d91.e(this.c, this);
    }
}
