package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.pqh;

/* loaded from: classes.dex */
public final class dd2 extends nt5 {
    public ae2 a;
    public pqh b;
    public pqh c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ae2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd2(ae2 ae2Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = ae2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a((av2) null, (String) null, false, (nt5) this);
    }
}
