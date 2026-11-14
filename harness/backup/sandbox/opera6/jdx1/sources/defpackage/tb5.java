package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class tb5 implements ivh {
    public final LinkedHashMap a = new LinkedHashMap();
    public volatile Map b = n08.a;

    @Override // defpackage.ivh
    public final void D(owh owhVar, long j, w61 w61Var) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new pb5((ivh) entry.getKey(), owhVar, j, w61Var, (byte) 0));
        }
    }

    @Override // defpackage.ivh
    public final void E(lvh lvhVar) {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            ((Executor) ((Map.Entry) it.next()).getValue()).execute(new fh4(r0.getKey(), (Object) lvhVar, (byte) 8));
        }
    }

    public final void a(ivh ivhVar, k31 k31Var) {
        if (this.b.containsKey(ivhVar)) {
            throw new IllegalStateException((ivhVar + " was already registered!").toString());
        }
        synchronized (this.a) {
            this.a.put(ivhVar, k31Var);
            this.b = rbd.i(this.a);
        }
    }

    public final void b(ivh ivhVar) {
        synchronized (this.a) {
            this.a.remove(ivhVar);
            this.b = rbd.i(this.a);
        }
    }

    @Override // defpackage.ivh
    public final void h(owh owhVar, long j, int i, int i2) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new gw4((ivh) entry.getKey(), owhVar, j, i, i2));
        }
    }

    @Override // defpackage.ivh
    public final void m(owh owhVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new qb5((ivh) entry.getKey(), owhVar, (byte) 2));
        }
    }

    @Override // defpackage.ivh
    public final void n(owh owhVar, long j, x61 x61Var) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new rb5((ivh) entry.getKey(), owhVar, j, x61Var, (byte) 1));
        }
    }

    @Override // defpackage.ivh
    public final void o(owh owhVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new qb5((ivh) entry.getKey(), owhVar, (byte) 1));
        }
    }

    @Override // defpackage.ivh
    public final void p(owh owhVar, long j) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new ni2((ivh) entry.getKey(), owhVar, j, (byte) 2));
        }
    }

    @Override // defpackage.ivh
    public final void q(owh owhVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new qb5((ivh) entry.getKey(), owhVar, (byte) 0));
        }
    }

    @Override // defpackage.ivh
    public final void r(final owh owhVar, final long j, final long j2) {
        for (Map.Entry entry : this.b.entrySet()) {
            final ivh ivhVar = (ivh) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: sb5
                @Override // java.lang.Runnable
                public final void run() {
                    ivhVar.r(owhVar, j, j2);
                }
            });
        }
    }

    @Override // defpackage.ivh
    public final void s(owh owhVar, long j, w61 w61Var) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new pb5((ivh) entry.getKey(), owhVar, j, w61Var, (byte) 1));
        }
    }

    @Override // defpackage.ivh
    public final void t(owh owhVar, long j, hwh hwhVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new rb5((ivh) entry.getKey(), owhVar, j, hwhVar, (byte) 0));
        }
    }
}
