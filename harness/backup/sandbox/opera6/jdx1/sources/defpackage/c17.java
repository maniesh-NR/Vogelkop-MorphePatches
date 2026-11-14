package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class c17 implements ocf {
    public final Context a;
    public final int b;
    public final w4o c;
    public final ezk d;
    public final oji e;
    public final Object f;
    public byte g;
    public final op1 h;
    public final eba i;
    public PowerManager.WakeLock j;
    public boolean k;
    public final w8k l;
    public final dx5 m;
    public volatile d3k n;

    static {
        qs7.B("DelayMetCommandHandler");
    }

    public c17(Context context, int i, ezk ezkVar, w8k w8kVar) {
        this.a = context;
        this.b = i;
        this.d = ezkVar;
        this.c = w8kVar.a;
        this.l = w8kVar;
        azl azlVar = ezkVar.e.j;
        a5o a5oVar = ezkVar.b;
        this.h = a5oVar.a;
        this.i = a5oVar.d;
        this.m = a5oVar.b;
        this.e = new oji(azlVar);
        this.k = false;
        this.g = (byte) 0;
        this.f = new Object();
    }

    public final void a() {
        synchronized (this.f) {
            if (this.n != null) {
                this.n.k((CancellationException) null);
            }
            this.d.c.a(this.c);
            PowerManager.WakeLock wakeLock = this.j;
            if (wakeLock != null && wakeLock.isHeld()) {
                qs7 qs7VarX = qs7.x();
                Objects.toString(this.j);
                Objects.toString(this.c);
                qs7VarX.getClass();
                this.j.release();
            }
        }
    }

    public final void b() throws Throwable {
        String str = this.c.a;
        Context context = this.a;
        StringBuilder sbH = u35.h(str, " (");
        sbH.append(this.b);
        sbH.append(")");
        this.j = iin.a(context, sbH.toString());
        qs7 qs7VarX = qs7.x();
        Objects.toString(this.j);
        qs7VarX.getClass();
        this.j.acquire();
        h5o h5oVarG = this.d.e.c.C().g(str);
        if (h5oVarG == null) {
            this.h.execute(new b17(this, (byte) 0));
            return;
        }
        boolean zB = h5oVarG.b();
        this.k = zB;
        if (zB) {
            this.n = q4o.a(this.e, h5oVarG, this.m, this);
        } else {
            qs7.x().getClass();
            this.h.execute(new b17(this, (byte) 1));
        }
    }

    public final void c(boolean z) {
        qs7 qs7VarX = qs7.x();
        w4o w4oVar = this.c;
        Objects.toString(w4oVar);
        qs7VarX.getClass();
        a();
        byte b = 6;
        int i = this.b;
        ezk ezkVar = this.d;
        eba ebaVar = this.i;
        Context context = this.a;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            wb5.d(intent, w4oVar);
            ebaVar.execute(new sq1(ezkVar, intent, i, b));
        }
        if (this.k) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            ebaVar.execute(new sq1(ezkVar, intent2, i, b));
        }
    }

    public final void d(h5o h5oVar, fp5 fp5Var) {
        boolean z = fp5Var instanceof dp5;
        op1 op1Var = this.h;
        if (z) {
            op1Var.execute(new b17(this, (byte) 1));
        } else {
            op1Var.execute(new b17(this, (byte) 0));
        }
    }
}
