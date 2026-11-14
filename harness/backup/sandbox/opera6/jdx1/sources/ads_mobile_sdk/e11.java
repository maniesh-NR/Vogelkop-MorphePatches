package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e11 extends nt5 {
    public q11 a;
    public pzh b;
    public UUID c;
    public /* synthetic */ Object d;
    public final /* synthetic */ q11 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e11(q11 q11Var, mt5 mt5Var) {
        super(mt5Var);
        this.e = q11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a((pzh) null, (UUID) null, (mt5) this);
    }
}
