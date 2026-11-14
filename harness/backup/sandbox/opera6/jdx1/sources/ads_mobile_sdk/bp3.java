package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class bp3 extends nt5 {
    public ep3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ep3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp3(ep3 ep3Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = ep3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return ep3.a(this.c, this);
    }
}
