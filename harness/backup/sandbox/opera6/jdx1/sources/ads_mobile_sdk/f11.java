package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class f11 extends nt5 {
    public q11 a;
    public fvh b;
    public fvh c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ q11 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f11(q11 q11Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = q11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a((String) null, (Map) null, (mt5) this);
    }
}
