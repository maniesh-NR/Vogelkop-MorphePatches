package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.fyo;

/* loaded from: classes.dex */
public final class in extends nt5 {
    public Object a;
    public Object b;
    public Object c;
    public fyo d;
    public Object e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ kn h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(kn knVar, nt5 nt5Var) {
        super(nt5Var);
        this.h = knVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return kn.a(this.h, this);
    }
}
