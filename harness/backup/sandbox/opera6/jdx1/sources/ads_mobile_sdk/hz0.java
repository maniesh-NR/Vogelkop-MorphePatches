package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class hz0 {
    public static hz0 b;
    public final ji a;

    public hz0(Context context) {
        ji jiVar = ji.c;
        if (jiVar == null) {
            jiVar = new ji(context);
            ji.c = jiVar;
        }
        this.a = jiVar;
    }

    public static final hz0 a(Context context) {
        hz0 hz0Var;
        synchronized (hz0.class) {
            hz0Var = b;
            if (hz0Var == null) {
                hz0Var = new hz0(context);
                b = hz0Var;
            }
        }
        return hz0Var;
    }

    public final boolean a() {
        boolean z;
        synchronized (hz0.class) {
            z = ((SharedPreferences) this.a.b).getBoolean("paidv2_publisher_option", true);
        }
        return z;
    }
}
