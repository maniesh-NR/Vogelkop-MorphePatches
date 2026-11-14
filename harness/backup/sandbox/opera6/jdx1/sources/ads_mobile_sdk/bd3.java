package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class bd3 extends nt5 {
    public cd3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cd3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd3(cd3 cd3Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = cd3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a(false, (mt5) this);
    }
}
