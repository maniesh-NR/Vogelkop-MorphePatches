package ads_mobile_sdk;

import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class cl extends nt5 {
    public dl a;
    public Uri b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(dl dlVar, nt5 nt5Var) {
        super(nt5Var);
        this.d = dlVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.c(null, this);
    }
}
