package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ex extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ lx b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(lx lxVar, nt5 nt5Var) {
        super(nt5Var);
        this.b = lxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return lx.a(this.b, (defpackage.r83) null, this);
    }
}
