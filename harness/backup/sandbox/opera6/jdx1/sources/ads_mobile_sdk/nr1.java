package ads_mobile_sdk;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class nr1 extends nt5 {
    public rr1 a;
    public ViewGroup b;
    public Object c;
    public Object d;
    public Object e;
    public cy0 f;
    public sy0 g;
    public pfe h;
    public /* synthetic */ Object i;
    public final /* synthetic */ rr1 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr1(rr1 rr1Var, nt5 nt5Var) {
        super(nt5Var);
        this.j = rr1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= LinearLayoutManager.INVALID_OFFSET;
        return this.j.a(null, null, null, null, null, null, this);
    }
}
