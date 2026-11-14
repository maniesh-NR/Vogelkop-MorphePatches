package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class k03 extends nt5 {
    public o03 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o03 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k03(o03 o03Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = o03Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return o03.a(this.d, this);
    }
}
