package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class xd2 extends nt5 {
    public ae2 a;
    public dl0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ae2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd2(ae2 ae2Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = ae2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a((dl0) null, this);
    }
}
