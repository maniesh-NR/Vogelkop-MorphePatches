package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class rb extends nt5 {
    public sb a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sb d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(sb sbVar, nt5 nt5Var) {
        super(nt5Var);
        this.d = sbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.b(this);
    }
}
