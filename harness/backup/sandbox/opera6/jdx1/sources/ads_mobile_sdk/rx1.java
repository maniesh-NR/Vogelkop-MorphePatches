package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.prb;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class rx1 extends nt5 {
    public ArrayList a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ w8 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx1(w8 w8Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = w8Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a((prb) null, (String) null, this);
    }
}
