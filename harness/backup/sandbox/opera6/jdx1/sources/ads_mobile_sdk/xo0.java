package ads_mobile_sdk;

import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class xo0 extends nt5 {
    public yo0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yo0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo0(yo0 yo0Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = yo0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a((RelativeLayout) null, (mt5) this);
    }
}
