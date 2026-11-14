package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.xp9;

/* loaded from: classes.dex */
public final class t82 extends nt5 {
    public v82 a;
    public xp9 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ v82 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t82(v82 v82Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = v82Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return v82.a(this.d, (xp9) null, this);
    }
}
