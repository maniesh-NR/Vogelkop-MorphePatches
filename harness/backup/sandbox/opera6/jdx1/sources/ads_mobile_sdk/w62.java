package ads_mobile_sdk;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class w62 extends nt5 {
    public Object a;
    public ViewGroup b;
    public fs0 c;
    public pfe e;
    public /* synthetic */ Object f;
    public final /* synthetic */ f72 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w62(f72 f72Var, nt5 nt5Var) {
        super(nt5Var);
        this.g = f72Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return f72.a(this.g, (ViewGroup) null, (fs0) null, this);
    }
}
