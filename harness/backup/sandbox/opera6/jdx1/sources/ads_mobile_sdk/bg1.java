package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.dvj;

/* loaded from: classes.dex */
public final class bg1 extends nt5 {
    public td1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dvj c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg1(dvj dvjVar, nt5 nt5Var) {
        super(nt5Var);
        this.c = dvjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.n(null, this);
    }
}
