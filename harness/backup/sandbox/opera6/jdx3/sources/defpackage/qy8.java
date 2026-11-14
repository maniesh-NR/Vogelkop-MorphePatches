package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class qy8 {
    public final String a;
    public final byte b;
    public final int c;
    public final boolean d;
    public long e;
    public long f;
    public int g;
    public final /* synthetic */ uy8 h;

    /* JADX WARN: Multi-variable type inference failed */
    public qy8(uy8 uy8Var, String str, int i, long j, boolean z) {
        this.h = uy8Var;
        this.a = "FEEDBACK_TRACKER_SEND_CONTROLLER_LAST_SUCCESS_".concat(str);
        this.b = i;
        this.c = (int) j;
        this.d = z;
    }

    public final long a() {
        return ((SharedPreferences) this.h.n.get()).getLong(this.a, 0L);
    }

    public final void b() {
        ((SharedPreferences) this.h.n.get()).edit().putLong(this.a, System.currentTimeMillis()).apply();
        c(false);
    }

    public final void c(boolean z) {
        ue2 ue2Var = this.h.g;
        if (this.d || this.g > 0 || z) {
            long jA = a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = 0;
            if (jA > jCurrentTimeMillis) {
                jA = 0;
            }
            if (this.e > jA) {
                j = this.f;
            } else if (!z) {
                j = jA + this.c;
            }
            byte b = this.b;
            ue2Var.removeMessages(b);
            if (j <= jCurrentTimeMillis) {
                ue2Var.sendEmptyMessage(b);
            } else {
                ue2Var.sendEmptyMessageDelayed(b, j - jCurrentTimeMillis);
            }
        }
    }
}
