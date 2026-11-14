package defpackage;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public interface kuh {
    static boolean f(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    static int g(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | NotificationCompat.FLAG_HIGH_PRIORITY | i4;
    }

    int b(oj9 oj9Var);

    default void d() {
    }

    String getName();

    int getTrackType();

    default void p(jx6 jx6Var) {
    }

    int supportsMixedMimeTypeAdaptation();
}
