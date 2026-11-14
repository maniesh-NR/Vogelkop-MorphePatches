package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class bk extends nt5 {
    public ek a;
    public String b;
    public String c;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ek f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(ek ekVar, mt5 mt5Var) {
        super(mt5Var);
        this.f = ekVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return ek.a(this.f, null, null, this);
    }
}
