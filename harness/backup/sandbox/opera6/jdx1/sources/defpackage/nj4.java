package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;

/* loaded from: classes.dex */
public final class nj4 extends nt5 {
    public pi4 A;
    public AutoCloseable B;
    public /* synthetic */ Object C;
    public final /* synthetic */ rj4 D;
    public int E;
    public int t;
    public boolean u;
    public boolean v;
    public long w;
    public boolean x;
    public rj4 y;
    public List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj4(rj4 rj4Var, nt5 nt5Var) {
        super(nt5Var);
        this.D = rj4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= LinearLayoutManager.INVALID_OFFSET;
        return this.D.o(null, 0, 0L, null, false, this);
    }
}
