package defpackage;

import com.leanplum.internal.Clock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class vmk {
    public final long a;
    public final umi b;
    public final qlk c;
    public boolean d;
    public long e;
    public long f;
    public long g;
    public long h;
    public oml i;

    public vmk(long j, avj avjVar, umi umiVar, qlk qlkVar) {
        this.a = j;
        this.b = umiVar;
        this.c = qlkVar;
    }

    public final void a() {
        oml omlVar = this.i;
        if (omlVar != null) {
            omlVar.cancel(false);
            this.i = null;
        }
        if (!this.d || this.e <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.i = new oml(this.b.d(this.c));
        long j = this.e;
        long jMax = this.h;
        if (jMax <= 0 || jCurrentTimeMillis >= jMax) {
            long j2 = this.f;
            long j3 = j2 <= 0 ? Long.MIN_VALUE : this.a + j2;
            if (j <= jCurrentTimeMillis) {
                jMax = Math.max(jCurrentTimeMillis, j3);
            } else {
                long j4 = j - Clock.DAY_MILLIS;
                if (jCurrentTimeMillis >= j4) {
                    jMax = Math.max(jCurrentTimeMillis, j3);
                } else {
                    long jMax2 = Math.max(j - 172800000, jCurrentTimeMillis);
                    jMax = Math.max(avj.e(j4 - jMax2) + jMax2, j3);
                }
            }
        }
        this.i.b(null, jMax - jCurrentTimeMillis, TimeUnit.MILLISECONDS, null);
    }
}
