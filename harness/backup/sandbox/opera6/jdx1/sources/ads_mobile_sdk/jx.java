package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class jx extends nt5 {
    public lx a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lx c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(lx lxVar, nt5 nt5Var) {
        super(nt5Var);
        this.c = lxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return lx.a(this.c, this);
    }
}
