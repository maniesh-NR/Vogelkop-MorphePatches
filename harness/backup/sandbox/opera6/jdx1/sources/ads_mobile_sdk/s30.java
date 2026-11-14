package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class s30 extends nt5 {
    public u30 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u30 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s30(u30 u30Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = u30Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.h(this);
    }
}
