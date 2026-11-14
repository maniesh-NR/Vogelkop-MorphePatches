package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.zep;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class rk1 extends nt5 {
    public zep a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ov d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk1(ov ovVar, mt5 mt5Var) {
        super(mt5Var);
        this.d = ovVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a((zep) null, (mt5) this);
    }
}
