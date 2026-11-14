package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d11 extends nt5 {
    public prb a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q11 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d11(q11 q11Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = q11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a((String) null, (UUID) null, (prb) null, (mt5) this);
    }
}
