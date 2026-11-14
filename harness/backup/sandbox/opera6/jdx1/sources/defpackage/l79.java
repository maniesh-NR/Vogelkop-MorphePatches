package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l79 extends nt5 {
    public ArrayList t;
    public ArrayList u;
    public /* synthetic */ Object v;
    public final /* synthetic */ n79 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l79(n79 n79Var, nt5 nt5Var) {
        super(nt5Var);
        this.w = n79Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.e(this);
    }
}
