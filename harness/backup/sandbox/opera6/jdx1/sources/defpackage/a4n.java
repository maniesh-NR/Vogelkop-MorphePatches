package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;

/* loaded from: classes.dex */
public final class a4n {
    public final chd a;
    public final f4n b;
    public final short c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public kzk l = kzk.a;

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public a4n(Context context, chd chdVar, long j) {
        this.a = chdVar;
        this.c = (int) j;
        this.b = new f4n(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r31, long r33, long r35, long r37, boolean r39, boolean r40, defpackage.rr3 r41) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4n.a(long, long, long, long, boolean, boolean, rr3):int");
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (!this.m && this.n))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        this.l.getClass();
        if (SystemClock.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long jElapsedRealtime;
        this.j = z;
        long j = this.c;
        if (j > 0) {
            this.l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.i = jElapsedRealtime;
    }

    public final void d() {
        this.d = true;
        this.l.getClass();
        this.g = tym.N(SystemClock.elapsedRealtime());
        f4n f4nVar = this.b;
        f4nVar.d = true;
        f4nVar.b();
        DisplayManager displayManager = (DisplayManager) f4nVar.b.getSystemService("display");
        c4n e4nVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                e4nVar = Build.VERSION.SDK_INT >= 33 ? new e4n(choreographer, displayManager) : new d4n(choreographer, displayManager);
            } catch (RuntimeException e) {
                w7d.L("Vsync sampling disabled due to platform error", e);
            }
        }
        f4nVar.c = e4nVar;
        if (e4nVar != null) {
            e4nVar.a();
        }
        f4nVar.d(false);
    }

    public final void e(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i == 1) {
            this.e = 0;
        } else {
            if (i != 2) {
                h9o.e();
                return;
            }
            this.e = Math.min(this.e, 2);
        }
        this.b.b();
    }

    public final void f(float f) {
        f4n f4nVar = this.b;
        f4nVar.f = f;
        e69 e69Var = f4nVar.a;
        e69Var.a.c();
        e69Var.b.c();
        e69Var.c = false;
        e69Var.d = -9223372036854775807L;
        e69Var.e = 0;
        f4nVar.c();
    }

    public final void g(Surface surface) {
        this.m = surface != null;
        this.n = false;
        f4n f4nVar = this.b;
        if (f4nVar.e != surface) {
            f4nVar.a();
            f4nVar.e = surface;
            f4nVar.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void h(float f) {
        z4o.w(f > 0.0f);
        if (f == this.k) {
            return;
        }
        this.k = f;
        f4n f4nVar = this.b;
        f4nVar.i = f;
        f4nVar.d(false);
    }
}
