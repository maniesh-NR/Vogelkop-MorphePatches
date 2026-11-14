package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a8g extends nt5 {
    public Function1 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ b8g v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8g(b8g b8gVar, mt5 mt5Var) {
        super(mt5Var);
        this.v = b8gVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.t(null, this);
    }
}
