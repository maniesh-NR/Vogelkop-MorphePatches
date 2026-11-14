package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class kh2 extends nt5 {
    public Iterator a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xj2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh2(xj2 xj2Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = xj2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a((List) null, (nt5) this);
    }
}
