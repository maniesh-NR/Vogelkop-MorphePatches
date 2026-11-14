package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class ocd {
    public static final long b;
    public final b59 a;

    static {
        on7 on7Var = pn7.b;
        b = cs5.x0(24, un7.g);
    }

    public ocd(b59 b59Var) {
        this.a = b59Var;
    }

    public final boolean a() {
        long j = ((SharedPreferences) this.a.get()).getLong("masthead_ad.last_removed_timestamp", -1L);
        if (j < 0) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < j) {
            return true;
        }
        on7 on7Var = pn7.b;
        return pn7.c(cs5.y0(jCurrentTimeMillis - j, un7.d), b) >= 0;
    }
}
