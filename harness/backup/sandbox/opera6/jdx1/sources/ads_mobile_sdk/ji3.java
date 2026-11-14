package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ji3 extends nt5 {
    public li3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ li3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji3(li3 li3Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = li3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.f(this);
    }
}
