package defpackage;

import ads_mobile_sdk.d91;
import ads_mobile_sdk.qp0;
import ads_mobile_sdk.r62;
import ads_mobile_sdk.ry0;
import ads_mobile_sdk.sy0;
import ads_mobile_sdk.tv2;
import ads_mobile_sdk.z2;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class sbl extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public byte u;
    public Object v;
    public Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sbl(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.x = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbl(r62 r62Var, sy0 sy0Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 13;
        this.w = sy0Var;
        this.x = r62Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbl(Uri uri, WebResourceRequest webResourceRequest, ry0 ry0Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 15;
        this.v = uri;
        this.w = ry0Var;
        this.x = webResourceRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbl(ism ismVar, Map map, sj5 sj5Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 4;
        yrm yrmVar = yrm.a;
        this.v = ismVar;
        this.w = map;
        this.x = sj5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sbl(Object obj, Object obj2, Object obj3, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sbl(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
        this.x = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: all -> 0x00a3, TryCatch #2 {all -> 0x00a3, blocks: (B:28:0x0075, B:30:0x007c, B:32:0x0083, B:34:0x0087, B:36:0x008b, B:37:0x008c, B:38:0x0091, B:39:0x0092, B:40:0x0099, B:41:0x009a, B:42:0x00a1, B:43:0x00a2), top: B:90:0x0075, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #2 {all -> 0x00a3, blocks: (B:28:0x0075, B:30:0x007c, B:32:0x0083, B:34:0x0087, B:36:0x008b, B:37:0x008c, B:38:0x0091, B:39:0x0092, B:40:0x0099, B:41:0x009a, B:42:0x00a1, B:43:0x00a2), top: B:90:0x0075, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6 A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:62:0x00cf, B:64:0x00d6, B:66:0x00dd, B:68:0x00e1, B:70:0x00e5, B:71:0x00e6, B:72:0x00eb, B:73:0x00ec, B:74:0x00f3, B:75:0x00f4, B:76:0x00fb, B:77:0x00fc), top: B:98:0x00cf, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fc A[Catch: all -> 0x00fd, TRY_LEAVE, TryCatch #7 {all -> 0x00fd, blocks: (B:62:0x00cf, B:64:0x00d6, B:66:0x00dd, B:68:0x00e1, B:70:0x00e5, B:71:0x00e6, B:72:0x00eb, B:73:0x00ec, B:74:0x00f3, B:75:0x00f4, B:76:0x00fb, B:77:0x00fc), top: B:98:0x00cf, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$ads_mobile_sdk$ap3(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbl.invokeSuspend$ads_mobile_sdk$ap3(java.lang.Object):java.lang.Object");
    }

    private final Object invokeSuspend$ads_mobile_sdk$c81(Object obj) throws Throwable {
        d91 d91Var;
        pfe pfeVar;
        pfe pfeVar2;
        px5 px5Var = px5.a;
        byte b = this.u;
        try {
            if (b == 0) {
                ybh.y(obj);
                d91Var = (d91) this.x;
                pfe pfeVar3 = d91Var.x;
                this.v = pfeVar3;
                this.w = d91Var;
                this.u = (byte) 1;
                if (pfeVar3.i(this) != px5Var) {
                    pfeVar = pfeVar3;
                }
                return px5Var;
            }
            if (b != 1) {
                if (b != 2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pfeVar2 = (pfe) this.v;
                try {
                    ybh.y(obj);
                    Unit unit = Unit.a;
                    pfeVar2.l((Object) null);
                    return unit;
                } catch (Throwable th) {
                    th = th;
                    pfeVar = pfeVar2;
                    pfeVar.l((Object) null);
                    throw th;
                }
            }
            d91Var = (d91) this.w;
            pfe pfeVar4 = (pfe) this.v;
            ybh.y(obj);
            pfeVar = pfeVar4;
            Long l = new Long(Long.MAX_VALUE);
            this.v = pfeVar;
            this.w = null;
            this.u = (byte) 2;
            if (d91.a(d91Var, null, null, 0, "{}", l, null, null, null, null, this, 487) != px5Var) {
                pfeVar2 = pfeVar;
                Unit unit2 = Unit.a;
                pfeVar2.l((Object) null);
                return unit2;
            }
            return px5Var;
        } catch (Throwable th2) {
            th = th2;
            pfeVar.l((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (r3.a(r14, "onSdkLoaded", r9) == r10) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$ads_mobile_sdk$g62(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.w
            ads_mobile_sdk.sy0 r0 = (ads_mobile_sdk.sy0) r0
            java.lang.Object r1 = r13.x
            ads_mobile_sdk.r62 r1 = (ads_mobile_sdk.r62) r1
            ads_mobile_sdk.s52 r2 = r1.e
            px5 r10 = px5.a
            byte r3 = r13.u
            r11 = 2
            r12 = 1
            if (r3 == 0) goto L2f
            if (r3 == r12) goto L26
            if (r3 != r11) goto L1f
            java.lang.Object r13 = r13.v
            ads_mobile_sdk.q6 r13 = (ads_mobile_sdk.q6) r13
            defpackage.ybh.y(r14)
            goto L98
        L1f:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r13)
            r13 = 0
            return r13
        L26:
            java.lang.Object r3 = r13.v
            ads_mobile_sdk.cy0 r3 = (ads_mobile_sdk.cy0) r3
            defpackage.ybh.y(r14)
            r9 = r13
            goto L69
        L2f:
            defpackage.ybh.y(r14)
            ads_mobile_sdk.cy0 r3 = r0.a
            ads_mobile_sdk.a2 r14 = r1.d
            ads_mobile_sdk.j82 r4 = r14.S
            ads_mobile_sdk.i82 r5 = r4.a
            ads_mobile_sdk.z92 r7 = r4.b
            ads_mobile_sdk.i82 r4 = ads_mobile_sdk.i82.a
            if (r5 != r4) goto L43
            ads_mobile_sdk.z31 r6 = ads_mobile_sdk.z31.b
            goto L4e
        L43:
            ads_mobile_sdk.w1 r6 = r14.G
            ads_mobile_sdk.w1 r8 = ads_mobile_sdk.w1.ONE_PIXEL
            if (r6 != r8) goto L4c
            ads_mobile_sdk.z31 r6 = ads_mobile_sdk.z31.e
            goto L4e
        L4c:
            ads_mobile_sdk.z31 r6 = ads_mobile_sdk.z31.d
        L4e:
            if (r5 != r4) goto L53
            ads_mobile_sdk.t00 r4 = ads_mobile_sdk.t00.e
            goto L55
        L53:
            ads_mobile_sdk.t00 r4 = ads_mobile_sdk.t00.c
        L55:
            java.lang.String r8 = r14.x
            r13.v = r3
            r13.u = r12
            r2.getClass()
            r5 = r6
            r6 = r4
            ads_mobile_sdk.z92 r4 = ads_mobile_sdk.z92.c
            r9 = r13
            java.lang.Object r14 = ads_mobile_sdk.s52.a(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r14 == r10) goto L97
        L69:
            r13 = r14
            ads_mobile_sdk.q6 r13 = (ads_mobile_sdk.q6) r13
            if (r13 != 0) goto L71
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        L71:
            r2.a(r13, r0)
            r2.getClass()
            ads_mobile_sdk.ah3 r14 = r2.f
            ads_mobile_sdk.h52 r0 = new ads_mobile_sdk.h52
            r0.<init>(r13, r12)
            java.lang.String r2 = "StartOmidSession"
            java.lang.Object r14 = r14.d(r2, r0)
            kotlin.Unit r14 = (kotlin.Unit) r14
            prb r14 = new prb
            r14.<init>()
            r9.v = r13
            r9.u = r11
            java.lang.String r0 = "onSdkLoaded"
            java.lang.Object r14 = r3.a(r14, r0, r9)
            if (r14 != r10) goto L98
        L97:
            return r10
        L98:
            r1.i = r13
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbl.invokeSuspend$ads_mobile_sdk$g62(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f A[Catch: all -> 0x00a6, TryCatch #2 {all -> 0x00a6, blocks: (B:27:0x0078, B:29:0x007f, B:31:0x0086, B:33:0x008a, B:35:0x008e, B:36:0x008f, B:37:0x0094, B:38:0x0095, B:39:0x009c, B:40:0x009d, B:41:0x00a4, B:42:0x00a5), top: B:85:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #2 {all -> 0x00a6, blocks: (B:27:0x0078, B:29:0x007f, B:31:0x0086, B:33:0x008a, B:35:0x008e, B:36:0x008f, B:37:0x0094, B:38:0x0095, B:39:0x009c, B:40:0x009d, B:41:0x00a4, B:42:0x00a5), top: B:85:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6 A[Catch: all -> 0x00fd, TryCatch #6 {all -> 0x00fd, blocks: (B:60:0x00cf, B:62:0x00d6, B:64:0x00dd, B:66:0x00e1, B:68:0x00e5, B:69:0x00e6, B:70:0x00eb, B:71:0x00ec, B:72:0x00f3, B:73:0x00f4, B:74:0x00fb, B:75:0x00fc), top: B:92:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fc A[Catch: all -> 0x00fd, TRY_LEAVE, TryCatch #6 {all -> 0x00fd, blocks: (B:60:0x00cf, B:62:0x00d6, B:64:0x00dd, B:66:0x00e1, B:68:0x00e5, B:69:0x00e6, B:70:0x00eb, B:71:0x00ec, B:72:0x00f3, B:73:0x00f4, B:74:0x00fb, B:75:0x00fc), top: B:92:0x00cf }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$ads_mobile_sdk$go2(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbl.invokeSuspend$ads_mobile_sdk$go2(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (r13 != r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
    
        if (r13 != r4) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082 A[Catch: Exception -> 0x00f0, TRY_ENTER, TryCatch #0 {Exception -> 0x00f0, blocks: (B:7:0x001e, B:46:0x00d5, B:48:0x00db, B:52:0x00eb, B:11:0x0029, B:29:0x0082, B:31:0x008a, B:33:0x0090, B:35:0x0096, B:36:0x009a, B:38:0x00a0, B:40:0x00ac, B:43:0x00bd), top: B:57:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd A[Catch: Exception -> 0x00f0, TryCatch #0 {Exception -> 0x00f0, blocks: (B:7:0x001e, B:46:0x00d5, B:48:0x00db, B:52:0x00eb, B:11:0x0029, B:29:0x0082, B:31:0x008a, B:33:0x0090, B:35:0x0096, B:36:0x009a, B:38:0x00a0, B:40:0x00ac, B:43:0x00bd), top: B:57:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$ads_mobile_sdk$ny0(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbl.invokeSuspend$ads_mobile_sdk$ny0(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f A[Catch: all -> 0x00a6, TryCatch #2 {all -> 0x00a6, blocks: (B:27:0x0078, B:29:0x007f, B:31:0x0086, B:33:0x008a, B:35:0x008e, B:36:0x008f, B:37:0x0094, B:38:0x0095, B:39:0x009c, B:40:0x009d, B:41:0x00a4, B:42:0x00a5), top: B:85:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #2 {all -> 0x00a6, blocks: (B:27:0x0078, B:29:0x007f, B:31:0x0086, B:33:0x008a, B:35:0x008e, B:36:0x008f, B:37:0x0094, B:38:0x0095, B:39:0x009c, B:40:0x009d, B:41:0x00a4, B:42:0x00a5), top: B:85:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3 A[Catch: all -> 0x00fa, TryCatch #6 {all -> 0x00fa, blocks: (B:60:0x00cc, B:62:0x00d3, B:64:0x00da, B:66:0x00de, B:68:0x00e2, B:69:0x00e3, B:70:0x00e8, B:71:0x00e9, B:72:0x00f0, B:73:0x00f1, B:74:0x00f8, B:75:0x00f9), top: B:92:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9 A[Catch: all -> 0x00fa, TRY_LEAVE, TryCatch #6 {all -> 0x00fa, blocks: (B:60:0x00cc, B:62:0x00d3, B:64:0x00da, B:66:0x00de, B:68:0x00e2, B:69:0x00e3, B:70:0x00e8, B:71:0x00e9, B:72:0x00f0, B:73:0x00f1, B:74:0x00f8, B:75:0x00f9), top: B:92:0x00cc }] */
    /* JADX WARN: Type inference failed for: r12v28, types: [ads_mobile_sdk.rg3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$ads_mobile_sdk$p52(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbl.invokeSuspend$ads_mobile_sdk$p52(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r0.a(r6, ads_mobile_sdk.fs0.c, r5) == r1) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$ads_mobile_sdk$pp0(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.v
            ads_mobile_sdk.qp0 r0 = (ads_mobile_sdk.qp0) r0
            ads_mobile_sdk.b82 r0 = r0.s
            px5 r1 = px5.a
            byte r2 = r5.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L16
            defpackage.ybh.y(r6)
            goto L4f
        L16:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L1d:
            defpackage.ybh.y(r6)
            goto L30
        L21:
            defpackage.ybh.y(r6)
            java.lang.Object r6 = r5.w
            f43 r6 = (defpackage.f43) r6
            r5.u = r4
            java.lang.Object r6 = r0.a(r6, r5)
            if (r6 == r1) goto L4e
        L30:
            java.lang.Object r6 = r5.x
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            java.lang.Object r6 = r6.get()
            fvo r6 = (defpackage.fvo) r6
            if (r6 == 0) goto L4f
            ads_mobile_sdk.ew1 r6 = (ads_mobile_sdk.ew1) r6
            android.widget.FrameLayout r6 = r6.d()
            if (r6 == 0) goto L4f
            r5.u = r3
            ads_mobile_sdk.fs0 r2 = ads_mobile_sdk.fs0.c
            java.lang.Object r5 = r0.a(r6, r2, r5)
            if (r5 != r1) goto L4f
        L4e:
            return r1
        L4f:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbl.invokeSuspend$ads_mobile_sdk$pp0(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r1.a((ads_mobile_sdk.hv0) r10, r3, (nt5) r9) == r2) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$ads_mobile_sdk$qv2(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.w
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r1 = r9.v
            ads_mobile_sdk.tv2 r1 = (ads_mobile_sdk.tv2) r1
            px5 r2 = px5.a
            byte r3 = r9.u
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L23
            if (r3 == r6) goto L1f
            if (r3 != r5) goto L19
            defpackage.ybh.y(r10)     // Catch: java.lang.Exception -> L56
            goto L76
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r4
        L1f:
            defpackage.ybh.y(r10)     // Catch: java.lang.Exception -> L56
            goto L41
        L23:
            defpackage.ybh.y(r10)
            ads_mobile_sdk.ws r10 = r1.g     // Catch: java.lang.Exception -> L56
            java.util.Map r10 = r10.a(r0)     // Catch: java.lang.Exception -> L56
            vkp r3 = r1.e     // Catch: java.lang.Exception -> L56
            java.net.URL r7 = new java.net.URL     // Catch: java.lang.Exception -> L56
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Exception -> L56
            r7.<init>(r8)     // Catch: java.lang.Exception -> L56
            r9.u = r6     // Catch: java.lang.Exception -> L56
            r6 = 26
            java.lang.Object r10 = defpackage.vkp.b(r3, r7, r10, r9, r6)     // Catch: java.lang.Exception -> L56
            if (r10 == r2) goto L55
        L41:
            rap r10 = (defpackage.rap) r10     // Catch: java.lang.Exception -> L56
            boolean r3 = r10 instanceof ads_mobile_sdk.hv0     // Catch: java.lang.Exception -> L56
            if (r3 == 0) goto L76
            ads_mobile_sdk.hv0 r10 = (ads_mobile_sdk.hv0) r10     // Catch: java.lang.Exception -> L56
            java.lang.Object r3 = r9.x     // Catch: java.lang.Exception -> L56
            ads_mobile_sdk.z2 r3 = (ads_mobile_sdk.z2) r3     // Catch: java.lang.Exception -> L56
            r9.u = r5     // Catch: java.lang.Exception -> L56
            java.lang.Object r9 = r1.a(r10, r3, r9)     // Catch: java.lang.Exception -> L56
            if (r9 != r2) goto L76
        L55:
            return r2
        L56:
            r9 = move-exception
            vr3 r10 = ads_mobile_sdk.xu0.a
            java.lang.String r9 = r9.getMessage()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "Error while pinging URL: "
            r10.<init>(r1)
            r10.append(r0)
            java.lang.String r0 = ": "
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            ads_mobile_sdk.xu0.b(r9, r4)
        L76:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbl.invokeSuspend$ads_mobile_sdk$qv2(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r0.b(r10) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:18:0x0066, B:20:0x006a), top: B:32:0x0066 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$ads_mobile_sdk$ss0(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = r10.x
            ads_mobile_sdk.mt0 r0 = (ads_mobile_sdk.mt0) r0
            px5 r1 = px5.a
            byte r2 = r10.u
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L33
            if (r2 == r5) goto L2f
            if (r2 == r4) goto L22
            if (r2 != r3) goto L1c
            java.lang.Object r10 = r10.v
            pfe r10 = (pfe) r10
            defpackage.ybh.y(r11)     // Catch: java.lang.Throwable -> L7e
            goto L78
        L1c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            return r6
        L22:
            java.lang.Object r0 = r10.w
            ads_mobile_sdk.mt0 r0 = (ads_mobile_sdk.mt0) r0
            java.lang.Object r2 = r10.v
            pfe r2 = (pfe) r2
            defpackage.ybh.y(r11)
            r11 = r2
            goto L66
        L2f:
            defpackage.ybh.y(r11)
            goto L58
        L33:
            defpackage.ybh.y(r11)
            ads_mobile_sdk.qr0 r11 = r0.e
            r11.getClass()
            on7 r2 = pn7.b
            r2 = 5
            un7 r7 = un7.e
            pn7 r2 = u0h.b(r2, r7)
            ads_mobile_sdk.fo r7 = ads_mobile_sdk.fo.a$18
            java.lang.String r8 = "gads:ad_overlay:delay_page_close_timeout_ms"
            java.lang.Object r11 = r11.a(r8, r2, r7)
            pn7 r11 = (pn7) r11
            long r7 = r11.a
            r10.u = r5
            java.lang.Object r11 = defpackage.nb6.q(r7, r10)
            if (r11 == r1) goto L76
        L58:
            pfe r11 = r0.y
            r10.v = r11
            r10.w = r0
            r10.u = r4
            java.lang.Object r2 = r11.i(r10)
            if (r2 == r1) goto L76
        L66:
            boolean r2 = r0.C     // Catch: java.lang.Throwable -> L83
            if (r2 != 0) goto L77
            r10.v = r11     // Catch: java.lang.Throwable -> L83
            r10.w = r6     // Catch: java.lang.Throwable -> L83
            r10.u = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r10 = r0.b(r10)     // Catch: java.lang.Throwable -> L83
            if (r10 != r1) goto L77
        L76:
            return r1
        L77:
            r10 = r11
        L78:
            kotlin.Unit r11 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L7e
            r10.l(r6)
            return r11
        L7e:
            r11 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
            goto L84
        L83:
            r10 = move-exception
        L84:
            r11.l(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbl.invokeSuspend$ads_mobile_sdk$ss0(java.lang.Object):java.lang.Object");
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                sbl sblVar = new sbl(this.w, obj2, mt5Var, (byte) 0);
                sblVar.v = obj;
                return sblVar;
            case 1:
                return new sbl(this.w, obj2, mt5Var, (byte) 1);
            case 2:
                sbl sblVar2 = new sbl((byte) 2, mt5Var, obj2);
                sblVar2.v = obj;
                return sblVar2;
            case 3:
                return new sbl(this.w, obj2, mt5Var, (byte) 3);
            case 4:
                ism ismVar = (ism) this.v;
                yrm yrmVar = yrm.a;
                return new sbl(ismVar, (Map) this.w, (sj5) obj2, mt5Var);
            case 5:
                return new sbl((p8j) this.v, (axm) this.w, (String) obj2, mt5Var, (byte) 5);
            case 6:
                return new sbl((rr1) this.v, (Function1) this.w, (lxm) obj2, mt5Var, (byte) 6);
            case 7:
                return new sbl((rin) this.v, (v28) this.w, (htm) obj2, mt5Var, (byte) 7);
            case 8:
                sbl sblVar3 = new sbl((byte) 8, mt5Var, obj2);
                sblVar3.w = obj;
                return sblVar3;
            case 9:
                return new sbl((b1o) this.v, (Uri) this.w, (w0o) obj2, mt5Var, (byte) 9);
            case 10:
                return new sbl((z5o) this.v, (ajc) this.w, (v4o) obj2, mt5Var, (byte) 10);
            case 11:
                return new sbl((byte) 11, mt5Var, obj2);
            case 12:
                return new sbl((byte) 12, mt5Var, obj2);
            case 13:
                return new sbl((r62) obj2, (sy0) this.w, mt5Var);
            case 14:
                return new sbl((byte) 14, mt5Var, obj2);
            case 15:
                return new sbl((Uri) this.v, (WebResourceRequest) obj2, (ry0) this.w, mt5Var);
            case 16:
                return new sbl((byte) 16, mt5Var, obj2);
            case 17:
                return new sbl((qp0) this.v, (f43) this.w, (WeakReference) obj2, mt5Var, (byte) 17);
            case 18:
                return new sbl((tv2) this.v, (Uri) this.w, (z2) obj2, mt5Var, (byte) 18);
            case 19:
                return new sbl((byte) 19, mt5Var, obj2);
            default:
                return new sbl((byte) 20, mt5Var, obj2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.x;
        switch (b) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((j3g) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 5:
                return create((xa7) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 6:
                return create((yuk) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 7:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 8:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 9:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 10:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 11:
                return new sbl((byte) 11, (mt5) obj2, obj3).invokeSuspend(Unit.a);
            case 12:
                return new sbl((byte) 12, (mt5) obj2, obj3).invokeSuspend(Unit.a);
            case 13:
                return new sbl((r62) obj3, (sy0) this.w, (mt5) obj2).invokeSuspend(Unit.a);
            case 14:
                return new sbl((byte) 14, (mt5) obj2, obj3).invokeSuspend(Unit.a);
            case 15:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 16:
                return new sbl((byte) 16, (mt5) obj2, obj3).invokeSuspend(Unit.a);
            case 17:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 18:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 19:
                return new sbl((byte) 19, (mt5) obj2, obj3).invokeSuspend(Unit.a);
            default:
                return new sbl((byte) 20, (mt5) obj2, obj3).invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dzn */
    /* JADX WARN: Can't wrap try/catch for region: R(11:187|(1:482)|(1:(1:(1:(3:192|234|235)(2:193|494))(1:194))(7:196|197|198|218|(1:220)|232|495))(1:199)|200|451|201|204|(1:206)(1:207)|208|(1:210)(1:211)|(2:221|222)(6:213|(1:215)|216|(2:218|(8:200|451|201|204|(0)(0)|208|(0)(0)|(0)(0))(0))|232|495)) */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0398, code lost:
    
        if (r3.d(r25) == r2) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03e0, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0505, code lost:
    
        if (r3.d.f(r2, r25) == r0) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x060c, code lost:
    
        if (r0 == r3) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0652, code lost:
    
        if (((h07) r2).X(r25) == r0) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x06cd, code lost:
    
        if (r0.f(r25, r2, r6) == r4) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x06da, code lost:
    
        if (r0.d(r25, r2, r6) == r4) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0808, code lost:
    
        if (r0.invoke(r25) != r4) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x085c, code lost:
    
        if (r3.invoke(r2, r25) == r0) goto L447;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0400 A[Catch: Exception -> 0x0442, TryCatch #18 {Exception -> 0x0442, blocks: (B:194:0x03be, B:200:0x03cf, B:204:0x03e1, B:206:0x0400, B:208:0x040a, B:210:0x040e, B:213:0x0414, B:216:0x041b, B:218:0x042b, B:221:0x043a, B:222:0x0441, B:197:0x03c6), top: B:482:0x03a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x040e A[Catch: Exception -> 0x0442, TryCatch #18 {Exception -> 0x0442, blocks: (B:194:0x03be, B:200:0x03cf, B:204:0x03e1, B:206:0x0400, B:208:0x040a, B:210:0x040e, B:213:0x0414, B:216:0x041b, B:218:0x042b, B:221:0x043a, B:222:0x0441, B:197:0x03c6), top: B:482:0x03a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0414 A[Catch: Exception -> 0x0442, TryCatch #18 {Exception -> 0x0442, blocks: (B:194:0x03be, B:200:0x03cf, B:204:0x03e1, B:206:0x0400, B:208:0x040a, B:210:0x040e, B:213:0x0414, B:216:0x041b, B:218:0x042b, B:221:0x043a, B:222:0x0441, B:197:0x03c6), top: B:482:0x03a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x043a A[Catch: Exception -> 0x0442, TryCatch #18 {Exception -> 0x0442, blocks: (B:194:0x03be, B:200:0x03cf, B:204:0x03e1, B:206:0x0400, B:208:0x040a, B:210:0x040e, B:213:0x0414, B:216:0x041b, B:218:0x042b, B:221:0x043a, B:222:0x0441, B:197:0x03c6), top: B:482:0x03a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #5 {all -> 0x00a7, blocks: (B:31:0x0095, B:33:0x009b), top: B:461:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4 A[Catch: all -> 0x00db, TryCatch #17 {all -> 0x00db, blocks: (B:41:0x00ad, B:43:0x00b4, B:45:0x00bb, B:47:0x00bf, B:49:0x00c3, B:50:0x00c4, B:51:0x00c9, B:52:0x00ca, B:53:0x00d1, B:54:0x00d2, B:55:0x00d9, B:56:0x00da), top: B:481:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:472:0x02e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x077c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:501:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #17 {all -> 0x00db, blocks: (B:41:0x00ad, B:43:0x00b4, B:45:0x00bb, B:47:0x00bf, B:49:0x00c3, B:50:0x00c4, B:51:0x00c9, B:52:0x00ca, B:53:0x00d1, B:54:0x00d2, B:55:0x00d9, B:56:0x00da), top: B:481:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0117 A[Catch: all -> 0x0122, TRY_LEAVE, TryCatch #2 {all -> 0x0122, blocks: (B:74:0x0111, B:76:0x0117), top: B:455:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012f A[Catch: all -> 0x0156, TryCatch #13 {all -> 0x0156, blocks: (B:84:0x0128, B:86:0x012f, B:88:0x0136, B:90:0x013a, B:92:0x013e, B:93:0x013f, B:94:0x0144, B:95:0x0145, B:96:0x014c, B:97:0x014d, B:98:0x0154, B:99:0x0155), top: B:474:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0155 A[Catch: all -> 0x0156, TRY_LEAVE, TryCatch #13 {all -> 0x0156, blocks: (B:84:0x0128, B:86:0x012f, B:88:0x0136, B:90:0x013a, B:92:0x013e, B:93:0x013f, B:94:0x0144, B:95:0x0145, B:96:0x014c, B:97:0x014d, B:98:0x0154, B:99:0x0155), top: B:474:0x0128 }] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v42, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:219:0x0437 -> B:200:0x03cf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
