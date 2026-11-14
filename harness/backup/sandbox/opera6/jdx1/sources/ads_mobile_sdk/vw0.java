package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.dvj;

/* loaded from: classes.dex */
public final class vw0 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ dvj b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw0(dvj dvjVar, nt5 nt5Var) {
        super(nt5Var);
        this.b = dvjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.m(0L, null, this);
    }
}
