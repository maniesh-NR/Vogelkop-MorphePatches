package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ii extends nt5 {
    public ki a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ki c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(ki kiVar, nt5 nt5Var) {
        super(nt5Var);
        this.c = kiVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return ki.a(this.c, this);
    }
}
