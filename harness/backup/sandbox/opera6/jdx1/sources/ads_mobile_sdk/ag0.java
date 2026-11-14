package ads_mobile_sdk;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.vkp;

/* loaded from: classes.dex */
public final class ag0 extends nt5 {
    public Object a;
    public rg3 b;
    public rg3 c;
    public Activity d;
    public vkp e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ cg0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(cg0 cg0Var, nt5 nt5Var) {
        super(nt5Var);
        this.h = cg0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return cg0.a(this.h, this);
    }
}
