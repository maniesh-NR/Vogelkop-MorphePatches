package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;

/* loaded from: classes.dex */
public final class mh2 extends nt5 {
    public ls a;
    public List b;
    public ls e;
    public ls f;
    public ls g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ xj2 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh2(xj2 xj2Var, nt5 nt5Var) {
        super(nt5Var);
        this.j = xj2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= LinearLayoutManager.INVALID_OFFSET;
        return this.j.a((List) null, 0, this);
    }
}
