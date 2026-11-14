package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ps3 extends nt5 {
    public voh t;
    public Object[] u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ qs3 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps3(qs3 qs3Var, nt5 nt5Var) {
        super(nt5Var);
        this.y = qs3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= LinearLayoutManager.INVALID_OFFSET;
        return this.y.a(null, this);
    }
}
