package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class pc3 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ qc3 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc3(qc3 qc3Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = qc3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.d(this);
    }
}
