package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.zk5;

/* loaded from: classes.dex */
public final class cx extends nt5 {
    public lx a;
    public zk5 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lx d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(lx lxVar, nt5 nt5Var) {
        super(nt5Var);
        this.d = lxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.b((zk5) null, this);
    }
}
