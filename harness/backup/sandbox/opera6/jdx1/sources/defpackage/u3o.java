package defpackage;

import android.os.Build;
import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class u3o implements t3o {
    public final o27 b;

    public u3o() {
        this.b = Build.VERSION.SDK_INT >= 34 ? p27.a : zpa.d;
        j95.d(new Integer[]{1, 2, 4, 8, 16, 32, 64, Integer.valueOf(NotificationCompat.FLAG_HIGH_PRIORITY)});
    }
}
