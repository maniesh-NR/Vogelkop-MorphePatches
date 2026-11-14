package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class lh extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ mh b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(mh mhVar, nt5 nt5Var) {
        super(nt5Var);
        this.b = mhVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.a(null, null, null, false, null, null, null, this);
    }
}
