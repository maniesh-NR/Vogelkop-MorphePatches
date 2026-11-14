package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class fm3 extends nt5 {
    public Object a;
    public Object b;
    public i07 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ im3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm3(im3 im3Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = im3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return im3.a(this.e, this);
    }
}
