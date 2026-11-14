package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class jb1 extends nt5 {
    public mb1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mb1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb1(mb1 mb1Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = mb1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.h(this);
    }
}
