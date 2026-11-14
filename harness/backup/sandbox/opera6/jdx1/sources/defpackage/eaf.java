package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class eaf extends nt5 {
    public faf t;
    public tlh u;
    public /* synthetic */ Object v;
    public final /* synthetic */ faf w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaf(faf fafVar, nt5 nt5Var) {
        super(nt5Var);
        this.w = fafVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return faf.f(this.w, this);
    }
}
