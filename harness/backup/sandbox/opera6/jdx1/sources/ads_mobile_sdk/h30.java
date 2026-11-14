package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.UUID;

/* loaded from: classes.dex */
public final class h30 extends nt5 {
    public p30 a;
    public j21 b;
    public UUID c;
    public /* synthetic */ Object d;
    public final /* synthetic */ p30 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h30(p30 p30Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = p30Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return this.e.a((j21) null, (UUID) null, this);
    }
}
