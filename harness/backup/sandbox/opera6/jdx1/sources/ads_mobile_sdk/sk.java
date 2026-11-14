package ads_mobile_sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class sk {
    public static final HashMap d = new HashMap();
    public static volatile sk e;
    public final Context b;
    public volatile ArrayList c;

    public sk(Context context) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        this.b = applicationContext;
        d.put("FireTVFOSDAT", tm0.a(applicationContext));
    }

    public static sk a(Context context) {
        if (e == null) {
            synchronized (sk.class) {
                if (e == null) {
                    e = new sk(context);
                }
            }
        }
        return e;
    }

    public final ArrayList a() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : d.entrySet()) {
                    if (((tm0) entry.getValue()).a()) {
                        String str = (String) entry.getKey();
                        Context context = this.b;
                        sm0 sm0Var = null;
                        if (str != null && context != null) {
                            try {
                                if ("FireTVFOSDAT".equals(str)) {
                                    sm0Var = new sm0(context);
                                }
                            } catch (Exception unused) {
                                "Error creating attestation mechanism: ".concat(str);
                            }
                        }
                        if (sm0Var != null) {
                            arrayList.add(sm0Var);
                        }
                    }
                }
                this.c = arrayList;
                return this.c;
            } catch (Exception unused2) {
                this.c = new ArrayList();
                return this.c;
            }
        }
    }
}
