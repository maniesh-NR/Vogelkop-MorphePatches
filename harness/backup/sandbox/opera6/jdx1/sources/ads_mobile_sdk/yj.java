package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class yj extends nt5 {
    public dk a;
    public xi b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dk d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(dk dkVar, nt5 nt5Var) {
        super(nt5Var);
        this.d = dkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return dk.a(this.d, null, 0L, this);
    }
}
