package ads_mobile_sdk;

import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ym1 extends nt5 {
    public zm1 a;
    public Uri b;
    public a2 c;
    public pn7 d;
    public String e;
    public String f;
    public String g;
    public /* synthetic */ Object h;
    public final /* synthetic */ zm1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym1(zm1 zm1Var, nt5 nt5Var) {
        super(nt5Var);
        this.i = zm1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= LinearLayoutManager.INVALID_OFFSET;
        return this.i.a((Uri) null, (n13) null, (a2) null, (Integer) null, (String) null, (pn7) null, (String) null, (ve2) null, (y31) null, (v31) null, this);
    }
}
