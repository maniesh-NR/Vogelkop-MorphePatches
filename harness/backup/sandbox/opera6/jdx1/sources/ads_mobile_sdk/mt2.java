package ads_mobile_sdk;

import defpackage.fsg;
import defpackage.j3p;
import defpackage.mip;
import java.util.ArrayList;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class mt2 {
    public final nx5 a;
    public final mip b;
    public final tv2 c;
    public final zm1 d;
    public final j3p e;
    public final i8 f;
    public final int g;
    public long h;
    public n13 i;
    public final pfe j;
    public et2[] k;

    public mt2(nx5 nx5Var, mip mipVar, tv2 tv2Var, zm1 zm1Var, j3p j3pVar, i8 i8Var, int i) {
        this.a = nx5Var;
        this.b = mipVar;
        this.c = tv2Var;
        this.d = zm1Var;
        this.e = j3pVar;
        this.f = i8Var;
        this.g = i;
        pn7.b.getClass();
        this.h = 0L;
        this.j = new pfe();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.mt2 r12, nt5 r13) {
        /*
            boolean r0 = r13 instanceof ads_mobile_sdk.ft2
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.ft2 r0 = (ads_mobile_sdk.ft2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ft2 r0 = new ads_mobile_sdk.ft2
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r12 = r0.b
            ads_mobile_sdk.mt2 r0 = r0.a
            defpackage.ybh.y(r13)
            r13 = r12
            r12 = r0
            goto L46
        L2e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r12)
            return r4
        L34:
            defpackage.ybh.y(r13)
            pfe r13 = r12.j
            r0.a = r12
            r0.b = r13
            r0.e = r3
            java.lang.Object r0 = r13.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            ads_mobile_sdk.et2[] r12 = r12.k     // Catch: java.lang.Throwable -> L5f
            if (r12 != 0) goto L4b
            r12 = r4
        L4b:
            java.util.List r5 = e82.p(r12)     // Catch: java.lang.Throwable -> L5f
            r13.l(r4)
            r10 = 0
            r11 = 62
            java.lang.String r6 = "_"
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r12 = kotlin.collections.CollectionsKt.P(r5, r6, r7, r8, r9, r10, r11)
            return r12
        L5f:
            r0 = move-exception
            r12 = r0
            r13.l(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mt2.a(ads_mobile_sdk.mt2, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r6, ads_mobile_sdk.a2 r8, nt5 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.lt2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.lt2 r0 = (ads_mobile_sdk.lt2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.lt2 r0 = new ads_mobile_sdk.lt2
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L32
            long r6 = r0.d
            pfe r5 = r0.c
            ads_mobile_sdk.a2 r8 = r0.b
            ads_mobile_sdk.mt2 r0 = r0.a
            defpackage.ybh.y(r9)
            r9 = r5
            r5 = r0
            goto L4e
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L38:
            defpackage.ybh.y(r9)
            r0.a = r5
            r0.b = r8
            pfe r9 = r5.j
            r0.c = r9
            r0.d = r6
            r0.g = r3
            java.lang.Object r0 = r9.i(r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            int r8 = r8.w     // Catch: java.lang.Throwable -> L7e
            int r8 = r8 + r3
            ads_mobile_sdk.et2[] r0 = r5.k     // Catch: java.lang.Throwable -> L7e
            if (r0 != 0) goto L56
            r0 = r4
        L56:
            int r0 = r0.length     // Catch: java.lang.Throwable -> L7e
        L57:
            if (r8 >= r0) goto L78
            ads_mobile_sdk.et2[] r1 = r5.k     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L5e
            r1 = r4
        L5e:
            r1 = r1[r8]     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L65
            ads_mobile_sdk.rm0 r2 = r1.b     // Catch: java.lang.Throwable -> L7e
            goto L66
        L65:
            r2 = r4
        L66:
            ads_mobile_sdk.rm0 r3 = ads_mobile_sdk.rm0.FILL     // Catch: java.lang.Throwable -> L7e
            if (r2 != r3) goto L75
            ads_mobile_sdk.rm0 r2 = ads_mobile_sdk.rm0.RENDERED_BUT_LOST     // Catch: java.lang.Throwable -> L7e
            r1.b = r2     // Catch: java.lang.Throwable -> L7e
            ads_mobile_sdk.a2 r1 = r1.a     // Catch: java.lang.Throwable -> L7e
            java.util.ArrayList r2 = r1.R     // Catch: java.lang.Throwable -> L7e
            r5.a(r2, r1, r6)     // Catch: java.lang.Throwable -> L7e
        L75:
            int r8 = r8 + 1
            goto L57
        L78:
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L7e
            r9.l(r4)
            return r5
        L7e:
            r5 = move-exception
            r9.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mt2.a(long, ads_mobile_sdk.a2, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.a2 r12, nt5 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ads_mobile_sdk.kt2
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.kt2 r0 = (ads_mobile_sdk.kt2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.kt2 r0 = new ads_mobile_sdk.kt2
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L31
            pfe r11 = r0.c
            ads_mobile_sdk.a2 r12 = r0.b
            ads_mobile_sdk.mt2 r0 = r0.a
            defpackage.ybh.y(r13)
            r13 = r11
            r11 = r0
        L2f:
            r6 = r12
            goto L4b
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            return r4
        L37:
            defpackage.ybh.y(r13)
            r0.a = r11
            r0.b = r12
            pfe r13 = r11.j
            r0.c = r13
            r0.f = r3
            java.lang.Object r0 = r13.i(r0)
            if (r0 != r1) goto L2f
            return r1
        L4b:
            ads_mobile_sdk.et2[] r11 = r11.k     // Catch: java.lang.Throwable -> L6b
            if (r11 != 0) goto L50
            r11 = r4
        L50:
            int r12 = r6.w     // Catch: java.lang.Throwable -> L6b
            ads_mobile_sdk.et2 r5 = new ads_mobile_sdk.et2     // Catch: java.lang.Throwable -> L6b
            ioj r0 = ads_mobile_sdk.rm0.b     // Catch: java.lang.Throwable -> L6b
            on7 r0 = pn7.b     // Catch: java.lang.Throwable -> L6b
            r0.getClass()     // Catch: java.lang.Throwable -> L6b
            ads_mobile_sdk.rm0 r7 = ads_mobile_sdk.rm0.INFLIGHT     // Catch: java.lang.Throwable -> L6b
            r10 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L6b
            r11[r12] = r5     // Catch: java.lang.Throwable -> L6b
            kotlin.Unit r11 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L6b
            r13.l(r4)
            return r11
        L6b:
            r0 = move-exception
            r11 = r0
            r13.l(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mt2.a(ads_mobile_sdk.a2, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.n13 r11, nt5 r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mt2.a(ads_mobile_sdk.n13, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0 A[Catch: all -> 0x018e, TryCatch #1 {all -> 0x018e, blocks: (B:26:0x00a6, B:29:0x00ab, B:31:0x00b0, B:33:0x00b4, B:35:0x00b8, B:37:0x00bc, B:40:0x00c2), top: B:86:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2 A[Catch: all -> 0x018e, TRY_LEAVE, TryCatch #1 {all -> 0x018e, blocks: (B:26:0x00a6, B:29:0x00ab, B:31:0x00b0, B:33:0x00b4, B:35:0x00b8, B:37:0x00bc, B:40:0x00c2), top: B:86:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00bf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r17) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mt2.a(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.rap r16, ads_mobile_sdk.a2 r17, long r18, nt5 r20) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mt2.a(rap, ads_mobile_sdk.a2, long, nt5):java.lang.Object");
    }

    public final void a(ArrayList arrayList, a2 a2Var, long j) {
        n13 n13Var = this.i;
        mt5 mt5Var = null;
        if (n13Var == null) {
            n13Var = null;
        }
        if (n13Var.c) {
            return;
        }
        defpackage.na2.B(this.a, h.a, null, new fsg(new it2(this, arrayList, a2Var, j, null), mt5Var, (byte) 3), 2);
    }
}
