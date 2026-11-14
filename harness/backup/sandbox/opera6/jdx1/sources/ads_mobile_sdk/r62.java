package ads_mobile_sdk;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import defpackage.m7p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class r62 extends k8 implements m7p {
    public final nx5 c;
    public final a2 d;
    public final s52 e;
    public final sy0 f;
    public final f72 g;
    public final pfe h;
    public q6 i;
    public final List j;

    public r62(CoroutineContext coroutineContext, nx5 nx5Var, a2 a2Var, s52 s52Var, sy0 sy0Var, f72 f72Var, qr0 qr0Var) {
        super(qr0Var, coroutineContext);
        this.c = nx5Var;
        this.d = a2Var;
        this.e = s52Var;
        this.f = sy0Var;
        this.g = f72Var;
        this.h = new pfe();
        this.j = Collections.synchronizedList(new ArrayList());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.r62 r10, android.view.ViewGroup r11, ads_mobile_sdk.fs0 r12, nt5 r13) {
        /*
            boolean r0 = r13 instanceof ads_mobile_sdk.d62
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.d62 r0 = (ads_mobile_sdk.d62) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.d62 r0 = new ads_mobile_sdk.d62
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            defpackage.ybh.y(r13)
            return r13
        L2a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            r10 = 0
            return r10
        L31:
            ads_mobile_sdk.fs0 r12 = r0.c
            android.view.ViewGroup r11 = r0.b
            ads_mobile_sdk.r62 r10 = r0.a
            defpackage.ybh.y(r13)
        L3a:
            r5 = r10
            r6 = r11
            r7 = r12
            goto L55
        L3e:
            defpackage.ybh.y(r13)
            ads_mobile_sdk.f72 r13 = r10.g
            r0.a = r10
            r0.b = r11
            r0.c = r12
            r0.g = r4
            r13.getClass()
            java.lang.Object r13 = ads_mobile_sdk.f72.a(r13, r0)
            if (r13 != r1) goto L3a
            goto L73
        L55:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r10 = r13.booleanValue()
            if (r10 == 0) goto L75
            k50 r4 = new k50
            r9 = 16
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r0.a = r8
            r0.b = r8
            r0.c = r8
            r0.g = r3
            java.lang.Object r10 = r5.a(r4, r0)
            if (r10 != r1) goto L74
        L73:
            return r1
        L74:
            return r10
        L75:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.r62.a(ads_mobile_sdk.r62, android.view.ViewGroup, ads_mobile_sdk.fs0, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.r62 r11, android.widget.RelativeLayout r12, nt5 r13) {
        /*
            boolean r0 = r13 instanceof ads_mobile_sdk.p62
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.p62 r0 = (ads_mobile_sdk.p62) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.p62 r0 = new ads_mobile_sdk.p62
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            pfe r11 = r0.c
            android.widget.RelativeLayout r12 = r0.b
            ads_mobile_sdk.r62 r0 = r0.a
            defpackage.ybh.y(r13)     // Catch: java.lang.Throwable -> L80
            goto L75
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            r11 = 0
            return r11
        L38:
            pfe r11 = r0.c
            android.widget.RelativeLayout r12 = r0.b
            ads_mobile_sdk.r62 r2 = r0.a
            defpackage.ybh.y(r13)
            r6 = r2
        L42:
            r8 = r12
            goto L5a
        L44:
            defpackage.ybh.y(r13)
            pfe r13 = r11.h
            r0.a = r11
            r0.b = r12
            r0.c = r13
            r0.f = r4
            java.lang.Object r2 = r13.i(r0)
            if (r2 == r1) goto L72
            r6 = r11
            r11 = r13
            goto L42
        L5a:
            ads_mobile_sdk.q6 r7 = r6.i     // Catch: java.lang.Throwable -> L80
            if (r7 == 0) goto L7a
            tf4 r5 = new tf4     // Catch: java.lang.Throwable -> L80
            r10 = 3
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L80
            r0.a = r6     // Catch: java.lang.Throwable -> L80
            r0.b = r8     // Catch: java.lang.Throwable -> L80
            r0.c = r11     // Catch: java.lang.Throwable -> L80
            r0.f = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r12 = r6.a(r5, r0)     // Catch: java.lang.Throwable -> L80
            if (r12 != r1) goto L73
        L72:
            return r1
        L73:
            r0 = r6
            r12 = r8
        L75:
            java.util.List r13 = r0.j     // Catch: java.lang.Throwable -> L80
            r13.add(r12)     // Catch: java.lang.Throwable -> L80
        L7a:
            kotlin.Unit r12 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L80
            r11.l(r9)
            return r12
        L80:
            r0 = move-exception
            r12 = r0
            r11.l(r9)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.r62.a(ads_mobile_sdk.r62, android.widget.RelativeLayout, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.r62 r8, nt5 r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.h62
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.h62 r0 = (ads_mobile_sdk.h62) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.h62 r0 = new ads_mobile_sdk.h62
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            java.lang.Object r8 = r0.a
            pfe r8 = (pfe) r8
            defpackage.ybh.y(r9)     // Catch: java.lang.Throwable -> L70
            goto L6a
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r5
        L35:
            pfe r8 = r0.b
            java.lang.Object r2 = r0.a
            ads_mobile_sdk.r62 r2 = (ads_mobile_sdk.r62) r2
            defpackage.ybh.y(r9)
            r9 = r8
            r8 = r2
            goto L52
        L41:
            defpackage.ybh.y(r9)
            pfe r9 = r8.h
            r0.a = r8
            r0.b = r9
            r0.e = r4
            java.lang.Object r2 = r9.i(r0)
            if (r2 == r1) goto L68
        L52:
            java.lang.Object r2 = r8.b     // Catch: java.lang.Throwable -> L72
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2     // Catch: java.lang.Throwable -> L72
            pin r4 = new pin     // Catch: java.lang.Throwable -> L72
            r6 = 4
            r4.<init>(r6, r5, r8)     // Catch: java.lang.Throwable -> L72
            r0.a = r9     // Catch: java.lang.Throwable -> L72
            r0.b = r5     // Catch: java.lang.Throwable -> L72
            r0.e = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r8 = defpackage.na2.Z(r2, r4, r0)     // Catch: java.lang.Throwable -> L72
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            r8 = r9
        L6a:
            kotlin.Unit r9 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L70
            r8.l(r5)
            return r9
        L70:
            r9 = move-exception
            goto L76
        L72:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L76:
            r8.l(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.r62.a(ads_mobile_sdk.r62, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.r62 r7, nt5 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.k62
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.k62 r0 = (ads_mobile_sdk.k62) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.k62 r0 = new ads_mobile_sdk.k62
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.a
            pfe r7 = (pfe) r7
            defpackage.ybh.y(r8)     // Catch: java.lang.Throwable -> L80
            goto L6b
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r5
        L35:
            pfe r7 = r0.b
            java.lang.Object r2 = r0.a
            ads_mobile_sdk.r62 r2 = (ads_mobile_sdk.r62) r2
            defpackage.ybh.y(r8)
            r8 = r7
            r7 = r2
            goto L52
        L41:
            defpackage.ybh.y(r8)
            pfe r8 = r7.h
            r0.a = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r2 = r8.i(r0)
            if (r2 == r1) goto L67
        L52:
            ads_mobile_sdk.q6 r2 = r7.i     // Catch: java.lang.Throwable -> L85
            if (r2 != 0) goto L77
            ads_mobile_sdk.f72 r7 = r7.g     // Catch: java.lang.Throwable -> L85
            r0.a = r8     // Catch: java.lang.Throwable -> L85
            r0.b = r5     // Catch: java.lang.Throwable -> L85
            r0.e = r3     // Catch: java.lang.Throwable -> L85
            r7.getClass()     // Catch: java.lang.Throwable -> L85
            java.lang.Object r7 = ads_mobile_sdk.f72.a(r7, r0)     // Catch: java.lang.Throwable -> L85
            if (r7 != r1) goto L68
        L67:
            return r1
        L68:
            r6 = r8
            r8 = r7
            r7 = r6
        L6b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L80
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L80
            if (r8 == 0) goto L75
            r8 = r7
            goto L77
        L75:
            r4 = 0
            goto L78
        L77:
            r7 = r8
        L78:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L80
            r7.l(r5)
            return r8
        L80:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
            goto L86
        L85:
            r7 = move-exception
        L86:
            r8.l(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.r62.b(ads_mobile_sdk.r62, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r6.a(r5, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.r62 r11, nt5 r12) {
        /*
            boolean r0 = r12 instanceof ads_mobile_sdk.l62
            if (r0 == 0) goto L13
            r0 = r12
            ads_mobile_sdk.l62 r0 = (ads_mobile_sdk.l62) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.l62 r0 = new ads_mobile_sdk.l62
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r11 = r0.a
            pfe r11 = (pfe) r11
            defpackage.ybh.y(r12)     // Catch: java.lang.Throwable -> L81
            goto L7b
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            r11 = 0
            return r11
        L36:
            pfe r11 = r0.b
            java.lang.Object r2 = r0.a
            ads_mobile_sdk.r62 r2 = (ads_mobile_sdk.r62) r2
            defpackage.ybh.y(r12)
            r6 = r2
            goto L54
        L41:
            defpackage.ybh.y(r12)
            pfe r12 = r11.h
            r0.a = r11
            r0.b = r12
            r0.e = r4
            java.lang.Object r2 = r12.i(r0)
            if (r2 == r1) goto L7a
            r6 = r11
            r11 = r12
        L54:
            ads_mobile_sdk.q6 r7 = r6.i     // Catch: java.lang.Throwable -> L81
            java.util.List r12 = r6.j
            if (r7 == 0) goto L7b
            defpackage.o95.y(r12)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r12 = kotlin.collections.CollectionsKt.R(r12)     // Catch: java.lang.Throwable -> L81
            android.view.View r12 = (android.view.View) r12     // Catch: java.lang.Throwable -> L81
            if (r12 != 0) goto L67
            ads_mobile_sdk.sy0 r12 = r6.f     // Catch: java.lang.Throwable -> L81
        L67:
            r8 = r12
            tf4 r5 = new tf4     // Catch: java.lang.Throwable -> L81
            r10 = 2
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L81
            r0.a = r11     // Catch: java.lang.Throwable -> L81
            r0.b = r9     // Catch: java.lang.Throwable -> L81
            r0.e = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r12 = r6.a(r5, r0)     // Catch: java.lang.Throwable -> L81
            if (r12 != r1) goto L7b
        L7a:
            return r1
        L7b:
            kotlin.Unit r12 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L81
            r11.l(r9)
            return r12
        L81:
            r0 = move-exception
            r12 = r0
            r11.l(r9)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.r62.c(ads_mobile_sdk.r62, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        if (r9.a(r4, "onSdkImpression", r0) == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #1 {all -> 0x00af, blocks: (B:14:0x002e, B:39:0x00a9, B:30:0x0086, B:32:0x008e, B:36:0x0095), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(ads_mobile_sdk.r62 r8, nt5 r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.n62
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.n62 r0 = (ads_mobile_sdk.n62) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.n62 r0 = new ads_mobile_sdk.n62
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L58
            if (r2 == r5) goto L49
            if (r2 == r4) goto L39
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.a
            pfe r8 = (pfe) r8
            defpackage.ybh.y(r9)     // Catch: java.lang.Throwable -> Laf
            goto La9
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r6
        L39:
            java.lang.Object r8 = r0.b
            ads_mobile_sdk.cy0 r8 = (ads_mobile_sdk.cy0) r8
            java.lang.Object r2 = r0.a
            pfe r2 = (pfe) r2
            defpackage.ybh.y(r9)     // Catch: java.lang.Throwable -> Lb3
            r7 = r9
            r9 = r8
            r8 = r2
            r2 = r7
            goto L86
        L49:
            java.lang.Object r8 = r0.b
            pfe r8 = (pfe) r8
            java.lang.Object r2 = r0.a
            ads_mobile_sdk.r62 r2 = (ads_mobile_sdk.r62) r2
            defpackage.ybh.y(r9)
            r7 = r2
            r2 = r8
            r8 = r7
            goto L6a
        L58:
            defpackage.ybh.y(r9)
            pfe r9 = r8.h
            r0.a = r8
            r0.b = r9
            r0.e = r5
            java.lang.Object r2 = r9.i(r0)
            if (r2 == r1) goto La8
            r2 = r9
        L6a:
            ads_mobile_sdk.sy0 r9 = r8.f     // Catch: java.lang.Throwable -> Lb3
            ads_mobile_sdk.cy0 r9 = r9.a     // Catch: java.lang.Throwable -> Lb3
            ads_mobile_sdk.q6 r5 = r8.i     // Catch: java.lang.Throwable -> Lb3
            if (r5 != 0) goto L94
            ads_mobile_sdk.f72 r8 = r8.g     // Catch: java.lang.Throwable -> Lb3
            r0.a = r2     // Catch: java.lang.Throwable -> Lb3
            r0.b = r9     // Catch: java.lang.Throwable -> Lb3
            r0.e = r4     // Catch: java.lang.Throwable -> Lb3
            r8.getClass()     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r8 = ads_mobile_sdk.f72.a(r8, r0)     // Catch: java.lang.Throwable -> Lb3
            if (r8 == r1) goto La8
            r7 = r2
            r2 = r8
            r8 = r7
        L86:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Laf
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Laf
            if (r2 != 0) goto L95
            kotlin.Unit r9 = kotlin.Unit.a     // Catch: java.lang.Throwable -> Laf
            r8.l(r6)
            return r9
        L94:
            r8 = r2
        L95:
            java.lang.String r2 = "onSdkImpression"
            prb r4 = new prb     // Catch: java.lang.Throwable -> Laf
            r4.<init>()     // Catch: java.lang.Throwable -> Laf
            r0.a = r8     // Catch: java.lang.Throwable -> Laf
            r0.b = r6     // Catch: java.lang.Throwable -> Laf
            r0.e = r3     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r9 = r9.a(r4, r2, r0)     // Catch: java.lang.Throwable -> Laf
            if (r9 != r1) goto La9
        La8:
            return r1
        La9:
            kotlin.Unit r9 = kotlin.Unit.a     // Catch: java.lang.Throwable -> Laf
            r8.l(r6)
            return r9
        Laf:
            r9 = move-exception
            r2 = r8
            r8 = r9
            goto Lb4
        Lb3:
            r8 = move-exception
        Lb4:
            r2.l(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.r62.d(ads_mobile_sdk.r62, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (ads_mobile_sdk.f72.a(r8, r7, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r7.a(r8, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object e(ads_mobile_sdk.r62 r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.o62
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.o62 r0 = (ads_mobile_sdk.o62) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.o62 r0 = new ads_mobile_sdk.o62
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            defpackage.ybh.y(r8)
            goto L82
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r3
        L34:
            defpackage.ybh.y(r8)
            goto L72
        L38:
            ads_mobile_sdk.r62 r7 = r0.a
            defpackage.ybh.y(r8)
            goto L59
        L3e:
            defpackage.ybh.y(r8)
            ads_mobile_sdk.a2 r8 = r7.d
            boolean r8 = r8.O
            if (r8 != 0) goto L4a
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L4a:
            ads_mobile_sdk.f72 r8 = r7.g
            r0.a = r7
            r0.d = r6
            r8.getClass()
            java.lang.Object r8 = ads_mobile_sdk.f72.a(r8, r0)
            if (r8 == r1) goto L81
        L59:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L75
            ads_mobile_sdk.f72 r8 = r7.g
            ads_mobile_sdk.sy0 r7 = r7.f
            r0.a = r3
            r0.d = r5
            r8.getClass()
            java.lang.Object r7 = ads_mobile_sdk.f72.a(r8, r7, r0)
            if (r7 == r1) goto L81
        L72:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L75:
            ads_mobile_sdk.sy0 r8 = r7.f
            r0.a = r3
            r0.d = r4
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L82
        L81:
            return r1
        L82:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.r62.e(ads_mobile_sdk.r62, nt5):java.lang.Object");
    }

    @Override // defpackage.m7p
    public final Object a(lp3 lp3Var) {
        return a(this, lp3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.sy0 r7, nt5 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.f62
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.f62 r0 = (ads_mobile_sdk.f62) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.f62 r0 = new ads_mobile_sdk.f62
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.a
            pfe r6 = (pfe) r6
            defpackage.ybh.y(r8)     // Catch: java.lang.Throwable -> L75
            goto L6f
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r5
        L35:
            pfe r6 = r0.c
            ads_mobile_sdk.sy0 r7 = r0.b
            java.lang.Object r2 = r0.a
            ads_mobile_sdk.r62 r2 = (ads_mobile_sdk.r62) r2
            defpackage.ybh.y(r8)
            r8 = r6
            r6 = r2
            goto L56
        L43:
            defpackage.ybh.y(r8)
            r0.a = r6
            r0.b = r7
            pfe r8 = r6.h
            r0.c = r8
            r0.f = r4
            java.lang.Object r2 = r8.i(r0)
            if (r2 == r1) goto L6d
        L56:
            java.lang.Object r2 = r6.b     // Catch: java.lang.Throwable -> L78
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2     // Catch: java.lang.Throwable -> L78
            sbl r4 = new sbl     // Catch: java.lang.Throwable -> L78
            r4.<init>(r6, r7, r5)     // Catch: java.lang.Throwable -> L78
            r0.a = r8     // Catch: java.lang.Throwable -> L78
            r0.b = r5     // Catch: java.lang.Throwable -> L78
            r0.c = r5     // Catch: java.lang.Throwable -> L78
            r0.f = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r6 = defpackage.na2.Z(r2, r4, r0)     // Catch: java.lang.Throwable -> L78
            if (r6 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r6 = r8
        L6f:
            kotlin.Unit r7 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L75
            r6.l(r5)
            return r7
        L75:
            r7 = move-exception
            r8 = r6
            goto L7a
        L78:
            r6 = move-exception
            r7 = r6
        L7a:
            r8.l(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.r62.a(ads_mobile_sdk.sy0, nt5):java.lang.Object");
    }

    @Override // defpackage.m7p
    public final Object a(View view, fs0 fs0Var, kuk kukVar) {
        return a(this, (ViewGroup) view, fs0Var, kukVar);
    }

    @Override // defpackage.m7p
    public final Object a(View view, mt5 mt5Var) {
        return a(this, (RelativeLayout) view, (nt5) mt5Var);
    }

    public final Object i(mt5 mt5Var) {
        return e(this, (nt5) mt5Var);
    }

    @Override // defpackage.m7p
    public final Object l(lp3 lp3Var) {
        return b(this, lp3Var);
    }

    @Override // defpackage.m7p
    public final Object m(pt0 pt0Var) {
        return c(this, pt0Var);
    }

    public final Object q(mt5 mt5Var) {
        return d(this, (nt5) mt5Var);
    }
}
