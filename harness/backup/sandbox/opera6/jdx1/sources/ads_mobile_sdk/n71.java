package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.wpb;

/* loaded from: classes.dex */
public final class n71 extends nt5 {
    public o71 a;
    public wpb b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o71 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n71(o71 o71Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = o71Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return o71.a(this.d, this);
    }
}
