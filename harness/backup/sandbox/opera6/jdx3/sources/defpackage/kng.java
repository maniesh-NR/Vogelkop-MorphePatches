package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class kng {
    public final umi a;
    public boolean c;
    public long d;
    public oml f;
    public long b = 1000;
    public ld9 e = null;

    public kng(umi umiVar) {
        this.a = umiVar;
    }

    public final void a() {
        if (this.c) {
            ld9 ld9Var = this.e;
            if (ld9Var != null) {
                ld9Var.run();
            }
            this.d = SystemClock.uptimeMillis();
            oml omlVar = new oml(this.a.d(new pjg(this, (byte) 4)));
            this.f = omlVar;
            omlVar.b(null, this.b, TimeUnit.MILLISECONDS, null);
        }
    }
}
