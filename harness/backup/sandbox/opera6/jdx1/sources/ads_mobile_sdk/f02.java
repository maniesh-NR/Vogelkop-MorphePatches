package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class f02 extends nt5 {
    public Object a;
    public Closeable b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ g02 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f02(g02 g02Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = g02Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return g02.a(this.e, this);
    }
}
