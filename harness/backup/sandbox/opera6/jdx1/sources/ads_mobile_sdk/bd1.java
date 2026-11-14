package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class bd1 extends nt5 {
    public dd1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dd1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd1(dd1 dd1Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = dd1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return dd1.a(this.c, this);
    }
}
