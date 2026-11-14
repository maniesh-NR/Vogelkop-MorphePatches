package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.eyo;

/* loaded from: classes.dex */
public final class dm3 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ eyo b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm3(eyo eyoVar, nt5 nt5Var) {
        super(nt5Var);
        this.b = eyoVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return eyo.c(this.b, this);
    }
}
