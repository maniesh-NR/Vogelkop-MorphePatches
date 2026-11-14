package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ld2 extends nt5 {
    public ae2 a;
    public av2 b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ae2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld2(ae2 ae2Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = ae2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a((av2) null, (String) null, this);
    }
}
