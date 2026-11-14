package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class g3a extends nt5 {
    public pfe t;
    public /* synthetic */ Object u;
    public final /* synthetic */ h3a v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3a(h3a h3aVar, mt5 mt5Var) {
        super(mt5Var);
        this.v = h3aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.a(this);
    }
}
