package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class yc3 extends nt5 {
    public cd3 a;
    public ev0 b;
    public Iterator c;
    public String d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ cd3 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc3(cd3 cd3Var, nt5 nt5Var) {
        super(nt5Var);
        this.g = cd3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return this.g.a((ArrayList) null, false, (nt5) this);
    }
}
