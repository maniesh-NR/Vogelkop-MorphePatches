package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.xzh;

/* loaded from: classes.dex */
public final class lc1 extends nt5 {
    public /* synthetic */ Object a;
    public int b;
    public l99 c;
    public final /* synthetic */ mc1 d;
    public av0 e;
    public xzh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc1(mc1 mc1Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = mc1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.emit(null, this);
    }
}
