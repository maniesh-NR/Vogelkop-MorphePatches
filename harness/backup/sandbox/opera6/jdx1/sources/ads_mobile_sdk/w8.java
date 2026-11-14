package ads_mobile_sdk;

import defpackage.edp;
import defpackage.lgp;
import defpackage.qr9;
import defpackage.wdp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class w8 implements qr9, wdp {
    public final Object a;

    public w8() {
        this.a = new AtomicReference(null);
    }

    public /* synthetic */ w8(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.w8 r8, defpackage.prb r9, nt5 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.qx1
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.qx1 r0 = (ads_mobile_sdk.qx1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.qx1 r0 = new ads_mobile_sdk.qx1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            java.lang.String r8 = r0.a
            defpackage.ybh.y(r10)
            goto L87
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r3
        L30:
            defpackage.ybh.y(r10)
            java.lang.String r10 = "name"
            java.lang.String r2 = ""
            java.lang.String r10 = ads_mobile_sdk.bw2.a(r9, r10, r2)
            int r5 = r10.length()
            if (r5 == 0) goto L91
            java.lang.String r5 = "type"
            java.lang.String r5 = ads_mobile_sdk.bw2.a(r9, r5, r2)
            java.lang.String r6 = "string"
            boolean r6 = kotlin.jvm.internal.Intrinsics.a(r5, r6)
            if (r6 == 0) goto L5b
            ads_mobile_sdk.h80 r8 = new ads_mobile_sdk.h80
            java.lang.String r0 = "string_value"
            java.lang.String r9 = ads_mobile_sdk.bw2.a(r9, r0, r2)
            r8.<init>(r10, r9)
            return r8
        L5b:
            java.lang.String r2 = "image"
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r5, r2)
            if (r2 == 0) goto L91
            java.lang.Object r8 = r8.a
            ads_mobile_sdk.jx1 r8 = (ads_mobile_sdk.jx1) r8
            java.lang.String r2 = "image_value"
            r0.a = r10
            r0.d = r4
            r8.getClass()
            if (r9 == 0) goto L77
            prb r9 = r9.w(r2)     // Catch: java.lang.Exception -> L77
            goto L78
        L77:
            r9 = r3
        L78:
            uie r2 = r8.a
            boolean r2 = r2.i()
            java.lang.Object r8 = r8.a(r9, r2, r0)
            if (r8 == r1) goto L92
            r7 = r10
            r10 = r8
            r8 = r7
        L87:
            ads_mobile_sdk.zf1 r10 = (ads_mobile_sdk.zf1) r10
            if (r10 == 0) goto L91
            ads_mobile_sdk.g80 r1 = new ads_mobile_sdk.g80
            r1.<init>(r8, r10)
            goto L92
        L91:
            r1 = r3
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w8.a(ads_mobile_sdk.w8, prb, nt5):java.lang.Object");
    }

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        return lw0.AD_TYPE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r10 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r10 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0083 -> B:32:0x0086). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.prb r8, java.lang.String r9, nt5 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.rx1
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.rx1 r0 = (ads_mobile_sdk.rx1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.rx1 r0 = new ads_mobile_sdk.rx1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            java.util.Iterator r7 = r0.b
            java.util.ArrayList r8 = r0.a
            defpackage.ybh.y(r10)
            goto L86
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r3
        L35:
            defpackage.ybh.y(r10)
            goto L5f
        L39:
            defpackage.ybh.y(r10)
            wpb r8 = ads_mobile_sdk.bw2.e(r8, r9)
            if (r8 != 0) goto L45
            l08 r7 = l08.a
            return r7
        L45:
            java.util.ArrayList r9 = r8.a
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L50
            l08 r7 = l08.a
            return r7
        L50:
            c71 r9 = new c71
            r10 = 20
            r9.<init>(r8, r7, r3, r10)
            r0.e = r5
            java.lang.Object r10 = defpackage.sgb.q(r9, r0)
            if (r10 == r1) goto L85
        L5f:
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r10.iterator()
            r6 = r8
            r8 = r7
            r7 = r6
        L6d:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L8e
            java.lang.Object r9 = r7.next()
            h07 r9 = (h07) r9
            r0.a = r8
            r0.b = r7
            r0.e = r4
            java.lang.Object r10 = r9.X(r0)
            if (r10 != r1) goto L86
        L85:
            return r1
        L86:
            a6p r10 = (defpackage.a6p) r10
            if (r10 == 0) goto L6d
            r8.add(r10)
            goto L6d
        L8e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w8.a(prb, java.lang.String, nt5):java.lang.Object");
    }

    @Override // defpackage.wdp
    public final Object d(mt5 mt5Var) {
        Set set = (Set) this.a;
        ArrayList arrayList = new ArrayList(k95.o(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((av2) it.next()).a);
        }
        return new hv0(new v8(arrayList));
    }

    @Override // defpackage.qr9
    public final void onFailure(Throwable th) {
    }

    @Override // defpackage.qr9
    public final void onSuccess(Object obj) {
        edp edpVar = (edp) obj;
        qm1 qm1Var = ((u83) this.a).c;
        synchronized (qm1Var.n) {
            lgp lgpVar = qm1Var.q;
            String strB = edpVar.b();
            lgpVar.b$1();
            ((t7) lgpVar.b).b(strB);
        }
    }
}
