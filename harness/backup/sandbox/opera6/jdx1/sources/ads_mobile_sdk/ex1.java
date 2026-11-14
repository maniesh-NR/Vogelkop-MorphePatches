package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ex1 extends nt5 {
    public ArrayList a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jx1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex1(jx1 jx1Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = jx1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a(null, this);
    }
}
