package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class he2 extends nt5 {
    public ie2 a;
    public bm1 b;
    public j13 c;
    public n13 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ie2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he2(ie2 ie2Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = ie2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a(this);
    }
}
