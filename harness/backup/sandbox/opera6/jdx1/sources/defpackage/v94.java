package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class v94 extends nt5 {
    public cd5 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ x94 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v94(x94 x94Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = x94Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.h(0L, this);
    }
}
