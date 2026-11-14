package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mdf {
    public final tcc a;
    public final x5f b;
    public final x5f c;
    public final wsf d;
    public final ArrayList e = new ArrayList();
    public long f;
    public long g;
    public boolean h;
    public final ob i;

    public mdf(tcc tccVar, x5f x5fVar, x5f x5fVar2, wsf wsfVar) {
        this.a = tccVar;
        this.b = x5fVar;
        this.c = x5fVar2;
        this.d = wsfVar;
        ob obVar = new ob((Object) this, (byte) 13);
        this.i = obVar;
        tccVar.a(obVar);
    }

    public final void a(kl0 kl0Var, gl0 gl0Var) {
        ll0 ll0Var;
        wd0 wd0Var;
        b(kl0Var, gl0Var);
        if (kl0Var == kl0.b) {
            ll0Var = ll0.b;
        } else if (kl0Var == kl0.c) {
            ll0Var = ll0.c;
        } else if (kl0Var == kl0.d) {
            ll0Var = ll0.d;
        } else if (kl0Var == kl0.e) {
            ll0Var = ll0.e;
        } else if (kl0Var != kl0.f) {
            return;
        } else {
            ll0Var = ll0.f;
        }
        if (gl0Var == gl0.b) {
            wd0Var = wd0.b;
        } else if (gl0Var != gl0.d) {
            return;
        } else {
            wd0Var = wd0.c;
        }
        x5f x5fVar = this.b;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            xd0 xd0Var = new xd0(2443, -1, 2);
            xd0Var.q(0, 1, ll0Var);
            xd0Var.q(1, 1, wd0Var);
            List list = (List) xb0VarX.n(28);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 28, am2.q(xb0VarX, 28, 1)) : new hf0(xb0VarX, 28, list)).add(xd0Var);
            x5fVar.U0(x56VarF);
        }
    }

    public final void b(kl0 kl0Var, gl0 gl0Var) {
        if (!Intrinsics.a(kl0Var, (kl0) CollectionsKt.R(this.e)) && kl0Var != null) {
            c(kl0Var);
        }
        if (this.h) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.f = (jUptimeMillis - this.g) + this.f;
            this.g = jUptimeMillis;
        }
        this.d.a(new tsf(kl0Var, r0.size(), gl0Var, this.f, (byte) 0));
    }

    public final void c(kl0 kl0Var) {
        ArrayList arrayList = this.e;
        if (Intrinsics.a(kl0Var, (kl0) CollectionsKt.R(arrayList))) {
            return;
        }
        this.f = 0L;
        arrayList.add(kl0Var);
    }
}
