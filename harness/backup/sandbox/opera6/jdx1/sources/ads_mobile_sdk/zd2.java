package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class zd2 extends nt5 {
    public ae2 a;
    public dl0 b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public int g;
    public long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ ae2 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd2(ae2 ae2Var, nt5 nt5Var) {
        super(nt5Var);
        this.j = ae2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= LinearLayoutManager.INVALID_OFFSET;
        return ae2.b(this.j, this);
    }
}
