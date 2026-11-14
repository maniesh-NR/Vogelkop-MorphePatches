package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class my extends nt5 {
    public vz a;
    public pfe b;
    public m5a c;
    public m5a d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vz f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my(vz vzVar, mt5 mt5Var) {
        super(mt5Var);
        this.f = vzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return vz.d(this.f, this);
    }
}
