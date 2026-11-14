package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class cme extends nt5 {
    public d04 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ fme v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cme(fme fmeVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = fmeVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.h(null, this);
    }
}
