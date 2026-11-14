package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class zb extends nt5 {
    public ac a;
    public LinkedHashMap b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ac d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(ac acVar, nt5 nt5Var) {
        super(nt5Var);
        this.d = acVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.d(this);
    }
}
