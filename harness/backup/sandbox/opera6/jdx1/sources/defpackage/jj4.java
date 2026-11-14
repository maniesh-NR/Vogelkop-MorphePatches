package defpackage;

import ads_mobile_sdk.iq3;
import ads_mobile_sdk.it1;
import ads_mobile_sdk.ve2;
import ads_mobile_sdk.wt1;
import ads_mobile_sdk.yq3;
import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class jj4 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public byte u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj4(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.y = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj4(ve2 ve2Var, it1 it1Var, wt1 wt1Var, prb prbVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 22;
        this.v = wt1Var;
        this.w = prbVar;
        this.x = ve2Var;
        this.y = it1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj4(ggb ggbVar, ArrayList arrayList, mg6 mg6Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 3;
        this.x = ggbVar;
        this.w = arrayList;
        this.y = mg6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj4(ggb ggbVar, ArrayList arrayList, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 4;
        this.y = ggbVar;
        this.w = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj4(Object obj, Object obj2, Object obj3, Object obj4, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj4(Object obj, Object obj2, Object obj3, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj4(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.x = obj;
        this.y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj4(mt5 mt5Var, rj4 rj4Var, ArrayList arrayList, ArrayList arrayList2) {
        super(2, mt5Var);
        this.t = (byte) 0;
        this.v = rj4Var;
        this.w = arrayList;
        this.x = arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (ads_mobile_sdk.gr0.a(r2, r0, (defpackage.prb) r12, r11) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$ads_mobile_sdk$mj1(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.x
            ads_mobile_sdk.bk1 r0 = (ads_mobile_sdk.bk1) r0
            px5 r1 = px5.a
            byte r2 = r11.u
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L36
            if (r2 == r6) goto L32
            if (r2 == r5) goto L2e
            if (r2 == r4) goto L22
            if (r2 != r3) goto L1c
            defpackage.ybh.y(r12)
            goto L9c
        L1c:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            return r7
        L22:
            java.lang.Object r0 = r11.w
            ads_mobile_sdk.ue1 r0 = (ads_mobile_sdk.ue1) r0
            java.lang.Object r2 = r11.v
            ads_mobile_sdk.gr0 r2 = (ads_mobile_sdk.gr0) r2
            defpackage.ybh.y(r12)
            goto L8a
        L2e:
            defpackage.ybh.y(r12)
            goto L6d
        L32:
            defpackage.ybh.y(r12)
            goto L5e
        L36:
            defpackage.ybh.y(r12)
            ads_mobile_sdk.qr0 r12 = r0.f
            pep r12 = r12.s
            r12.getClass()
            on7 r2 = pn7.b
            r2 = 60
            un7 r8 = un7.e
            pn7 r2 = u0h.b(r2, r8)
            ads_mobile_sdk.fo r8 = ads_mobile_sdk.fo.a$21
            java.lang.String r9 = "gads:flag_update_delay_sec"
            java.lang.Object r12 = r12.a(r9, r2, r8)
            pn7 r12 = (pn7) r12
            long r8 = r12.a
            r11.u = r6
            java.lang.Object r12 = defpackage.nb6.q(r8, r11)
            if (r12 == r1) goto L9b
        L5e:
            ads_mobile_sdk.vz r12 = r0.p
            if (r12 != 0) goto L63
            r12 = r7
        L63:
            ynb r12 = r12.D
            r11.u = r5
            java.lang.Object r12 = r12.Z(r11)
            if (r12 == r1) goto L9b
        L6d:
            ads_mobile_sdk.gr0 r2 = r0.i
            java.lang.Object r12 = r11.y
            ads_mobile_sdk.ue1 r12 = (ads_mobile_sdk.ue1) r12
            ads_mobile_sdk.vz r0 = r0.p
            if (r0 != 0) goto L78
            r0 = r7
        L78:
            r11.v = r2
            r11.w = r12
            r11.u = r4
            r0.getClass()
            java.lang.Object r0 = ads_mobile_sdk.vz.d(r0, r11)
            if (r0 == r1) goto L9b
            r10 = r0
            r0 = r12
            r12 = r10
        L8a:
            prb r12 = (defpackage.prb) r12
            r11.v = r7
            r11.w = r7
            r11.u = r3
            r2.getClass()
            java.lang.Object r11 = ads_mobile_sdk.gr0.a(r2, r0, r12, r11)
            if (r11 != r1) goto L9c
        L9b:
            return r1
        L9c:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj4.invokeSuspend$ads_mobile_sdk$mj1(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (ads_mobile_sdk.wt1.a(r1, r3, r12, (nt5) r11) == r2) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$ads_mobile_sdk$pt1(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.w
            prb r0 = (defpackage.prb) r0
            java.lang.Object r1 = r11.v
            ads_mobile_sdk.wt1 r1 = (ads_mobile_sdk.wt1) r1
            px5 r2 = px5.a
            byte r3 = r11.u
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L24
            if (r3 == r6) goto L20
            if (r3 != r5) goto L1a
            defpackage.ybh.y(r12)
            goto Lac
        L1a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            return r4
        L20:
            defpackage.ybh.y(r12)
            goto L35
        L24:
            defpackage.ybh.y(r12)
            ads_mobile_sdk.jx1 r12 = r1.c
            java.lang.Object r3 = r11.x
            ads_mobile_sdk.ve2 r3 = (ads_mobile_sdk.ve2) r3
            r11.u = r6
            java.lang.Object r12 = r12.a(r0, r3, r11)
            if (r12 == r2) goto La8
        L35:
            ads_mobile_sdk.cy0 r12 = (ads_mobile_sdk.cy0) r12
            if (r12 == 0) goto Lac
            java.lang.Object r3 = r11.y
            ads_mobile_sdk.it1 r3 = (ads_mobile_sdk.it1) r3
            r3.j = r12
            r3.k = r12
            ads_mobile_sdk.bz0 r6 = r12.d()
            r3.l = r6
            ads_mobile_sdk.bz0 r6 = r12.d()
            r3.m = r6
            ads_mobile_sdk.qr0 r6 = r1.f
            r6.getClass()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            ads_mobile_sdk.fo r8 = ads_mobile_sdk.fo.a
            java.lang.String r9 = "gads:immersive_video_ads:enabled"
            java.lang.Object r6 = r6.a(r9, r7, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto Lac
            java.lang.String r6 = "video"
            prb r0 = ads_mobile_sdk.bw2.a(r0, r6, r4)
            if (r0 == 0) goto Lac
            java.lang.String r4 = "flags"
            wpb r0 = ads_mobile_sdk.bw2.e(r0, r4)
            if (r0 == 0) goto Lac
            java.util.ArrayList r4 = r0.a
            int r4 = r4.size()
            r6 = 0
        L7b:
            if (r6 >= r4) goto Lac
            prb r7 = ads_mobile_sdk.bw2.a(r0, r6)
            if (r7 == 0) goto La9
            java.lang.String r8 = "key"
            java.lang.String r9 = ""
            java.lang.String r8 = ads_mobile_sdk.bw2.a(r7, r8, r9)
            java.lang.String r10 = "afma_video_player_type"
            boolean r8 = kotlin.jvm.internal.Intrinsics.a(r8, r10)
            if (r8 == 0) goto La9
            java.lang.String r0 = "value"
            java.lang.String r0 = ads_mobile_sdk.bw2.a(r7, r0, r9)     // Catch: java.lang.NumberFormatException -> Lac
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Lac
            r4 = 3
            if (r0 != r4) goto Lac
            r11.u = r5
            java.lang.Object r11 = ads_mobile_sdk.wt1.a(r1, r3, r12, r11)
            if (r11 != r2) goto Lac
        La8:
            return r2
        La9:
            int r6 = r6 + 1
            goto L7b
        Lac:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj4.invokeSuspend$ads_mobile_sdk$pt1(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0095 A[Catch: all -> 0x00bc, TryCatch #4 {all -> 0x00bc, blocks: (B:33:0x008e, B:35:0x0095, B:37:0x009c, B:39:0x00a0, B:41:0x00a4, B:42:0x00a5, B:43:0x00aa, B:44:0x00ab, B:45:0x00b2, B:46:0x00b3, B:47:0x00ba, B:48:0x00bb), top: B:101:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #4 {all -> 0x00bc, blocks: (B:33:0x008e, B:35:0x0095, B:37:0x009c, B:39:0x00a0, B:41:0x00a4, B:42:0x00a5, B:43:0x00aa, B:44:0x00ab, B:45:0x00b2, B:46:0x00b3, B:47:0x00ba, B:48:0x00bb), top: B:101:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0106 A[Catch: all -> 0x012d, TryCatch #5 {all -> 0x012d, blocks: (B:72:0x00ff, B:74:0x0106, B:76:0x010d, B:78:0x0111, B:80:0x0115, B:81:0x0116, B:82:0x011b, B:83:0x011c, B:84:0x0123, B:85:0x0124, B:86:0x012b, B:87:0x012c), top: B:102:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012c A[Catch: all -> 0x012d, TRY_LEAVE, TryCatch #5 {all -> 0x012d, blocks: (B:72:0x00ff, B:74:0x0106, B:76:0x010d, B:78:0x0111, B:80:0x0115, B:81:0x0116, B:82:0x011b, B:83:0x011c, B:84:0x0123, B:85:0x0124, B:86:0x012b, B:87:0x012c), top: B:102:0x00ff }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$ads_mobile_sdk$vm2(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj4.invokeSuspend$ads_mobile_sdk$vm2(java.lang.Object):java.lang.Object");
    }

    private final Object invokeSuspend$ads_mobile_sdk$wq3(Object obj) throws Throwable {
        yq3 yq3Var;
        pfe pfeVar;
        String str;
        Throwable th;
        pfe pfeVar2;
        px5 px5Var = px5.a;
        byte b = this.u;
        byte b2 = 1;
        mt5 mt5Var = null;
        try {
            if (b == 0) {
                ybh.y(obj);
                yq3Var = (yq3) this.y;
                pfeVar = yq3Var.m;
                this.v = pfeVar;
                this.w = yq3Var;
                str = "GMA_WEBVIEW_PROFILE";
                this.x = "GMA_WEBVIEW_PROFILE";
                this.u = (byte) 1;
                if (pfeVar.i(this) != px5Var) {
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
                } catch (Throwable th2) {
                    th = th2;
                    pfeVar2.l((Object) null);
                    throw th;
                }
            }
            str = (String) this.x;
            yq3Var = (yq3) this.w;
            pfe pfeVar3 = (pfe) this.v;
            ybh.y(obj);
            pfeVar = pfeVar3;
            CoroutineContext coroutineContext = yq3Var.d;
            iq3 iq3Var = new iq3(yq3Var, str, mt5Var, b2);
            this.v = pfeVar;
            this.w = null;
            this.x = null;
            this.u = (byte) 2;
            if (na2.Z(coroutineContext, iq3Var, this) != px5Var) {
                pfeVar2 = pfeVar;
                Unit unit2 = Unit.a;
                pfeVar2.l((Object) null);
                return unit2;
            }
            return px5Var;
        } catch (Throwable th3) {
            pfe pfeVar4 = pfeVar;
            th = th3;
            pfeVar2 = pfeVar4;
            pfeVar2.l((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Path cross not found for [B:11:0x0041, B:15:0x0064], limit reached: 18 */
    /* JADX WARN: Path cross not found for [B:15:0x0064, B:11:0x0041], limit reached: 18 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[PHI: r9 r10
      0x005d: PHI (r9v1 mqh) = (r9v2 mqh), (r9v3 mqh) binds: [B:12:0x005b, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r10v1 nx5) = (r10v2 nx5), (r10v3 nx5) binds: [B:12:0x005b, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0062 -> B:11:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007c -> B:11:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            px5 r0 = px5.a
            byte r1 = r12.u
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L21
            if (r1 != r4) goto L1b
            java.lang.Object r1 = r12.v
            mqh r1 = (defpackage.mqh) r1
            java.lang.Object r5 = r12.w
            nx5 r5 = (nx5) r5
            defpackage.ybh.y(r13)
            r9 = r1
            r10 = r5
            goto L41
        L1b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r12)
            return r2
        L21:
            java.lang.Object r1 = r12.v
            mqh r1 = (defpackage.mqh) r1
            java.lang.Object r5 = r12.w
            nx5 r5 = (nx5) r5
            defpackage.ybh.y(r13)
            r9 = r1
            r10 = r5
            goto L5d
        L2f:
            defpackage.ybh.y(r13)
            java.lang.Object r13 = r12.w
            nx5 r13 = (nx5) r13
            mqh r1 = new mqh
            r1.<init>()
            r5 = 1065353216(0x3f800000, float:1.0)
            r1.a = r5
            r10 = r13
            r9 = r1
        L41:
            java.lang.Object r13 = r12.x
            r7 = r13
            afe r7 = (defpackage.afe) r7
            java.lang.Object r13 = r12.y
            r8 = r13
            d7b r8 = (d7b) r8
            rg r6 = new rg
            r11 = 6
            r6.<init>(r7, r8, r9, r10, r11)
            r12.w = r10
            r12.v = r9
            r12.u = r3
            java.lang.Object r13 = defpackage.z5i.D0(r6, r12)
            if (r13 == r0) goto L7e
        L5d:
            float r13 = r9.a
            r1 = 0
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 != 0) goto L41
            q4b r13 = new q4b
            r13.<init>(r10, r3)
            xd6 r13 = dyg.o(r13)
            c7b r1 = new c7b
            r1.<init>(r4, r2)
            r12.w = r10
            r12.v = r9
            r12.u = r4
            java.lang.Object r13 = defpackage.cs5.F(r13, r1, r12)
            if (r13 != r0) goto L41
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj4.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (defpackage.na2.Z(r12, r2, r6) != r8) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.x
            r2 = r0
            joc r2 = (joc) r2
            java.lang.Object r0 = r11.y
            is6 r0 = (is6) r0
            java.lang.Object r1 = r11.w
            r7 = r1
            e2f r7 = (e2f) r7
            px5 r8 = px5.a
            byte r1 = r11.u
            r9 = 3
            r3 = 2
            r4 = 1
            r10 = 0
            if (r1 == 0) goto L36
            if (r1 == r4) goto L32
            if (r1 == r3) goto L29
            if (r1 != r9) goto L23
            defpackage.ybh.y(r12)
            goto L8c
        L23:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            return r10
        L29:
            java.lang.Object r1 = r11.v
            z1f r1 = (defpackage.z1f) r1
            defpackage.ybh.y(r12)
            r6 = r11
            goto L74
        L32:
            defpackage.ybh.y(r12)
            goto L43
        L36:
            defpackage.ybh.y(r12)
            r11.u = r4
            z1f r12 = e2f.e
            java.lang.Enum r12 = r7.b(r2, r11)
            if (r12 == r8) goto L8b
        L43:
            smc r12 = (smc) r12
            int r12 = r12.ordinal()
            if (r12 == 0) goto L5c
            if (r12 == r4) goto L59
            if (r12 != r3) goto L55
            r0.a(r3)
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        L55:
            h9o.p()
            return r10
        L59:
            z1f r12 = e2f.e
            goto L5e
        L5c:
            z1f r12 = e2f.f
        L5e:
            java.lang.Object r1 = r11.w
            e2f r1 = (e2f) r1
            r4 = r3
            y1f r3 = r12.a
            r11.v = r12
            r11.u = r4
            r4 = 0
            r6 = r11
            java.lang.Object r11 = r1.a(r2, r3, r4, r6)
            if (r11 == r8) goto L8b
            r1 = r12
            r12 = r11
        L74:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            dx5 r12 = r7.b
            qmb r2 = new qmb
            r2.<init>(r0, r11, r1, r10)
            r6.v = r10
            r6.u = r9
            java.lang.Object r11 = defpackage.na2.Z(r12, r2, r6)
            if (r11 != r8) goto L8c
        L8b:
            return r8
        L8c:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj4.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            px5 r0 = px5.a
            byte r1 = r10.u
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L14
            defpackage.ybh.y(r11)
            return r11
        L14:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            return r5
        L1a:
            java.lang.Object r1 = r10.v
            pfe r1 = (pfe) r1
            defpackage.ybh.y(r11)     // Catch: java.lang.Throwable -> L99
            goto L6f
        L22:
            java.lang.Object r1 = r10.w
            wgg r1 = (defpackage.wgg) r1
            java.lang.Object r4 = r10.v
            pfe r4 = (pfe) r4
            defpackage.ybh.y(r11)
            r11 = r4
            goto L45
        L2f:
            defpackage.ybh.y(r11)
            java.lang.Object r11 = r10.x
            r1 = r11
            wgg r1 = (defpackage.wgg) r1
            pfe r11 = r1.e
            r10.v = r11
            r10.w = r1
            r10.u = r4
            java.lang.Object r4 = r11.i(r10)
            if (r4 == r0) goto L97
        L45:
            android.view.textclassifier.TextClassifier r4 = r1.f     // Catch: java.lang.Throwable -> L9b
            if (r4 == 0) goto L4f
            boolean r6 = r4.isDestroyed()     // Catch: java.lang.Throwable -> L9b
            if (r6 == 0) goto L73
        L4f:
            on7 r4 = pn7.b     // Catch: java.lang.Throwable -> L9b
            un7 r4 = un7.d     // Catch: java.lang.Throwable -> L9b
            r6 = 300(0x12c, double:1.48E-321)
            long r6 = defpackage.cs5.y0(r6, r4)     // Catch: java.lang.Throwable -> L9b
            bz1 r4 = new bz1     // Catch: java.lang.Throwable -> L9b
            r8 = 23
            r4.<init>(r8, r5, r1)     // Catch: java.lang.Throwable -> L9b
            r10.v = r11     // Catch: java.lang.Throwable -> L9b
            r10.w = r5     // Catch: java.lang.Throwable -> L9b
            r10.u = r3     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = uyg.x(r6, r4, r10)     // Catch: java.lang.Throwable -> L9b
            if (r1 == r0) goto L97
            r9 = r1
            r1 = r11
            r11 = r9
        L6f:
            r4 = r11
            android.view.textclassifier.TextClassifier r4 = (android.view.textclassifier.TextClassifier) r4     // Catch: java.lang.Throwable -> L99
            r11 = r1
        L73:
            r11.l(r5)
            on7 r11 = pn7.b
            r6 = 200(0xc8, double:9.9E-322)
            un7 r11 = un7.d
            long r6 = defpackage.cs5.y0(r6, r11)
            qmb r11 = new qmb
            java.lang.Object r1 = r10.y
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r3 = 24
            r11.<init>(r4, r1, r5, r3)
            r10.v = r5
            r10.w = r5
            r10.u = r2
            java.lang.Object r10 = uyg.x(r6, r11, r10)
            if (r10 != r0) goto L98
        L97:
            return r0
        L98:
            return r10
        L99:
            r10 = move-exception
            goto L9d
        L9b:
            r10 = move-exception
            r1 = r11
        L9d:
            r1.l(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj4.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x016c, code lost:
    
        if (r0 != r10) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112 A[Catch: all -> 0x0319, TRY_LEAVE, TryCatch #1 {all -> 0x0319, blocks: (B:9:0x002d, B:56:0x016f, B:57:0x0174, B:14:0x003f, B:52:0x0138, B:53:0x013b, B:67:0x01a2, B:72:0x01c3, B:88:0x01eb, B:95:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x0211, B:90:0x01f0, B:92:0x01f5, B:93:0x01f8, B:71:0x01ac, B:16:0x0048, B:46:0x0109, B:48:0x0112, B:49:0x0125, B:105:0x022b, B:107:0x0233, B:109:0x0240, B:113:0x0259, B:115:0x0261, B:117:0x0270, B:121:0x0289, B:123:0x0291, B:125:0x029e, B:129:0x02b7, B:131:0x02bf, B:133:0x02cc, B:137:0x02e5, B:139:0x02ed, B:141:0x02fa, B:145:0x0313, B:146:0x0318, B:17:0x004f, B:36:0x00a9, B:38:0x00b1, B:40:0x00c0, B:44:0x00d8, B:26:0x0074, B:28:0x007c, B:30:0x0089, B:34:0x00a1), top: B:153:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f5 A[Catch: all -> 0x0319, TryCatch #1 {all -> 0x0319, blocks: (B:9:0x002d, B:56:0x016f, B:57:0x0174, B:14:0x003f, B:52:0x0138, B:53:0x013b, B:67:0x01a2, B:72:0x01c3, B:88:0x01eb, B:95:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x0211, B:90:0x01f0, B:92:0x01f5, B:93:0x01f8, B:71:0x01ac, B:16:0x0048, B:46:0x0109, B:48:0x0112, B:49:0x0125, B:105:0x022b, B:107:0x0233, B:109:0x0240, B:113:0x0259, B:115:0x0261, B:117:0x0270, B:121:0x0289, B:123:0x0291, B:125:0x029e, B:129:0x02b7, B:131:0x02bf, B:133:0x02cc, B:137:0x02e5, B:139:0x02ed, B:141:0x02fa, B:145:0x0313, B:146:0x0318, B:17:0x004f, B:36:0x00a9, B:38:0x00b1, B:40:0x00c0, B:44:0x00d8, B:26:0x0074, B:28:0x007c, B:30:0x0089, B:34:0x00a1), top: B:153:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f8 A[Catch: all -> 0x0319, TryCatch #1 {all -> 0x0319, blocks: (B:9:0x002d, B:56:0x016f, B:57:0x0174, B:14:0x003f, B:52:0x0138, B:53:0x013b, B:67:0x01a2, B:72:0x01c3, B:88:0x01eb, B:95:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x0211, B:90:0x01f0, B:92:0x01f5, B:93:0x01f8, B:71:0x01ac, B:16:0x0048, B:46:0x0109, B:48:0x0112, B:49:0x0125, B:105:0x022b, B:107:0x0233, B:109:0x0240, B:113:0x0259, B:115:0x0261, B:117:0x0270, B:121:0x0289, B:123:0x0291, B:125:0x029e, B:129:0x02b7, B:131:0x02bf, B:133:0x02cc, B:137:0x02e5, B:139:0x02ed, B:141:0x02fa, B:145:0x0313, B:146:0x0318, B:17:0x004f, B:36:0x00a9, B:38:0x00b1, B:40:0x00c0, B:44:0x00d8, B:26:0x0074, B:28:0x007c, B:30:0x0089, B:34:0x00a1), top: B:153:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj4.r(java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj) throws Throwable {
        pfe pfeVar;
        Function2 function2;
        Throwable th;
        pfe pfeVar2;
        px5 px5Var = px5.a;
        byte b = this.u;
        byte b2 = 2;
        mt5 mt5Var = null;
        try {
            if (b == 0) {
                ybh.y(obj);
                pfeVar = (pfe) this.x;
                function2 = (Function2) this.y;
                this.v = pfeVar;
                this.w = (kuk) function2;
                this.u = (byte) 1;
                if (pfeVar.i(this) != px5Var) {
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
                    pfeVar2.l((Object) null);
                    return Unit.a;
                } catch (Throwable th2) {
                    th = th2;
                    pfeVar2.l((Object) null);
                    throw th;
                }
            }
            function2 = (Function2) ((kuk) this.w);
            pfe pfeVar3 = (pfe) this.v;
            ybh.y(obj);
            pfeVar = pfeVar3;
            fsg fsgVar = new fsg(function2, mt5Var, b2);
            this.v = pfeVar;
            this.w = null;
            this.u = (byte) 2;
            if (sgb.q(fsgVar, this) != px5Var) {
                pfeVar2 = pfeVar;
                pfeVar2.l((Object) null);
                return Unit.a;
            }
            return px5Var;
        } catch (Throwable th3) {
            pfe pfeVar4 = pfeVar;
            th = th3;
            pfeVar2 = pfeVar4;
            pfeVar2.l((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:0|2|(5:(1:(1:(7:6|41|7|47|(2:48|25)|46|29)(2:11|12))(1:13))(2:14|(4:16|(1:18)|(0)|23))|43|21|(5:24|47|(3:27|48|25)|45|29)|23)|39|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        r9 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.x
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            px5 r1 = px5.a
            byte r2 = r8.u
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L29
            if (r2 == r5) goto L21
            if (r2 != r4) goto L1b
            java.lang.Object r8 = r8.v
            b4j r8 = (defpackage.b4j) r8
            defpackage.ybh.y(r9)     // Catch: java.lang.Throwable -> L19
            goto L72
        L19:
            r9 = move-exception
            goto L85
        L1b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r3
        L21:
            java.lang.Object r2 = r8.v
            b4j r2 = (defpackage.b4j) r2
            defpackage.ybh.y(r9)
            goto L60
        L29:
            defpackage.ybh.y(r9)
            java.lang.Object r9 = r8.v
            nx5 r9 = (nx5) r9
            b4j r2 = new b4j
            kotlin.coroutines.CoroutineContext r6 = r9.l()
            unb r6 = defpackage.o0g.U(r6)
            java.lang.Object r7 = r8.w
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r9 = r7.invoke(r9)
            r2.<init>(r6, r9)
            java.lang.Object r9 = r0.getAndSet(r2)
            b4j r9 = (defpackage.b4j) r9
            if (r9 == 0) goto L60
            unb r9 = r9.a
            r8.v = r2
            r8.u = r5
            r9.k(r3)
            java.lang.Object r9 = r9.Z(r8)
            if (r9 == r1) goto L5e
            kotlin.Unit r9 = kotlin.Unit.a
        L5e:
            if (r9 == r1) goto L70
        L60:
            java.lang.Object r9 = r8.y     // Catch: java.lang.Throwable -> L82
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9     // Catch: java.lang.Throwable -> L82
            java.lang.Object r5 = r2.b     // Catch: java.lang.Throwable -> L7f
            r8.v = r2     // Catch: java.lang.Throwable -> L7f
            r8.u = r4     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r9 = r9.invoke(r5, r8)     // Catch: java.lang.Throwable -> L7f
            if (r9 != r1) goto L71
        L70:
            return r1
        L71:
            r8 = r2
        L72:
            boolean r1 = r0.compareAndSet(r8, r3)
            if (r1 != 0) goto L7e
            java.lang.Object r1 = r0.get()
            if (r1 == r8) goto L72
        L7e:
            return r9
        L7f:
            r9 = move-exception
        L80:
            r8 = r2
            goto L85
        L82:
            r8 = move-exception
            r9 = r8
            goto L80
        L85:
            boolean r1 = r0.compareAndSet(r8, r3)
            if (r1 != 0) goto L91
            java.lang.Object r1 = r0.get()
            if (r1 == r8) goto L85
        L91:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj4.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0069 -> B:15:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.y
            dzl r0 = (defpackage.dzl) r0
            px5 r1 = px5.a
            byte r2 = r8.u
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L30
            if (r2 == r4) goto L20
            if (r2 != r3) goto L1a
            java.lang.Object r2 = r8.x
            nx5 r2 = (nx5) r2
            defpackage.ybh.y(r9)     // Catch: java.lang.Throwable -> L70
            r9 = r2
            goto L37
        L1a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r5
        L20:
            java.lang.Object r2 = r8.w
            spi r2 = (defpackage.spi) r2
            java.lang.Object r6 = r8.v
            dzl r6 = (defpackage.dzl) r6
            java.lang.Object r7 = r8.x
            nx5 r7 = (nx5) r7
            defpackage.ybh.y(r9)     // Catch: java.lang.Throwable -> L70
            goto L58
        L30:
            defpackage.ybh.y(r9)
            java.lang.Object r9 = r8.x
            nx5 r9 = (nx5) r9
        L37:
            kotlin.coroutines.CoroutineContext r2 = r9.l()     // Catch: java.lang.Throwable -> L70
            boolean r2 = defpackage.o0g.c0(r2)     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r0.b     // Catch: java.lang.Throwable -> L70
            spi r2 = (defpackage.spi) r2     // Catch: java.lang.Throwable -> L70
            p04 r6 = r0.f     // Catch: java.lang.Throwable -> L70
            r8.x = r9     // Catch: java.lang.Throwable -> L70
            r8.v = r0     // Catch: java.lang.Throwable -> L70
            r8.w = r2     // Catch: java.lang.Throwable -> L70
            r8.u = r4     // Catch: java.lang.Throwable -> L70
            java.lang.Object r6 = p04.O(r6, r8)     // Catch: java.lang.Throwable -> L70
            if (r6 == r1) goto L68
            r7 = r9
            r9 = r6
            r6 = r0
        L58:
            bzl r9 = (defpackage.bzl) r9     // Catch: java.lang.Throwable -> L70
            r8.x = r7     // Catch: java.lang.Throwable -> L70
            r8.v = r5     // Catch: java.lang.Throwable -> L70
            r8.w = r5     // Catch: java.lang.Throwable -> L70
            r8.u = r3     // Catch: java.lang.Throwable -> L70
            java.lang.Object r9 = r6.f(r2, r9, r8)     // Catch: java.lang.Throwable -> L70
            if (r9 != r1) goto L69
        L68:
            return r1
        L69:
            r9 = r7
            goto L37
        L6b:
            r0.g = r5
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L70:
            r8 = move-exception
            r0.g = r5
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj4.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0090, code lost:
    
        if (r0 == r4) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = r0.y
            nle r1 = (nle) r1
            java.lang.Object r2 = r0.x
            h46 r2 = (h46) r2
            java.lang.Object r3 = r0.w
            x0m r3 = (x0m) r3
            px5 r4 = px5.a
            byte r5 = r0.u
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L32
            if (r5 == r7) goto L2c
            if (r5 != r6) goto L25
            java.lang.Object r0 = r0.v
            o0m r0 = (o0m) r0
            defpackage.ybh.y(r17)
            r5 = r0
            r0 = r17
            goto L93
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r0)
            r0 = 0
            return r0
        L2c:
            defpackage.ybh.y(r17)
            r5 = r17
            goto L3d
        L32:
            defpackage.ybh.y(r17)
            r0.u = r7
            java.lang.Object r5 = r3.d(r2, r1, r0)
            if (r5 == r4) goto L92
        L3d:
            o0m r5 = (o0m) r5
            zth r3 = r3.a
            eme r2 = r2.g
            wv r1 = r2.u0(r1)
            ldh r8 = new ldh
            r14 = 0
            r15 = 6
            r9 = 1
            x1 r10 = x1.a
            java.lang.Class<x1> r11 = x1.class
            java.lang.String r12 = "decodeUInt"
            java.lang.String r13 = "decodeUInt(Ljava/lang/String;)Ljava/math/BigInteger;"
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r2 = 0
            kotlinx.serialization.json.b[] r9 = new kotlinx.serialization.json.b[r2]
            if (r1 == 0) goto L81
            java.lang.String r1 = r1.a()
            r40 r9 = new r40
            r10 = 5
            r9.<init>(r10, r1, r2)
            sth[] r1 = new sth[r7]
            r1[r2] = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r7)
            r1 = r1[r2]
            kotlinx.serialization.json.b r1 = r1.k()
            r9.add(r1)
            kotlinx.serialization.json.b[] r1 = new kotlinx.serialization.json.b[r2]
            java.lang.Object[] r1 = r9.toArray(r1)
            r9 = r1
            kotlinx.serialization.json.b[] r9 = (kotlinx.serialization.json.b[]) r9
        L81:
            tth r1 = new tth
            java.lang.String r2 = "eth_maxPriorityFeePerGas"
            r1.<init>(r2, r9, r8)
            r0.v = r5
            r0.u = r6
            java.lang.Object r0 = zth.c(r3, r1, r0)
            if (r0 != r4) goto L93
        L92:
            return r4
        L93:
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            java.math.BigInteger r1 = r5.b
            java.math.BigInteger r2 = pe3.b
            java.math.BigInteger r2 = r1.add(r2)
            java.math.BigInteger r3 = r5.a
            r4 = 3
            java.math.BigInteger r2 = r2.pow(r4)
            java.math.BigInteger r2 = r3.multiply(r2)
            java.math.BigInteger r1 = r1.pow(r4)
            java.math.BigInteger r1 = r2.divide(r1)
            q0m r2 = new q0m
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj4.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (defpackage.na2.Z((kotlin.coroutines.CoroutineContext) r11, r7, r10) == r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.x
            int[] r0 = (int[]) r0
            java.lang.Object r1 = r10.w
            g7m r1 = (defpackage.g7m) r1
            px5 r2 = px5.a
            byte r3 = r10.u
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L37
            if (r3 == r7) goto L2f
            if (r3 == r6) goto L27
            if (r3 == r5) goto L1e
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            return r4
        L1e:
            defpackage.ybh.y(r11)     // Catch: java.lang.Throwable -> L88
            pxb r10 = new pxb     // Catch: java.lang.Throwable -> L88
            r10.<init>()     // Catch: java.lang.Throwable -> L88
            throw r10     // Catch: java.lang.Throwable -> L88
        L27:
            java.lang.Object r3 = r10.v
            l99 r3 = (l99) r3
            defpackage.ybh.y(r11)
            goto L6d
        L2f:
            java.lang.Object r3 = r10.v
            l99 r3 = (l99) r3
            defpackage.ybh.y(r11)
            goto L5a
        L37:
            defpackage.ybh.y(r11)
            java.lang.Object r11 = r10.v
            l99 r11 = (l99) r11
            java.lang.Object r3 = r1.h
            d7f r3 = (defpackage.d7f) r3
            boolean r3 = r3.a(r0)
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r1.c
            y5i r3 = (defpackage.y5i) r3
            r10.v = r11
            r10.u = r7
            r7 = 0
            kotlin.coroutines.CoroutineContext r3 = defpackage.kfo.H(r3, r7, r10)
            if (r3 == r2) goto L6c
            r9 = r3
            r3 = r11
            r11 = r9
        L5a:
            kotlin.coroutines.CoroutineContext r11 = (kotlin.coroutines.CoroutineContext) r11
            zhl r7 = new zhl
            r8 = 4
            r7.<init>(r8, r4, r1)
            r10.v = r3
            r10.u = r6
            java.lang.Object r11 = defpackage.na2.Z(r11, r7, r10)
            if (r11 != r2) goto L6d
        L6c:
            return r2
        L6d:
            r11 = r3
        L6e:
            pqh r3 = new pqh     // Catch: java.lang.Throwable -> L88
            r3.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.Object r6 = r1.i     // Catch: java.lang.Throwable -> L88
            je6 r6 = (defpackage.je6) r6     // Catch: java.lang.Throwable -> L88
            as4 r7 = new as4     // Catch: java.lang.Throwable -> L88
            java.lang.Object r8 = r10.y     // Catch: java.lang.Throwable -> L88
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch: java.lang.Throwable -> L88
            r7.<init>(r3, r11, r8, r0)     // Catch: java.lang.Throwable -> L88
            r10.v = r4     // Catch: java.lang.Throwable -> L88
            r10.u = r5     // Catch: java.lang.Throwable -> L88
            r6.a(r7, r10)     // Catch: java.lang.Throwable -> L88
            return r2
        L88:
            r10 = move-exception
            java.lang.Object r11 = r1.h
            d7f r11 = (defpackage.d7f) r11
            r11.b(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj4.w(java.lang.Object):java.lang.Object");
    }

    private final Object z(Object obj) throws Throwable {
        h5o h5oVar = (h5o) this.w;
        ajc ajcVar = (ajc) this.v;
        px5 px5Var = px5.a;
        byte b = this.u;
        if (b == 0) {
            ybh.y(obj);
            ListenableFuture listenableFutureA = ajcVar.a();
            this.u = (byte) 1;
            obj = a6o.a(listenableFutureA, ajcVar, this);
            if (obj != px5Var) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                ybh.y(obj);
                return obj;
            }
            qp2.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ybh.y(obj);
        ij9 ij9Var = (ij9) obj;
        if (ij9Var == null) {
            qp2.n(z1m.l(new StringBuilder("Worker was marked important ("), h5oVar.c, ") but did not provide ForegroundInfo"));
            return null;
        }
        int i = u4o.a;
        qs7.x().getClass();
        v4o v4oVar = (v4o) this.x;
        o94 o94VarZ = k1g.z(new z0c(v4oVar.a.a, new i51((Object) v4oVar, (Object) ajcVar.b.a, (Object) ij9Var, this.y, (byte) 19), (byte) 4));
        this.u = (byte) 2;
        Object objL = a26.l(o94VarZ, this);
        return objL == px5Var ? px5Var : objL;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new jj4(mt5Var, (rj4) this.v, (ArrayList) this.w, (ArrayList) this.x);
            case 1:
                jj4 jj4Var = new jj4((byte) 1, mt5Var, this.y);
                jj4Var.x = obj;
                return jj4Var;
            case 2:
                jj4 jj4Var2 = new jj4(this.x, this.y, mt5Var, (byte) 2);
                jj4Var2.w = obj;
                return jj4Var2;
            case 3:
                return new jj4((ggb) this.x, (ArrayList) this.w, (mg6) this.y, mt5Var);
            case 4:
                return new jj4((ggb) this.y, (ArrayList) this.w, mt5Var);
            case 5:
                jj4 jj4Var3 = new jj4((byte) 5, mt5Var, this.y);
                jj4Var3.x = obj;
                return jj4Var3;
            case 6:
                jj4 jj4Var4 = new jj4((byte) 6, mt5Var, this.y);
                jj4Var4.x = obj;
                return jj4Var4;
            case 7:
                return new jj4((ks3) this.v, (Uri) this.w, (kcl) this.x, (lqh) this.y, mt5Var, (byte) 7);
            case 8:
                return new jj4((bej) this.v, (f99) this.w, (xee) this.x, this.y, mt5Var, (byte) 8);
            case 9:
                jj4 jj4Var5 = new jj4((byte) 9, mt5Var, this.y);
                jj4Var5.x = obj;
                return jj4Var5;
            case 10:
                jj4 jj4Var6 = new jj4(this.x, this.y, mt5Var, (byte) 10);
                jj4Var6.w = obj;
                return jj4Var6;
            case 11:
                jj4 jj4Var7 = new jj4(this.x, this.y, mt5Var, (byte) 11);
                jj4Var7.w = obj;
                return jj4Var7;
            case 12:
                return new jj4(this.w, this.x, this.y, mt5Var, (byte) 12);
            case 13:
                return new jj4(this.x, this.y, mt5Var, (byte) 13);
            case 14:
                return new jj4(this.x, this.y, mt5Var, (byte) 14);
            case 15:
                return new jj4(this.x, this.y, mt5Var, (byte) 15);
            case 16:
                jj4 jj4Var8 = new jj4(this.w, this.x, this.y, mt5Var, (byte) 16);
                jj4Var8.v = obj;
                return jj4Var8;
            case 17:
                jj4 jj4Var9 = new jj4((byte) 17, mt5Var, this.y);
                jj4Var9.x = obj;
                return jj4Var9;
            case 18:
                return new jj4(this.w, this.x, this.y, mt5Var, (byte) 18);
            case 19:
                jj4 jj4Var10 = new jj4(this.w, this.x, this.y, mt5Var, (byte) 19);
                jj4Var10.v = obj;
                return jj4Var10;
            case 20:
                return new jj4((ajc) this.v, (h5o) this.w, (v4o) this.x, (Context) this.y, mt5Var, (byte) 20);
            case 21:
                return new jj4(this.x, this.y, mt5Var, (byte) 21);
            case 22:
                return new jj4((ve2) this.x, (it1) this.y, (wt1) this.v, (prb) this.w, mt5Var);
            case 23:
                return new jj4(this.x, this.y, mt5Var, (byte) 23);
            case 24:
                return new jj4((byte) 24, mt5Var, this.y);
            default:
                jj4 jj4Var11 = new jj4((byte) 25, mt5Var, this.y);
                jj4Var11.x = obj;
                return jj4Var11;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                create((z1h) obj, (mt5) obj2).invokeSuspend(Unit.a);
                return px5.a;
            case 2:
                return create((l99) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((yuk) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                return create((yuk) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 5:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 6:
                create((z1h) obj, (mt5) obj2).invokeSuspend(Unit.a);
                return px5.a;
            case 7:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 8:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 9:
                return create((l99) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 10:
                create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
                return px5.a;
            case 11:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 12:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 13:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 14:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 15:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 16:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 17:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 18:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 19:
                create((l99) obj, (mt5) obj2).invokeSuspend(Unit.a);
                return px5.a;
            case 20:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 21:
                return new jj4(this.x, this.y, (mt5) obj2, (byte) 21).invokeSuspend(Unit.a);
            case 22:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 23:
                return new jj4(this.x, this.y, (mt5) obj2, (byte) 23).invokeSuspend(Unit.a);
            case 24:
                return new jj4((byte) 24, (mt5) obj2, this.y).invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0296, code lost:
    
        if (r11.collect(r12, r26) == r0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02b8, code lost:
    
        if (r11.collect(r12, r26) != r0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02d9, code lost:
    
        if (defpackage.j14.v(r3, r10, r26) == r0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0331, code lost:
    
        if (r2.a(r10, r26) == r0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04a0, code lost:
    
        if (r0.e1(r26) != r5) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        if (r0 != r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0512, code lost:
    
        if (r3 != r2) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x05e7, code lost:
    
        if (defpackage.cgh.j(r10, r26) != r2) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0642, code lost:
    
        if (r3.I0(r26) != r2) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0105, code lost:
    
        if (defpackage.na2.Z(r5, r6, r26) == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x06f1, code lost:
    
        if (r7.Q0(r9, r26) == r2) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0746, code lost:
    
        if (defpackage.j14.F(r0, (f99) r3, r26) == r2) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:231:0x0481, B:228:0x0472], limit reached: 519 */
    /* JADX WARN: Path cross not found for [B:233:0x0485, B:209:0x0419], limit reached: 519 */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0243 A[Catch: all -> 0x025c, TRY_LEAVE, TryCatch #13 {all -> 0x025c, blocks: (B:107:0x01fb, B:115:0x022d, B:117:0x023b, B:119:0x0243, B:111:0x020c, B:114:0x0228), top: B:489:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x046b A[PHI: r6 r10
      0x046b: PHI (r6v36 pqh) = (r6v31 pqh), (r6v44 pqh) binds: [B:203:0x03ec, B:224:0x0469] A[DONT_GENERATE, DONT_INLINE]
      0x046b: PHI (r10v33 nx5) = (r10v30 nx5), (r10v35 nx5) binds: [B:203:0x03ec, B:224:0x0469] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0472 A[Catch: CancellationException -> 0x0493, TryCatch #3 {CancellationException -> 0x0493, blocks: (B:226:0x046c, B:228:0x0472, B:231:0x0481, B:233:0x0485), top: B:473:0x046c }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0481 A[Catch: CancellationException -> 0x0493, TryCatch #3 {CancellationException -> 0x0493, blocks: (B:226:0x046c, B:228:0x0472, B:231:0x0481, B:233:0x0485), top: B:473:0x046c }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:535:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v102 */
    /* JADX WARN: Type inference failed for: r3v103 */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v105 */
    /* JADX WARN: Type inference failed for: r3v106 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r5v43, types: [byte] */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0252 -> B:115:0x022d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:229:0x047e -> B:209:0x0419). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:232:0x0483 -> B:209:0x0419). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:234:0x0490 -> B:209:0x0419). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:239:0x04a0 -> B:208:0x0418). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:241:0x04a4 -> B:209:0x0419). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:292:0x05e7 -> B:293:0x05e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:353:0x06f1 -> B:355:0x06f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
