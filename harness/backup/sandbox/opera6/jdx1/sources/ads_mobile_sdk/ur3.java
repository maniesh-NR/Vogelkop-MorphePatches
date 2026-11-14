package ads_mobile_sdk;

import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ur3 extends nt5 {
    public wr3 a;
    public Uri b;
    public String c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ wr3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur3(wr3 wr3Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = wr3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a(null, this);
    }
}
