package defpackage;

import android.app.Activity;
import android.os.SystemClock;
import com.opera.android.Lazy;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class iu9 extends bqi {
    public static int y;
    public final Lazy p;
    public final i5o q;
    public final String r;
    public final String s;
    public final String t;
    public final long u;
    public final long v;
    public long w;
    public boolean x;

    /* JADX WARN: Illegal instructions before constructor call */
    public iu9(Activity activity, Lazy lazy, pyl pylVar, i5o i5oVar, uwh uwhVar, wo woVar, r68 r68Var, i3j i3jVar, r9g r9gVar) {
        yo yoVar = yo.GB_ONLINE;
        rm rmVar = rm.NATIVE;
        String str = woVar.i;
        super("GbSdkProvider", activity, yoVar, rmVar, str, pylVar, uwhVar, null, r68Var, i3jVar, ap.b(woVar.e, woVar.g), r9gVar);
        this.w = -1L;
        this.p = lazy;
        this.q = i5oVar;
        this.r = woVar.h;
        this.s = str;
        this.t = woVar.a;
        long j = woVar.k;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.u = timeUnit.toMillis(j);
        this.v = timeUnit.toMillis(woVar.j);
    }

    @Override // defpackage.bqi
    public final k43 l(zy zyVar, az azVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.w;
        if (j >= 0) {
            if (j + (this.x ? this.v : this.u) > jElapsedRealtime) {
                zyVar.onFailed(bqi.n("Backoff triggered", this.g));
                return null;
            }
        }
        return new hu9(this, zyVar, azVar.a(), jElapsedRealtime);
    }
}
