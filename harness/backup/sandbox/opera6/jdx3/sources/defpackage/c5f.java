package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class c5f implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c5f(long j, boolean z, boolean z2) {
        this.a = z;
        this.b = j;
        this.c = z2;
    }

    public final Object invoke(Object obj) {
        td0 td0VarD = ((ck0) obj).d();
        String str = this.a ? "user_sd_plus" : "user";
        zpa zpaVar = td0VarD.a;
        zpaVar.getClass();
        kq0 kq0VarL = zpa.L();
        td0VarD.b.C0().put(str, kq0VarL);
        kq0 kq0Var = (kq0) new esg(zpaVar, kq0VarL).c;
        kq0Var.y().addAll(new a82(new long[]{this.b}, (byte) 1));
        if (this.c) {
            kq0Var.p(3, 1, 1L);
        } else {
            kq0Var.p(5, 1, 1L);
        }
        return Unit.a;
    }
}
