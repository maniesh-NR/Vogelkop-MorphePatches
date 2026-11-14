package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.zk5;

/* loaded from: classes.dex */
public final class sw extends nt5 {
    public lx a;
    public zk5 b;
    public g21 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ lx e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(lx lxVar, nt5 nt5Var) {
        super(nt5Var);
        this.e = lxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a((zk5) null, this);
    }
}
