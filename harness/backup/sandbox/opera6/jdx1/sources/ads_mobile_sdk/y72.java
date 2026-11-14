package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class y72 extends nt5 {
    public b82 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b82 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y72(b82 b82Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = b82Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return b82.d(this.c, this);
    }
}
