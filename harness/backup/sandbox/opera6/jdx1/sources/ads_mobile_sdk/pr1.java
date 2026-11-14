package ads_mobile_sdk;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;

/* loaded from: classes.dex */
public final class pr1 extends nt5 {
    public rr1 a;
    public Activity b;
    public Window c;
    public ViewGroup d;
    public av e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ rr1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr1(rr1 rr1Var, nt5 nt5Var) {
        super(nt5Var);
        this.l = rr1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= LinearLayoutManager.INVALID_OFFSET;
        return rr1.a(this.l, (Map) null, this);
    }
}
