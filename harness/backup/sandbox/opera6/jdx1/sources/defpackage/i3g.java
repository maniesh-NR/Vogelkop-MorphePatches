package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i3g extends nt5 {
    public String t;
    public Function1 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ j3g w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3g(j3g j3gVar, nt5 nt5Var) {
        super(nt5Var);
        this.w = j3gVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.a(null, null, this);
    }
}
