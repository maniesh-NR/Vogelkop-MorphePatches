package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ad3 extends nt5 {
    public cd3 a;
    public ejp b;
    public /* synthetic */ Object c;
    public final /* synthetic */ cd3 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad3(cd3 cd3Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = cd3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a((ejp) null, this);
    }
}
