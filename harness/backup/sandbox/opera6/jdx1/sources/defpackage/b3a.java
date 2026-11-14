package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;

/* loaded from: classes.dex */
public final class b3a extends nt5 {
    public /* synthetic */ Object A;
    public final /* synthetic */ d3a B;
    public int C;
    public List t;
    public w2a u;
    public nqh v;
    public List w;
    public w2a x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3a(d3a d3aVar, mt5 mt5Var) {
        super(mt5Var);
        this.B = d3aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= LinearLayoutManager.INVALID_OFFSET;
        return this.B.o(null, 0, null, this);
    }
}
