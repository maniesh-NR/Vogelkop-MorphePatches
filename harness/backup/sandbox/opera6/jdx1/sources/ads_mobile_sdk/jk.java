package ads_mobile_sdk;

import defpackage.cs5;
import defpackage.mip;
import defpackage.qlo;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class jk implements qlo {
    public final mip a;
    public final qr0 b;
    public Long f;
    public int h;
    public boolean l;
    public long m;
    public final Object c = new Object();
    public int d = -1;
    public int e = -1;
    public final Object g = new Object();
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashMap j = new LinkedHashMap();
    public final Object k = new Object();

    public jk(qr0 qr0Var, mip mipVar) {
        this.a = mipVar;
        this.b = qr0Var;
        pn7.b.getClass();
        this.m = 0L;
    }

    @Override // defpackage.qlo
    public final Object b(long j, kuk kukVar) {
        synchronized (this.k) {
            if (!this.l) {
                return Unit.a;
            }
            if (pn7.c(j, this.m) < 0) {
                return Unit.a;
            }
            boolean z = false;
            this.l = false;
            qr0 qr0Var = this.b;
            qr0Var.getClass();
            if (((Boolean) qr0Var.a("gads:reset_session_counters_on_app_foreground:enabled", Boolean.TRUE, fo.a)).booleanValue()) {
                long jL = pn7.l(j, this.m);
                qr0 qr0Var2 = this.b;
                qr0Var2.getClass();
                if (pn7.c(jL, ((pn7) qr0Var2.a("gads:app_activity_tracker:app_session_timeout_ms", new pn7(cs5.x0(5, un7.f)), fo.a$18)).a) > 0) {
                    z = true;
                }
            }
            this.m = j;
            Unit unit = Unit.a;
            if (!z) {
                return unit;
            }
            synchronized (this.c) {
                this.f = null;
                this.e = -1;
            }
            return unit;
        }
    }

    @Override // defpackage.qlo
    public final Object d(long j, kuk kukVar) {
        synchronized (this.k) {
            if (this.l) {
                return Unit.a;
            }
            if (pn7.c(j, this.m) < 0) {
                return Unit.a;
            }
            this.l = true;
            this.m = j;
            return Unit.a;
        }
    }
}
