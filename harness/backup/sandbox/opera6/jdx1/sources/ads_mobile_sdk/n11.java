package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.UUID;

/* loaded from: classes.dex */
public final class n11 extends nt5 {
    public q11 a;
    public Object b;
    public Object c;
    public Object d;
    public UUID e;
    public boolean f;
    public boolean g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ q11 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n11(q11 q11Var, mt5 mt5Var) {
        super(mt5Var);
        this.j = q11Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= LinearLayoutManager.INVALID_OFFSET;
        return this.j.a((kvh) null, (t9f) null, false, (h21) null, false, (mt5) this);
    }
}
