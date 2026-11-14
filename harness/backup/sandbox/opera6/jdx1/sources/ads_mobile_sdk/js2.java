package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class js2 extends nt5 {
    public vs2 a;
    public pfe b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ vs2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js2(vs2 vs2Var, mt5 mt5Var) {
        super(mt5Var);
        this.e = vs2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.b(false, this);
    }
}
