package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class rs extends nt5 {
    public ws a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ws d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs(ws wsVar, nt5 nt5Var) {
        super(nt5Var);
        this.d = wsVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return ws.a(this.d, this);
    }
}
