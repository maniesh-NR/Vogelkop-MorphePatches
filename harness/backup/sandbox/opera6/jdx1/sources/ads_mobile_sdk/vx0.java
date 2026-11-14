package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class vx0 extends nt5 {
    public Object a;
    public Closeable b;
    public Object c;
    public cd5 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ cy0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx0(cy0 cy0Var, mt5 mt5Var) {
        super(mt5Var);
        this.f = cy0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.b(null, this);
    }
}
