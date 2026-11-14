package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;

/* loaded from: classes.dex */
public final class ij4 extends nt5 {
    public int t;
    public rj4 u;
    public List v;
    public pi4 w;
    public /* synthetic */ Object x;
    public final /* synthetic */ rj4 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij4(rj4 rj4Var, nt5 nt5Var) {
        super(nt5Var);
        this.y = rj4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= LinearLayoutManager.INVALID_OFFSET;
        return this.y.m(null, 0, null, this);
    }
}
