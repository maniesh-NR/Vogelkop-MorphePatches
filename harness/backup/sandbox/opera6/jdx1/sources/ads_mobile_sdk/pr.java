package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class pr extends nt5 {
    public sr a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sr d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr(sr srVar, nt5 nt5Var) {
        super(nt5Var);
        this.d = srVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return sr.b(this.d, this);
    }
}
