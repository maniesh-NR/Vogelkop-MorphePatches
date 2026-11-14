package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.vgp;

/* loaded from: classes.dex */
public final class rn1 extends nt5 {
    public vgp a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vgp c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn1(vgp vgpVar, nt5 nt5Var) {
        super(nt5Var);
        this.c = vgpVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a(null, this);
    }
}
