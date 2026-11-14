package ads_mobile_sdk;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rf0 extends nt5 {
    public cg0 a;
    public Activity b;
    public ArrayList c;
    public nqh d;
    public nqh e;
    public int f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ cg0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(cg0 cg0Var, nt5 nt5Var) {
        super(nt5Var);
        this.j = cg0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= LinearLayoutManager.INVALID_OFFSET;
        return this.j.a((Activity) null, this);
    }
}
