package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dch {
    public final umi a;
    public final qie b;
    public final HashSet c;
    public final HashSet d;
    public final HashMap e;
    public int f;
    public final /* synthetic */ ech g;

    public dch(ech echVar, umi umiVar, qie qieVar) {
        Objects.requireNonNull(echVar);
        this.g = echVar;
        this.c = new HashSet();
        this.d = new HashSet();
        this.e = new HashMap();
        this.a = umiVar;
        this.b = qieVar;
    }

    public final void a() {
        synchronized (this.e) {
            if (!this.e.isEmpty()) {
                b();
            } else if (this.c.isEmpty() && this.d.isEmpty()) {
                this.g.a.set(null);
                this.g.a(this.f);
            }
        }
    }

    public final void b() {
        if (this.c.isEmpty() && this.d.isEmpty()) {
            Iterator it = this.e.values().iterator();
            if (it.hasNext()) {
                throw p3p.g(it);
            }
            this.g.a.set(null);
            final byte b = 0;
            Runnable runnable = new Runnable(this) { // from class: cch
                public final /* synthetic */ dch b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    dch dchVar = this.b;
                    switch (b2) {
                        case 0:
                            synchronized (dchVar.e) {
                                Iterator it2 = dchVar.e.values().iterator();
                                if (it2.hasNext()) {
                                    if (it2.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                            return;
                        default:
                            dchVar.g.a(dchVar.f);
                            return;
                    }
                }
            };
            umi umiVar = this.a;
            nml nmlVarC = umiVar.c(runnable);
            final byte b2 = 1;
            nmlVarC.b(umiVar.d(new Runnable(this) { // from class: cch
                public final /* synthetic */ dch b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    dch dchVar = this.b;
                    switch (b22) {
                        case 0:
                            synchronized (dchVar.e) {
                                Iterator it2 = dchVar.e.values().iterator();
                                if (it2.hasNext()) {
                                    if (it2.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                            return;
                        default:
                            dchVar.g.a(dchVar.f);
                            return;
                    }
                }
            }));
            this.b.n(new oml(nmlVarC), null);
        }
    }
}
