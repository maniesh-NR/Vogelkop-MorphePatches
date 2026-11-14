package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class unm extends nt5 {
    public br9 t;
    public Function0 u;
    public float v;
    public /* synthetic */ Object w;
    public final /* synthetic */ vnm x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unm(vnm vnmVar, nt5 nt5Var) {
        super(nt5Var);
        this.x = vnmVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= LinearLayoutManager.INVALID_OFFSET;
        return this.x.a(null, null, this);
    }
}
