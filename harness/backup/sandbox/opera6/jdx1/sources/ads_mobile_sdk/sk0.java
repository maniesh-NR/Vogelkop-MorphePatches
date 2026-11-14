package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class sk0 extends nt5 {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ al0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk0(al0 al0Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = al0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.b(this);
    }
}
