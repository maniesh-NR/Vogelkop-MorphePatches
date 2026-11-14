package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class x13 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ y13 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x13(y13 y13Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = y13Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.d(this);
    }
}
