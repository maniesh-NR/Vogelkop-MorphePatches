package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ei3 extends nt5 {
    public li3 a;
    public String b;
    public ArrayList c;
    public Iterator d;
    public ArrayList e;
    public /* synthetic */ Object f;
    public final /* synthetic */ li3 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei3(li3 li3Var, nt5 nt5Var) {
        super(nt5Var);
        this.g = li3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return this.g.n(this);
    }
}
