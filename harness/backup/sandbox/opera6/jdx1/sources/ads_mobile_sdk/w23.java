package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class w23 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ a33 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w23(a33 a33Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = a33Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return a33.b(this.b, this);
    }
}
