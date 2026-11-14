package ads_mobile_sdk;

import defpackage.eyo;
import defpackage.sgb;
import defpackage.tso;
import defpackage.vkp;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mh3 extends st2 {
    public final i41 k;
    public double l;
    public Map m;

    public mh3(tso tsoVar, vkp vkpVar, qr0 qr0Var, eyo eyoVar, i41 i41Var) {
        super(tsoVar, vkpVar, qr0Var, eyoVar);
        this.k = i41Var;
        this.m = n08.a;
    }

    @Override // ads_mobile_sdk.st2
    public final Object a(kuk kukVar) {
        Object objQ = sgb.q(new lh3(this, null), kukVar);
        return objQ == px5.a ? objQ : Unit.a;
    }

    @Override // ads_mobile_sdk.st2
    public final boolean a() {
        boolean z;
        synchronized (this) {
            Iterator it = this.j.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += ((oh3) it.next()).b.length;
            }
            qr0 qr0Var = this.c;
            qr0Var.getClass();
            z = length >= ((Number) qr0Var.a("gads:cui_buffer_size", (Object) 1000, (Function1) fo.a$11)).intValue();
        }
        return z;
    }

    @Override // ads_mobile_sdk.st2
    public final long b() {
        qr0 qr0Var = this.c;
        qr0Var.getClass();
        on7 on7Var = pn7.b;
        return ((pn7) qr0Var.a("gads:cui_monitoring_interval_ms", u0h.b(5, un7.f), fo.a$18)).a;
    }
}
