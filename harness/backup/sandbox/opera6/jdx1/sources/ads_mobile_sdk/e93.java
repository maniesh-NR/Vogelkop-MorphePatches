package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class e93 extends nt5 {
    public f93 a;
    public Map b;
    public /* synthetic */ Object c;
    public final /* synthetic */ f93 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e93(f93 f93Var, mt5 mt5Var) {
        super(mt5Var);
        this.d = f93Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= LinearLayoutManager.INVALID_OFFSET;
        return this.d.a(null, null, this);
    }
}
