package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class tg0 extends nt5 {
    public Object a;
    public cy0 b;
    public Map c;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ug0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg0(ug0 ug0Var, mt5 mt5Var) {
        super(mt5Var);
        this.f = ug0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a(null, null, this);
    }
}
