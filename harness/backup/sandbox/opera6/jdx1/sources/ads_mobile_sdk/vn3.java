package ads_mobile_sdk;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class vn3 {
    public static final HashMap h = new HashMap();
    public final Context a;
    public final dj0 b;
    public final z6 c;
    public final rn3 d;
    public final boolean e;
    public cm1 f;
    public final Object g = new Object();

    public vn3(Context context, dj0 dj0Var, z6 z6Var, rn3 rn3Var, boolean z) {
        this.a = context;
        this.b = dj0Var;
        this.c = z6Var;
        this.d = rn3Var;
        this.e = z;
    }

    public final cm1 a() {
        cm1 cm1Var;
        synchronized (this.g) {
            cm1Var = this.f;
        }
        return cm1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: Exception -> 0x011e, TryCatch #4 {Exception -> 0x011e, blocks: (B:19:0x004f, B:21:0x006b, B:24:0x007a, B:33:0x008d, B:29:0x0084, B:30:0x0087, B:32:0x0089, B:37:0x0099, B:36:0x0093), top: B:91:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ads_mobile_sdk.cm1 a(ads_mobile_sdk.xk2 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vn3.a(ads_mobile_sdk.xk2):ads_mobile_sdk.cm1");
    }

    public final void a(cm1 cm1Var) {
        synchronized (this.g) {
            cm1 cm1Var2 = this.f;
            if (cm1Var2 != null) {
                try {
                    cm1Var2.a();
                } catch (tn3 e) {
                    this.c.a(e.a, -1L, e);
                }
                this.f = cm1Var;
            } else {
                this.f = cm1Var;
            }
        }
    }
}
