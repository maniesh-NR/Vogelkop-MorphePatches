package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class cz extends nt5 {
    public Object a;
    public Object b;
    public Closeable c;
    public Object d;
    public String e;
    public pfe f;
    public /* synthetic */ Object g;
    public final /* synthetic */ vz h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz(vz vzVar, nt5 nt5Var) {
        super(nt5Var);
        this.h = vzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return this.h.E(this);
    }
}
