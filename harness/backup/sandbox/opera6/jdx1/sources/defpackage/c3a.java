package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;

/* loaded from: classes.dex */
public final class c3a extends nt5 {
    public List t;
    public w2a u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ d3a y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3a(d3a d3aVar, mt5 mt5Var) {
        super(mt5Var);
        this.y = d3aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= LinearLayoutManager.INVALID_OFFSET;
        return this.y.p(null, this);
    }
}
