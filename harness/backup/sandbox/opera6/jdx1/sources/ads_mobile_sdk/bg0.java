package ads_mobile_sdk;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class bg0 extends nt5 {
    public Object a;
    public rg3 b;
    public rg3 c;
    public Activity d;
    public /* synthetic */ Object e;
    public final /* synthetic */ cg0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0(cg0 cg0Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = cg0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return cg0.b(this.f, this);
    }
}
