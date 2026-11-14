package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class f52 extends nt5 {
    public s52 a;
    public cy0 b;
    public String c;
    public String d;
    public t00 e;
    public z31 f;
    public z92 g;
    public z92 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ s52 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f52(s52 s52Var, nt5 nt5Var) {
        super(nt5Var);
        this.j = s52Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= LinearLayoutManager.INVALID_OFFSET;
        return s52.a(this.j, null, null, null, null, null, null, null, this);
    }
}
