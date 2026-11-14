package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ut2 extends nt5 {
    public Object a;
    public Object b;
    public hb2 c;
    public rg3 d;
    public rg3 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ au2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut2(au2 au2Var, nt5 nt5Var) {
        super(nt5Var);
        this.g = au2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return au2.a(this.g, null, null, null, null, this);
    }
}
