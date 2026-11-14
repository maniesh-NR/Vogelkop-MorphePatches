package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ct extends nt5 {
    public dt a;
    public cy0 b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ dt e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct(dt dtVar, mt5 mt5Var) {
        super(mt5Var);
        this.e = dtVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a(null, null, this);
    }
}
