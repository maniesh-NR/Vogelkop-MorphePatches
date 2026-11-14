package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class x82 extends nt5 {
    public f92 a;
    public Map b;
    public cy0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ f92 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x82(f92 f92Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = f92Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.b(null, null, this);
    }
}
