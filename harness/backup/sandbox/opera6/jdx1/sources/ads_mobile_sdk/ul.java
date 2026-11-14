package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ul extends nt5 {
    public Object a;
    public Object b;
    public Object c;
    public aa0 d;
    public Object e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ wl h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(wl wlVar, nt5 nt5Var) {
        super(nt5Var);
        this.h = wlVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return this.h.a(false, (mt5) this);
    }
}
