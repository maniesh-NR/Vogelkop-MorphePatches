package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.fq;
import java.util.Map;

/* loaded from: classes.dex */
public final class ry2 extends nt5 {
    public Object a;
    public Object b;
    public defpackage.r83 c;
    public Map d;
    public av2 e;
    public fq f;
    public rg3 g;
    public rg3 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ sy2 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry2(sy2 sy2Var, nt5 nt5Var) {
        super(nt5Var);
        this.j = sy2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= LinearLayoutManager.INVALID_OFFSET;
        return this.j.a((Map.Entry) null, (defpackage.r83) null, (Map) null, (av2) null, (fq) null, this);
    }
}
