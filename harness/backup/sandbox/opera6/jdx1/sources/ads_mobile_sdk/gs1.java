package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class gs1 extends nt5 {
    public js1 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ js1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs1(js1 js1Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = js1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return js1.a(this.d, this);
    }
}
