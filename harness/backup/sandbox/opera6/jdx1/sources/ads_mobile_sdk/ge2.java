package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ge2 extends nt5 {
    public ie2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ie2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge2(ie2 ie2Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = ie2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a(null, this);
    }
}
