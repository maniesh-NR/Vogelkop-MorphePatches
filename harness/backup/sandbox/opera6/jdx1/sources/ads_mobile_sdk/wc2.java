package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class wc2 extends nt5 {
    public yc2 a;
    public LinkedHashSet b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yc2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc2(yc2 yc2Var, nt5 nt5Var) {
        super(nt5Var);
        this.d = yc2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return yc2.a(this.d, this);
    }
}
