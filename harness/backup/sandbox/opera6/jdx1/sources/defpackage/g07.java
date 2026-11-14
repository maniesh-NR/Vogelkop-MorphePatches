package defpackage;

import android.util.Log;
import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class g07 {
    public static final AtomicInteger k;
    public static final AtomicInteger l;
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public l94 d;
    public final o94 e;
    public l94 f;
    public final o94 g;
    public final Size h;
    public final int i;
    public Class j;

    static {
        new Size(0, 0);
        k = new AtomicInteger(0);
        l = new AtomicInteger(0);
    }

    public g07(int i, Size size) {
        final byte b = 0;
        this.h = size;
        this.i = i;
        o94 o94VarZ = k1g.z(new m94(this) { // from class: d07
            public final /* synthetic */ g07 b;

            {
                this.b = this;
            }

            @Override // defpackage.m94
            public final Object attachCompleter(l94 l94Var) {
                byte b2 = b;
                g07 g07Var = this.b;
                switch (b2) {
                    case 0:
                        synchronized (g07Var.a) {
                            g07Var.d = l94Var;
                        }
                        return "DeferrableSurface-termination(" + g07Var + ")";
                    default:
                        synchronized (g07Var.a) {
                            g07Var.f = l94Var;
                        }
                        return "DeferrableSurface-close(" + g07Var + ")";
                }
            }
        });
        this.e = o94VarZ;
        final byte b2 = 1;
        this.g = k1g.z(new m94(this) { // from class: d07
            public final /* synthetic */ g07 b;

            {
                this.b = this;
            }

            @Override // defpackage.m94
            public final Object attachCompleter(l94 l94Var) {
                byte b22 = b2;
                g07 g07Var = this.b;
                switch (b22) {
                    case 0:
                        synchronized (g07Var.a) {
                            g07Var.d = l94Var;
                        }
                        return "DeferrableSurface-termination(" + g07Var + ")";
                    default:
                        synchronized (g07Var.a) {
                            g07Var.f = l94Var;
                        }
                        return "DeferrableSurface-close(" + g07Var + ")";
                }
            }
        });
        if (gyg.G(3, "DeferrableSurface")) {
            l.incrementAndGet();
            k.get();
            toString();
            o94VarZ.b.addListener(new e07(this, Log.getStackTraceString(new Exception())), n97.a());
        }
    }

    public void a() {
        l94 l94Var;
        synchronized (this.a) {
            if (this.c) {
                l94Var = null;
            } else {
                this.c = true;
                this.f.b(null);
                if (this.b == 0) {
                    l94Var = this.d;
                    this.d = null;
                } else {
                    l94Var = null;
                }
                if (gyg.G(3, "DeferrableSurface")) {
                    toString();
                }
            }
        }
        if (l94Var != null) {
            l94Var.b(null);
        }
    }

    public final void b() {
        l94 l94Var;
        synchronized (this.a) {
            int i = this.b;
            if (i == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            int i2 = i - 1;
            this.b = i2;
            if (i2 == 0 && this.c) {
                l94Var = this.d;
                this.d = null;
            } else {
                l94Var = null;
            }
            if (gyg.G(3, "DeferrableSurface")) {
                toString();
                if (this.b == 0) {
                    l.get();
                    k.decrementAndGet();
                    toString();
                }
            }
        }
        if (l94Var != null) {
            l94Var.b(null);
        }
    }

    public final ListenableFuture c() {
        synchronized (this.a) {
            if (this.c) {
                return new q0b(new f07(this, "DeferrableSurface already closed."), (byte) 1);
            }
            return e();
        }
    }

    public final void d() {
        synchronized (this.a) {
            int i = this.b;
            if (i == 0 && this.c) {
                throw new f07(this, "Cannot begin use on a closed surface.");
            }
            this.b = i + 1;
            if (gyg.G(3, "DeferrableSurface")) {
                if (this.b == 1) {
                    l.get();
                    k.incrementAndGet();
                    toString();
                }
                toString();
            }
        }
    }

    public ListenableFuture e() {
        return q0b.c;
    }
}
