package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;

/* loaded from: classes.dex */
public final class ak extends nt5 {
    public dk a;
    public xi b;
    public prb c;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ dk f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(dk dkVar, nt5 nt5Var) {
        super(nt5Var);
        this.f = dkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a((xi) null, (prb) null, this);
    }
}
