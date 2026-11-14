package ads_mobile_sdk;

import defpackage.avo;
import defpackage.mip;
import defpackage.tso;
import defpackage.vkp;

/* loaded from: classes.dex */
public final class bk1 extends al0 {
    public final nx5 d;
    public final nx5 e;
    public final qr0 f;
    public final mip g;
    public final vkp h;
    public final gr0 i;
    public final o03 j;
    public final oo3 k;
    public final ux2 l;
    public final avo m;
    public final tso n;
    public final ax0 o;
    public vz p;

    public bk1(nx5 nx5Var, nx5 nx5Var2, qr0 qr0Var, mip mipVar, vkp vkpVar, gr0 gr0Var, o03 o03Var, oo3 oo3Var, ux2 ux2Var, avo avoVar, tso tsoVar, ax0 ax0Var) {
        this.d = nx5Var;
        this.e = nx5Var2;
        this.f = qr0Var;
        this.g = mipVar;
        this.h = vkpVar;
        this.i = gr0Var;
        this.j = o03Var;
        this.k = oo3Var;
        this.l = ux2Var;
        this.m = avoVar;
        this.n = tsoVar;
        this.o = ax0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r6.c(r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.bk1 r6, java.lang.String r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.xj1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.xj1 r0 = (ads_mobile_sdk.xj1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.xj1 r0 = new ads_mobile_sdk.xj1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r8)
            goto L5e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L31:
            ads_mobile_sdk.bk1 r6 = r0.a
            defpackage.ybh.y(r8)
            goto L44
        L37:
            defpackage.ybh.y(r8)
            r0.a = r6
            r0.d = r5
            java.lang.Object r8 = r6.a(r7, r0)
            if (r8 == r1) goto L5d
        L44:
            rap r8 = (defpackage.rap) r8
            boolean r7 = r8 instanceof ads_mobile_sdk.av0
            if (r7 == 0) goto L4d
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L4d:
            ads_mobile_sdk.hv0 r8 = (ads_mobile_sdk.hv0) r8
            java.lang.Object r7 = r8.b
            ads_mobile_sdk.ue1 r7 = (ads_mobile_sdk.ue1) r7
            r0.a = r3
            r0.d = r4
            java.lang.Object r6 = r6.c(r7, r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bk1.a(ads_mobile_sdk.bk1, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.bk1 r12, nt5 r13) {
        /*
            ads_mobile_sdk.fo r0 = ads_mobile_sdk.fo.a$21
            boolean r1 = r13 instanceof ads_mobile_sdk.zj1
            if (r1 == 0) goto L15
            r1 = r13
            ads_mobile_sdk.zj1 r1 = (ads_mobile_sdk.zj1) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            ads_mobile_sdk.zj1 r1 = new ads_mobile_sdk.zj1
            r1.<init>(r12, r13)
        L1a:
            java.lang.Object r13 = r1.c
            px5 r2 = px5.a
            int r3 = r1.e
            r4 = 30
            java.lang.String r5 = "gads:sdk_core_ttl_seconds"
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L41
            if (r3 == r7) goto L3b
            if (r3 != r6) goto L34
            long r2 = r1.b
            ads_mobile_sdk.bk1 r12 = r1.a
            defpackage.ybh.y(r13)
            goto La3
        L34:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r12)
            r12 = 0
            return r12
        L3b:
            ads_mobile_sdk.bk1 r12 = r1.a
            defpackage.ybh.y(r13)
            goto L53
        L41:
            defpackage.ybh.y(r13)
            ads_mobile_sdk.o03 r13 = r12.j
            r1.a = r12
            r1.e = r7
            r13.getClass()
            java.lang.Object r13 = ads_mobile_sdk.o03.a(r13, r1)
            if (r13 == r2) goto La1
        L53:
            ads_mobile_sdk.i03 r13 = (ads_mobile_sdk.i03) r13
            java.lang.String r13 = r13.o()
            boolean r13 = kotlin.text.StringsKt.N(r13)
            if (r13 != 0) goto Ld0
            ads_mobile_sdk.qr0 r13 = r12.f
            pep r13 = r13.s
            r13.getClass()
            on7 r3 = pn7.b
            un7 r8 = un7.h
            pn7 r8 = u0h.b(r4, r8)
            java.lang.Object r13 = r13.a(r5, r8, r0)
            pn7 r13 = (pn7) r13
            long r8 = r13.a
            r3.getClass()
            r10 = 0
            int r13 = pn7.c(r8, r10)
            if (r13 <= 0) goto Ld1
            mip r13 = r12.g
            r13.getClass()
            long r8 = java.lang.System.currentTimeMillis()
            un7 r13 = un7.d
            long r8 = defpackage.cs5.y0(r8, r13)
            ads_mobile_sdk.o03 r13 = r12.j
            r1.a = r12
            r1.b = r8
            r1.e = r6
            r13.getClass()
            java.lang.Object r13 = ads_mobile_sdk.o03.a(r13, r1)
            if (r13 != r2) goto La2
        La1:
            return r2
        La2:
            r2 = r8
        La3:
            ads_mobile_sdk.i03 r13 = (ads_mobile_sdk.i03) r13
            long r8 = r13.q()
            un7 r13 = un7.d
            long r8 = defpackage.cs5.y0(r8, r13)
            ads_mobile_sdk.qr0 r12 = r12.f
            pep r12 = r12.s
            r12.getClass()
            on7 r13 = pn7.b
            un7 r13 = un7.h
            pn7 r13 = u0h.b(r4, r13)
            java.lang.Object r12 = r12.a(r5, r13, r0)
            pn7 r12 = (pn7) r12
            long r12 = r12.a
            long r12 = pn7.m(r8, r12)
            int r12 = pn7.c(r2, r12)
            if (r12 < 0) goto Ld1
        Ld0:
            r7 = 0
        Ld1:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bk1.a(ads_mobile_sdk.bk1, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ads_mobile_sdk.bk1 r6, java.lang.String r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.ak1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.ak1 r0 = (ads_mobile_sdk.ak1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.ak1 r0 = new ads_mobile_sdk.ak1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            java.lang.Object r6 = r0.a
            java.lang.String r6 = (java.lang.String) r6
            defpackage.ybh.y(r8)
            return r6
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L35:
            java.lang.Object r6 = r0.a
            ads_mobile_sdk.bk1 r6 = (ads_mobile_sdk.bk1) r6
            defpackage.ybh.y(r8)
            goto L4a
        L3d:
            defpackage.ybh.y(r8)
            r0.a = r6
            r0.d = r5
            java.lang.Object r8 = r6.c(r7, r0)
            if (r8 == r1) goto L76
        L4a:
            rap r8 = (defpackage.rap) r8
            boolean r7 = r8 instanceof ads_mobile_sdk.av0
            if (r7 == 0) goto L51
            return r3
        L51:
            ads_mobile_sdk.hv0 r8 = (ads_mobile_sdk.hv0) r8
            java.lang.Object r7 = r8.b
            ads_mobile_sdk.j21 r7 = (ads_mobile_sdk.j21) r7
            ads_mobile_sdk.gv2 r7 = r7.d
            if (r7 == 0) goto L5f
            java.lang.String r3 = ads_mobile_sdk.gv2.a(r7)
        L5f:
            if (r3 == 0) goto L77
            boolean r7 = kotlin.text.StringsKt.N(r3)
            if (r7 != 0) goto L77
            ads_mobile_sdk.o03 r6 = r6.j
            r0.a = r3
            r0.d = r4
            r6.getClass()
            java.lang.Object r6 = ads_mobile_sdk.o03.a(r6, r3, r0)
            if (r6 != r1) goto L77
        L76:
            return r1
        L77:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bk1.b(ads_mobile_sdk.bk1, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (ads_mobile_sdk.gr0.a(r13, r12, (defpackage.prb) r14, r0) != r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ads_mobile_sdk.al0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.ue1 r13, mt5 r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof ads_mobile_sdk.lj1
            if (r0 == 0) goto L13
            r0 = r14
            ads_mobile_sdk.lj1 r0 = (ads_mobile_sdk.lj1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.lj1 r0 = new ads_mobile_sdk.lj1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            defpackage.ybh.y(r14)
            goto Lac
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r12)
            return r6
        L35:
            ads_mobile_sdk.ue1 r12 = r0.b
            java.lang.Object r13 = r0.a
            ads_mobile_sdk.gr0 r13 = (ads_mobile_sdk.gr0) r13
            defpackage.ybh.y(r14)
            goto L9a
        L3f:
            ads_mobile_sdk.ue1 r13 = r0.b
            java.lang.Object r12 = r0.a
            ads_mobile_sdk.bk1 r12 = (ads_mobile_sdk.bk1) r12
            defpackage.ybh.y(r14)
            goto L80
        L49:
            defpackage.ybh.y(r14)
            if (r13 != 0) goto L51
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        L51:
            ads_mobile_sdk.qr0 r14 = r12.f
            boolean r2 = r14.w
            if (r2 != 0) goto L5f
            double r7 = r14.x
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto Laf
        L5f:
            java.lang.Object r14 = r14.a
            w7p r14 = (defpackage.w7p) r14
            ads_mobile_sdk.eo r14 = (ads_mobile_sdk.eo) r14
            java.util.concurrent.atomic.AtomicBoolean r14 = r14.o
            boolean r14 = r14.get()
            if (r14 != 0) goto Laf
            ads_mobile_sdk.vz r14 = r12.p
            if (r14 != 0) goto L72
            r14 = r6
        L72:
            ynb r14 = r14.D
            r0.a = r12
            r0.b = r13
            r0.e = r5
            java.lang.Object r14 = r14.Z(r0)
            if (r14 == r1) goto Lab
        L80:
            ads_mobile_sdk.gr0 r14 = r12.i
            ads_mobile_sdk.vz r12 = r12.p
            if (r12 != 0) goto L87
            r12 = r6
        L87:
            r0.a = r14
            r0.b = r13
            r0.e = r4
            r12.getClass()
            java.lang.Object r12 = ads_mobile_sdk.vz.d(r12, r0)
            if (r12 == r1) goto Lab
            r11 = r14
            r14 = r12
            r12 = r13
            r13 = r11
        L9a:
            prb r14 = (defpackage.prb) r14
            r0.a = r6
            r0.b = r6
            r0.e = r3
            r13.getClass()
            java.lang.Object r12 = ads_mobile_sdk.gr0.a(r13, r12, r14, r0)
            if (r12 != r1) goto Lac
        Lab:
            return r1
        Lac:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        Laf:
            jj4 r14 = new jj4
            r0 = 21
            r14.<init>(r12, r13, r6, r0)
            kotlin.coroutines.h r13 = kotlin.coroutines.h.a
            fsg r0 = new fsg
            r0.<init>(r14, r6, r3)
            nx5 r12 = r12.e
            defpackage.na2.B(r12, r13, r6, r0, r4)
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bk1.a(ads_mobile_sdk.ue1, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #4 {all -> 0x008c, blocks: (B:18:0x003b, B:26:0x007c, B:28:0x0082), top: B:98:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:35:0x0092, B:37:0x0099, B:39:0x00a0, B:41:0x00a4, B:43:0x00a8, B:44:0x00a9, B:45:0x00ae, B:46:0x00af, B:47:0x00b6, B:48:0x00b7, B:49:0x00be, B:50:0x00bf), top: B:91:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:35:0x0092, B:37:0x0099, B:39:0x00a0, B:41:0x00a4, B:43:0x00a8, B:44:0x00a9, B:45:0x00ae, B:46:0x00af, B:47:0x00b6, B:48:0x00b7, B:49:0x00be, B:50:0x00bf), top: B:91:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e1 A[Catch: all -> 0x00eb, TRY_LEAVE, TryCatch #3 {all -> 0x00eb, blocks: (B:13:0x002c, B:61:0x00db, B:63:0x00e1), top: B:96:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f8 A[Catch: all -> 0x011f, TryCatch #7 {all -> 0x011f, blocks: (B:70:0x00f1, B:72:0x00f8, B:74:0x00ff, B:76:0x0103, B:78:0x0107, B:79:0x0108, B:80:0x010d, B:81:0x010e, B:82:0x0115, B:83:0x0116, B:84:0x011d, B:85:0x011e), top: B:104:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011e A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #7 {all -> 0x011f, blocks: (B:70:0x00f1, B:72:0x00f8, B:74:0x00ff, B:76:0x0103, B:78:0x0107, B:79:0x0108, B:80:0x010d, B:81:0x010e, B:82:0x0115, B:83:0x0116, B:84:0x011d, B:85:0x011e), top: B:104:0x00f1 }] */
    @Override // ads_mobile_sdk.al0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r14, mt5 r15) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bk1.a(java.lang.String, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r18, mt5 r19) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bk1.b(java.lang.String, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #1 {all -> 0x0095, blocks: (B:18:0x003b, B:26:0x0085, B:28:0x008b), top: B:93:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[Catch: all -> 0x00c9, TryCatch #3 {all -> 0x00c9, blocks: (B:35:0x009b, B:37:0x00a2, B:39:0x00a9, B:41:0x00ad, B:43:0x00b1, B:44:0x00b2, B:45:0x00b7, B:46:0x00b8, B:47:0x00bf, B:48:0x00c0, B:49:0x00c7, B:50:0x00c8), top: B:97:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8 A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #3 {all -> 0x00c9, blocks: (B:35:0x009b, B:37:0x00a2, B:39:0x00a9, B:41:0x00ad, B:43:0x00b1, B:44:0x00b2, B:45:0x00b7, B:46:0x00b8, B:47:0x00bf, B:48:0x00c0, B:49:0x00c7, B:50:0x00c8), top: B:97:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1 A[Catch: all -> 0x00fb, TRY_LEAVE, TryCatch #5 {all -> 0x00fb, blocks: (B:13:0x002c, B:61:0x00eb, B:63:0x00f1), top: B:100:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0108 A[Catch: all -> 0x012f, TryCatch #7 {all -> 0x012f, blocks: (B:70:0x0101, B:72:0x0108, B:74:0x010f, B:76:0x0113, B:78:0x0117, B:79:0x0118, B:80:0x011d, B:81:0x011e, B:82:0x0125, B:83:0x0126, B:84:0x012d, B:85:0x012e), top: B:104:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012e A[Catch: all -> 0x012f, TRY_LEAVE, TryCatch #7 {all -> 0x012f, blocks: (B:70:0x0101, B:72:0x0108, B:74:0x010f, B:76:0x0113, B:78:0x0117, B:79:0x0118, B:80:0x011d, B:81:0x011e, B:82:0x0125, B:83:0x0126, B:84:0x012d, B:85:0x012e), top: B:104:0x0101 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r14, nt5 r15) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bk1.c(java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(mt5 r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.wj1
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.wj1 r0 = (ads_mobile_sdk.wj1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            ads_mobile_sdk.wj1 r0 = new ads_mobile_sdk.wj1
            nt5 r7 = (nt5) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            ads_mobile_sdk.bk1 r6 = r0.a
            defpackage.ybh.y(r7)
            goto L86
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L35:
            ads_mobile_sdk.bk1 r6 = r0.a
            defpackage.ybh.y(r7)
            goto L63
        L3b:
            defpackage.ybh.y(r7)
            r0.a = r6
            r0.d = r5
            ads_mobile_sdk.qr0 r7 = r6.f
            java.lang.Object r7 = r7.a
            w7p r7 = (defpackage.w7p) r7
            ads_mobile_sdk.eo r7 = (ads_mobile_sdk.eo) r7
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.o
            boolean r2 = r2.get()
            if (r2 == 0) goto L55
            kotlin.Unit r7 = kotlin.Unit.a
            goto L5d
        L55:
            java.lang.Object r7 = r7.a(r3, r0)
            if (r7 == r1) goto L5d
            kotlin.Unit r7 = kotlin.Unit.a
        L5d:
            if (r7 == r1) goto L61
            kotlin.Unit r7 = kotlin.Unit.a
        L61:
            if (r7 == r1) goto L85
        L63:
            ads_mobile_sdk.qr0 r7 = r6.f
            java.lang.Object r7 = r7.a
            w7p r7 = (defpackage.w7p) r7
            ads_mobile_sdk.eo r7 = (ads_mobile_sdk.eo) r7
            java.util.concurrent.atomic.AtomicBoolean r7 = r7.o
            boolean r7 = r7.get()
            if (r7 == 0) goto L7b
            ads_mobile_sdk.hv0 r6 = new ads_mobile_sdk.hv0
            kotlin.Unit r7 = kotlin.Unit.a
            r6.<init>(r7)
            return r6
        L7b:
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r6.b(r0)
            if (r7 != r1) goto L86
        L85:
            return r1
        L86:
            rap r7 = (defpackage.rap) r7
            boolean r0 = r7 instanceof ads_mobile_sdk.av0
            if (r0 == 0) goto L8f
            ads_mobile_sdk.av0 r7 = (ads_mobile_sdk.av0) r7
            return r7
        L8f:
            ads_mobile_sdk.hv0 r7 = (ads_mobile_sdk.hv0) r7
            java.lang.Object r7 = r7.b
            ads_mobile_sdk.ue1 r7 = (ads_mobile_sdk.ue1) r7
            ads_mobile_sdk.qr0 r6 = r6.f
            java.lang.Object r6 = r6.a
            w7p r6 = (defpackage.w7p) r6
            ads_mobile_sdk.eo r6 = (ads_mobile_sdk.eo) r6
            java.util.concurrent.atomic.AtomicBoolean r6 = r6.o
            boolean r6 = r6.get()
            if (r6 == 0) goto Lad
            ads_mobile_sdk.hv0 r6 = new ads_mobile_sdk.hv0
            kotlin.Unit r7 = kotlin.Unit.a
            r6.<init>(r7)
            return r6
        Lad:
            ads_mobile_sdk.ev0 r6 = new ads_mobile_sdk.ev0
            java.lang.String r7 = "Failed to get the CSRB flags"
            ads_mobile_sdk.ae1 r0 = ads_mobile_sdk.ae1.a
            r6.<init>(r7, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bk1.e(mt5):java.lang.Object");
    }
}
