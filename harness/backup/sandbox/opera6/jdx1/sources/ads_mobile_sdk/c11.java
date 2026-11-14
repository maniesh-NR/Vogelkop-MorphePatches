package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class c11 extends nt5 {
    public Map a;
    public Map b;
    public g21 c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ q11 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c11(q11 q11Var, mt5 mt5Var) {
        super(mt5Var);
        this.f = q11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a((h21) null, (Map) null, (mt5) this);
    }
}
