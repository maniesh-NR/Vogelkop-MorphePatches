package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.rap;
import defpackage.xzh;

/* loaded from: classes.dex */
public final class xm2 extends nt5 {
    public /* synthetic */ Object a;
    public int b;
    public l99 c;
    public final /* synthetic */ ym2 d;
    public Object e;
    public rap f;
    public xzh g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm2(ym2 ym2Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = ym2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.emit(null, this);
    }
}
