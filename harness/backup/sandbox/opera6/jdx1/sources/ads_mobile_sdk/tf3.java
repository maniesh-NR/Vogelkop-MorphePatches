package ads_mobile_sdk;

import defpackage.v0k;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class tf3 implements ThreadFactory {
    public final String a;
    public Integer b = null;
    public final AtomicInteger c = new AtomicInteger(1);

    public tf3(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = "GMA(" + this.a + ") " + this.c.getAndIncrement();
        Integer num = this.b;
        if (num != null) {
            return new Thread((Runnable) new fmn(num, runnable, (byte) 21), str);
        }
        vr3 vr3Var = xu0.a;
        if (vq.a != wq.a && xu0.a("GoogleMobileAds", 2)) {
            vr3 vr3Var2 = xu0.a;
            vr3Var2.getClass();
            u0k u0kVarF = ((v0k) vr3Var2.d).f(vr3Var2, "Creating Thread with default priority");
            while (true) {
                u0k u0kVar = u0kVarF;
                if (!u0kVar.hasNext()) {
                    break;
                }
                Thread.currentThread().getName();
            }
        }
        return new Thread(runnable, str);
    }
}
