package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class m5 extends nt5 {
    public n5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n5 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(n5 n5Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = n5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return n5.a(this.c, this);
    }
}
