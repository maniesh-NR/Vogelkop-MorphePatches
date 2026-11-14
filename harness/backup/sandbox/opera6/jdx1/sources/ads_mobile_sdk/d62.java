package ads_mobile_sdk;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class d62 extends nt5 {
    public r62 a;
    public ViewGroup b;
    public fs0 c;
    public /* synthetic */ Object e;
    public final /* synthetic */ r62 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d62(r62 r62Var, nt5 nt5Var) {
        super(nt5Var);
        this.f = r62Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return r62.a(this.f, null, null, this);
    }
}
