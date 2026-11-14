package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class cv1 extends nt5 {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ iv1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv1(iv1 iv1Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = iv1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.b(null, this);
    }
}
