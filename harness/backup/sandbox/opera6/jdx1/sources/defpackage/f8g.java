package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f8g {
    public final fi5 a;
    public final zh5 b;
    public final vt9 c;
    public final Function2 d;
    public final boolean e;
    public final jim f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(h8g.c);
    public long i = joh.k();
    public tee j = jmi.a;
    public final j1c k;
    public final roh l;

    public f8g(fi5 fi5Var, zh5 zh5Var, vt9 vt9Var, wee weeVar, Function2 function2, boolean z, jim jimVar, Object obj) {
        this.a = fi5Var;
        this.b = zh5Var;
        this.c = vt9Var;
        this.d = function2;
        this.e = z;
        this.f = jimVar;
        this.g = obj;
        j1c j1cVar = new j1c();
        j1cVar.i(weeVar, vt9Var.y());
        this.k = j1cVar;
        this.l = new roh(jimVar.c);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((h8g) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    h8g h8gVar = h8g.f;
                    h8g h8gVar2 = h8g.g;
                    while (!atomicReference.compareAndSet(h8gVar, h8gVar2)) {
                        if (atomicReference.get() != h8gVar) {
                            bpg.b("Unexpected state change from: " + h8gVar + " to: " + h8gVar2 + ".");
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new oye();
            }
        } catch (Exception e) {
            atomicReference.set(h8g.a);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.d();
                    this.k.e();
                } finally {
                    this.k.c();
                    this.a.q = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        return ((h8g) this.h.get()).compareTo(h8g.f) >= 0;
    }

    public final void d() {
        AtomicReference atomicReference;
        h8g h8gVar = h8g.d;
        h8g h8gVar2 = h8g.f;
        do {
            atomicReference = this.h;
            if (atomicReference.compareAndSet(h8gVar, h8gVar2)) {
                return;
            }
        } while (atomicReference.get() == h8gVar);
        bpg.b("Unexpected state change from: " + h8gVar + " to: " + h8gVar2 + ".");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public final boolean e(thj thjVar) throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((h8g) atomicReference.get()).ordinal();
            fi5 fi5Var = this.a;
            zh5 zh5Var = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    vt9 vt9Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        vt9Var.z = 0;
                        vt9Var.y = true;
                    }
                    this.j = zh5Var.b(fi5Var, thjVar, this.d);
                    if (z) {
                        if (vt9Var.F || vt9Var.z != 0) {
                            bpg.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        vt9Var.z = -1;
                        vt9Var.y = false;
                    }
                    h8g h8gVar = h8g.c;
                    h8g h8gVar2 = h8g.d;
                    while (true) {
                        if (!atomicReference.compareAndSet(h8gVar, h8gVar2)) {
                            if (atomicReference.get() != h8gVar) {
                                bpg.b("Unexpected state change from: " + h8gVar + " to: " + h8gVar2 + ".");
                            }
                        }
                    }
                    if (this.j.g()) {
                        d();
                    }
                    return c();
                case 3:
                    h8g h8gVar3 = h8g.d;
                    h8g h8gVar4 = h8g.e;
                    while (true) {
                        if (!atomicReference.compareAndSet(h8gVar3, h8gVar4)) {
                            if (atomicReference.get() != h8gVar3) {
                                bpg.b("Unexpected state change from: " + h8gVar3 + " to: " + h8gVar4 + ".");
                            }
                        }
                    }
                    long j = this.i;
                    try {
                        this.i = joh.k();
                        this.j = zh5Var.n(fi5Var, thjVar, this.j);
                        while (true) {
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } finally {
                        this.i = j;
                        h8g h8gVar5 = h8g.e;
                        h8g h8gVar6 = h8g.d;
                        while (true) {
                            if (!atomicReference.compareAndSet(h8gVar5, h8gVar6)) {
                                if (atomicReference.get() != h8gVar5) {
                                    bpg.b("Unexpected state change from: " + h8gVar5 + " to: " + h8gVar6 + ".");
                                }
                            }
                        }
                    }
                case 4:
                    mh5.b("Recursive call to resume()");
                    throw new pxb();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new oye();
            }
        } catch (Exception e) {
            atomicReference.set(h8g.a);
            throw e;
        }
    }
}
