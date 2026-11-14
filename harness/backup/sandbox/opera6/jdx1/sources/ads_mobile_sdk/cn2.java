package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.y7h;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class cn2 extends nt5 {
    public on2 a;
    public y7h b;
    public CoroutineContext c;
    public /* synthetic */ Object d;
    public final /* synthetic */ on2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn2(on2 on2Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = on2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return on2.a(this.e, null, this);
    }
}
