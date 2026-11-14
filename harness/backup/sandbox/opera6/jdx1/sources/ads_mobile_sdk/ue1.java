package ads_mobile_sdk;

import defpackage.f6p;
import defpackage.prb;
import java.util.UUID;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ue1 implements f6p {
    public cy0 a;
    public final nx5 b;
    public final ux2 c;
    public final qr0 d;
    public final boolean e;
    public final pfe f = new pfe();
    public boolean g;
    public int h;

    public ue1(cy0 cy0Var, nx5 nx5Var, ux2 ux2Var, qr0 qr0Var, boolean z) {
        this.a = cy0Var;
        this.b = nx5Var;
        this.c = ux2Var;
        this.d = qr0Var;
        this.e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x017c A[Catch: all -> 0x017d, TRY_LEAVE, TryCatch #7 {all -> 0x017d, blocks: (B:85:0x014f, B:87:0x0156, B:89:0x015d, B:91:0x0161, B:93:0x0165, B:94:0x0166, B:95:0x016b, B:96:0x016c, B:97:0x0173, B:98:0x0174, B:99:0x017b, B:100:0x017c), top: B:120:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:18:0x0045, B:28:0x00a8, B:32:0x00af, B:33:0x00b1, B:35:0x00b5), top: B:107:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc A[Catch: all -> 0x00f3, TryCatch #3 {all -> 0x00f3, blocks: (B:42:0x00c5, B:44:0x00cc, B:46:0x00d3, B:48:0x00d7, B:50:0x00db, B:51:0x00dc, B:52:0x00e1, B:53:0x00e2, B:54:0x00e9, B:55:0x00ea, B:56:0x00f1, B:57:0x00f2), top: B:113:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2 A[Catch: all -> 0x00f3, TRY_LEAVE, TryCatch #3 {all -> 0x00f3, blocks: (B:42:0x00c5, B:44:0x00cc, B:46:0x00d3, B:48:0x00d7, B:50:0x00db, B:51:0x00dc, B:52:0x00e1, B:53:0x00e2, B:54:0x00e9, B:55:0x00ea, B:56:0x00f1, B:57:0x00f2), top: B:113:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013f A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #5 {all -> 0x014a, blocks: (B:13:0x0036, B:71:0x0132, B:75:0x0139, B:76:0x013b, B:78:0x013f), top: B:116:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0156 A[Catch: all -> 0x017d, TryCatch #7 {all -> 0x017d, blocks: (B:85:0x014f, B:87:0x0156, B:89:0x015d, B:91:0x0161, B:93:0x0165, B:94:0x0166, B:95:0x016b, B:96:0x016c, B:97:0x0173, B:98:0x0174, B:99:0x017b, B:100:0x017c), top: B:120:0x014f }] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v29, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.ue1 r16, java.lang.String r17, java.lang.String r18, java.util.UUID r19, mt5 r20) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ue1.a(ads_mobile_sdk.ue1, java.lang.String, java.lang.String, java.util.UUID, mt5):java.lang.Object");
    }

    @Override // defpackage.f6p
    public final Object a(String str, String str2, mt5 mt5Var) {
        return a(this, str, str2, UUID.randomUUID(), mt5Var);
    }

    @Override // defpackage.f6p
    public final Object a(prb prbVar, mt5 mt5Var) {
        Object objA;
        cy0 cy0Var = this.a;
        return (cy0Var == null || (objA = cy0Var.a(prbVar, "sendMessageToNativeJs", mt5Var)) != px5.a) ? Unit.a : objA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r6.e(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(mt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.pe1
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.pe1 r0 = (ads_mobile_sdk.pe1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.pe1 r0 = new ads_mobile_sdk.pe1
            nt5 r7 = (nt5) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2d
            defpackage.ybh.y(r7)
            goto L63
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r5
        L33:
            pfe r6 = r0.b
            ads_mobile_sdk.ue1 r2 = r0.a
            defpackage.ybh.y(r7)
            r7 = r6
            r6 = r2
            goto L4e
        L3d:
            defpackage.ybh.y(r7)
            r0.a = r6
            pfe r7 = r6.f
            r0.b = r7
            r0.e = r4
            java.lang.Object r2 = r7.i(r0)
            if (r2 == r1) goto L62
        L4e:
            int r2 = r6.h     // Catch: java.lang.Throwable -> L66
            int r2 = r2 - r4
            r6.h = r2     // Catch: java.lang.Throwable -> L66
            r7.l(r5)
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L66:
            r6 = move-exception
            r7.l(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ue1.b(mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r6.e(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(mt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.qe1
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.qe1 r0 = (ads_mobile_sdk.qe1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.qe1 r0 = new ads_mobile_sdk.qe1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.ybh.y(r7)
            goto L5e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r5
        L31:
            pfe r6 = r0.b
            ads_mobile_sdk.ue1 r2 = r0.a
            defpackage.ybh.y(r7)
            r7 = r6
            r6 = r2
            goto L4c
        L3b:
            defpackage.ybh.y(r7)
            r0.a = r6
            pfe r7 = r6.f
            r0.b = r7
            r0.e = r4
            java.lang.Object r2 = r7.i(r0)
            if (r2 == r1) goto L5d
        L4c:
            r6.g = r4     // Catch: java.lang.Throwable -> L61
            r7.l(r5)
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L61:
            r6 = move-exception
            r7.l(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ue1.c(mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(mt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.re1
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.re1 r0 = (ads_mobile_sdk.re1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.re1 r0 = new ads_mobile_sdk.re1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r5 = r0.b
            ads_mobile_sdk.ue1 r0 = r0.a
            defpackage.ybh.y(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L34:
            defpackage.ybh.y(r6)
            r0.a = r5
            pfe r6 = r5.f
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            int r0 = r5.h     // Catch: java.lang.Throwable -> L51
            int r0 = r0 + r3
            r5.h = r0     // Catch: java.lang.Throwable -> L51
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L51
            r6.l(r4)
            return r5
        L51:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ue1.d(mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(mt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.se1
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.se1 r0 = (ads_mobile_sdk.se1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.se1 r0 = new ads_mobile_sdk.se1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r5 = r0.b
            ads_mobile_sdk.ue1 r0 = r0.a
            defpackage.ybh.y(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L34:
            defpackage.ybh.y(r6)
            r0.a = r5
            pfe r6 = r5.f
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            boolean r0 = r5.g     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L5a
            int r0 = r5.h     // Catch: java.lang.Throwable -> L60
            if (r0 > 0) goto L5a
            nx5 r0 = r5.b     // Catch: java.lang.Throwable -> L60
            ads_mobile_sdk.te1 r1 = new ads_mobile_sdk.te1     // Catch: java.lang.Throwable -> L60
            r2 = 0
            r1.<init>(r5, r4, r2)     // Catch: java.lang.Throwable -> L60
            r5 = 3
            defpackage.na2.B(r0, r4, r4, r1, r5)     // Catch: java.lang.Throwable -> L60
        L5a:
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L60
            r6.l(r4)
            return r5
        L60:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ue1.e(mt5):java.lang.Object");
    }
}
