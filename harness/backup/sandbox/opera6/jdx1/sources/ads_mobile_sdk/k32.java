package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.jjj;
import defpackage.lip;

/* loaded from: classes.dex */
public final class k32 extends nt5 {
    public Object a;
    public Object b;
    public rg3 c;
    public jjj d;
    public rg3 e;
    public rg3 f;
    public lip g;
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ o32 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k32(o32 o32Var, nt5 nt5Var) {
        super(nt5Var);
        this.k = o32Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= LinearLayoutManager.INVALID_OFFSET;
        return o32.b(this.k, this);
    }
}
