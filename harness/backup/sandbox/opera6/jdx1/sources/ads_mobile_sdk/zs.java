package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class zs extends nt5 {
    public Object a;
    public String b;
    public Object c;
    public bw2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ at f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs(at atVar, nt5 nt5Var) {
        super(nt5Var);
        this.f = atVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.d(this);
    }
}
