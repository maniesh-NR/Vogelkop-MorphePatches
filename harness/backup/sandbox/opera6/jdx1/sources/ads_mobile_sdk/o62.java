package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class o62 extends nt5 {
    public r62 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r62 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o62(r62 r62Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = r62Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return r62.e(this.c, this);
    }
}
