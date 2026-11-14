package ads_mobile_sdk;

import defpackage.fsg;
import defpackage.zhl;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class se2 extends k61 {
    public final nx5 c;
    public final qr0 d;
    public boolean e;
    public final pfe f;
    public final LinkedHashMap g;
    public final ReferenceQueue h;

    public se2(nx5 nx5Var, qr0 qr0Var) {
        super((fw0) null, 3);
        this.c = nx5Var;
        this.d = qr0Var;
        this.f = new pfe();
        this.g = new LinkedHashMap();
        this.h = new ReferenceQueue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.se2 r5, java.lang.Object r6, defpackage.jbp r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.qe2
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.qe2 r0 = (ads_mobile_sdk.qe2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.qe2 r0 = new ads_mobile_sdk.qe2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L32
            pfe r5 = r0.d
            jbp r7 = r0.c
            java.lang.Object r6 = r0.b
            ads_mobile_sdk.se2 r0 = r0.a
            defpackage.ybh.y(r8)
            r8 = r5
            r5 = r0
            goto L55
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L38:
            defpackage.ybh.y(r8)
            boolean r8 = r5.e
            if (r8 != 0) goto L42
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L42:
            pfe r8 = r5.f
            r0.a = r5
            r0.b = r6
            r0.c = r7
            r0.d = r8
            r0.g = r3
            java.lang.Object r0 = r8.i(r0)
            if (r0 != r1) goto L55
            return r1
        L55:
            java.util.LinkedHashMap r0 = r5.g     // Catch: java.lang.Throwable -> L69
            ads_mobile_sdk.yu0 r1 = new ads_mobile_sdk.yu0     // Catch: java.lang.Throwable -> L69
            java.lang.ref.ReferenceQueue r5 = r5.h     // Catch: java.lang.Throwable -> L69
            r1.<init>(r7, r6, r5)     // Catch: java.lang.Throwable -> L69
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L69
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> L69
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L69
            r8.l(r4)
            return r5
        L69:
            r5 = move-exception
            r8.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.se2.a(ads_mobile_sdk.se2, java.lang.Object, jbp, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0089 -> B:21:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008c -> B:22:0x004e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b8 -> B:17:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(ads_mobile_sdk.se2 r9, nt5 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.oe2
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.oe2 r0 = (ads_mobile_sdk.oe2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.oe2 r0 = new ads_mobile_sdk.oe2
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L29
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2d
            ads_mobile_sdk.se2 r9 = r0.a
        L29:
            defpackage.ybh.y(r10)
            goto L3f
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return
        L33:
            pfe r9 = r0.c
            ads_mobile_sdk.yu0 r2 = r0.b
            ads_mobile_sdk.se2 r6 = r0.a
            defpackage.ybh.y(r10)
            r10 = r9
            r9 = r6
            goto L60
        L3f:
            java.lang.ref.ReferenceQueue r10 = r9.h
            java.lang.ref.Reference r10 = r10.poll()
            boolean r2 = r10 instanceof ads_mobile_sdk.yu0
            if (r2 == 0) goto L4c
            ads_mobile_sdk.yu0 r10 = (ads_mobile_sdk.yu0) r10
            goto L4d
        L4c:
            r10 = r5
        L4d:
            r2 = r10
        L4e:
            if (r2 == 0) goto L93
            pfe r10 = r9.f
            r0.a = r9
            r0.b = r2
            r0.c = r10
            r0.f = r3
            java.lang.Object r6 = r10.i(r0)
            if (r6 == r1) goto Lba
        L60:
            java.util.LinkedHashMap r6 = r9.g     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r6 = r6.remove(r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L8e
            r10.l(r5)
            nx5 r10 = r9.c
            zhl r6 = new zhl
            r7 = 25
            r6.<init>(r7, r5, r2)
            kotlin.coroutines.h r2 = kotlin.coroutines.h.a
            fsg r7 = new fsg
            r8 = 3
            r7.<init>(r6, r5, r8)
            defpackage.na2.B(r10, r2, r5, r7, r4)
            java.lang.ref.ReferenceQueue r10 = r9.h
            java.lang.ref.Reference r10 = r10.poll()
            boolean r2 = r10 instanceof ads_mobile_sdk.yu0
            if (r2 == 0) goto L8c
            ads_mobile_sdk.yu0 r10 = (ads_mobile_sdk.yu0) r10
            goto L4d
        L8c:
            r2 = r5
            goto L4e
        L8e:
            r9 = move-exception
            r10.l(r5)
            throw r9
        L93:
            ads_mobile_sdk.qr0 r10 = r9.d
            r10.getClass()
            on7 r2 = pn7.b
            un7 r2 = un7.f
            pn7 r2 = u0h.b(r4, r2)
            ads_mobile_sdk.fo r6 = ads_mobile_sdk.fo.a$21
            java.lang.String r7 = "gads:phantom_reference_interval:seconds"
            java.lang.Object r10 = r10.a(r7, r2, r6)
            pn7 r10 = (pn7) r10
            long r6 = r10.a
            r0.a = r9
            r0.b = r5
            r0.c = r5
            r0.f = r4
            java.lang.Object r10 = defpackage.nb6.q(r6, r0)
            if (r10 != r1) goto L3f
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.se2.a(ads_mobile_sdk.se2, nt5):void");
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        qr0 qr0Var = this.d;
        qr0Var.getClass();
        on7 on7Var = pn7.b;
        long j = ((pn7) qr0Var.a("gads:phantom_reference_interval:seconds", u0h.b(2, un7.f), fo.a$21)).a;
        on7Var.getClass();
        boolean z = pn7.c(j, 0L) > 0;
        this.e = z;
        if (z) {
            mt5 mt5Var2 = null;
            defpackage.na2.B(this.c, h.a, null, new fsg(new zhl((byte) 27, mt5Var2, (Object) this), mt5Var2, (byte) 3), 2);
        }
        return new hv0(Unit.a);
    }
}
