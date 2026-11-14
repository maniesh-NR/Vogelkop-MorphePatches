package ads_mobile_sdk;

import android.os.Bundle;
import com.google.android.gms.ads.AdError;
import defpackage.aop;
import defpackage.mip;
import defpackage.nsd;
import defpackage.prb;
import defpackage.r7p;
import defpackage.wpb;
import defpackage.xzh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

/* loaded from: classes.dex */
public final class j71 implements aop, r7p {
    public final d91 a;
    public final av2 b;
    public final Optional c;
    public final String d;
    public final boolean e;
    public final mip f;
    public final m5a g;
    public String h;
    public boolean k;
    public boolean l;
    public av0 s;
    public xzh t;
    public long u;
    public volatile boolean v;
    public final pfe i = new pfe();
    public b71 j = b71.a;
    public prb m = new prb();
    public String n = "";
    public String o = "";
    public String p = "";
    public prb q = new prb();
    public prb r = new prb();

    public j71(d91 d91Var, av2 av2Var, Optional optional, String str, boolean z, mip mipVar, m5a m5aVar) {
        this.a = d91Var;
        this.b = av2Var;
        this.c = optional;
        this.d = str;
        this.e = z;
        this.f = mipVar;
        this.g = m5aVar;
        pn7.b.getClass();
        this.u = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (ads_mobile_sdk.d91.d(r7, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.j71 r7, ads_mobile_sdk.av0 r8, defpackage.xzh r9, nt5 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.d71
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.d71 r0 = (ads_mobile_sdk.d71) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.d71 r0 = new ads_mobile_sdk.d71
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            defpackage.ybh.y(r10)
            goto Laa
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r6
        L35:
            ads_mobile_sdk.j71 r7 = r0.a
            defpackage.ybh.y(r10)
            goto L9a
        L3b:
            pfe r7 = r0.d
            xzh r9 = r0.c
            ads_mobile_sdk.av0 r8 = r0.b
            ads_mobile_sdk.j71 r2 = r0.a
            defpackage.ybh.y(r10)
            r10 = r7
            r7 = r2
            goto L65
        L49:
            defpackage.ybh.y(r10)
            boolean r10 = r7.v
            if (r10 != 0) goto L53
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L53:
            pfe r10 = r7.i
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r0.d = r10
            r0.g = r5
            java.lang.Object r2 = r10.i(r0)
            if (r2 == r1) goto La9
        L65:
            ads_mobile_sdk.b71 r2 = ads_mobile_sdk.b71.c     // Catch: java.lang.Throwable -> Lad
            r7.j = r2     // Catch: java.lang.Throwable -> Lad
            r7.s = r8     // Catch: java.lang.Throwable -> Lad
            r7.t = r9     // Catch: java.lang.Throwable -> Lad
            on7 r8 = pn7.b     // Catch: java.lang.Throwable -> Lad
            mip r8 = r7.f     // Catch: java.lang.Throwable -> Lad
            r8.getClass()     // Catch: java.lang.Throwable -> Lad
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lad
            un7 r2 = un7.d     // Catch: java.lang.Throwable -> Lad
            long r8 = defpackage.cs5.y0(r8, r2)     // Catch: java.lang.Throwable -> Lad
            r7.u = r8     // Catch: java.lang.Throwable -> Lad
            r10.l(r6)
            ads_mobile_sdk.d91 r8 = r7.a
            java.lang.String r9 = r7.h
            if (r9 != 0) goto L8a
            r9 = r6
        L8a:
            r0.a = r7
            r0.b = r6
            r0.c = r6
            r0.d = r6
            r0.g = r4
            java.lang.Object r8 = r8.a(r9, r7, r0)
            if (r8 == r1) goto La9
        L9a:
            ads_mobile_sdk.d91 r7 = r7.a
            r0.a = r6
            r0.g = r3
            r7.getClass()
            java.lang.Object r7 = ads_mobile_sdk.d91.d(r7, r0)
            if (r7 != r1) goto Laa
        La9:
            return r1
        Laa:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        Lad:
            r7 = move-exception
            r10.l(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.j71.a(ads_mobile_sdk.j71, ads_mobile_sdk.av0, xzh, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:13:0x002d, B:28:0x009b, B:30:0x00a3, B:32:0x00b2, B:31:0x00b0), top: B:41:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:13:0x002d, B:28:0x009b, B:30:0x00a3, B:32:0x00b2, B:31:0x00b0), top: B:41:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.j71 r9, ads_mobile_sdk.n13 r10, nt5 r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof ads_mobile_sdk.f71
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.f71 r0 = (ads_mobile_sdk.f71) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.f71 r0 = new ads_mobile_sdk.f71
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            pfe r9 = r0.c
            ads_mobile_sdk.n13 r10 = r0.b
            ads_mobile_sdk.j71 r0 = r0.a
            defpackage.ybh.y(r11)     // Catch: java.lang.Throwable -> Lb8
            goto L9b
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r5
        L37:
            pfe r9 = r0.c
            ads_mobile_sdk.n13 r10 = r0.b
            ads_mobile_sdk.j71 r2 = r0.a
            defpackage.ybh.y(r11)
            r11 = r9
            r9 = r2
            goto L5d
        L43:
            defpackage.ybh.y(r11)
            boolean r11 = r9.v
            if (r11 != 0) goto L4d
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L4d:
            pfe r11 = r9.i
            r0.a = r9
            r0.b = r10
            r0.c = r11
            r0.f = r4
            java.lang.Object r2 = r11.i(r0)
            if (r2 == r1) goto L96
        L5d:
            ads_mobile_sdk.j13 r2 = r10.b     // Catch: java.lang.Throwable -> Lba
            ads_mobile_sdk.xv r2 = r2.b     // Catch: java.lang.Throwable -> Lba
            prb r6 = r2.f     // Catch: java.lang.Throwable -> Lba
            r9.m = r6     // Catch: java.lang.Throwable -> Lba
            java.lang.String r6 = r2.c     // Catch: java.lang.Throwable -> Lba
            r9.n = r6     // Catch: java.lang.Throwable -> Lba
            java.lang.String r6 = r2.b     // Catch: java.lang.Throwable -> Lba
            r9.p = r6     // Catch: java.lang.Throwable -> Lba
            prb r6 = r2.i     // Catch: java.lang.Throwable -> Lba
            r9.q = r6     // Catch: java.lang.Throwable -> Lba
            ads_mobile_sdk.d91 r6 = r9.a     // Catch: java.lang.Throwable -> Lba
            prb r2 = r2.e     // Catch: java.lang.Throwable -> Lba
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lba
            int r2 = r2.length()     // Catch: java.lang.Throwable -> Lba
            ads_mobile_sdk.j13 r7 = r10.b     // Catch: java.lang.Throwable -> Lba
            ads_mobile_sdk.xv r7 = r7.b     // Catch: java.lang.Throwable -> Lba
            java.lang.String r7 = r7.d     // Catch: java.lang.Throwable -> Lba
            int r7 = r7.length()     // Catch: java.lang.Throwable -> Lba
            int r2 = r2 + r7
            r0.a = r9     // Catch: java.lang.Throwable -> Lba
            r0.b = r10     // Catch: java.lang.Throwable -> Lba
            r0.c = r11     // Catch: java.lang.Throwable -> Lba
            r0.f = r3     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r0 = r6.a(r2, r0)     // Catch: java.lang.Throwable -> Lba
            if (r0 != r1) goto L97
        L96:
            return r1
        L97:
            r8 = r0
            r0 = r9
            r9 = r11
            r11 = r8
        L9b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Lb8
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Lb8
            if (r11 == 0) goto Lb0
            ads_mobile_sdk.j13 r10 = r10.b     // Catch: java.lang.Throwable -> Lb8
            ads_mobile_sdk.xv r10 = r10.b     // Catch: java.lang.Throwable -> Lb8
            prb r11 = r10.e     // Catch: java.lang.Throwable -> Lb8
            r0.r = r11     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r10 = r10.d     // Catch: java.lang.Throwable -> Lb8
            r0.o = r10     // Catch: java.lang.Throwable -> Lb8
            goto Lb2
        Lb0:
            r0.k = r4     // Catch: java.lang.Throwable -> Lb8
        Lb2:
            kotlin.Unit r10 = kotlin.Unit.a     // Catch: java.lang.Throwable -> Lb8
            r9.l(r5)
            return r10
        Lb8:
            r10 = move-exception
            goto Lbc
        Lba:
            r10 = move-exception
            r9 = r11
        Lbc:
            r9.l(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.j71.a(ads_mobile_sdk.j71, ads_mobile_sdk.n13, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.j71 r5, mt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.c71
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.c71 r0 = (ads_mobile_sdk.c71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.c71 r0 = new ads_mobile_sdk.c71
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
            ads_mobile_sdk.j71 r0 = r0.a
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
            pfe r6 = r5.i
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r5.l = r3     // Catch: java.lang.Throwable -> L4e
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L4e
            r6.l(r4)
            return r5
        L4e:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.j71.a(ads_mobile_sdk.j71, mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        if (ads_mobile_sdk.d91.d(r9, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.j71 r9, defpackage.xzh r10, nt5 r11) {
        /*
            boolean r0 = r11 instanceof ads_mobile_sdk.e71
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.e71 r0 = (ads_mobile_sdk.e71) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.e71 r0 = new ads_mobile_sdk.e71
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            defpackage.ybh.y(r11)
            goto La2
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r6
        L35:
            ads_mobile_sdk.j71 r9 = r0.a
            defpackage.ybh.y(r11)
            goto L92
        L3b:
            pfe r9 = r0.c
            xzh r10 = r0.b
            ads_mobile_sdk.j71 r2 = r0.a
            defpackage.ybh.y(r11)
            r11 = r9
            r9 = r2
            goto L61
        L47:
            defpackage.ybh.y(r11)
            boolean r11 = r9.v
            if (r11 != 0) goto L51
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L51:
            pfe r11 = r9.i
            r0.a = r9
            r0.b = r10
            r0.c = r11
            r0.f = r5
            java.lang.Object r2 = r11.i(r0)
            if (r2 == r1) goto La1
        L61:
            ads_mobile_sdk.b71 r2 = ads_mobile_sdk.b71.b     // Catch: java.lang.Throwable -> La5
            r9.j = r2     // Catch: java.lang.Throwable -> La5
            r9.t = r10     // Catch: java.lang.Throwable -> La5
            on7 r10 = pn7.b     // Catch: java.lang.Throwable -> La5
            mip r10 = r9.f     // Catch: java.lang.Throwable -> La5
            r10.getClass()     // Catch: java.lang.Throwable -> La5
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La5
            un7 r10 = un7.d     // Catch: java.lang.Throwable -> La5
            long r7 = defpackage.cs5.y0(r7, r10)     // Catch: java.lang.Throwable -> La5
            r9.u = r7     // Catch: java.lang.Throwable -> La5
            r11.l(r6)
            ads_mobile_sdk.d91 r10 = r9.a
            java.lang.String r11 = r9.h
            if (r11 != 0) goto L84
            r11 = r6
        L84:
            r0.a = r9
            r0.b = r6
            r0.c = r6
            r0.f = r4
            java.lang.Object r10 = r10.a(r11, r9, r0)
            if (r10 == r1) goto La1
        L92:
            ads_mobile_sdk.d91 r9 = r9.a
            r0.a = r6
            r0.f = r3
            r9.getClass()
            java.lang.Object r9 = ads_mobile_sdk.d91.d(r9, r0)
            if (r9 != r1) goto La2
        La1:
            return r1
        La2:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        La5:
            r9 = move-exception
            r11.l(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.j71.a(ads_mobile_sdk.j71, xzh, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.j71 r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.g71
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.g71 r0 = (ads_mobile_sdk.g71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.g71 r0 = new ads_mobile_sdk.g71
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            java.lang.String r5 = r0.b
            ads_mobile_sdk.j71 r0 = r0.a
            defpackage.ybh.y(r6)
            goto L57
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L32:
            defpackage.ybh.y(r6)
            java.util.Optional r6 = r5.c
            java.lang.Object r6 = r6.orElse(r3)
            r83 r6 = (defpackage.r83) r6
            if (r6 == 0) goto L43
            java.lang.String r3 = r6.m()
        L43:
            ads_mobile_sdk.d91 r6 = r5.a
            r0.a = r5
            r0.b = r3
            r0.e = r4
            r6.getClass()
            java.lang.Object r6 = ads_mobile_sdk.d91.a(r6, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            r0 = r5
            r5 = r3
        L57:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L65
            if (r5 == 0) goto L65
            r0.h = r5
            r0.v = r4
        L65:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.j71.b(ads_mobile_sdk.j71, nt5):java.lang.Object");
    }

    @Override // defpackage.r7p
    public final Object a(av0 av0Var, xzh xzhVar, mt5 mt5Var) {
        return a(this, av0Var, xzhVar, (nt5) mt5Var);
    }

    @Override // defpackage.r7p
    public final Object a(n13 n13Var, a2 a2Var, xzh xzhVar, mt5 mt5Var) {
        return a(this, xzhVar, (nt5) mt5Var);
    }

    @Override // defpackage.aop
    public final Object a(n13 n13Var, mt5 mt5Var) {
        return a(this, n13Var, (nt5) mt5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(mt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.h71
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.h71 r0 = (ads_mobile_sdk.h71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.h71 r0 = new ads_mobile_sdk.h71
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
            ads_mobile_sdk.j71 r0 = r0.a
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
            pfe r6 = r5.i
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            ads_mobile_sdk.b71 r5 = r5.j     // Catch: java.lang.Throwable -> L57
            ads_mobile_sdk.b71 r0 = ads_mobile_sdk.b71.a     // Catch: java.lang.Throwable -> L57
            if (r5 != r0) goto L4f
            r3 = 0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L57
            r6.l(r4)
            return r5
        L57:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.j71.a(mt5):java.lang.Object");
    }

    public final prb a(xzh xzhVar) {
        prb prbVar;
        prb prbVar2;
        prb prbVar3 = new prb();
        prbVar3.r("winningAdapterClassName", xzhVar.getAdapterClassName());
        long j = this.u;
        on7 on7Var = pn7.b;
        prbVar3.p(Long.valueOf(pn7.p(j, un7.e)), "responseSecsSinceEpoch");
        prbVar3.r("responseId", xzhVar.getResponseId());
        prbVar3.r("adRequestUrl", this.n);
        prbVar3.r("postBody", this.p);
        prbVar3.r("adResponseBody", this.o);
        prbVar3.q("hasExceededMemoryLimit", Boolean.valueOf(this.k));
        prbVar3.o("adResponseHeaders", this.r);
        prbVar3.o("transactionExtras", this.q);
        prbVar3.o("biddingData", this.m);
        wpb wpbVar = new wpb();
        Iterator it = xzhVar.getAdSourceResponses().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            prbVar = mrb.a;
            if (!zHasNext) {
                break;
            }
            defpackage.hq hqVar = (defpackage.hq) it.next();
            prb prbVar4 = new prb();
            prbVar4.r("adapterClassName", hqVar.getAdapterClassName());
            prbVar4.p(Long.valueOf(hqVar.getLatencyMillis()), "latencyMillis");
            Bundle credentials = hqVar.getCredentials();
            try {
                m5a m5aVar = this.g;
                prbVar2 = (prb) m5aVar.b(prb.class, m5aVar.g(credentials));
            } catch (Exception e) {
                ArrayList arrayList = w8h.a(e).s;
                String message = e.getMessage();
                if (message == null) {
                    message = e.getClass().getName();
                }
                arrayList.add(message);
                prbVar2 = null;
            }
            if (prbVar2 == null) {
                prbVar2 = new prb();
            }
            prbVar4.o("credentials", prbVar2);
            nsd adError = hqVar.getAdError();
            if (adError != null) {
                prb prbVar5 = new prb();
                prbVar5.r("errorDomain", adError.getDomain());
                prbVar5.p(adError.E(), "errorCode");
                prbVar5.r("errorDescription", adError.getMessage());
                prbVar5.o("underlyingError", prbVar);
                prbVar = prbVar5;
            }
            prbVar4.o("error", prbVar);
            wpbVar.o(prbVar4);
        }
        prbVar3.o("adNetworks", wpbVar);
        av0 av0Var = this.s;
        if (xzhVar.getAdSourceResponses().isEmpty() && av0Var != null) {
            wpb wpbVar2 = new wpb();
            prb prbVar6 = new prb();
            prbVar6.r("errorDomain", AdError.GOOGLE_MOBILE_ADS_DOMAIN);
            prbVar6.r("errorCode", av0Var.a().a().name());
            prbVar6.r("errorDescription", dyg.b(av0Var));
            prbVar6.o("underlyingError", prbVar);
            wpbVar2.o(prbVar6);
            prbVar3.o("errors", wpbVar2);
        }
        return prbVar3;
    }

    @Override // defpackage.aop
    public final Object b(mt5 mt5Var) {
        return b(this, (nt5) mt5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(mt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.i71
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.i71 r0 = (ads_mobile_sdk.i71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.i71 r0 = new ads_mobile_sdk.i71
            nt5 r7 = (nt5) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            pfe r6 = r0.b
            ads_mobile_sdk.j71 r0 = r0.a
            defpackage.ybh.y(r7)
            r7 = r6
            r6 = r0
            goto L48
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r4
        L36:
            defpackage.ybh.y(r7)
            r0.a = r6
            pfe r7 = r6.i
            r0.b = r7
            r0.e = r3
            java.lang.Object r0 = r7.i(r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            prb r0 = new prb     // Catch: java.lang.Throwable -> L90
            r0.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = "state"
            ads_mobile_sdk.b71 r2 = r6.j     // Catch: java.lang.Throwable -> L90
            boolean r3 = r6.e     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = r2.name()     // Catch: java.lang.Throwable -> L90
            r0.r(r1, r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = "format"
            ads_mobile_sdk.av2 r2 = r6.b     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = r2.a     // Catch: java.lang.Throwable -> L90
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = r2.toUpperCase(r5)     // Catch: java.lang.Throwable -> L90
            r0.r(r1, r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = "isOutOfContext"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L90
            r0.q(r1, r2)     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L7f
            java.lang.String r1 = "shown"
            boolean r2 = r6.l     // Catch: java.lang.Throwable -> L90
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L90
            r0.q(r1, r2)     // Catch: java.lang.Throwable -> L90
        L7f:
            xzh r1 = r6.t     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L8c
            java.lang.String r2 = "responseInfo"
            prb r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L90
            r0.o(r2, r6)     // Catch: java.lang.Throwable -> L90
        L8c:
            r7.l(r4)
            return r0
        L90:
            r6 = move-exception
            r7.l(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.j71.c(mt5):java.lang.Object");
    }
}
