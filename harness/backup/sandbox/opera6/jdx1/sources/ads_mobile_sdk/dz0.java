package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.zep;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class dz0 extends nt5 {
    public zep a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dz1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz0(dz1 dz1Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = dz1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a((zep) null, (mt5) this);
    }
}
