package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class h62 extends nt5 {
    public Object a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ r62 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h62(r62 r62Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = r62Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return r62.a(this.d, this);
    }
}
