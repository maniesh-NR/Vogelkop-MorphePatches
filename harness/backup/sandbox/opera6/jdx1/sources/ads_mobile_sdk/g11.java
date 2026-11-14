package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.net.URL;

/* loaded from: classes.dex */
public final class g11 extends nt5 {
    public Object a;
    public Object b;
    public /* synthetic */ Object d;
    public final /* synthetic */ q11 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g11(q11 q11Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = q11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a((URL) null, (in0) null, (mt5) this);
    }
}
