package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.zbf;

/* loaded from: classes.dex */
public final class n81 extends nt5 {
    public d91 a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ d91 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n81(d91 d91Var, nt5 nt5Var) {
        super(nt5Var);
        this.h = d91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return d91.a(this.h, (x71) null, (zbf) null, this);
    }
}
