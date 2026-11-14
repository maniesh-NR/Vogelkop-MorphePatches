package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class so3 extends nt5 {
    public uo3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uo3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so3(uo3 uo3Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = uo3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a(null, null, null, null, null, this);
    }
}
