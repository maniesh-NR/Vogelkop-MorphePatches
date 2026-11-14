package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class k98 extends kuk implements cr9 {
    public l98 t;
    public Iterator u;
    public String v;
    public boolean w;
    public /* synthetic */ boolean x;
    public /* synthetic */ Map y;
    public final /* synthetic */ l98 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k98(l98 l98Var, mt5 mt5Var) {
        super(3, mt5Var);
        this.z = l98Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        k98 k98Var = new k98(this.z, (mt5) obj3);
        k98Var.x = zBooleanValue;
        k98Var.y = (Map) obj2;
        return k98Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005b -> B:16:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            boolean r0 = r13.x
            java.util.Map r1 = r13.y
            java.util.Map r1 = (java.util.Map) r1
            px5 r2 = px5.a
            boolean r3 = r13.w
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L20
            if (r3 != r4) goto L1a
            java.lang.String r1 = r13.v
            java.util.Iterator r3 = r13.u
            l98 r6 = r13.t
            ybh.y(r14)
            goto L5e
        L1a:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r13)
            return r5
        L20:
            ybh.y(r14)
            if (r0 == 0) goto Ldd
            java.util.Set r14 = r1.entrySet()
            java.util.Iterator r14 = r14.iterator()
            l98 r1 = r13.z
            r3 = r14
            r6 = r1
        L31:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto Ldd
            java.lang.Object r14 = r3.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r1 = r14.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r14 = r14.getValue()
            d98 r14 = (defpackage.d98) r14
            sm6 r7 = r6.m
            r13.y = r5
            r13.t = r6
            r13.u = r3
            r13.v = r1
            r13.x = r0
            r13.w = r4
            java.lang.Object r14 = r7.a(r14, r13)
            if (r14 != r2) goto L5e
            return r2
        L5e:
            pmi r14 = (defpackage.pmi) r14
            nmi r7 = defpackage.nmi.a
            boolean r7 = kotlin.jvm.internal.Intrinsics.a(r14, r7)
            if (r7 != 0) goto L31
            boolean r7 = r14 instanceof defpackage.omi
            if (r7 == 0) goto Ld9
            com.opera.android.BrowserActivity r7 = r6.a
            omi r14 = (defpackage.omi) r14
            long r8 = r14.a
            x4o r14 = x4o.c(r7)
            java.lang.String r7 = "ESIMUPS:"
            java.lang.String r7 = defpackage.sko.j(r7, r1)
            tn r10 = new tn
            java.lang.Class<com.opera.android.esim.work.EsimUpsellWorker> r11 = com.opera.android.esim.work.EsimUpsellWorker.class
            r10.<init>(r11)
            on7 r11 = pn7.b
            un7 r11 = un7.e
            long r11 = pn7.p(r8, r11)
            int r8 = pn7.h(r8)
            long r8 = (long) r8
            java.time.Duration r8 = java.time.Duration.ofSeconds(r11, r8)
            java.lang.Object r9 = r10.c
            h5o r9 = (h5o) r9
            long r11 = r8.toMillis()
            r9.g = r11
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r11 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r11
            java.lang.Object r11 = r10.c
            h5o r11 = (h5o) r11
            long r11 = r11.g
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 <= 0) goto Ld3
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.lang.String r9 = "plan_id"
            r8.put(r9, r1)
            ib6 r1 = new ib6
            r1.<init>(r8)
            cqp.H0(r1)
            java.lang.Object r8 = r10.c
            h5o r8 = (h5o) r8
            r8.e = r1
            off r1 = r10.j()
            r14.b(r7, r1)
            goto L31
        Ld3:
            java.lang.String r13 = "The given initial delay is too large and will cause an overflow!"
            defpackage.qp2.o(r13)
            return r5
        Ld9:
            h9o.p()
            return r5
        Ldd:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k98.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
