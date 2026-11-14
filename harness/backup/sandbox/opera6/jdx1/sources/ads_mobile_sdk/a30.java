package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a30 extends nt5 {
    public rg3 a;
    public rg3 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ p30 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a30(p30 p30Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = p30Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a((AtomicReference) null, (ynb) null, (Long) null, this);
    }
}
