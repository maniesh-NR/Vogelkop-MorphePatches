package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class df1 extends nt5 {
    public rf1 a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ rf1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df1(rf1 rf1Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = rf1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a(this);
    }
}
