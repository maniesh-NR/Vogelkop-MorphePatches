package defpackage;

import android.os.Handler;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class hnl {
    public final nx5 a;
    public final nx5 b;
    public final ScheduledExecutorService c;
    public final dx5 d;
    public final ScheduledExecutorService e;
    public final dx5 f;
    public final ScheduledExecutorService g;
    public final dx5 h;
    public final zyk i;
    public final zyk j;

    public hnl(nx5 nx5Var, nx5 nx5Var2, ScheduledExecutorService scheduledExecutorService, dx5 dx5Var, ScheduledExecutorService scheduledExecutorService2, dx5 dx5Var2, ScheduledExecutorService scheduledExecutorService3, dx5 dx5Var3, p7l p7lVar, eek eekVar) {
        this.a = nx5Var;
        this.b = nx5Var2;
        this.c = scheduledExecutorService;
        this.d = dx5Var;
        this.e = scheduledExecutorService2;
        this.f = dx5Var2;
        this.g = scheduledExecutorService3;
        this.h = dx5Var3;
        this.i = z4c.b(new p7l(p7lVar, (byte) 10));
        this.j = z4c.b(new p7l(eekVar, (byte) 11));
    }

    public final Handler a() {
        return (Handler) this.i.getValue();
    }

    public final Object b(long j, Function1 function1) {
        try {
            return scd.g0(this.d, new bk4(this, function1, j, null));
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
