package ads_mobile_sdk;

import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class yl3 extends nt5 {
    public am3 a;
    public Uri b;
    public /* synthetic */ Object c;
    public final /* synthetic */ am3 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl3(am3 am3Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = am3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        this.d.k(this);
        return px5.a;
    }
}
