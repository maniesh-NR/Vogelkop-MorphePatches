package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;

/* loaded from: classes.dex */
public final class si4 extends nt5 {
    public final /* synthetic */ rj4 A;
    public int B;
    public long t;
    public int u;
    public rj4 v;
    public List w;
    public pi4 x;
    public AutoCloseable y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si4(rj4 rj4Var, nt5 nt5Var) {
        super(nt5Var);
        this.A = rj4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= LinearLayoutManager.INVALID_OFFSET;
        return this.A.d(null, 0L, 0, null, this);
    }
}
