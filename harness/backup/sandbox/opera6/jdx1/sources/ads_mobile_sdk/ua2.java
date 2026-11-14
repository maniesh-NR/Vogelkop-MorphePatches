package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.rap;

/* loaded from: classes.dex */
public final class ua2 extends nt5 {
    public xa2 a;
    public a2 b;
    public rap c;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xa2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua2(xa2 xa2Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = xa2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return xa2.a(this.f, this);
    }
}
