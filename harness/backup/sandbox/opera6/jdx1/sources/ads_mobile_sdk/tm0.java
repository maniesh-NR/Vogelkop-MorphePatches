package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class tm0 {
    public static volatile tm0 d;
    public volatile Boolean a;
    public volatile Boolean b;
    public final Context c;

    public tm0(Context context) {
        this.c = context;
        a();
    }

    public static tm0 a(Context context) {
        if (d == null) {
            synchronized (tm0.class) {
                if (d == null) {
                    d = new tm0(context);
                }
            }
        }
        return d;
    }

    public final boolean a() {
        if (this.a != null) {
            return this.a.booleanValue();
        }
        synchronized (this) {
            if (this.a != null) {
                return this.a.booleanValue();
            }
            boolean z = this.c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && Build.VERSION.SDK_INT <= 30;
            this.a = Boolean.valueOf(z);
            return z;
        }
    }
}
