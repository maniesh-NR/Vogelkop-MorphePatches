package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class xj extends nt5 {
    public dk a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dk d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(dk dkVar, mt5 mt5Var) {
        super(mt5Var);
        this.d = dkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a((xi) null, (mt5) this);
    }
}
