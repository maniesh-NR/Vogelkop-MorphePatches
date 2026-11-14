package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class kg3 extends nt5 {
    public lg3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lg3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg3(lg3 lg3Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = lg3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.d(this);
    }
}
