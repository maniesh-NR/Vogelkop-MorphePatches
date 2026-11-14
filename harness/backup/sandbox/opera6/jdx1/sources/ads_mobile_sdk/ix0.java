package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ix0 extends nt5 {
    public cy0 a;
    public Object b;
    public String c;
    public UUID d;
    public cd5 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ cy0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix0(cy0 cy0Var, mt5 mt5Var) {
        super(mt5Var);
        this.g = cy0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return this.g.a(null, null, null, this);
    }
}
