package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class tm6 extends nt5 {
    public String t;
    public /* synthetic */ Object u;
    public final /* synthetic */ esg v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm6(esg esgVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = esgVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.x(null, this);
    }
}
