package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pfn extends lim implements abh, dmk, g8d {
    public final Context a;
    public final af3 b;
    public final qb7 c;
    public final xb d;
    public final slk e;
    public final fmk f;
    public final ru9 g;
    public final z77 h;
    public final jtg i;
    public final q2 j;
    public final mfn n;
    public amk o;
    public uah q;
    public wvg r;
    public final ode k = new ode();
    public final ofn l = new ofn(this, (byte) 1);
    public final ofn m = new ofn(this, (byte) 0);
    public lh4 p = lh4.c;

    public pfn(Context context, af3 af3Var, qb7 qb7Var, xb xbVar, slk slkVar, fmk fmkVar, ru9 ru9Var, z77 z77Var, jtg jtgVar, q2 q2Var, x5f x5fVar) {
        this.a = context;
        this.b = af3Var;
        this.c = qb7Var;
        this.d = xbVar;
        this.e = slkVar;
        this.f = fmkVar;
        this.g = ru9Var;
        this.h = z77Var;
        this.i = jtgVar;
        this.j = q2Var;
        this.n = new mfn(x5fVar, new jfn(this, (byte) 0));
    }

    @Override // defpackage.abh
    public final void D() {
        this.q = null;
        S();
    }

    @Override // defpackage.g8d
    public final void J() {
        this.e.b(null);
    }

    @Override // defpackage.g8d
    public final String Q() {
        jmk jmkVar;
        hmk hmkVar;
        wvg wvgVar = this.r;
        if (wvgVar == null || (jmkVar = wvgVar.h) == null || (hmkVar = jmkVar.c) == null) {
            return null;
        }
        return hmkVar.a;
    }

    public final void R(nfn nfnVar) {
        this.k.r(nfnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfn.S():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.abh
    public final void a(bbh bbhVar) {
        h1b h1bVar;
        jmk jmkVar;
        hmk hmkVar;
        wvg wvgVar = this.r;
        uah uahVar = null;
        String str = (wvgVar == null || (jmkVar = wvgVar.h) == null || (hmkVar = jmkVar.c) == null) ? null : hmkVar.b;
        if (str != null) {
            csh cshVar = bbhVar.a;
            int i = cshVar.d;
            int i2 = 0;
            loop0: while (i2 < i) {
                Object obj = cshVar.get(i2);
                i2++;
                uah uahVar2 = (uah) obj;
                if (Intrinsics.a(uahVar2.a, str) && ((h1bVar = uahVar2.e) == null || !h1bVar.isEmpty())) {
                    int size = h1bVar.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = h1bVar.get(i3);
                        i3++;
                        String str2 = (String) obj2;
                        Map map = zsk.f;
                        if (Intrinsics.a(str2, "premium_monthly") || Intrinsics.a(str2, "premium_3month")) {
                            uahVar = obj;
                            break loop0;
                        }
                    }
                }
            }
            uahVar = uahVar;
        }
        this.q = uahVar;
        S();
    }

    @Override // defpackage.dmk
    public final void handleSubscriptionPlans(bmk bmkVar) {
        jmk jmkVar;
        imk imkVar;
        a1b a1bVarU = bmkVar.c.u(0);
        amk amkVar = null;
        amk amkVar2 = null;
        while (a1bVarU.hasNext()) {
            amk amkVar3 = (amk) a1bVarU.next();
            if (amkVar2 == null || amkVar3.a.c > amkVar2.a.c) {
                amkVar2 = amkVar3;
            }
        }
        wvg wvgVar = this.r;
        String str = (wvgVar == null || (jmkVar = wvgVar.h) == null || (imkVar = jmkVar.b) == null) ? null : imkVar.a;
        if (str != null) {
            if (str.equals(amkVar2 != null ? amkVar2.c.c.b : null)) {
                amkVar = amkVar2;
            }
        }
        this.o = amkVar;
        S();
    }

    @Override // defpackage.dmk
    public final void handleSubscriptionPlans(cmk cmkVar) {
        this.o = null;
        S();
    }

    @Override // defpackage.dmk
    public final void handleSubscriptionPlans(zlk zlkVar) {
        this.o = null;
        S();
    }

    @Override // defpackage.g8d
    public final void j(jg4 jg4Var) {
        ((dpf) this.d.e.g()).a(new y8d(jg4Var, (byte) 1));
    }

    @Override // defpackage.g8d
    public final String u() {
        return this.q.a;
    }
}
