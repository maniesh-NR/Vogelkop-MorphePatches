package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class qf extends nt5 {
    public Object a;
    public Object b;
    public Object c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ bg f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(bg bgVar, nt5 nt5Var) {
        super(nt5Var);
        this.f = bgVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.s(this);
    }
}
