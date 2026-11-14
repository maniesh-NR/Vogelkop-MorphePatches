package ads_mobile_sdk;

import android.app.UiModeManager;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class nw {
    public static ah3 a;

    /* renamed from: a, reason: collision with other field name */
    public static p22 f2a;

    /* renamed from: a, reason: collision with other field name */
    public static UiModeManager f3a;

    public static ji a(int i, long j, String str) {
        tf3 tf3Var = new tf3(str);
        int i2 = qw.k;
        on7 on7Var = pn7.b;
        return new ji(new ThreadPoolExecutor(i, i, pn7.p(j, un7.e), TimeUnit.SECONDS, new LinkedBlockingQueue(), tf3Var), tf3Var);
    }

    public static void a(String str) {
        ah3 ah3Var;
        xu0.b(str, null);
        IllegalStateException illegalStateException = new IllegalStateException(str);
        illegalStateException.printStackTrace();
        wq wqVar = vq.a;
        if (wqVar == wq.b || wqVar == wq.c) {
            throw illegalStateException;
        }
        if (wqVar != wq.a || (ah3Var = a) == null) {
            return;
        }
        ah3Var.a(str, (Throwable) illegalStateException);
    }
}
