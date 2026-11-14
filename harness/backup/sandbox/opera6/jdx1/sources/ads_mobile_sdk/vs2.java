package ads_mobile_sdk;

import android.os.SystemClock;
import defpackage.aop;
import defpackage.cs5;
import defpackage.llp;
import defpackage.mip;
import defpackage.o0g;

/* loaded from: classes.dex */
public final class vs2 implements aop, llp {
    public final nx5 a;
    public final mip b;
    public final qr0 c;
    public uo2 d;
    public final pfe e = new pfe();
    public d3k f;
    public ynb g;
    public ynb h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;

    public vs2(nx5 nx5Var, mip mipVar, qr0 qr0Var) {
        this.a = nx5Var;
        this.b = mipVar;
        this.c = qr0Var;
        ynb ynbVarE = o0g.e();
        ynbVarE.B0();
        this.g = ynbVarE;
        ynb ynbVarE2 = o0g.e();
        ynbVarE2.B0();
        this.h = ynbVarE2;
        pn7.b.getClass();
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
        qr0Var.getClass();
        un7 un7Var = un7.e;
        pn7 pn7VarB = u0h.b(60, un7Var);
        fo foVar = fo.a$18;
        this.o = ((pn7) qr0Var.a("gads:banner_refresh_time:seconds", pn7VarB, foVar)).a;
        this.p = ((pn7) qr0Var.a("gads:banner_refresh_load_ad_delay:seconds", u0h.b(30, un7Var), foVar)).a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        if (r13.Z(r0) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(long r12, ads_mobile_sdk.vs2 r14, nt5 r15) {
        /*
            boolean r0 = r15 instanceof ads_mobile_sdk.rs2
            if (r0 == 0) goto L13
            r0 = r15
            ads_mobile_sdk.rs2 r0 = (ads_mobile_sdk.rs2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.rs2 r0 = new ads_mobile_sdk.rs2
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 3
            r4 = 2
            r5 = 1
            r10 = 0
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2f
            defpackage.ybh.y(r15)
            goto Lb1
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r12)
            r12 = 0
            return r12
        L36:
            pfe r12 = r0.b
            ads_mobile_sdk.vs2 r13 = r0.a
            defpackage.ybh.y(r15)
            goto L9f
        L3e:
            long r12 = r0.c
            pfe r14 = r0.b
            ads_mobile_sdk.vs2 r2 = r0.a
            defpackage.ybh.y(r15)
            r11 = r2
        L48:
            r8 = r12
            goto L70
        L4a:
            defpackage.ybh.y(r15)
            on7 r15 = pn7.b
            r15.getClass()
            r6 = 0
            int r15 = pn7.c(r12, r6)
            if (r15 > 0) goto L5d
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        L5d:
            pfe r15 = r14.e
            r0.a = r14
            r0.b = r15
            r0.c = r12
            r0.f = r5
            java.lang.Object r2 = r15.i(r0)
            if (r2 == r1) goto Lb0
            r11 = r14
            r14 = r15
            goto L48
        L70:
            ynb r12 = r11.h     // Catch: java.lang.Throwable -> Lba
            r12.B0()     // Catch: java.lang.Throwable -> Lba
            ynb r12 = defpackage.o0g.e()     // Catch: java.lang.Throwable -> Lba
            r11.h = r12     // Catch: java.lang.Throwable -> Lba
            nx5 r12 = r11.a     // Catch: java.lang.Throwable -> Lba
            t3 r6 = new t3     // Catch: java.lang.Throwable -> Lba
            r7 = 7
            r6.<init>(r7, r8, r10, r11)     // Catch: java.lang.Throwable -> Lba
            kotlin.coroutines.h r13 = kotlin.coroutines.h.a     // Catch: java.lang.Throwable -> Lba
            fsg r15 = new fsg     // Catch: java.lang.Throwable -> Lba
            r15.<init>(r6, r10, r3)     // Catch: java.lang.Throwable -> Lba
            defpackage.na2.B(r12, r13, r10, r15, r4)     // Catch: java.lang.Throwable -> Lba
            r14.l(r10)
            pfe r12 = r11.e
            r0.a = r11
            r0.b = r12
            r0.f = r4
            java.lang.Object r13 = r12.i(r0)
            if (r13 == r1) goto Lb0
            r13 = r11
        L9f:
            ynb r13 = r13.h     // Catch: java.lang.Throwable -> Lb4
            r12.l(r10)
            r0.a = r10
            r0.b = r10
            r0.f = r3
            java.lang.Object r12 = r13.Z(r0)
            if (r12 != r1) goto Lb1
        Lb0:
            return r1
        Lb1:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        Lb4:
            r0 = move-exception
            r13 = r0
            r12.l(r10)
            throw r13
        Lba:
            r0 = move-exception
            r12 = r0
            r14.l(r10)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vs2.a(long, ads_mobile_sdk.vs2, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087 A[Catch: CancellationException -> 0x014a, cp2 -> 0x0167, PHI: r12
      0x0087: PHI (r12v37 ads_mobile_sdk.vs2) = (r12v0 ads_mobile_sdk.vs2), (r12v23 ads_mobile_sdk.vs2), (r12v38 ads_mobile_sdk.vs2) binds: [B:38:0x0084, B:70:0x0139, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #7 {cp2 -> 0x0167, CancellationException -> 0x014a, blocks: (B:14:0x0033, B:39:0x0087, B:45:0x00a7, B:47:0x00ac, B:49:0x00af, B:51:0x00c1, B:54:0x00c6, B:56:0x00da, B:69:0x012c, B:80:0x0146, B:81:0x0149, B:26:0x0065, B:29:0x006c), top: B:97:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac A[Catch: CancellationException -> 0x014a, cp2 -> 0x0167, TryCatch #7 {cp2 -> 0x0167, CancellationException -> 0x014a, blocks: (B:14:0x0033, B:39:0x0087, B:45:0x00a7, B:47:0x00ac, B:49:0x00af, B:51:0x00c1, B:54:0x00c6, B:56:0x00da, B:69:0x012c, B:80:0x0146, B:81:0x0149, B:26:0x0065, B:29:0x006c), top: B:97:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af A[Catch: CancellationException -> 0x014a, cp2 -> 0x0167, TryCatch #7 {cp2 -> 0x0167, CancellationException -> 0x014a, blocks: (B:14:0x0033, B:39:0x0087, B:45:0x00a7, B:47:0x00ac, B:49:0x00af, B:51:0x00c1, B:54:0x00c6, B:56:0x00da, B:69:0x012c, B:80:0x0146, B:81:0x0149, B:26:0x0065, B:29:0x006c), top: B:97:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da A[Catch: CancellationException -> 0x014a, cp2 -> 0x0167, PHI: r12 r13
      0x00da: PHI (r12v32 ads_mobile_sdk.vs2) = (r12v16 ads_mobile_sdk.vs2), (r12v34 ads_mobile_sdk.vs2) binds: [B:26:0x0065, B:55:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r13v12 java.lang.Object) = (r13v1 java.lang.Object), (r13v18 java.lang.Object) binds: [B:26:0x0065, B:55:0x00d8] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #7 {cp2 -> 0x0167, CancellationException -> 0x014a, blocks: (B:14:0x0033, B:39:0x0087, B:45:0x00a7, B:47:0x00ac, B:49:0x00af, B:51:0x00c1, B:54:0x00c6, B:56:0x00da, B:69:0x012c, B:80:0x0146, B:81:0x0149, B:26:0x0065, B:29:0x006c), top: B:97:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0095 A[EXC_TOP_SPLITTER, PHI: r12 r13
      0x0095: PHI (r12v35 ads_mobile_sdk.vs2) = (r12v14 ads_mobile_sdk.vs2), (r12v37 ads_mobile_sdk.vs2) binds: [B:33:0x0079, B:40:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r13v20 pfe) = (r13v6 pfe), (r13v23 pfe) binds: [B:33:0x0079, B:40:0x0093] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0139 -> B:39:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.vs2 r12, nt5 r13) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vs2.a(ads_mobile_sdk.vs2, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.aop
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.n13 r6, mt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.gs2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.gs2 r0 = (ads_mobile_sdk.gs2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L1a
        L13:
            ads_mobile_sdk.gs2 r0 = new ads_mobile_sdk.gs2
            nt5 r7 = (nt5) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L32
            pfe r5 = r0.c
            ads_mobile_sdk.n13 r6 = r0.b
            ads_mobile_sdk.vs2 r0 = r0.a
            defpackage.ybh.y(r7)
            r7 = r5
            r5 = r0
            goto L4c
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L38:
            defpackage.ybh.y(r7)
            r0.a = r5
            r0.b = r6
            pfe r7 = r5.e
            r0.c = r7
            r0.f = r3
            java.lang.Object r0 = r7.i(r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            ads_mobile_sdk.j13 r6 = r6.b     // Catch: java.lang.Throwable -> L5e
            ads_mobile_sdk.xv r6 = r6.b     // Catch: java.lang.Throwable -> L5e
            long r0 = r6.o     // Catch: java.lang.Throwable -> L5e
            r5.p = r0     // Catch: java.lang.Throwable -> L5e
            long r0 = r6.n     // Catch: java.lang.Throwable -> L5e
            r5.o = r0     // Catch: java.lang.Throwable -> L5e
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L5e
            r7.l(r4)
            return r5
        L5e:
            r5 = move-exception
            r7.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vs2.a(ads_mobile_sdk.n13, mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r10.i(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.uo2 r11, gdj r12, nt5 r13) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vs2.a(ads_mobile_sdk.uo2, gdj, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.llp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(mt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.hs2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.hs2 r0 = (ads_mobile_sdk.hs2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.hs2 r0 = new ads_mobile_sdk.hs2
            nt5 r6 = (nt5) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r5 = r0.b
            ads_mobile_sdk.vs2 r0 = r0.a
            defpackage.ybh.y(r6)
            goto L48
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L34:
            defpackage.ybh.y(r6)
            r0.a = r5
            pfe r6 = r5.e
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r0 = r5
            r5 = r6
        L48:
            r6 = 0
            r0.i = r6     // Catch: java.lang.Throwable -> L67
            r0.j = r6     // Catch: java.lang.Throwable -> L67
            r0.k = r3     // Catch: java.lang.Throwable -> L67
            long r1 = r0.b()     // Catch: java.lang.Throwable -> L67
            r0.m = r1     // Catch: java.lang.Throwable -> L67
            r0.n = r1     // Catch: java.lang.Throwable -> L67
            ynb r6 = r0.g     // Catch: java.lang.Throwable -> L67
            r6.B0()     // Catch: java.lang.Throwable -> L67
            ynb r6 = r0.h     // Catch: java.lang.Throwable -> L67
            r6.B0()     // Catch: java.lang.Throwable -> L67
            r5.l(r4)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L67:
            r6 = move-exception
            r5.l(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vs2.a(mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r10.invoke(r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[PHI: r9 r10
      0x003f: PHI (r9v6 s23) = (r9v1 s23), (r9v14 s23) binds: [B:29:0x008d, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r10v5 ads_mobile_sdk.vs2) = (r10v1 ads_mobile_sdk.vs2), (r10v11 ads_mobile_sdk.vs2) binds: [B:29:0x008d, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081 A[PHI: r9 r10
      0x0081: PHI (r9v1 s23) = (r9v2 s23), (r9v13 s23) binds: [B:27:0x007f, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r10v1 ads_mobile_sdk.vs2) = (r10v2 ads_mobile_sdk.vs2), (r10v10 ads_mobile_sdk.vs2) binds: [B:27:0x007f, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008d -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(s23 r10, nt5 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.ks2
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.ks2 r0 = (ads_mobile_sdk.ks2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.ks2 r0 = new ads_mobile_sdk.ks2
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L58
            if (r2 == r6) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L38
            if (r2 != r3) goto L32
            defpackage.ybh.y(r11)
            goto Laa
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r7
        L38:
            s23 r9 = r0.b
            ads_mobile_sdk.vs2 r10 = r0.a
            defpackage.ybh.y(r11)
        L3f:
            r8 = r10
            r10 = r9
            r9 = r8
            goto L90
        L43:
            s23 r9 = r0.b
            ads_mobile_sdk.vs2 r10 = r0.a
            defpackage.ybh.y(r11)
            goto L81
        L4b:
            pfe r9 = r0.c
            s23 r10 = r0.b
            ads_mobile_sdk.vs2 r2 = r0.a
            defpackage.ybh.y(r11)
            r11 = r9
            r9 = r10
            r10 = r2
            goto L6e
        L58:
            defpackage.ybh.y(r11)
        L5b:
            pfe r11 = r9.e
            r0.a = r9
            r0.b = r10
            r0.c = r11
            r0.f = r6
            java.lang.Object r2 = r11.i(r0)
            if (r2 == r1) goto La9
            r8 = r10
            r10 = r9
            r9 = r8
        L6e:
            ynb r2 = r10.g     // Catch: java.lang.Throwable -> Lb8
            r11.l(r7)
            r0.a = r10
            r0.b = r9
            r0.c = r7
            r0.f = r5
            java.lang.Object r11 = r2.Z(r0)
            if (r11 == r1) goto La9
        L81:
            pfe r11 = r10.e
            r0.a = r10
            r0.b = r9
            r0.f = r4
            java.lang.Object r11 = r11.i(r0)
            if (r11 != r1) goto L3f
            goto La9
        L90:
            boolean r11 = r9.i     // Catch: java.lang.Throwable -> Lb1
            pfe r2 = r9.e
            if (r11 != 0) goto Lad
            boolean r11 = r9.j     // Catch: java.lang.Throwable -> Lb1
            if (r11 != 0) goto Lad
            r2.l(r7)
            r0.a = r7
            r0.b = r7
            r0.f = r3
            java.lang.Object r9 = r10.invoke(r0)
            if (r9 != r1) goto Laa
        La9:
            return r1
        Laa:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        Lad:
            r2.l(r7)
            goto L5b
        Lb1:
            r10 = move-exception
            pfe r9 = r9.e
            r9.l(r7)
            throw r10
        Lb8:
            r9 = move-exception
            r11.l(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vs2.a(s23, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.llp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r6, mt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.is2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.is2 r0 = (ads_mobile_sdk.is2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.is2 r0 = new ads_mobile_sdk.is2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            boolean r6 = r0.c
            pfe r5 = r0.b
            ads_mobile_sdk.vs2 r0 = r0.a
            defpackage.ybh.y(r7)
            r7 = r5
            r5 = r0
            goto L4a
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L36:
            defpackage.ybh.y(r7)
            r0.a = r5
            pfe r7 = r5.e
            r0.b = r7
            r0.c = r6
            r0.f = r3
            java.lang.Object r0 = r7.i(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            boolean r0 = r5.i     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L5e
            boolean r0 = r5.j     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L5e
            ynb r0 = defpackage.o0g.e()     // Catch: java.lang.Throwable -> L6b
            r5.g = r0     // Catch: java.lang.Throwable -> L6b
            long r0 = r5.b()     // Catch: java.lang.Throwable -> L6b
            r5.l = r0     // Catch: java.lang.Throwable -> L6b
        L5e:
            if (r6 == 0) goto L63
            r5.i = r3     // Catch: java.lang.Throwable -> L6b
            goto L65
        L63:
            r5.j = r3     // Catch: java.lang.Throwable -> L6b
        L65:
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L6b
            r7.l(r4)
            return r5
        L6b:
            r5 = move-exception
            r7.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vs2.a(boolean, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[PHI: r13 r14 r15
      0x004f: PHI (r13v4 kotlin.jvm.functions.Function1) = (r13v7 kotlin.jvm.functions.Function1), (r13v13 kotlin.jvm.functions.Function1) binds: [B:26:0x007e, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r14v3 ads_mobile_sdk.vs2) = (r14v6 ads_mobile_sdk.vs2), (r14v11 ads_mobile_sdk.vs2) binds: [B:26:0x007e, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r15v6 java.lang.Object) = (r15v10 java.lang.Object), (r15v1 java.lang.Object) binds: [B:26:0x007e, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[PHI: r13 r14
      0x005e: PHI (r13v8 'this' ads_mobile_sdk.vs2) = 
      (r13v0 'this' ads_mobile_sdk.vs2 A[IMMUTABLE_TYPE, THIS])
      (r13v5 'this' ads_mobile_sdk.vs2)
      (r13v10 'this' ads_mobile_sdk.vs2)
     binds: [B:21:0x005b, B:29:0x008d, B:46:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r14v7 kotlin.jvm.functions.Function1) = (r14v0 kotlin.jvm.functions.Function1), (r14v4 kotlin.jvm.functions.Function1), (r14v9 kotlin.jvm.functions.Function1) binds: [B:21:0x005b, B:29:0x008d, B:46:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008d -> B:22:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ba -> B:50:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a$1(kotlin.jvm.functions.Function1 r14, nt5 r15) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vs2.a$1(kotlin.jvm.functions.Function1, nt5):java.lang.Object");
    }

    public final long b() {
        on7 on7Var = pn7.b;
        this.b.getClass();
        return cs5.y0(SystemClock.elapsedRealtime(), un7.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.llp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r6, mt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.js2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.js2 r0 = (ads_mobile_sdk.js2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.js2 r0 = new ads_mobile_sdk.js2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            boolean r6 = r0.c
            pfe r5 = r0.b
            ads_mobile_sdk.vs2 r0 = r0.a
            defpackage.ybh.y(r7)
            r7 = r5
            r5 = r0
            goto L4a
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L36:
            defpackage.ybh.y(r7)
            r0.a = r5
            pfe r7 = r5.e
            r0.b = r7
            r0.c = r6
            r0.f = r3
            java.lang.Object r0 = r7.i(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r0 = 0
            if (r6 == 0) goto L50
            r5.i = r0     // Catch: java.lang.Throwable -> L87
            goto L52
        L50:
            r5.j = r0     // Catch: java.lang.Throwable -> L87
        L52:
            boolean r6 = r5.i     // Catch: java.lang.Throwable -> L87
            if (r6 != 0) goto L81
            boolean r6 = r5.j     // Catch: java.lang.Throwable -> L87
            if (r6 != 0) goto L81
            ynb r6 = r5.g     // Catch: java.lang.Throwable -> L87
            boolean r6 = r6.h0()     // Catch: java.lang.Throwable -> L87
            if (r6 != 0) goto L81
            long r0 = r5.b()     // Catch: java.lang.Throwable -> L87
            long r2 = r5.l     // Catch: java.lang.Throwable -> L87
            long r0 = pn7.l(r0, r2)     // Catch: java.lang.Throwable -> L87
            long r2 = r5.n     // Catch: java.lang.Throwable -> L87
            long r2 = pn7.m(r2, r0)     // Catch: java.lang.Throwable -> L87
            r5.n = r2     // Catch: java.lang.Throwable -> L87
            long r2 = r5.m     // Catch: java.lang.Throwable -> L87
            long r0 = pn7.m(r2, r0)     // Catch: java.lang.Throwable -> L87
            r5.m = r0     // Catch: java.lang.Throwable -> L87
            ynb r5 = r5.g     // Catch: java.lang.Throwable -> L87
            r5.B0()     // Catch: java.lang.Throwable -> L87
        L81:
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L87
            r7.l(r4)
            return r5
        L87:
            r5 = move-exception
            r7.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vs2.b(boolean, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(mt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.zr2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.zr2 r0 = (ads_mobile_sdk.zr2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.zr2 r0 = new ads_mobile_sdk.zr2
            nt5 r6 = (nt5) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            pfe r5 = r0.b
            ads_mobile_sdk.vs2 r0 = r0.a
            defpackage.ybh.y(r6)
            r6 = r5
            r5 = r0
            goto L48
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L36:
            defpackage.ybh.y(r6)
            r0.a = r5
            pfe r6 = r5.e
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            d3k r0 = r5.f     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L4f
            r0.k(r4)     // Catch: java.lang.Throwable -> L57
        L4f:
            r5.j = r3     // Catch: java.lang.Throwable -> L57
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L57
            r6.l(r4)
            return r5
        L57:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vs2.c(mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:17:0x004a, B:19:0x0065, B:22:0x0076, B:27:0x0099, B:29:0x00b2, B:23:0x007f, B:25:0x008d, B:26:0x0097, B:28:0x00a8), top: B:35:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r8, nt5 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.as2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.as2 r0 = (ads_mobile_sdk.as2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.as2 r0 = new ads_mobile_sdk.as2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            boolean r8 = r0.c
            pfe r7 = r0.b
            ads_mobile_sdk.vs2 r0 = r0.a
            defpackage.ybh.y(r9)
            r9 = r7
            r7 = r0
            goto L4a
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r4
        L36:
            defpackage.ybh.y(r9)
            r0.a = r7
            pfe r9 = r7.e
            r0.b = r9
            r0.c = r8
            r0.f = r3
            java.lang.Object r0 = r9.i(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            long r0 = r7.b()     // Catch: java.lang.Throwable -> Lb8
            ads_mobile_sdk.qr0 r2 = r7.c     // Catch: java.lang.Throwable -> Lb8
            r2.getClass()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r3 = "gads:proactive_banner_refresh:enabled"
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lb8
            ads_mobile_sdk.fo r6 = ads_mobile_sdk.fo.a     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r2 = r2.a(r3, r5, r6)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lb8
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto La8
            long r2 = r7.p     // Catch: java.lang.Throwable -> Lb8
            on7 r5 = pn7.b     // Catch: java.lang.Throwable -> Lb8
            r5.getClass()     // Catch: java.lang.Throwable -> Lb8
            r5 = 0
            int r2 = pn7.c(r2, r5)     // Catch: java.lang.Throwable -> Lb8
            if (r2 <= 0) goto La8
            if (r8 == 0) goto L7f
            long r2 = r7.p     // Catch: java.lang.Throwable -> Lb8
            long r0 = pn7.m(r0, r2)     // Catch: java.lang.Throwable -> Lb8
            r7.m = r0     // Catch: java.lang.Throwable -> Lb8
            goto L99
        L7f:
            long r2 = r7.n     // Catch: java.lang.Throwable -> Lb8
            long r2 = pn7.l(r0, r2)     // Catch: java.lang.Throwable -> Lb8
            long r5 = r7.p     // Catch: java.lang.Throwable -> Lb8
            int r8 = pn7.c(r2, r5)     // Catch: java.lang.Throwable -> Lb8
            if (r8 >= 0) goto L97
            long r5 = r7.p     // Catch: java.lang.Throwable -> Lb8
            long r0 = pn7.m(r0, r5)     // Catch: java.lang.Throwable -> Lb8
            long r0 = pn7.l(r0, r2)     // Catch: java.lang.Throwable -> Lb8
        L97:
            r7.m = r0     // Catch: java.lang.Throwable -> Lb8
        L99:
            long r2 = r7.o     // Catch: java.lang.Throwable -> Lb8
            long r0 = pn7.m(r0, r2)     // Catch: java.lang.Throwable -> Lb8
            long r2 = r7.p     // Catch: java.lang.Throwable -> Lb8
            long r0 = pn7.l(r0, r2)     // Catch: java.lang.Throwable -> Lb8
            r7.n = r0     // Catch: java.lang.Throwable -> Lb8
            goto Lb2
        La8:
            long r2 = r7.o     // Catch: java.lang.Throwable -> Lb8
            long r0 = pn7.m(r0, r2)     // Catch: java.lang.Throwable -> Lb8
            r7.n = r0     // Catch: java.lang.Throwable -> Lb8
            r7.m = r0     // Catch: java.lang.Throwable -> Lb8
        Lb2:
            kotlin.Unit r7 = kotlin.Unit.a     // Catch: java.lang.Throwable -> Lb8
            r9.l(r4)
            return r7
        Lb8:
            r7 = move-exception
            r9.l(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vs2.c(boolean, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #0 {all -> 0x0094, blocks: (B:27:0x0070, B:29:0x0075), top: B:50:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(mt5 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.qs2
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.qs2 r0 = (ads_mobile_sdk.qs2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.qs2 r0 = new ads_mobile_sdk.qs2
            nt5 r8 = (nt5) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L48
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L30
            defpackage.ybh.y(r8)
            return r8
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r6
        L36:
            pfe r7 = r0.b
            ads_mobile_sdk.vs2 r2 = r0.a
            defpackage.ybh.y(r8)
            goto L70
        L3e:
            pfe r7 = r0.b
            ads_mobile_sdk.vs2 r2 = r0.a
            defpackage.ybh.y(r8)
            r8 = r7
            r7 = r2
            goto L59
        L48:
            defpackage.ybh.y(r8)
            r0.a = r7
            pfe r8 = r7.e
            r0.b = r8
            r0.e = r5
            java.lang.Object r2 = r8.i(r0)
            if (r2 == r1) goto L90
        L59:
            boolean r2 = r7.k     // Catch: java.lang.Throwable -> L9e
            r8.l(r6)
            if (r2 != 0) goto L99
            pfe r8 = r7.e
            r0.a = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r2 = r8.i(r0)
            if (r2 == r1) goto L90
            r2 = r7
            r7 = r8
        L70:
            boolean r8 = r2.i     // Catch: java.lang.Throwable -> L94
            r4 = 0
            if (r8 != 0) goto L79
            boolean r8 = r2.j     // Catch: java.lang.Throwable -> L94
            if (r8 == 0) goto L7a
        L79:
            r5 = r4
        L7a:
            r7.l(r6)
            if (r5 == 0) goto L92
            ads_mobile_sdk.uo2 r7 = r2.d
            if (r7 != 0) goto L84
            r7 = r6
        L84:
            r0.a = r6
            r0.b = r6
            r0.e = r3
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r1) goto L91
        L90:
            return r1
        L91:
            return r7
        L92:
            r5 = r4
            goto L99
        L94:
            r8 = move-exception
            r7.l(r6)
            throw r8
        L99:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L9e:
            r7 = move-exception
            r8.l(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vs2.d(mt5):java.lang.Object");
    }
}
