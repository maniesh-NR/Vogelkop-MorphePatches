package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ig3 extends nt5 {
    public v0j t;
    public /* synthetic */ Object u;
    public final /* synthetic */ jg3 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig3(jg3 jg3Var, nt5 nt5Var) {
        super(nt5Var);
        this.v = jg3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.a(this);
    }
}
