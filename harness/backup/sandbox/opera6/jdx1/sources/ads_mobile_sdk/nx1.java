package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class nx1 extends nt5 {
    public ox1 a;
    public Map b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ox1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx1(ox1 ox1Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = ox1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a(null, null, this);
    }
}
