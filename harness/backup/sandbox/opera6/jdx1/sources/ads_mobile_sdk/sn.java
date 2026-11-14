package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class sn extends nt5 {
    public eo a;
    public /* synthetic */ Object b;
    public final /* synthetic */ eo c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(eo eoVar, nt5 nt5Var) {
        super(nt5Var);
        this.c = eoVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return eo.a(this.c, this);
    }
}
