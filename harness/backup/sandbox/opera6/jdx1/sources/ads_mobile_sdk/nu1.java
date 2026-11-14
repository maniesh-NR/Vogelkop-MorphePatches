package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.kyo;

/* loaded from: classes.dex */
public final class nu1 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ su1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu1(su1 su1Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = su1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.a((kyo) null, (a2) null, this);
    }
}
