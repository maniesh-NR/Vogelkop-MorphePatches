package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class e92 extends nt5 {
    public boolean a;
    public boolean b;
    public boolean c;
    public cy0 d;
    public String e;
    public String f;
    public String g;
    public nj3 h;
    public int i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f92 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e92(f92 f92Var, nt5 nt5Var) {
        super(nt5Var);
        this.l = f92Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= LinearLayoutManager.INVALID_OFFSET;
        return this.l.b(null, false, false, null, this);
    }
}
