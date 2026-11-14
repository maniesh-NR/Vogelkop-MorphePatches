package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class d92 extends nt5 {
    public Map a;
    public cy0 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ f92 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d92(f92 f92Var, nt5 nt5Var) {
        super(nt5Var);
        this.g = f92Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return this.g.a(null, false, false, false, false, null, this);
    }
}
