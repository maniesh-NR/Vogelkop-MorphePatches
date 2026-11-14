package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;

/* loaded from: classes.dex */
public final class bd2 extends nt5 {
    public List t;
    public yyh u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ cd2 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd2(cd2 cd2Var, nt5 nt5Var) {
        super(nt5Var);
        this.y = cd2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= LinearLayoutManager.INVALID_OFFSET;
        return this.y.b(this);
    }
}
