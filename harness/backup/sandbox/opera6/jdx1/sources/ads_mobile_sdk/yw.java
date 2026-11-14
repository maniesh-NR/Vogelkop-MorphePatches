package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.zk5;

/* loaded from: classes.dex */
public final class yw extends nt5 {
    public lx a;
    public zk5 b;
    public int c;
    public int d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ lx g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(lx lxVar, nt5 nt5Var) {
        super(nt5Var);
        this.g = lxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return lx.a(this.g, (zk5) null, this);
    }
}
