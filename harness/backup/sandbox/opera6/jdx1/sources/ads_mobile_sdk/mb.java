package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class mb extends nt5 {
    public defpackage.r83 b;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ sb f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(sb sbVar, nt5 nt5Var) {
        super(nt5Var);
        this.f = sbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return sb.a(this.f, (defpackage.r83) null, (String) null, this);
    }
}
