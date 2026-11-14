package ads_mobile_sdk;

import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class ov2 extends nt5 {
    public tv2 a;
    public Uri b;
    public u22 c;
    public String d;
    public Map e;
    public z2 f;
    public a2 g;
    public Boolean h;
    public int j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ tv2 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov2(tv2 tv2Var, nt5 nt5Var) {
        super(nt5Var);
        this.m = tv2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= LinearLayoutManager.INVALID_OFFSET;
        return this.m.a(null, null, 0, 0L, null, null, null, null, null, this);
    }
}
