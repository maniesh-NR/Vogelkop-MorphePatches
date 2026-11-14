package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class vxf extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ wxf u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxf(wxf wxfVar, nt5 nt5Var) {
        super(nt5Var);
        this.u = wxfVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= LinearLayoutManager.INVALID_OFFSET;
        return this.u.a(null, 0.0f, this);
    }
}
