package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class si3 extends nt5 {
    public wi3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wi3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si3(wi3 wi3Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = wi3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a(this);
    }
}
