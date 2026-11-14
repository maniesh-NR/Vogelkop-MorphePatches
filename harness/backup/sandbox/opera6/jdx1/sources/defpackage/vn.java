package defpackage;

import android.util.Pair;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class vn implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vn(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
    }

    public /* synthetic */ vn(ap[] apVarArr, int i, ap apVar, AtomicReference atomicReference, bp bpVar) {
        this.a = (byte) 0;
        this.c = apVarArr;
        this.b = i;
        this.d = apVar;
        this.e = atomicReference;
        this.f = bpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tz tzVar;
        byte b = this.a;
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ap[] apVarArr = (ap[]) obj4;
                bp bpVar = (bp) obj;
                apVarArr[i] = (ap) obj3;
                eo eoVar = (eo) ((AtomicReference) obj2).get();
                if (eoVar != null) {
                    int i2 = ao.s;
                    double d = 0.0d;
                    for (ap apVar : apVarArr) {
                        if (apVar == null) {
                            break;
                        } else {
                            double d2 = apVar.c;
                            if (d2 == -1.0d) {
                                break;
                            } else {
                                d += d2;
                            }
                        }
                    }
                    ((yz) eoVar).r = ap.a(d);
                    aqi aqiVar = (aqi) bpVar.b;
                    if (aqiVar != null && (tzVar = ((yz) aqiVar).q) != null) {
                        tzVar.c(aqiVar);
                        break;
                    }
                }
                break;
            case 1:
                Pair pair = (Pair) obj3;
                ((el6) ((vrd) obj4).b.i).t(((Integer) pair.first).intValue(), (jrd) pair.second, (bsc) obj2, (tjd) obj, this.b);
                break;
            default:
                ((shf) obj4).m((fvh) obj3, (String) obj2, (b94) obj, i + 1);
                break;
        }
    }
}
