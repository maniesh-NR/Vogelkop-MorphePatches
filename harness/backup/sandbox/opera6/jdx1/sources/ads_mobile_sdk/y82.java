package ads_mobile_sdk;

import android.app.Activity;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class y82 extends nt5 {
    public f92 a;
    public Map b;
    public cy0 c;
    public String d;
    public Activity e;
    public Uri f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f92 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y82(f92 f92Var, nt5 nt5Var) {
        super(nt5Var);
        this.l = f92Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= LinearLayoutManager.INVALID_OFFSET;
        return this.l.a(null, false, false, false, null, this);
    }
}
