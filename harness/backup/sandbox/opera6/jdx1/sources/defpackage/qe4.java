package defpackage;

import android.os.Trace;

/* loaded from: classes.dex */
public final class qe4 {
    public final ia6 a;
    public final int b;
    public final Object c;
    public boolean d;

    public qe4(ia6 ia6Var) {
        this.a = ia6Var;
        bf2 bf2Var = se4.a;
        bf2Var.getClass();
        this.b = bf2.b.incrementAndGet(bf2Var);
        this.c = new Object();
    }

    public final gg4 a() {
        gg4 gg4Var;
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("Check failed.");
            }
            gg4Var = (gg4) ((m7h) this.a.y).get();
        }
        return gg4Var;
    }

    public final xc4 b() {
        xc4 xc4Var;
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("Check failed.");
            }
            xc4Var = (xc4) ((m7h) this.a.w).get();
        }
        return xc4Var;
    }

    public final nd4 c(fd4 fd4Var, ld4 ld4Var) {
        try {
            Trace.beginSection("CXCP#CameraGraph-" + ((Object) sd4.b(fd4Var.a)));
            return (nd4) ((m7h) new ha6((ia6) this.a.c, new k5o(fd4Var, ld4Var, (byte) 7)).p).get();
        } finally {
            Trace.endSection();
        }
    }

    public final String toString() {
        return "CameraPipe-" + this.b;
    }
}
