package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class cwl extends nt5 {
    public dwl t;
    public /* synthetic */ Object u;
    public final /* synthetic */ dwl v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwl(dwl dwlVar, mt5 mt5Var) {
        super(mt5Var);
        this.v = dwlVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return dwl.x(this.v, null, this);
    }
}
