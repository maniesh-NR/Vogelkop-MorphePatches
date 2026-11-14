package defpackage;

import java.util.Objects;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final class ge9 extends p43 {
    public final /* synthetic */ long i;
    public final /* synthetic */ String j;
    public final /* synthetic */ oi2 k;
    public final /* synthetic */ le9 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge9(long j, oi2 oi2Var, vk2 vk2Var, le9 le9Var, String str) {
        super(le9Var, vk2Var);
        this.i = j;
        this.j = str;
        this.k = oi2Var;
        Objects.requireNonNull(le9Var);
        this.l = le9Var;
    }

    @Override // defpackage.p43
    public final RealCall b() {
        le9 le9Var = this.l;
        t9f t9fVar = (t9f) le9Var.a.get();
        fvh fvhVarA = le9Var.a("messages/" + this.i, this.j, new String[0]);
        fvhVarA.e("DELETE", rvh.EMPTY);
        return t9fVar.c(new kvh(fvhVarA));
    }

    @Override // defpackage.p43
    public final void f(pzh pzhVar) {
        e(this.k);
    }
}
