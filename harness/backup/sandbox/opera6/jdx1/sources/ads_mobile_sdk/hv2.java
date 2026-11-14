package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class hv2 extends nt5 {
    public kv2 a;
    public Map b;
    public String c;
    public String d;
    public String e;
    public pfe f;
    public /* synthetic */ Object g;
    public final /* synthetic */ kv2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv2(kv2 kv2Var, mt5 mt5Var) {
        super(mt5Var);
        this.h = kv2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return this.h.a((cy0) null, (Map) null, (mt5) this);
    }
}
