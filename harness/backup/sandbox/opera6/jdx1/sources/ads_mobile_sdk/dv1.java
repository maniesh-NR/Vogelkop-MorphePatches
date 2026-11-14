package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class dv1 extends nt5 {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ iv1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv1(iv1 iv1Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = iv1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.h(this);
    }
}
