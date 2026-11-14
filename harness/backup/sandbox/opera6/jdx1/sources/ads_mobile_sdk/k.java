package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k extends nt5 {
    public l a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, nt5 nt5Var) {
        super(nt5Var);
        this.d = lVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a(null, this);
    }
}
