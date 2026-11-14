package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class fg3 extends nt5 {
    public /* synthetic */ Object a;
    public final /* synthetic */ gg3 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg3(gg3 gg3Var, nt5 nt5Var) {
        super(nt5Var);
        this.b = gg3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= LinearLayoutManager.INVALID_OFFSET;
        return gg3.a(this.b, false, this);
    }
}
