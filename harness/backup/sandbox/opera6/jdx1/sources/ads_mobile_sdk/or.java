package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.pqh;

/* loaded from: classes.dex */
public final class or extends nt5 {
    public Object a;
    public rg3 b;
    public rg3 c;
    public pqh d;
    public pqh e;
    public pfe f;
    public /* synthetic */ Object g;
    public final /* synthetic */ sr h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(sr srVar, nt5 nt5Var) {
        super(nt5Var);
        this.h = srVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return sr.a(this.h, this);
    }
}
