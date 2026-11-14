package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class tg3 extends nt5 {
    public ah3 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ah3 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(ah3 ah3Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = ah3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return ah3.c(this.d, null, null, this);
    }
}
