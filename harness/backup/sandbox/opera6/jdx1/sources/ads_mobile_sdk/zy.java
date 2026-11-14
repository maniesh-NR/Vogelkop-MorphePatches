package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class zy extends nt5 {
    public Exception a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vz c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy(vz vzVar, nt5 nt5Var) {
        super(nt5Var);
        this.c = vzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a((Exception) null, this);
    }
}
