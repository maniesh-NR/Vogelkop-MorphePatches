package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class yt2 extends nt5 {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ au2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt2(au2 au2Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = au2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a(null, this);
    }
}
