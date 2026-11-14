package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class htj extends nt5 {
    public Function1 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ mtj v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htj(mtj mtjVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = mtjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.b(null, 0.0f, null, this);
    }
}
