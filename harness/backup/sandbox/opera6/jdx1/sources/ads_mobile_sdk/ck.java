package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ck extends nt5 {
    public dk a;
    public pfe b;
    public /* synthetic */ Object d;
    public final /* synthetic */ dk e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(dk dkVar, nt5 nt5Var) {
        super(nt5Var);
        this.e = dkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return dk.a(this.e, this);
    }
}
