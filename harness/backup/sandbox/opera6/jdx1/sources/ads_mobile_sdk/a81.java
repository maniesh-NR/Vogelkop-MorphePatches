package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;
import defpackage.vkp;

/* loaded from: classes.dex */
public final class a81 extends nt5 {
    public Object a;
    public Object b;
    public rg3 c;
    public rg3 d;
    public g21 e;
    public vkp f;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ d91 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a81(d91 d91Var, nt5 nt5Var) {
        super(nt5Var);
        this.i = d91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= LinearLayoutManager.INVALID_OFFSET;
        return d91.a(this.i, (String) null, (prb) null, this);
    }
}
