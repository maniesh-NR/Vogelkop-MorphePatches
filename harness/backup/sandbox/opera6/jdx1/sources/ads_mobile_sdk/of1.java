package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class of1 extends nt5 {
    public rf1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rf1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of1(rf1 rf1Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = rf1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.c(this);
    }
}
