package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class oj extends nt5 {
    public Object a;
    public String b;
    public String c;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ dk f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj(dk dkVar, nt5 nt5Var) {
        super(nt5Var);
        this.f = dkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a((String) null, (String) null, this);
    }
}
