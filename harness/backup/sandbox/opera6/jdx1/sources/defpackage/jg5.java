package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class jg5 extends nt5 {
    public Object t;
    public ccb u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ lg5 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg5(lg5 lg5Var, nt5 nt5Var) {
        super(nt5Var);
        this.y = lg5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= LinearLayoutManager.INVALID_OFFSET;
        return this.y.a(null, null, this);
    }
}
