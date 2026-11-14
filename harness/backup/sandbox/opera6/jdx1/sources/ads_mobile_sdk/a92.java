package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class a92 extends nt5 {
    public f92 a;
    public Object b;
    public rg3 c;
    public rg3 d;
    public boolean e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ f92 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a92(f92 f92Var, nt5 nt5Var) {
        super(nt5Var);
        this.h = f92Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return this.h.a((Map) null, false, false, (cy0) null, (nt5) this);
    }
}
