package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;

/* loaded from: classes.dex */
public final class oj4 extends nt5 {
    public pi4 t;
    public List u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ rj4 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj4(rj4 rj4Var, nt5 nt5Var) {
        super(nt5Var);
        this.x = rj4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= LinearLayoutManager.INVALID_OFFSET;
        return this.x.p(null, 0, 0, null, this);
    }
}
