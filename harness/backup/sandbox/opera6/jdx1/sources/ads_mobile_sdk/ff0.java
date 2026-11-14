package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.vkp;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class ff0 extends nt5 {
    public Object a;
    public Closeable b;
    public Object c;
    public Object d;
    public vkp e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ cg0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff0(cg0 cg0Var, nt5 nt5Var) {
        super(nt5Var);
        this.h = cg0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return this.h.a(this);
    }
}
