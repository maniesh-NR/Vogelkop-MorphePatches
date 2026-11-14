package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ya extends nt5 {
    public sb a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sb d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(sb sbVar, mt5 mt5Var) {
        super(mt5Var);
        this.d = sbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return sb.a(this.d, this);
    }
}
