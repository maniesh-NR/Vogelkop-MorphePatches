package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;

/* loaded from: classes.dex */
public final class cj4 extends nt5 {
    public List t;
    public pi4 u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ rj4 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj4(rj4 rj4Var, nt5 nt5Var) {
        super(nt5Var);
        this.y = rj4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= LinearLayoutManager.INVALID_OFFSET;
        return this.y.h(null, 0, 0, 0, null, this);
    }
}
