package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class xm1 extends nt5 {
    public zm1 a;
    public n13 b;
    public a2 c;
    public Integer d;
    public String e;
    public pn7 f;
    public String g;
    public ve2 h;
    public y31 i;
    public v31 j;
    public ArrayList k;
    public Iterator l;
    public ArrayList m;
    public /* synthetic */ Object n;
    public final /* synthetic */ zm1 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm1(zm1 zm1Var, nt5 nt5Var) {
        super(nt5Var);
        this.o = zm1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= LinearLayoutManager.INVALID_OFFSET;
        return this.o.a((List) null, (n13) null, (a2) null, (Integer) null, (String) null, (pn7) null, (String) null, (ve2) null, (y31) null, (v31) null, this);
    }
}
