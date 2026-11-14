package ads_mobile_sdk;

import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class c92 extends nt5 {
    public Object a;
    public cy0 b;
    public Map c;
    public Object d;
    public Intent e;
    public boolean f;
    public boolean g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ f92 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c92(f92 f92Var, mt5 mt5Var) {
        super(mt5Var);
        this.j = f92Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= LinearLayoutManager.INVALID_OFFSET;
        return this.j.a(null, null, this);
    }
}
