package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class pxf extends nt5 {
    public int t;
    public a2k u;
    public /* synthetic */ Object v;
    public final /* synthetic */ sxf w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxf(sxf sxfVar, nt5 nt5Var) {
        super(nt5Var);
        this.w = sxfVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.f(0, null, this);
    }
}
