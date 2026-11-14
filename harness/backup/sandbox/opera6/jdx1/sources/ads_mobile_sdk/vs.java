package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class vs extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ws b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs(ws wsVar, nt5 nt5Var) {
        super(nt5Var);
        this.b = wsVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return ws.b(this.b, this);
    }
}
