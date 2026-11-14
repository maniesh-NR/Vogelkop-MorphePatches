package ads_mobile_sdk;

import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.pqh;

/* loaded from: classes.dex */
public final class tk1 extends nt5 {
    public bl1 a;
    public cy0 b;
    public Uri c;
    public String d;
    public String e;
    public pqh f;
    public pfe g;
    public /* synthetic */ Object h;
    public final /* synthetic */ bl1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk1(bl1 bl1Var, nt5 nt5Var) {
        super(nt5Var);
        this.i = bl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= LinearLayoutManager.INVALID_OFFSET;
        return bl1.a(this.i, (cy0) null, (Uri) null, this);
    }
}
