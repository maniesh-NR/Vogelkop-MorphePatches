package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class hz2 extends nt5 {
    public jz2 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jz2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz2(jz2 jz2Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = jz2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.c(this);
    }
}
