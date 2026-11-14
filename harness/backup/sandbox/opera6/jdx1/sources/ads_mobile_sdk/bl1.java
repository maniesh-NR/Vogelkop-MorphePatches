package ads_mobile_sdk;

import defpackage.ato;
import defpackage.zep;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class bl1 implements zep {
    public final ux2 a;
    public final kh3 b;
    public final ax0 c;
    public final nx5 d;
    public final qr0 e;
    public final pfe f = new pfe();
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public final ft1 i = new ft1(null);

    public bl1(ux2 ux2Var, kh3 kh3Var, ax0 ax0Var, nx5 nx5Var, qr0 qr0Var) {
        this.a = ux2Var;
        this.b = kh3Var;
        this.c = ax0Var;
        this.d = nx5Var;
        this.e = qr0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (r4 != r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01bf, code lost:
    
        if (r14.invoke(r5) == r6) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107 A[Catch: all -> 0x0148, TryCatch #2 {all -> 0x0148, blocks: (B:35:0x00fd, B:37:0x0107, B:40:0x0111, B:42:0x0117, B:44:0x012c, B:46:0x0134), top: B:132:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.bl1 r27, ads_mobile_sdk.cy0 r28, android.net.Uri r29, nt5 r30) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bl1.a(ads_mobile_sdk.bl1, ads_mobile_sdk.cy0, android.net.Uri, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r7.a(r0, r10) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:31:0x0092, B:33:0x009c, B:34:0x00a1), top: B:50:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.bl1 r7, java.lang.String r8, defpackage.ato r9, mt5 r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bl1.a(ads_mobile_sdk.bl1, java.lang.String, ato, mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r9.a(r7, r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.bl1 r6, java.lang.String r7, cd5 r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.al1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.al1 r0 = (ads_mobile_sdk.al1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.al1 r0 = new ads_mobile_sdk.al1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r9)
            goto L5e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L31:
            cd5 r8 = r0.b
            java.lang.String r7 = r0.a
            defpackage.ybh.y(r9)
            goto L4a
        L39:
            defpackage.ybh.y(r9)
            ads_mobile_sdk.ft1 r6 = r6.i
            r0.a = r7
            r0.b = r8
            r0.e = r5
            java.lang.Object r9 = r6.a(r0)
            if (r9 == r1) goto L5d
        L4a:
            ads_mobile_sdk.kv2 r9 = (ads_mobile_sdk.kv2) r9
            if (r9 != 0) goto L51
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L51:
            r0.a = r3
            r0.b = r3
            r0.e = r4
            java.lang.Object r6 = r9.a(r7, r8, r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bl1.a(ads_mobile_sdk.bl1, java.lang.String, cd5, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.bl1 r5, java.lang.String r6, nt5 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.wk1
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.wk1 r0 = (ads_mobile_sdk.wk1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.wk1 r0 = new ads_mobile_sdk.wk1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            if (r2 == r3) goto L33
            r5 = 2
            if (r2 != r5) goto L2d
            defpackage.ybh.y(r7)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L33:
            java.lang.String r6 = r0.b
            ads_mobile_sdk.bl1 r5 = r0.a
            defpackage.ybh.y(r7)
            goto L4d
        L3b:
            defpackage.ybh.y(r7)
            ads_mobile_sdk.ft1 r7 = r5.i
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            ads_mobile_sdk.kv2 r7 = (ads_mobile_sdk.kv2) r7
            if (r7 != 0) goto L5d
            java.lang.String r5 = "Unknown/Unexpected GMSG without a handler: result"
            ads_mobile_sdk.xu0.c(r5, r4)
            r6 = 6
            ads_mobile_sdk.xh3.a(r5, r4, r6)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L5d:
            m5a r0 = new m5a     // Catch: java.lang.Exception -> L6b
            r0.<init>()     // Catch: java.lang.Exception -> L6b
            java.lang.Class<prb> r1 = defpackage.prb.class
            java.lang.Object r6 = r0.b(r1, r6)     // Catch: java.lang.Exception -> L6b
            prb r6 = (defpackage.prb) r6     // Catch: java.lang.Exception -> L6b
            goto L84
        L6b:
            r6 = move-exception
            ads_mobile_sdk.ub2 r0 = w8h.a(r6)
            java.util.ArrayList r0 = r0.s
            java.lang.String r1 = r6.getMessage()
            if (r1 != 0) goto L80
            java.lang.Class r6 = r6.getClass()
            java.lang.String r1 = r6.getName()
        L80:
            r0.add(r1)
            r6 = r4
        L84:
            if (r6 != 0) goto L89
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L89:
            ads_mobile_sdk.ix1 r0 = new ads_mobile_sdk.ix1
            r0.<init>(r5, r7, r6, r4)
            nx5 r5 = r5.d
            sqo r6 = new sqo
            r7 = 8
            r6.<init>(r7, r4, r0)
            r7 = 3
            defpackage.na2.B(r5, r4, r4, r6, r7)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bl1.a(ads_mobile_sdk.bl1, java.lang.String, nt5):java.lang.Object");
    }

    @Override // defpackage.zep
    public final Object a(String str, ato atoVar, mt5 mt5Var) {
        return a(this, str, atoVar, mt5Var);
    }
}
