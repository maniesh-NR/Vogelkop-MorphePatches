package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class of extends nt5 {
    public bg a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(bg bgVar, nt5 nt5Var) {
        super(nt5Var);
        this.c = bgVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return bg.a(this.c, this);
    }
}
