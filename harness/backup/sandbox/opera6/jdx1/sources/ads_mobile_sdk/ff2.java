package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ff2 extends nt5 {
    public if2 a;
    public pfe b;
    public /* synthetic */ Object c;
    public final /* synthetic */ if2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff2(if2 if2Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = if2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return if2.a(this.d, this);
    }
}
