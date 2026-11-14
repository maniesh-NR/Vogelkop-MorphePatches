package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.jjj;

/* loaded from: classes.dex */
public final class g32 extends nt5 {
    public Object a;
    public Object b;
    public rg3 c;
    public rg3 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ o32 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g32(o32 o32Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = o32Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a((jjj) null, this);
    }
}
