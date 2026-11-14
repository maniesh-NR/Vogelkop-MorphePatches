package defpackage;

import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final class fe9 extends r43 {
    public final /* synthetic */ long i;
    public final /* synthetic */ String j;
    public final /* synthetic */ re9 k;
    public final /* synthetic */ le9 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe9(long j, vk2 vk2Var, le9 le9Var, re9 re9Var, String str) {
        super(le9Var, vk2Var);
        this.i = j;
        this.j = str;
        this.k = re9Var;
        this.l = le9Var;
    }

    @Override // defpackage.p43
    public final RealCall b() {
        le9 le9Var = this.l;
        return j7c.q(le9Var.a("messages/" + this.i, this.j, new String[0]), (t9f) le9Var.a.get());
    }

    @Override // defpackage.r43
    public final void g(orb orbVar) {
        e(new cn7(this.k, new je9(orbVar), (byte) 25));
    }
}
