package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.v7p;

/* loaded from: classes.dex */
public final class g10 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ fg2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g10(fg2 fg2Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = fg2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.a((v7p) null, this);
    }
}
