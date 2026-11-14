package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class ib extends nt5 {
    public sb a;
    public oqh b;
    public Collection c;
    public Iterator d;
    public Map.Entry e;
    public pfe f;
    public Collection g;
    public /* synthetic */ Object h;
    public final /* synthetic */ sb i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(sb sbVar, nt5 nt5Var) {
        super(nt5Var);
        this.i = sbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= LinearLayoutManager.INVALID_OFFSET;
        return sb.a(this.i, (LinkedHashSet) null, (nt5) this);
    }
}
