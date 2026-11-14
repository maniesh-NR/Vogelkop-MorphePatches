package ads_mobile_sdk;

import defpackage.goo;
import defpackage.iao;
import defpackage.k3p;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class h83 implements goo {
    public final String a;
    public final String b;
    public final rp1 c;
    public final k3p d;
    public final iao e;

    public h83(String str, String str2, k3p k3pVar, rp1 rp1Var, iao iaoVar) {
        this.a = str;
        this.b = str2;
        this.d = k3pVar;
        this.c = rp1Var;
        this.e = iaoVar;
    }

    public void a(Method method, k3p k3pVar) {
        if (cj1.f == null) {
            synchronized (cj1.g) {
                if (cj1.f == null) {
                    Long l = (Long) method.invoke("", null);
                    l.getClass();
                    cj1.f = l;
                }
            }
        }
        synchronized (k3pVar) {
            if (cj1.f != null) {
                long jLongValue = cj1.f.longValue();
                k3pVar.b$1();
                pd pdVar = (pd) k3pVar.b;
                pdVar.bitField0_ |= 1048576;
                pdVar.jbkSignal_ = jLongValue;
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        iao iaoVar = this.e;
        try {
            iaoVar.b();
            Method methodA = this.c.a(this.a, this.b);
            if (methodA != null) {
                a(methodA, this.d);
            }
            iaoVar.a();
            return null;
        } finally {
        }
    }
}
