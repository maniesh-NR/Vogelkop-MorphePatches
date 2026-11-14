package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;

/* loaded from: classes.dex */
public final class qx1 extends nt5 {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ w8 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx1(w8 w8Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = w8Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return w8.a(this.c, (prb) null, this);
    }
}
