package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class oi2 extends nt5 {
    public ArrayList a;
    public Iterator b;
    public Object c;
    public /* synthetic */ Object f;
    public final /* synthetic */ xj2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi2(xj2 xj2Var, nt5 nt5Var) {
        super(nt5Var);
        this.g = xj2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return this.g.m9c((List) null, (nt5) this);
    }
}
