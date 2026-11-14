package defpackage;

import android.app.NotificationManager;

/* loaded from: classes.dex */
public final class td2 {
    public final umi a;

    public /* synthetic */ td2(umi umiVar) {
        this.a = umiVar;
    }

    public final void a(NotificationManager notificationManager, fd2 fd2Var) {
        va2 va2Var = new va2(fd2Var, (byte) 1);
        ab abVar = new ab(fd2Var, (byte) 19);
        umi umiVar = this.a;
        nml nmlVarE = umiVar.e(va2Var);
        nmlVarE.b(umiVar.f(new lw0(abVar, (byte) 1)));
        nmlVarE.a(notificationManager);
    }
}
