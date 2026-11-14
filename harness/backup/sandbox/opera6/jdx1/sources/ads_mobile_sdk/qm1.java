package ads_mobile_sdk;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.afp;
import defpackage.amp;
import defpackage.anp;
import defpackage.fbp;
import defpackage.hcp;
import defpackage.lgp;
import defpackage.lko;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class qm1 implements fbp {
    public static final o7 u;
    public final Context a;
    public final anp b;
    public final ExecutorService c;
    public final s11 d;
    public final boolean e;
    public final String f;
    public final long g;
    public final long h;
    public final double i;
    public final String j;
    public final int k;
    public final long l;
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final Object n = new Object();
    public final Object o = new Object();
    public final Object p = new Object();
    public final lgp q = t7.o();
    public final ArrayList r = new ArrayList();
    public boolean s = false;
    public final HashMap t = new HashMap();

    static {
        hcp hcpVarO = o7.o();
        hcpVarO.b$1();
        o7 o7Var = (o7) hcpVarO.b;
        o7Var.getClass();
        o7Var.binaryName_ = 15;
        o7Var.bitField0_ |= 1;
        u = (o7) hcpVarO.a();
    }

    public qm1(Context context, anp anpVar, ExecutorService executorService, s11 s11Var, Random random, String str, long j, long j2, double d, String str2, int i, long j3) {
        this.a = context;
        this.b = anpVar;
        this.c = executorService;
        this.d = s11Var;
        this.f = str;
        this.g = j;
        this.h = j2;
        this.i = d;
        this.j = str2;
        this.k = i;
        this.l = j3;
        this.e = random.nextDouble() < d;
    }

    public final long a(int i) {
        long jLongValue;
        synchronized (this.p) {
            Long l = (Long) this.t.get(Integer.valueOf(i));
            if (l == null) {
                l = 0L;
            }
            jLongValue = l.longValue() + 1;
            this.t.put(Integer.valueOf(i), Long.valueOf(jLongValue));
        }
        return jLongValue;
    }

    @Override // defpackage.fbp
    public final ListenableFuture a() {
        Runnable m7mVar = new m7m(Executors.callable(new afp(this, (byte) 1), null));
        this.c.execute(m7mVar);
        return m7mVar;
    }

    public final void a(int i, long j, Throwable th, String str) {
        if (this.e) {
            synchronized (this.o) {
                this.r.add(new pm1(i, j, th, str, a(i)));
                if (!this.s) {
                    this.s = true;
                    this.b.a(new afp(this, (byte) 0), this.h);
                }
            }
        }
    }

    public final void a(t7 t7Var) {
        try {
            lko lkoVarO = b8.o();
            o7 o7Var = u;
            lkoVarO.b$1();
            ((b8) lkoVarO.b).a(o7Var);
            amp ampVarO = z7.o();
            ampVarO.b$1();
            ((z7) ampVarO.b).a(t7Var);
            z7 z7Var = (z7) ampVarO.a();
            lkoVarO.b$1();
            ((b8) lkoVarO.b).a(z7Var);
            this.d.a(this.f, true, ((b8) lkoVarO.a()).a(), "application/x-protobuf");
        } catch (RuntimeException unused) {
        }
    }
}
