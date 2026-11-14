package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class zz1 extends nt5 {
    public a02 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a02 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz1(a02 a02Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = a02Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return a02.b(this.c, this);
    }
}
