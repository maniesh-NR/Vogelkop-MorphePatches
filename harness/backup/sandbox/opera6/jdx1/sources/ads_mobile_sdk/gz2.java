package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class gz2 extends nt5 {
    public jz2 a;
    public String b;
    public int c;
    public Map d;
    public pfe e;
    public /* synthetic */ Object f;
    public final /* synthetic */ jz2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz2(jz2 jz2Var, nt5 nt5Var) {
        super(nt5Var);
        this.g = jz2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return jz2.a(this.g, null, 0, null, this);
    }
}
