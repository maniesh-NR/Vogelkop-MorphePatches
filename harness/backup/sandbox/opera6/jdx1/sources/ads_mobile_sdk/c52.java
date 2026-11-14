package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class c52 extends nt5 {
    public s52 a;
    public cy0 b;
    public z92 c;
    public z31 d;
    public t00 e;
    public z92 f;
    public String g;
    public /* synthetic */ Object h;
    public final /* synthetic */ s52 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c52(s52 s52Var, nt5 nt5Var) {
        super(nt5Var);
        this.i = s52Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= LinearLayoutManager.INVALID_OFFSET;
        return s52.a(this.i, null, null, null, null, null, null, this);
    }
}
