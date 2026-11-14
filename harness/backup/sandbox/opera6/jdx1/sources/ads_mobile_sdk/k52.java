package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class k52 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ s52 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k52(s52 s52Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = s52Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return s52.a(this.b, this);
    }
}
