package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;

/* loaded from: classes.dex */
public final class li2 extends nt5 {
    public xj2 a;
    public Object b;
    public /* synthetic */ Object h;
    public final /* synthetic */ xj2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li2(xj2 xj2Var, nt5 nt5Var) {
        super(nt5Var);
        this.i = xj2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= LinearLayoutManager.INVALID_OFFSET;
        return this.i.m8b((List) null, (nt5) this);
    }
}
