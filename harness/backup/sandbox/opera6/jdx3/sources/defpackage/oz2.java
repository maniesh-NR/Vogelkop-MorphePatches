package defpackage;

import android.content.SharedPreferences;
import com.opera.android.OperaApplication;
import com.opera.android.startup.WelcomeActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class oz2 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oz2(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [android.app.Activity, com.opera.android.startup.WelcomeActivity, hjf, java.lang.Object] */
    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                qf5 qf5Var = (qf5) obj2;
                qf5Var.a.setEnabled(z);
                qf5Var.b.f(z);
                return new qz2((vdc) obj, qf5Var);
            case 1:
                rj4 rj4Var = (rj4) obj2;
                x61 x61Var = (x61) obj;
                lj4 lj4Var = new lj4(x61Var, rj4Var);
                wi4 wi4Var = rj4Var.n;
                x61Var.a.getFrameNumber();
                return Boolean.valueOf(su5.a(new uj4(wi4Var, lj4Var), z));
            case 2:
                rq8 rq8Var = (rq8) obj2;
                g77 g77Var = rq8Var.b;
                nq8 nq8Var = (nq8) obj;
                b59 b59Var = rq8Var.g.a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                byte b2 = 23;
                if (z) {
                    ((k5o) g77Var.c).k(new su(g77Var, nq8Var, new qq8(jCurrentTimeMillis, rq8Var, nq8Var), b2));
                } else {
                    boolean zA = Intrinsics.a(nq8Var.a(), ((SharedPreferences) b59Var.get()).getString("cached_request_hash", null));
                    on7 on7Var = pn7.b;
                    boolean z2 = jCurrentTimeMillis > pn7.f(cs5.y0(((SharedPreferences) b59Var.get()).getLong("cache_max_age_millis", 0L), un7.d));
                    if (!zA || z2) {
                        rq8Var.a(nq8Var, false);
                        ((k5o) g77Var.c).k(new su(g77Var, nq8Var, new qq8(jCurrentTimeMillis, rq8Var, nq8Var), b2));
                    } else {
                        rq8Var.a(nq8Var, true);
                    }
                }
                return Unit.a;
            case 3:
                dc0 dc0Var = (dc0) obj2;
                yb0 yb0Var = (yb0) ((ck0) obj).d().c.getValue();
                yb0Var.a.getClass();
                cc0 cc0Var = new cc0(2443, -1, 2);
                xb0 xb0Var = yb0Var.b;
                List list = (List) xb0Var.n(47);
                ((list == null || list.isEmpty()) ? new hf0(xb0Var, 47, am2.q(xb0Var, 47, 1)) : new hf0(xb0Var, 47, list)).add(cc0Var);
                cc0Var.q(0, 1, dc0Var);
                cc0Var.r(1, 1, z);
                return Unit.a;
            default:
                ?? r1 = (WelcomeActivity) obj;
                r1.T();
                r1.V(false);
                umi umiVar = vml.d;
                String[] strArr = OperaApplication.K;
                return new x65(umiVar, ((OperaApplication) r1.getApplication()).h(), r1.a, new qfl((Object) r1, (byte) 28), new tzn(r1, (byte) 3), true, (p10) obj2, false, true, false, this.b, false);
        }
    }
}
