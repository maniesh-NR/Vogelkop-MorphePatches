package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class j32 extends nt5 {
    public o32 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o32 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j32(o32 o32Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = o32Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return o32.a(this.c, this);
    }
}
