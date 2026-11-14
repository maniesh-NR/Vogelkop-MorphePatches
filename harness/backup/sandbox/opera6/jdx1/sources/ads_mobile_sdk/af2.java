package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class af2 extends nt5 {
    public df2 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ df2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af2(df2 df2Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = df2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return df2.a(this.d, false, this);
    }
}
