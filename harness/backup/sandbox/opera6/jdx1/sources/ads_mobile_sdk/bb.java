package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class bb extends nt5 {
    public sb a;
    public String b;
    public rg3 c;
    public rg3 d;
    public iv0 e;
    public pfe f;
    public /* synthetic */ Object g;
    public final /* synthetic */ sb h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(sb sbVar, nt5 nt5Var) {
        super(nt5Var);
        this.h = sbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return sb.a(this.h, null, null, 0L, this);
    }
}
