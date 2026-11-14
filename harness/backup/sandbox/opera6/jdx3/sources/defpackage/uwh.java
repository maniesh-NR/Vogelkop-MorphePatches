package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final class uwh implements NetworkChangeNotifier.ConnectionTypeObserver, Runnable {
    public final xnh a;
    public boolean c;
    public int e;
    public long f;
    public final tcc i;
    public final d14 b = new d14((byte) 4);
    public final IdentityHashMap g = new IdentityHashMap();
    public final qfb h = new qfb(this, (byte) 29);
    public final h7f k = new h7f();
    public boolean d = sle.d();
    public final rle j = sle.a(this);

    public uwh(tcc tccVar, xnh xnhVar) {
        this.i = tccVar;
        this.a = xnhVar;
        tccVar.a(new rz(this, (byte) 1));
        c();
    }

    public final void a(k43 k43Var, int i) {
        d14 d14Var = this.b;
        boolean zIsEmpty = d14Var.a.isEmpty();
        ArrayList arrayList = d14Var.a;
        int size = arrayList.size();
        int i2 = 0;
        if (size == 0) {
            size = i2;
            break;
        }
        while (i2 < size) {
            if (((twh) arrayList.get(i2)).b <= i) {
                size = i2;
                break;
            }
            i2++;
        }
        arrayList.add(size, new twh(k43Var, i));
        if (this.c && zIsEmpty) {
            vml.c(new pjg(this, (byte) 20));
        }
    }

    public final boolean b() {
        return this.b.a.isEmpty() && this.g.isEmpty();
    }

    public final void c() {
        boolean z = this.d && (!((wnh) this.a.i()).a(8) || this.e <= 0) && this.i.i != qcc.a;
        if (this.c == z) {
            return;
        }
        this.c = z;
        if (z) {
            e();
        } else {
            vml.a(this);
        }
    }

    public final void d(k43 k43Var, boolean z) {
        this.g.remove(k43Var);
        if (z || !b()) {
            return;
        }
        h7f h7fVar = this.k;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ux uxVar = ((qx) g7fVarH.next()).a;
            uwh uwhVar = uxVar.h;
            uwhVar.k.c(uxVar.b);
            uxVar.k = (byte) 0;
            i3j i3jVar = uxVar.f;
            if (i3jVar != null) {
                uxVar.a(i3jVar.z());
            }
        }
    }

    public final void e() {
        if (!this.c || this.b.a.isEmpty()) {
            return;
        }
        long jMax = Math.max(0L, ((wnh) this.a.i()).c - (SystemClock.uptimeMillis() - this.f));
        vml.a(this);
        if (jMax == 0) {
            run();
        } else {
            vml.d(this, jMax);
        }
    }

    public final void onConnectionTypeChanged(int i) {
        boolean zIsOnline = NetworkChangeNotifier.isOnline();
        if (this.d == zIsOnline) {
            return;
        }
        this.d = zIsOnline;
        c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            d14 d14Var = this.b;
            ArrayList arrayList = d14Var.a;
            ArrayList arrayList2 = d14Var.a;
            if (arrayList.isEmpty()) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.f = jUptimeMillis;
            k43 k43Var = ((twh) arrayList2.remove(0)).a;
            this.g.put(k43Var, null);
            k43Var.f(this.h);
            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
            if (arrayList2.isEmpty()) {
                return;
            }
            long j = ((wnh) this.a.i()).c;
            if (j <= 0 || jUptimeMillis2 <= 10) {
                vml.c(this);
            } else {
                vml.d(this, j);
            }
        }
    }
}
