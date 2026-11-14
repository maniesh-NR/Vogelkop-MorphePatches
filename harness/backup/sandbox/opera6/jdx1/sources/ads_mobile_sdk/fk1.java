package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.avo;

/* loaded from: classes.dex */
public final class fk1 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ dz1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk1(dz1 dz1Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = dz1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.a((avo) null, this);
    }
}
