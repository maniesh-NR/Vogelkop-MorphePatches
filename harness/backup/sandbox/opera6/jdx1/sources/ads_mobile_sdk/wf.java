package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class wf extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(bg bgVar, nt5 nt5Var) {
        super(nt5Var);
        this.b = bgVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return this.b.a((byte[]) null, this);
    }
}
