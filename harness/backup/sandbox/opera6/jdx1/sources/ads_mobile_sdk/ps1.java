package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ps1 extends nt5 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ mc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps1(mc1 mc1Var, mt5 mt5Var) {
        super(mt5Var);
        this.c = mc1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.emit(null, this);
    }
}
