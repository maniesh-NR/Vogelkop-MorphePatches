package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ly extends nt5 {
    public vz a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vz d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly(vz vzVar, mt5 mt5Var) {
        super(mt5Var);
        this.d = vzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return vz.c(this.d, this);
    }
}
