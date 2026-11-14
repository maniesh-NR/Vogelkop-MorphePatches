package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class td2 extends nt5 {
    public Object a;
    public Object b;
    public rg3 c;
    public rg3 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ae2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td2(ae2 ae2Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = ae2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return ae2.b(this.f, (fe2) null, this);
    }
}
