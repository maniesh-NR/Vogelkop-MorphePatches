package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;

/* loaded from: classes.dex */
public final class xt2 extends nt5 {
    public prb a;
    public prb b;
    public prb c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ au2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt2(au2 au2Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = au2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.b(this);
    }
}
