package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class rf extends nt5 {
    public bg a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bg d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(bg bgVar, nt5 nt5Var) {
        super(nt5Var);
        this.d = bgVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a((String) null, (tv0) null, this);
    }
}
