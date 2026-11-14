package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class cf4 {
    public final Executor a;
    public final g7a b;
    public ScheduledFuture e;
    public tah f;
    public hf4 g;
    public xf2 h;
    public rn9 i;
    public final Object c = new Object();
    public final Object d = new Object();
    public final bf4 j = new bf4(this, (byte) 0);
    public volatile List k = l08.a;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final CopyOnWriteArrayList m = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList n = new CopyOnWriteArrayList();
    public final LinkedHashMap o = new LinkedHashMap();

    public cf4(Executor executor, g7a g7aVar) {
        this.a = executor;
        this.b = g7aVar;
    }

    public final void a(String str) {
        hf4 hf4Var = this.g;
        if (hf4Var != null) {
            try {
                e(hf4Var.b(str).g());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void b(Set set, Set set2) {
        boolean zIsEmpty = set.isEmpty();
        CopyOnWriteArrayList copyOnWriteArrayList = this.n;
        if (!zIsEmpty) {
            set.size();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                af4 af4Var = (af4) it.next();
                af4Var.b.execute(new rl(af4Var, set));
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        set2.size();
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            af4 af4Var2 = (af4) it2.next();
            af4Var2.b.execute(new bi2(af4Var2, set2, (byte) 24));
        }
    }

    public final void c(String str) {
        synchronized (this.c) {
            f7f f7fVar = (f7f) this.o.remove(str);
            hf4 hf4Var = this.g;
            if (f7fVar != null && hf4Var != null) {
                try {
                    zd4 zd4VarB = hf4Var.b(str);
                    ((g7a) x7d.l()).execute(new bi2(zd4VarB, f7fVar, (byte) 25));
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public final void d(int i, List list) {
        if (i <= 0 || !this.l.get()) {
            return;
        }
        this.e = this.b.schedule(new ze4(this, list, i, (byte) 0), i == 3 ? 0L : 400L, TimeUnit.MILLISECONDS);
    }

    public final void e(xd4 xd4Var) {
        String strE = xd4Var.e();
        if (this.l.get()) {
            synchronized (this.c) {
                if (!this.o.containsKey(strE)) {
                    k9 k9Var = new k9(this, strE);
                    ((g7a) x7d.l()).execute(new bi2(xd4Var, k9Var, (byte) 26));
                    this.o.put(strE, k9Var);
                }
            }
        }
    }

    public final void f() {
        if (this.l.getAndSet(false)) {
            synchronized (this.d) {
                ScheduledFuture scheduledFuture = this.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.e = null;
            }
            xf2 xf2Var = this.h;
            if (xf2Var != null) {
                xf2Var.f(this.j);
            }
            synchronized (this.c) {
                if (!this.o.isEmpty()) {
                    Map mapI = rbd.i(this.o);
                    this.o.clear();
                    hf4 hf4Var = this.g;
                    if (hf4Var != null) {
                        LinkedHashSet<zd4> linkedHashSetC = hf4Var.c();
                        ArrayList arrayList = new ArrayList();
                        for (zd4 zd4Var : linkedHashSetC) {
                            xd4 xd4VarG = zd4Var != null ? zd4Var.g() : null;
                            if (xd4VarG != null) {
                                arrayList.add(xd4VarG);
                            }
                        }
                        mapI.size();
                        for (Map.Entry entry : mapI.entrySet()) {
                            String str = (String) entry.getKey();
                            ((g7a) x7d.l()).execute(new k3(arrayList, (f7f) entry.getValue(), str, (byte) 21));
                        }
                    }
                }
            }
            this.i = null;
            this.m.clear();
            this.n.clear();
            this.k = l08.a;
            this.f = null;
            this.g = null;
        }
    }

    public final void g(rn9 rn9Var, tah tahVar, hf4 hf4Var) {
        if (this.l.compareAndSet(false, true)) {
            this.i = rn9Var;
            Set setO = tahVar.o();
            ArrayList arrayList = new ArrayList(k95.o(setO, 10));
            Iterator it = setO.iterator();
            while (it.hasNext()) {
                arrayList.add(y9m.v((String) it.next(), null, null));
            }
            this.k = arrayList;
            this.f = tahVar;
            this.g = hf4Var;
            this.h = (xf2) tahVar.g;
            this.a.execute(new ye4(this, (byte) 1));
            xf2 xf2Var = this.h;
            if (xf2Var != null) {
                xf2Var.g(new b2j(this.a), this.j);
            }
        }
    }
}
