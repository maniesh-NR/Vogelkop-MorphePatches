package ads_mobile_sdk;

import defpackage.kap;
import defpackage.tso;

/* loaded from: classes.dex */
public final class nj0 implements tso, kap {
    public static final Object c = new Object();
    public volatile tso a;
    public volatile Object b = c;

    public nj0(tso tsoVar) {
        this.a = tsoVar;
    }

    public static kap a(tso tsoVar) {
        if (tsoVar instanceof kap) {
            return (kap) tsoVar;
        }
        tsoVar.getClass();
        return new nj0(tsoVar);
    }

    @Override // defpackage.tso
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.get();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
