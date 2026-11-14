package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.g22;
import defpackage.x4o;
import defpackage.xo5;

/* loaded from: classes.dex */
public final class r42 extends nt5 {
    public t42 a;
    public pfe b;
    public x4o c;
    public Class d;
    public xo5 e;
    public String f;
    public g22 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ t42 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r42(t42 t42Var, nt5 nt5Var) {
        super(nt5Var);
        this.i = t42Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= LinearLayoutManager.INVALID_OFFSET;
        return t42.a(this.i, this);
    }
}
