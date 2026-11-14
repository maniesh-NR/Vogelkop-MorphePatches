package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class bx extends nt5 {
    public lx a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lx d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(lx lxVar, nt5 nt5Var) {
        super(nt5Var);
        this.d = lxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return lx.b(this.d, this);
    }
}
