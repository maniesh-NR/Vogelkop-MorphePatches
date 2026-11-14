package defpackage;

import android.os.SystemClock;
import java.util.HashSet;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final class fwh implements sm5 {
    public final tm5 a;
    public final yhe b;
    public boolean d;
    public boolean e;
    public long g;
    public boolean h;
    public final vl9 c = new vl9(this, 24);
    public long f = -1;

    public fwh(tm5 tm5Var, yhe yheVar) {
        this.a = tm5Var;
        this.b = yheVar;
    }

    @Override // defpackage.sm5
    public final void a(boolean z) {
        d();
        if (z) {
            c();
        }
    }

    public final void b(boolean z) {
        rle rleVar;
        vl9 vl9Var = this.c;
        if (z) {
            long jUptimeMillis = this.g - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                long jMin = Math.min(this.f * 3, 600000L);
                this.f = jMin;
                this.h = true;
                this.g = SystemClock.uptimeMillis() + jMin;
                vml.d(vl9Var, jMin);
            } else {
                this.h = true;
                this.g = SystemClock.uptimeMillis() + jUptimeMillis;
                vml.d(vl9Var, jUptimeMillis);
            }
            d();
            c();
            return;
        }
        if (this.e) {
            this.e = false;
            tm5 tm5Var = this.a;
            HashSet hashSet = tm5Var.d;
            hashSet.remove(this);
            if (hashSet.isEmpty() && (rleVar = tm5Var.c) != null) {
                NetworkChangeNotifier.removeConnectionTypeObserver(rleVar.a);
                tm5Var.c = null;
            }
        }
        if (this.h) {
            this.h = false;
            vml.a(vl9Var);
        }
    }

    public final void c() {
        if (this.d) {
            tm5 tm5Var = this.a;
            if (tm5Var.c == null) {
                tm5Var.a = sle.d();
            }
            if (tm5Var.a && tm5Var.b) {
                ((t7j) this.b.b).c();
            }
        }
    }

    public final void d() {
        rle rleVar;
        boolean z = this.d;
        tm5 tm5Var = this.a;
        if (z) {
            tm5Var.e.add(this);
        } else {
            tm5Var.e.remove(this);
        }
        if (this.d && tm5Var.b) {
            if (!this.e) {
                this.e = true;
                tm5Var.d.add(this);
                if (tm5Var.c == null) {
                    tm5Var.c = sle.a(tm5Var);
                    tm5Var.a = sle.d();
                }
            }
        } else if (this.e) {
            this.e = false;
            HashSet hashSet = tm5Var.d;
            hashSet.remove(this);
            if (hashSet.isEmpty() && (rleVar = tm5Var.c) != null) {
                NetworkChangeNotifier.removeConnectionTypeObserver(rleVar.a);
                tm5Var.c = null;
            }
        }
        if (tm5Var.c == null) {
            tm5Var.a = sle.d();
        }
        boolean z2 = tm5Var.a;
        boolean z3 = this.d;
        vl9 vl9Var = this.c;
        if (!z3 || !z2) {
            if (this.h) {
                this.h = false;
                vml.a(vl9Var);
            }
            this.f = -1L;
            return;
        }
        if (!tm5Var.b || this.h) {
            return;
        }
        this.f = 10000L;
        this.h = true;
        this.g = SystemClock.uptimeMillis() + 10000;
        vml.d(vl9Var, 10000L);
    }
}
