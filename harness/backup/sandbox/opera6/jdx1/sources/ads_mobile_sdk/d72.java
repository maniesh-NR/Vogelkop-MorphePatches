package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class d72 extends nt5 {
    public f72 a;
    public Object b;
    public Object c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ f72 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d72(f72 f72Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = f72Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return f72.a(this.f, (cy0) null, false, (nt5) this);
    }
}
