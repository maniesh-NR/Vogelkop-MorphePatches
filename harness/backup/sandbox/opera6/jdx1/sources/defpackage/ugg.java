package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ugg extends nt5 {
    public Object t;
    public Object u;
    public pfe v;
    public long w;
    public /* synthetic */ Object x;
    public final /* synthetic */ wgg y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugg(wgg wggVar, nt5 nt5Var) {
        super(nt5Var);
        this.y = wggVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= LinearLayoutManager.INVALID_OFFSET;
        return this.y.a(null, 0L, null, this);
    }
}
