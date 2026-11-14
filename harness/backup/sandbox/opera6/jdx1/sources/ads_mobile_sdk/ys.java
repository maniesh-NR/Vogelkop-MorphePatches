package ads_mobile_sdk;

import defpackage.jjj;
import defpackage.prb;
import defpackage.wpb;
import defpackage.z1m;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ys implements zcp {
    public final String a;
    public final String b;
    public final prb c;
    public final long d;

    public ys(String str, String str2, prb prbVar, long j) {
        this.a = str;
        this.b = str2;
        this.c = prbVar;
        this.d = j;
    }

    public final void a(jjj jjjVar) {
        wpb wpbVar;
        String str = this.a;
        jjjVar.adUnitRequestSignals = str;
        jjjVar.commonCldSignals = this.b;
        jjjVar.commonCldSignalsObject = this.c;
        jjjVar.timeSinceCldUpdate = this.d;
        if (str != null) {
            try {
                prb prbVar = (prb) new m5a().b(prb.class, str);
                wpbVar = new wpb();
                wpbVar.o(prbVar);
            } catch (Exception e) {
                ArrayList arrayList = w8h.a(e).s;
                String message = e.getMessage();
                if (message == null) {
                    message = e.getClass().getName();
                }
                arrayList.add(message);
                wpbVar = null;
            }
            jjjVar.adUnitRequestSignalsObject = wpbVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys)) {
            return false;
        }
        ys ysVar = (ys) obj;
        return Intrinsics.a(this.a, ysVar.a) && Intrinsics.a(this.b, ysVar.b) && Intrinsics.a(this.c, ysVar.c) && this.d == ysVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        prb prbVar = this.c;
        return Long.hashCode(this.d) + ((iHashCode2 + (prbVar != null ? prbVar.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = z1m.n("CldSignal(adUnitRequestSignals=", this.a, ", commonCldSignals=", this.b, ", commonCldObject=");
        sbN.append(this.c);
        sbN.append(", timeSinceCldUpdateInMs=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
