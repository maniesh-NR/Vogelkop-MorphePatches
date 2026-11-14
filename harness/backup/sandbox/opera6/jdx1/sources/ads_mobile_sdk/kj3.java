package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class kj3 extends nt5 {
    public nj3 a;
    public Object b;
    public String c;
    public String d;
    public sy0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nj3 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj3(nj3 nj3Var, nt5 nt5Var) {
        super(nt5Var);
        this.l = nj3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= LinearLayoutManager.INVALID_OFFSET;
        return this.l.a(false, 0, false, null, null, null, null, false, false, this);
    }
}
