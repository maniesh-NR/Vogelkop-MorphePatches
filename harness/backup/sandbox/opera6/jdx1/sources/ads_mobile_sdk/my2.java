package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class my2 extends nt5 {
    public sy2 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sy2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my2(sy2 sy2Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = sy2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a(null, null, null, this);
    }
}
