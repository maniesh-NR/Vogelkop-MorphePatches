package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.chromium.net.CronetEngine;

/* loaded from: classes.dex */
public final class o30 extends nt5 {
    public p30 a;
    public CronetEngine.Builder b;
    public Long c;
    public CronetEngine.Builder d;
    public /* synthetic */ Object e;
    public final /* synthetic */ p30 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o30(p30 p30Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = p30Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return p30.a(this.f, (CronetEngine.Builder) null, (Long) null, this);
    }
}
