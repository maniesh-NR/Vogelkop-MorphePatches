package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class qh2 extends nt5 {
    public Iterator a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xj2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh2(xj2 xj2Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = xj2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.m7a((List) null, (nt5) this);
    }
}
