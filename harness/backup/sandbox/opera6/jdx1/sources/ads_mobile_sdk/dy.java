package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class dy extends nt5 {
    public vz a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vz c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(vz vzVar, nt5 nt5Var) {
        super(nt5Var);
        this.c = vzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.u(this);
    }
}
