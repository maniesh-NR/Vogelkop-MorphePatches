package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class f7p {
    public static volatile f7p d;
    public volatile Boolean a;
    public volatile Boolean b;
    public final Context c;

    public f7p(Context context) {
        this.c = context;
        b();
    }

    public static f7p a(Context context) {
        if (d == null) {
            synchronized (f7p.class) {
                if (d == null) {
                    d = new f7p(context);
                }
            }
        }
        return d;
    }

    public final boolean b() {
        boolean zBooleanValue;
        if (this.a != null) {
            return this.a.booleanValue();
        }
        synchronized (this) {
            if (this.a != null) {
                zBooleanValue = this.a.booleanValue();
            } else {
                zBooleanValue = this.c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && Build.VERSION.SDK_INT <= 30;
                this.a = Boolean.valueOf(zBooleanValue);
            }
        }
        return zBooleanValue;
    }
}
