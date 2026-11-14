package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class i30 extends nt5 {
    public p30 a;
    public g21 b;
    public g21 c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ p30 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i30(p30 p30Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = p30Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a((String) null, (Map) null, (mt5) this);
    }
}
