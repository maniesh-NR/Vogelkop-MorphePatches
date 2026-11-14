package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;

/* loaded from: classes.dex */
public final class gi3 extends nt5 {
    public li3 a;
    public Object b;
    public List c;
    public Object d;
    public Object e;
    public Integer f;
    public String g;
    public ve2 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ li3 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi3(li3 li3Var, nt5 nt5Var) {
        super(nt5Var);
        this.j = li3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= LinearLayoutManager.INVALID_OFFSET;
        return this.j.q(this);
    }
}
