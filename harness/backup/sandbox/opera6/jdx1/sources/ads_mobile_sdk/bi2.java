package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bi2 extends nt5 {
    public Object a;
    public Object b;
    public rg3 c;
    public ub2 d;
    public ArrayList e;
    public xj2 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ xj2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi2(xj2 xj2Var, nt5 nt5Var) {
        super(nt5Var);
        this.h = xj2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return this.h.r(this);
    }
}
