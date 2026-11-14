package ads_mobile_sdk;

import android.net.Uri;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class fn0 extends nt5 {
    public gn0 a;
    public ym0 b;
    public Bundle c;
    public Uri.Builder d;
    public /* synthetic */ Object e;
    public final /* synthetic */ gn0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn0(gn0 gn0Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = gn0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a(null, null, null, this);
    }
}
