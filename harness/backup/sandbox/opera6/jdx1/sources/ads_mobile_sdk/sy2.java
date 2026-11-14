package ads_mobile_sdk;

import android.content.Context;
import defpackage.mip;
import defpackage.nap;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class sy2 {
    public final Context a;
    public final mip b;
    public final dk c;
    public final g0 d;
    public final nap e;
    public final nx5 f;
    public final ux2 g;
    public final sb h;
    public final defpackage.r83 i;
    public final dr2 j;
    public final long k;
    public final long l;
    public final pfe m;
    public final ArrayList n;

    public sy2(qr0 qr0Var, Context context, mip mipVar, dk dkVar, g0 g0Var, nap napVar, nx5 nx5Var, ux2 ux2Var, sb sbVar, defpackage.r83 r83Var, dr2 dr2Var) {
        this.a = context;
        this.b = mipVar;
        this.c = dkVar;
        this.d = g0Var;
        this.e = napVar;
        this.f = nx5Var;
        this.g = ux2Var;
        this.h = sbVar;
        this.i = r83Var;
        this.j = dr2Var;
        qr0Var.getClass();
        on7 on7Var = pn7.b;
        this.k = ((pn7) qr0Var.a("(gads:rtb_v1_1:signal_timeout_ms", u0h.b(900, un7.d), fo.a$18)).a;
        this.l = pn7.o(i83.e.a, ((Number) qr0Var.a("gads:rtb_timeout_multiplier", Double.valueOf(0.95d), fo.a$7)).doubleValue());
        this.m = new pfe();
        this.n = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(defpackage.fq r14, ads_mobile_sdk.av2 r15, defpackage.r83 r16, nt5 r17) {
        /*
            r13 = this;
            r0 = r17
            boolean r2 = r0 instanceof ads_mobile_sdk.my2
            if (r2 == 0) goto L16
            r2 = r0
            ads_mobile_sdk.my2 r2 = (ads_mobile_sdk.my2) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.e = r3
        L14:
            r7 = r2
            goto L1c
        L16:
            ads_mobile_sdk.my2 r2 = new ads_mobile_sdk.my2
            r2.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.c
            px5 r8 = px5.a
            int r2 = r7.e
            r9 = 2
            r10 = 1
            r11 = 0
            if (r2 == 0) goto L3f
            if (r2 == r10) goto L39
            if (r2 != r9) goto L33
            pfe r1 = r7.b
            ads_mobile_sdk.sy2 r2 = r7.a
            defpackage.ybh.y(r0)
            goto L6f
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r0)
            return r11
        L39:
            ads_mobile_sdk.sy2 r1 = r7.a
            defpackage.ybh.y(r0)
            goto L5e
        L3f:
            defpackage.ybh.y(r0)
            dvj r12 = ads_mobile_sdk.ax0.f
            dj2 r0 = new dj2
            r5 = 0
            r6 = 11
            r1 = r13
            r4 = r14
            r3 = r15
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a = r13
            r7.e = r10
            long r2 = r13.l
            java.lang.Object r0 = r12.m(r2, r0, r7)
            if (r0 == r8) goto L6c
            r1 = r13
        L5e:
            pfe r0 = r1.m
            r7.a = r1
            r7.b = r0
            r7.e = r9
            java.lang.Object r2 = r0.i(r7)
            if (r2 != r8) goto L6d
        L6c:
            return r8
        L6d:
            r2 = r1
            r1 = r0
        L6f:
            java.util.ArrayList r0 = r2.n     // Catch: java.lang.Throwable -> L75
            r1.l(r11)
            return r0
        L75:
            r0 = move-exception
            r1.l(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sy2.a(fq, ads_mobile_sdk.av2, r83, nt5):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f1, code lost:
    
        if (r1.i(r8) != r9) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.os.Bundle r17, android.os.Bundle r18, defpackage.fq r19, java.lang.String r20, java.lang.String r21, nt5 r22) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sy2.a(android.os.Bundle, android.os.Bundle, fq, java.lang.String, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02de A[Catch: all -> 0x0305, TryCatch #4 {all -> 0x0305, blocks: (B:118:0x02d7, B:120:0x02de, B:122:0x02e5, B:124:0x02e9, B:126:0x02ed, B:127:0x02ee, B:128:0x02f3, B:129:0x02f4, B:130:0x02fb, B:131:0x02fc, B:132:0x0303, B:133:0x0304), top: B:147:0x02d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0304 A[Catch: all -> 0x0305, TRY_LEAVE, TryCatch #4 {all -> 0x0305, blocks: (B:118:0x02d7, B:120:0x02de, B:122:0x02e5, B:124:0x02e9, B:126:0x02ed, B:127:0x02ee, B:128:0x02f3, B:129:0x02f4, B:130:0x02fb, B:131:0x02fc, B:132:0x0303, B:133:0x0304), top: B:147:0x02d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0106 A[Catch: all -> 0x01ab, TRY_LEAVE, TryCatch #7 {all -> 0x01ab, blocks: (B:35:0x00fe, B:37:0x0106, B:40:0x012b, B:42:0x013b, B:43:0x0140, B:45:0x014d, B:47:0x0153, B:48:0x015b, B:50:0x0161, B:51:0x0177), top: B:151:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012b A[Catch: all -> 0x01ab, TRY_ENTER, TryCatch #7 {all -> 0x01ab, blocks: (B:35:0x00fe, B:37:0x0106, B:40:0x012b, B:42:0x013b, B:43:0x0140, B:45:0x014d, B:47:0x0153, B:48:0x015b, B:50:0x0161, B:51:0x0177), top: B:151:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b6 A[Catch: all -> 0x01dd, TryCatch #9 {all -> 0x01dd, blocks: (B:63:0x01af, B:65:0x01b6, B:67:0x01bd, B:69:0x01c1, B:71:0x01c5, B:72:0x01c6, B:73:0x01cb, B:74:0x01cc, B:75:0x01d3, B:76:0x01d4, B:77:0x01db, B:78:0x01dc), top: B:154:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dc A[Catch: all -> 0x01dd, TRY_LEAVE, TryCatch #9 {all -> 0x01dd, blocks: (B:63:0x01af, B:65:0x01b6, B:67:0x01bd, B:69:0x01c1, B:71:0x01c5, B:72:0x01c6, B:73:0x01cb, B:74:0x01cc, B:75:0x01d3, B:76:0x01d4, B:77:0x01db, B:78:0x01dc), top: B:154:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022c A[Catch: all -> 0x02d3, TRY_LEAVE, TryCatch #2 {all -> 0x02d3, blocks: (B:89:0x0224, B:91:0x022c, B:94:0x0251, B:96:0x0261, B:97:0x0266, B:99:0x0273, B:101:0x0279, B:102:0x0281, B:104:0x0287, B:105:0x029d), top: B:144:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0251 A[Catch: all -> 0x02d3, TRY_ENTER, TryCatch #2 {all -> 0x02d3, blocks: (B:89:0x0224, B:91:0x022c, B:94:0x0251, B:96:0x0261, B:97:0x0266, B:99:0x0273, B:101:0x0279, B:102:0x0281, B:104:0x0287, B:105:0x029d), top: B:144:0x0224 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r2v51, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r6v5, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r6v7, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r6v8, types: [ads_mobile_sdk.rg3, ads_mobile_sdk.wk2] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map.Entry r18, defpackage.r83 r19, java.util.Map r20, ads_mobile_sdk.av2 r21, defpackage.fq r22, nt5 r23) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sy2.a(java.util.Map$Entry, r83, java.util.Map, ads_mobile_sdk.av2, fq, nt5):java.lang.Object");
    }
}
