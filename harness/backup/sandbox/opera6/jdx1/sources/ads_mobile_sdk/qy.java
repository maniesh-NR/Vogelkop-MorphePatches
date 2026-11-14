package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class qy extends nt5 {
    public vz a;
    public ox b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vz d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy(vz vzVar, nt5 nt5Var) {
        super(nt5Var);
        this.d = vzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.B(this);
    }
}
