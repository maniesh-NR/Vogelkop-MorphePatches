package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.yno;

/* loaded from: classes.dex */
public final class pa2 extends nt5 {
    public Object a;
    public a2 b;
    public Object c;
    public yno d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xa2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa2(xa2 xa2Var, nt5 nt5Var) {
        super(nt5Var);
        this.g = xa2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return this.g.a((a2) null, this);
    }
}
