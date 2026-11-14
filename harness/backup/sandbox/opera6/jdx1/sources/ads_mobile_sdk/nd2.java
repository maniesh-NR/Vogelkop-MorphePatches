package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.pqh;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class nd2 extends nt5 {
    public Object a;
    public Object b;
    public Serializable c;
    public rg3 d;
    public rg3 e;
    public Object f;
    public pqh g;
    public int h;
    public boolean i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ae2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd2(ae2 ae2Var, nt5 nt5Var) {
        super(nt5Var);
        this.l = ae2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= LinearLayoutManager.INVALID_OFFSET;
        return this.l.b((av2) null, (String) null, this);
    }
}
