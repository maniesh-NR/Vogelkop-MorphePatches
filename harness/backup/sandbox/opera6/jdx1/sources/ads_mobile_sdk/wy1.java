package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class wy1 extends nt5 {
    public cy0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xy1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy1(xy1 xy1Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = xy1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return xy1.a(this.c, null, this);
    }
}
