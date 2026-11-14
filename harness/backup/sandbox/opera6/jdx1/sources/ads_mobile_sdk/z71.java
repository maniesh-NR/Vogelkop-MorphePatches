package ads_mobile_sdk;

import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;

/* loaded from: classes.dex */
public final class z71 extends nt5 {
    public d91 a;
    public String b;
    public prb c;
    public Uri.Builder d;
    public Uri.Builder e;
    public String f;
    public Uri.Builder g;
    public /* synthetic */ Object h;
    public final /* synthetic */ d91 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z71(d91 d91Var, nt5 nt5Var) {
        super(nt5Var);
        this.i = d91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= LinearLayoutManager.INVALID_OFFSET;
        return d91.a(this.i, null, null, null, this);
    }
}
