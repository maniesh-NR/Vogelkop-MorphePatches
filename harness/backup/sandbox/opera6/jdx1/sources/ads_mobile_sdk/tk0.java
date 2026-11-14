package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class tk0 extends nt5 {
    public al0 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ al0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk0(al0 al0Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = al0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.c(this);
    }
}
